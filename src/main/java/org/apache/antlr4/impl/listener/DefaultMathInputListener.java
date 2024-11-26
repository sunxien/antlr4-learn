//package org.apache.antlr4.impl.listener;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.apache.antlr4.MathInputBaseListener;
//import org.apache.antlr4.MathInputLexer;
//import org.apache.antlr4.MathInputParser;
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//
///**
// * @author sunxien
// */
//public class DefaultMathInputListener extends MathInputBaseListener {
//
//    final Deque<Integer> stack;
//
//    public DefaultMathInputListener() {
//        this.stack = new ArrayDeque<>();
//    }
//
//    @Override
//    public void exitMul_Div(MathInputParser.Mul_DivContext ctx) {
//        final int left = this.stack.pop();
//        final int right = this.stack.pop();
//        if (ctx.MUL() != null) {
//            this.stack.push(left * right);
//        } else if (ctx.DIV() != null) {
//            this.stack.push(left / right);
//        } else {
//            throw new IllegalArgumentException("unknown operator: " + ctx.expr());
//        }
//    }
//
//    @Override
//    public void exitAdd_Sub(MathInputParser.Add_SubContext ctx) {
//        final int left = this.stack.pop();
//        final int right = this.stack.pop();
//        if (ctx.ADD() != null) {
//            this.stack.push(left + right);
//        } else if (ctx.SUB() != null) {
//            this.stack.push(left - right);
//        } else {
//            throw new IllegalArgumentException("unknown operator: " + ctx.expr());
//        }
//    }
//
//    @Override
//    public void exitGet_Int(MathInputParser.Get_IntContext ctx) {
//        this.stack.push(Integer.parseInt(ctx.INT().getText()));
//    }
//
//    /**
//     * @return Integer
//     */
//    public Integer getResult() {
//        if (this.stack.isEmpty()) {
//            throw new IllegalArgumentException("empty stack");
//        }
//        return this.stack.pop();
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
//        DefaultMathInputListener listener = new DefaultMathInputListener();
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(listener, tree);
//        System.out.println("Compute as => " + listener.getResult());
//    }
//}
