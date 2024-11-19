//package org.apache.antlr4.impl.parser;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.apache.antlr4.CommonLexer;
//import org.apache.antlr4.CustomersParser;
//
///**
// *
// */
//public class CustomersActionParser {
//
//    /**
//     *
//     */
//    static final String CUSTOMER_CSV = //
//            "parrt\tTerence Parr\t101\n" + //
//            "tombu\tTom Burns\t020\n" + //
//            "bke\tKevin Edgar\t008\n";
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        System.out.println(CUSTOMER_CSV);
//
//        CommonLexer lexer = new CommonLexer(CharStreams.fromString(CUSTOMER_CSV));
//        CommonTokenStream stream = new CommonTokenStream(lexer);
//        int col = 3;
//        CustomersParser parser = new CustomersParser(stream, col);
//        parser.setBuildParseTree(false);
//        parser.customers();
//    }
//}
