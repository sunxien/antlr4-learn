package org.apache.antlr4.impl.listener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.antlr4.ArrayInitBaseListener;
import org.apache.antlr4.ArrayInitLexer;
import org.apache.antlr4.ArrayInitParser;

import java.util.Formatter;

/**
 * @author sunxien
 */
public class DefaultArrayInitListener extends ArrayInitBaseListener {

    final StringBuilder sb;

    /**
     *
     */
    public DefaultArrayInitListener() {
        this.sb = new StringBuilder();
    }

    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        sb.append("\"");
        super.enterInit(ctx);
    }

    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        sb.append("\"");
        super.exitInit(ctx);
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        TerminalNode terminalNode = ctx.DIGIT();
        // DIGIT() is null, enter init rule.
        if (terminalNode != null) {
            String text = ctx.DIGIT().getText();
            Integer val = Integer.parseInt(text);
            sb.append(new Formatter().format("\\u%04x", val));
        }
        super.enterValue(ctx);
    }

    @Override
    public void exitValue(ArrayInitParser.ValueContext ctx) {
        super.exitValue(ctx);
    }

    /**
     * @return String
     */
    public String getTarget() {
        try {
            return sb.toString();
        } finally {
            sb.setLength(0); // reset
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        CharStream stream = CharStreams.fromString("{1,{2,3,4},5}");
        ArrayInitLexer lexer = new ArrayInitLexer(stream);
        // About ParseTree, CommonTokenStream (See at Section 4.1)
        ArrayInitParser parser = new ArrayInitParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));

        DefaultArrayInitListener listener = new DefaultArrayInitListener();
        new ParseTreeWalker().walk(listener, tree);
        System.out.println("Translate to => " + listener.getTarget());
    }
}
