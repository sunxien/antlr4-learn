//package org.apache.antlr4.impl.listener;
//
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.apache.antlr4.CSVFileBaseListener;
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
//public class DefaultCSVFileListener extends CSVFileBaseListener {
//
//    //
//    private final List<Object> header;
//    private final List<List<Object>> rowset;
//    private final List<Object> rowdata;
//
//    /**
//     *
//     */
//    public DefaultCSVFileListener() {
//        this.header = new ArrayList<>();
//        this.rowset = new ArrayList<>();
//        this.rowdata = new ArrayList<>();
//    }
//
//    @Override
//    public void exitHeader(CSVFileParser.HeaderContext ctx) {
//        this.header.addAll(new ArrayList<>(this.rowdata));
//        this.rowdata.clear();
//    }
//
//    @Override
//    public void exitFields(CSVFileParser.FieldsContext ctx) {
//        if (ctx.parent instanceof CSVFileParser.RowsetContext) {
//            this.rowset.add(new ArrayList<>(this.rowdata));
//            this.rowdata.clear();
//        }
//    }
//
//    @Override
//    public void exitString(CSVFileParser.StringContext ctx) {
//        String string = ctx.STRING_VAL().getText();
//        this.rowdata.add(string);
//    }
//
//    @Override
//    public void exitText(CSVFileParser.TextContext ctx) {
//        String text = ctx.PLAIN_TEXT().getText();
//        this.rowdata.add(text);
//    }
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
//            System.out.println(tree.toStringTree(parser));
//
//            DefaultCSVFileListener listener = new DefaultCSVFileListener();
//            new ParseTreeWalker().walk(listener, tree);
//
//
//            System.out.println("Header: " + listener.getHeader());
//            for (List<Object> rowset : listener.getRowSet()) {
//                System.out.println("Data: " + rowset);
//            }
//        } catch (Exception ex) {
//            System.err.println("DefaultCSVFileListener.main failed. Error: " + ex.getMessage());
//        }
//    }
//}
