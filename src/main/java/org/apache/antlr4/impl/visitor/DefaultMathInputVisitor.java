package org.apache.antlr4.impl.visitor;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.antlr4.MathInputBaseVisitor;
import org.apache.antlr4.MathInputLexer;
import org.apache.antlr4.MathInputParser;

/**
 * @author sunxien
 */
public class DefaultMathInputVisitor extends MathInputBaseVisitor<Integer> {

    /**
     * @param ctx the parse tree
     * @return Integer
     */
    @Override
    public Integer visitMul_Div(MathInputParser.Mul_DivContext ctx) {
        if (ctx.MUL() != null) {
            return visit(ctx.expr(0)) * visit(ctx.expr(1));
        } else if (ctx.DIV() != null) {
            return visit(ctx.expr(0)) / visit(ctx.expr(1));
        } else {
            throw new IllegalArgumentException("unknown operator: " + ctx.expr());
        }
    }

    /**
     * @param ctx the parse tree
     * @return Integer
     */
    @Override
    public Integer visitAdd_Sub(MathInputParser.Add_SubContext ctx) {
        if (ctx.ADD() != null) {
            return visit(ctx.expr(0)) + visit(ctx.expr(1));
        } else if (ctx.SUB() != null) {
            return visit(ctx.expr(0)) - visit(ctx.expr(1));
        } else {
            throw new IllegalArgumentException("unknown operator: " + ctx.expr());
        }
    }

    @Override
    public Integer visitGet_Int(MathInputParser.Get_IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        MathInputLexer lexer = new MathInputLexer(CharStreams.fromString("1+2*3"));
        MathInputParser parser = new MathInputParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.expr();
        System.out.println(tree.toStringTree(parser));

        DefaultMathInputVisitor visitor = new DefaultMathInputVisitor();
        System.out.println("Compute as => " + visitor.visit(tree));
    }
}
