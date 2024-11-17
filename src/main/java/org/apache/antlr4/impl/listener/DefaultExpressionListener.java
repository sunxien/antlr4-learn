package org.apache.antlr4.impl.listener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.antlr4.CommonLexer;
import org.apache.antlr4.ExpressionBaseListener;
import org.apache.antlr4.ExpressionLexer;
import org.apache.antlr4.ExpressionParser;

import java.util.LinkedList;

/**
 * @author sunxien
 */
public class DefaultExpressionListener extends ExpressionBaseListener {

    /**
     *
     */
    public DefaultExpressionListener() {
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        CharStream stream = CharStreams.fromString("1+2*3-5+6\n");
        ExpressionLexer lexer = new ExpressionLexer(stream);
        ExpressionParser parser = new ExpressionParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.prog();
        System.out.println(tree.toStringTree(parser));

        DefaultExpressionListener listener = new DefaultExpressionListener();
        new ParseTreeWalker().walk(listener, tree);
//        System.out.println("Compute as => " + listener.getTarget());
    }
}
