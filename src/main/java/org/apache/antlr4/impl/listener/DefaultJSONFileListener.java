//package org.apache.antlr4.impl.listener;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeProperty;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.apache.antlr4.JSONFileBaseListener;
//import org.apache.antlr4.JSONFileLexer;
//import org.apache.antlr4.JSONFileParser;
//
//import java.io.InputStream;
//import java.util.List;
//
///**
// * Translate JSON to XML format.
// *
// * @author sunxien
// */
//public class DefaultJSONFileListener extends JSONFileBaseListener {
//
//    final ParseTreeProperty<String> property;
//
//    public DefaultJSONFileListener() {
//        this.property = new ParseTreeProperty<>();
//    }
//
//    @Override
//    public void exitJson(JSONFileParser.JsonContext ctx) {
//        setXMLString(ctx, getXMLString(ctx.getChild(0)));
//    }
//
//    @Override
//    public void exitObject(JSONFileParser.ObjectContext ctx) {
//        StringBuilder sb = new StringBuilder();
//        List<JSONFileParser.PairContext> pairs = ctx.pair();
//        if (pairs != null && !pairs.isEmpty()) {
//            sb.append("\n");
//            for (JSONFileParser.PairContext pair : ctx.pair()) {
//                String xmlSnippet = getXMLString(pair);
//                sb.append(xmlSnippet).append("\n");
//            }
//        }
//        setXMLString(ctx, sb.toString());
//    }
//
//    @Override
//    public void exitArray(JSONFileParser.ArrayContext ctx) {
//        StringBuilder sb = new StringBuilder();
//        List<JSONFileParser.ValueContext> values = ctx.value();
//        if (values != null && !values.isEmpty()) {
//            sb.append("\n");
//            for (JSONFileParser.ValueContext value : values) {
//                sb.append("<proposal>");
//                sb.append(getXMLString(value));
//                sb.append("</proposal>").append("\n");
//            }
//        }
//        setXMLString(ctx, sb.toString());
//    }
//
//    @Override
//    public void exitPair(JSONFileParser.PairContext ctx) {
//        String keyTagName = getXMLString(ctx.key());
//        String valueTagName = stripQuotes(getXMLString(ctx.value()));
//        String xmlSnippet = createOpenTag(keyTagName) + valueTagName + createCloseTag(keyTagName);
//        setXMLString(ctx, xmlSnippet);
//    }
//
//    @Override
//    public void exitKey(JSONFileParser.KeyContext ctx) {
//        setXMLString(ctx, ctx.STRING_VALUE().getText());
//    }
//
//    @Override
//    public void exitAtomic_Val(JSONFileParser.Atomic_ValContext ctx) {
//        setXMLString(ctx, ctx.getText());
//    }
//
//    @Override
//    public void exitNumber_Val(JSONFileParser.Number_ValContext ctx) {
//        setXMLString(ctx, ctx.getText());
//    }
//
//    @Override
//    public void exitString_Val(JSONFileParser.String_ValContext ctx) {
//        setXMLString(ctx, ctx.getText());
//    }
//
//    @Override
//    public void exitArray_Val(JSONFileParser.Array_ValContext ctx) {
//        setXMLString(ctx, getXMLString(ctx.array()));
//    }
//
//    @Override
//    public void exitObject_Val(JSONFileParser.Object_ValContext ctx) {
//        setXMLString(ctx, getXMLString(ctx.object()));
//    }
//
//    public String createOpenTag(String tagName) {
//        return "<" + stripQuotes(tagName) + ">";
//    }
//
//    public String createCloseTag(String tagName) {
//        return "</" + stripQuotes(tagName) + ">";
//    }
//
//    public String stripQuotes(String tagName) {
//        if (tagName == null) {
//            return null;
//        }
//        if (tagName.startsWith("\"") && tagName.endsWith("\"")) {
//            return tagName.substring(1, tagName.length() - 1);
//        }
//        return tagName;
//    }
//
//    public String getXMLString(ParseTree node) {
//        return this.property.get(node);
//    }
//
//    public void setXMLString(ParseTree node, String xmlSnippet) {
//        this.property.put(node, xmlSnippet);
//    }
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("dataset/customer.json")) {
//            if (is == null) {
//                throw new IllegalArgumentException("load json file failed.");
//            }
//            JSONFileLexer lexer = new JSONFileLexer(CharStreams.fromStream(is));
//            JSONFileParser parser = new JSONFileParser(new CommonTokenStream(lexer));
//            ParseTree tree = parser.json();
//            System.out.println(tree.toStringTree(parser));
//
//            DefaultJSONFileListener listener = new DefaultJSONFileListener();
//            new ParseTreeWalker().walk(listener, tree);
//            System.out.println("Compute as => " + listener.getXMLString(tree));
//        } catch (Exception ex) {
//            System.err.println("DefaultJSONFileListener.main failed. Error: " + ex.getMessage());
//        }
//    }
//}
