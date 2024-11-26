package org.apache.antlr4.impl.visitor;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.antlr4.JSONFileBaseVisitor;
import org.apache.antlr4.JSONFileLexer;
import org.apache.antlr4.JSONFileParser;

import java.io.InputStream;

/**
 * Translate JSON to XML format.
 *
 * @author sunxien
 */
public class DefaultJSONFileVisitor extends JSONFileBaseVisitor {


    public DefaultJSONFileVisitor() {

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
