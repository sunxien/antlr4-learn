//package org.apache.antlr4.impl.listener;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeProperty;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.apache.antlr4.MathInputBaseListener;
//import org.apache.antlr4.MathInputLexer;
//import org.apache.antlr4.MathInputParser;
//
///**
// * @author sunxien
// */
//public class AnnotatedMathInputListener extends MathInputBaseListener {
//
//
//    final ParseTreeProperty<Integer> property;
//
//    public AnnotatedMathInputListener() {
//        this.property = new ParseTreeProperty<>();
//    }
//
//    @Override
//    public void exitMul_Div(MathInputParser.Mul_DivContext ctx) {
//        final int left = getValue(ctx.expr(0));
//        final int right = getValue(ctx.expr(1));
//        if (ctx.MUL() != null) {
//            setValue(ctx, left * right);
//        } else if (ctx.DIV() != null) {
//            setValue(ctx, left / right);
//        } else {
//            throw new IllegalArgumentException("unknown operator: " + ctx.expr());
//        }
//    }
//
//    @Override
//    public void exitAdd_Sub(MathInputParser.Add_SubContext ctx) {
//        final int left = getValue(ctx.expr(0));
//        final int right = getValue(ctx.expr(1));
//        if (ctx.ADD() != null) {
//            setValue(ctx, left + right);
//        } else if (ctx.SUB() != null) {
//            setValue(ctx, left - right);
//        } else {
//            throw new IllegalArgumentException("unknown operator: " + ctx.expr());
//        }
//    }
//
//    @Override
//    public void exitGet_Int(MathInputParser.Get_IntContext ctx) {
//        setValue(ctx, Integer.parseInt(ctx.INT().getText()));
//    }
//
//    public Integer getValue(ParseTree node) {
//        return this.property.get(node);
//    }
//
//    public void setValue(ParseTree node, int value) {
//        this.property.put(node, value);
//    }
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        MathInputLexer lexer = new MathInputLexer(CharStreams.fromString("1+2*3"));
//        MathInputParser parser = new MathInputParser(new CommonTokenStream(lexer));
//        ParseTree tree = parser.expr();
//        System.out.println(tree.toStringTree(parser));
//
//        AnnotatedMathInputListener listener = new AnnotatedMathInputListener();
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(listener, tree);
//        System.out.println("Compute as => " + listener.getValue(tree));
//    }
//}
