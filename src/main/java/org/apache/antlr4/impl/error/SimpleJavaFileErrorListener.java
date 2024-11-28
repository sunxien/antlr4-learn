package org.apache.antlr4.impl.error;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.dfa.DFA;
import org.apache.antlr4.SimpleJavaFileLexer;
import org.apache.antlr4.SimpleJavaFileParser;

import java.io.InputStream;
import java.util.BitSet;
import java.util.List;

/**
 * @author sunxien
 */
public class SimpleJavaFileErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        underlineErrorToken(recognizer, offendingSymbol, line, charPositionInLine);

        if (recognizer instanceof Parser) {
            System.err.println("-------------------- Parser Begin --------------------");
            System.err.println("错误位置: [" + line + ", " + charPositionInLine + "]");
            System.err.println("词法符号: " + offendingSymbol);
            System.err.println("错误信息: " + msg);

            StringBuilder tree = new StringBuilder(1024);
            List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
            for (int i = stack.size() - 1; i > -1; i--) {
                tree.append(stack.get(i));
                if (i > 0) {
                    tree.append(" -> ");
                }
            }
            System.err.println("规则调用: " + tree);
            System.err.println("-------------------- Parser Ending --------------------");

        } else if (recognizer instanceof Lexer) {
            System.err.println("-------------------- Lexer Begin --------------------");
            // super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
            // System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
            System.err.println("-------------------- Lexer Ending --------------------");
        } else {
            System.err.println("-------------------- Syntax Begin --------------------");
            super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
            System.err.println("-------------------- Syntax Ending --------------------");
        }
    }

    private void underlineErrorToken(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine) {
        CommonTokenStream cts = (CommonTokenStream) recognizer.getInputStream();
        String[] tokenSourceLines = cts.getTokenSource().getInputStream().toString().split("\n");

        StringBuilder markErrorLine = new StringBuilder(256);
        markErrorLine.append(tokenSourceLines[line - 1]).append("\n");

        markErrorLine.append(" ".repeat(Math.max(0, charPositionInLine)));

        CommonToken ct = ((CommonToken) offendingSymbol);
        final int startIndex = ct.getStartIndex();
        final int stopIndex = ct.getStopIndex();
        if (startIndex > -1 && stopIndex > -1) {
            markErrorLine.append("^".repeat(Math.max(0, stopIndex - startIndex + 1)));
        }
        System.err.println(markErrorLine);
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        super.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("dataset/SimpleJava.snippet")) {
            if (is == null) {
                throw new IllegalArgumentException("load dataset/SimpleJava.snippet failed");
            }

            SimpleJavaFileErrorListener errorListener = new SimpleJavaFileErrorListener();

            SimpleJavaFileLexer lexer = new SimpleJavaFileLexer(CharStreams.fromStream(is));
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);

            SimpleJavaFileParser parser = new SimpleJavaFileParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

            parser.prog();
        } catch (Exception ex) {
            System.err.println("Error Listener: " + ex.getMessage());
        }
    }
}
