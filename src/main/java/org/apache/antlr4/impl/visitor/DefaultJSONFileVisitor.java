package org.apache.antlr4.impl.visitor;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.antlr4.JSONFileBaseVisitor;
import org.apache.antlr4.JSONFileLexer;
import org.apache.antlr4.JSONFileParser;

import java.io.InputStream;
import java.util.List;

/**
 * Translate JSON to XML format.
 *
 * @author sunxien
 */
public class DefaultJSONFileVisitor extends JSONFileBaseVisitor<String> {


    public DefaultJSONFileVisitor() {
    }

    @Override
    public String visitJson(JSONFileParser.JsonContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public String visitObject(JSONFileParser.ObjectContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<JSONFileParser.PairContext> pairs = ctx.pair();
        if (pairs != null && !pairs.isEmpty()) {
            for (JSONFileParser.PairContext pair : pairs) {
                sb.append(visit(pair)).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String visitArray(JSONFileParser.ArrayContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<JSONFileParser.ValueContext> values = ctx.value();
        if (values != null && !values.isEmpty()) {
            sb.append("\n");
            for (JSONFileParser.ValueContext value : values) {
                sb.append("<proposal>");
                sb.append("\n").append(visit(value));
                sb.append("</proposal>").append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String visitPair(JSONFileParser.PairContext ctx) {
        String tagName = visit(ctx.key());
        String value = visit(ctx.value());
        return createOpenTag(tagName) + value + createCloseTag(tagName);
    }

    @Override
    public String visitKey(JSONFileParser.KeyContext ctx) {
        return stripQuotes(ctx.STRING_VALUE().getText());
    }

    @Override
    public String visitNumber_Val(JSONFileParser.Number_ValContext ctx) {
        return stripQuotes(ctx.NUMBER_VALUE().getText());
    }

    @Override
    public String visitString_Val(JSONFileParser.String_ValContext ctx) {
        return stripQuotes(ctx.STRING_VALUE().getText());
    }

    @Override
    public String visitAtomic_Val(JSONFileParser.Atomic_ValContext ctx) {
        return ctx.getText(); // NULL, FALSE, TRUE
    }

    @Override
    public String visitObject_Val(JSONFileParser.Object_ValContext ctx) {
        return visit(ctx.object());
    }

    @Override
    public String visitArray_Val(JSONFileParser.Array_ValContext ctx) {
        return visit(ctx.array());
    }

    public String createOpenTag(String tagName) {
        return "<" + tagName + ">";
    }

    public String createCloseTag(String tagName) {
        return "</" + tagName + ">";
    }

    public String stripQuotes(String tagName) {
        if (tagName == null) {
            return null;
        }
        if (tagName.startsWith("\"") && tagName.endsWith("\"")) {
            return tagName.substring(1, tagName.length() - 1);
        }
        return tagName;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("dataset/customer.json")) {
            if (is == null) {
                throw new IllegalArgumentException("load json file failed.");
            }
            JSONFileLexer lexer = new JSONFileLexer(CharStreams.fromStream(is));
            JSONFileParser parser = new JSONFileParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.json();
            // System.out.println(tree.toStringTree(parser));

            DefaultJSONFileVisitor visitor = new DefaultJSONFileVisitor();
            System.out.println("Compute as => " + visitor.visit(tree));
        } catch (Exception ex) {
            System.err.println("DefaultJSONFileVisitor.main failed. Error: " + ex.getMessage());
        }
    }
}
