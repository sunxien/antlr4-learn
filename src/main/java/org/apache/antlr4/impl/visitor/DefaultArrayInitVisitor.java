package org.apache.antlr4.impl.visitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.antlr4.ArrayInitBaseVisitor;
import org.apache.antlr4.ArrayInitLexer;
import org.apache.antlr4.ArrayInitParser;

/**
 * @author sunxien
 */
public class DefaultArrayInitVisitor extends ArrayInitBaseVisitor {

    /**
     * @param ctx the parse tree
     * @return Object
     */
    @Override
    public Object visitInit(ArrayInitParser.InitContext ctx) {
        System.out.println("visitInit: " + ctx.getText());
        return super.visitInit(ctx);
    }

    /**
     * @param ctx the parse tree
     * @return Object
     */
    @Override
    public Object visitValue(ArrayInitParser.ValueContext ctx) {
        System.out.println("visitValue: " + ctx.getText());
        return super.visitValue(ctx);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        CharStream stream = CharStreams.fromString("{1,2,3}");
        ArrayInitLexer lexer = new ArrayInitLexer(stream);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(cts);
        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));
    }
}
