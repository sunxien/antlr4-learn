//package org.apache.antlr4.impl.visitor;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.TerminalNode;
//import org.apache.antlr4.CSVFileBaseVisitor;
//import org.apache.antlr4.CSVFileLexer;
//import org.apache.antlr4.CSVFileParser;
//
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Parse CSV records.
// *
// * @author sunxien
// */
//public class DefaultCSVFileVisitor extends CSVFileBaseVisitor {
//
//    //
//    private final List<Object> header;
//    private final List<List<Object>> rowset;
//
//    //
//    public DefaultCSVFileVisitor() {
//        this.header = new ArrayList<>();
//        this.rowset = new ArrayList<>();
//    }
//
//    @Override
//    public Object visitText(CSVFileParser.TextContext ctx) {
//        return ctx.getText();
//    }
//
//    @Override
//    public Object visitString(CSVFileParser.StringContext ctx) {
//        return ctx.getChild(0).getText();
//    }
//
//    @Override
//    public Object visitHeader(CSVFileParser.HeaderContext ctx) {
//        CSVFileParser.FieldsContext fctx = ctx.fields();
//        final int childCount = fctx.getChildCount();
//        for (int i = 0; i < childCount; i++) {
//            ParseTree child = fctx.getChild(i);
//            if (child instanceof CSVFileParser.TextContext) {
//                this.header.add(visit(child));
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Object visitRowset(CSVFileParser.RowsetContext ctx) {
//        List<CSVFileParser.FieldsContext> fctxs = ctx.fields();
//        for (CSVFileParser.FieldsContext fctx : fctxs) {
//            List<Object> row = new ArrayList<>();
//            final int childCount = fctx.getChildCount();
//            for (int i = 0; i < childCount; i++) {
//                ParseTree child = fctx.getChild(i);
//                if (!(child instanceof TerminalNode)) {
//                    row.add(visit(fctx.getChild(i)));
//                }
//            }
//            this.rowset.add(row);
//        }
//        return null;
//    }
//
//
//    public List<Object> getHeader() {
//        return this.header;
//    }
//
//    public List<List<Object>> getRowSet() {
//        return this.rowset;
//    }
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("dataset/customer.csv")) {
//            if (is == null) {
//                throw new IllegalArgumentException("load csv file failed.");
//            }
//            CSVFileLexer lexer = new CSVFileLexer(CharStreams.fromStream(is));
//            CSVFileParser parser = new CSVFileParser(new CommonTokenStream(lexer));
//            ParseTree tree = parser.file();
//            // System.out.println(tree.toStringTree(parser));
//
//            DefaultCSVFileVisitor visitor = new DefaultCSVFileVisitor();
//            visitor.visit(tree);
//
//            System.out.println("Header: " + visitor.getHeader());
//            for (List<Object> rowset : visitor.getRowSet()) {
//                System.out.println("Data: " + rowset);
//            }
//        } catch (Exception ex) {
//            System.err.println("DefaultCSVFileVisitor.main failed. Error: " + ex.getMessage());
//        }
//    }
//}
