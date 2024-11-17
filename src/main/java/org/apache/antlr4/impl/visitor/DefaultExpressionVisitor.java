package org.apache.antlr4.impl.visitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.antlr4.ExpressionBaseVisitor;
import org.apache.antlr4.ExpressionLexer;
import org.apache.antlr4.ExpressionParser;

/**
 * @author sunxien
 */
public class DefaultExpressionVisitor extends ExpressionBaseVisitor<Integer> {

    //
    int result = 0;

    /**
     *
     */
    public DefaultExpressionVisitor() {
    }

    @Override
    public Integer visitTarget_Label(ExpressionParser.Target_LabelContext ctx) {
        return result = visit(ctx.getChild(0));
    }

    @Override
    public Integer visitMulAndDiv_Label(ExpressionParser.MulAndDiv_LabelContext ctx) {
        if (ctx.getChildCount() != 3) {
            throw new IllegalArgumentException("bad expr: " + ctx.getText());
        }
        int a = visit(ctx.getChild(0));
        String operator = ctx.getChild(1).getText();
        int b = visit(ctx.getChild(2));
        if ("*".equals(operator)) {
            return a * b;
        } else if ("/".equals(operator)) {
            return a / b;
        } else {
            throw new RuntimeException("unknown operator: " + operator);
        }
    }

    @Override
    public Integer visitAddAndSub_Label(ExpressionParser.AddAndSub_LabelContext ctx) {
        if (ctx.getChildCount() != 3) {
            throw new IllegalArgumentException("bad expr: " + ctx.getText());
        }
        int a = visit(ctx.getChild(0));
        String operator = ctx.getChild(1).getText();
        int b = visit(ctx.getChild(2));
        if ("+".equals(operator)) {
            return a + b;
        } else if ("-".equals(operator)) {
            return a - b;
        } else {
            throw new RuntimeException("unknown operator: " + operator);
        }
    }

    @Override
    public Integer visitComplexExpr_Label(ExpressionParser.ComplexExpr_LabelContext ctx) {
        if (ctx.getChildCount() != 3) {
            throw new IllegalArgumentException("bad expr: " + ctx.getText());
        }
        return visit(ctx.expr());
    }

    @Override
    public Integer visitNumber_Label(ExpressionParser.Number_LabelContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    /**
     * @return Integer
     */
    public Integer getTarget() {
        return this.result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "1+2*3+((3*4+4)/4)-5+6\n"; // 1+6+4-5+6=12
        String str2 = "1+(2*3-4)+2\n"; // 1+2+2=5
        CharStream stream = CharStreams.fromString(str1);
        ExpressionLexer lexer = new ExpressionLexer(stream);
        ExpressionParser parser = new ExpressionParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));

        DefaultExpressionVisitor visitor = new DefaultExpressionVisitor();
        tree.accept(visitor);
        System.out.println("Compute as => " + visitor.getTarget());
    }
}
