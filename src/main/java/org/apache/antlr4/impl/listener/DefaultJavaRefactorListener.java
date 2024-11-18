//package org.apache.antlr4.impl.listener;
//
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.apache.antlr4.JavaRefactorBaseListener;
//import org.apache.antlr4.JavaRefactorLexer;
//import org.apache.antlr4.JavaRefactorParser;
//
///**
// * @author sunxien
// */
//public class DefaultJavaRefactorListener extends JavaRefactorBaseListener {
//
//    final StringBuilder sb;
//
//    /**
//     *
//     */
//    public DefaultJavaRefactorListener() {
//        this.sb = new StringBuilder();
//    }
//
//    @Override
//    public void enterClassFileDefinition(JavaRefactorParser.ClassFileDefinitionContext ctx) {
//        int childCount = ctx.getChildCount();
//        String text = ctx.getText();
//        super.enterClassFileDefinition(ctx);
//    }
//
//    /**
//     * @param ctx the parse tree
//     */
//    @Override
//    public void enterPackageDeclaration(JavaRefactorParser.PackageDeclarationContext ctx) {
//        sb.append(ctx.getChild(0).getText());
//        sb.append(" ");
//        for (int i = 1; i < ctx.getChildCount(); i++) {
//            sb.append(ctx.getChild(i).getText());
//        }
//        super.enterPackageDeclaration(ctx);
//    }
//
//    /**
//     * @param ctx the parse tree
//     */
//    @Override
//    public void enterImportDeclaration(JavaRefactorParser.ImportDeclarationContext ctx) {
//        sb.append("\n");
//        sb.append(ctx.getChild(0).getText());
//        sb.append(" ");
//        for (int i = 1; i < ctx.getChildCount(); i++) {
//            sb.append(ctx.getChild(i).getText());
//        }
//        super.enterImportDeclaration(ctx);
//    }
//
//    @Override
//    public void enterClassDeclaration(JavaRefactorParser.ClassDeclarationContext ctx) {
//        sb.append("\n");
//        sb.append(ctx.getChild(0).getText()); // public
//        sb.append(" interface"); // class -> interface
//        sb.append(" I").append(ctx.getChild(2).getText()).append(" {\n"); // Demo -> IDemo
//        super.enterClassDeclaration(ctx);
//    }
//
//    @Override
//    public void enterMethodDeclaration(JavaRefactorParser.MethodDeclarationContext ctx) {
//        int childCount = ctx.getChildCount();
//        for (int i = 0; i < childCount; i++) {
//            ParseTree child = ctx.getChild(i);
//            if (child instanceof JavaRefactorParser.MethodArgumentsContext) {
//                break;
//            } else {
//                sb.append(" ");
//            }
//            sb.append(child.getText());
//        }
//        super.enterMethodDeclaration(ctx);
//    }
//
//    @Override
//    public void enterMethodArguments(JavaRefactorParser.MethodArgumentsContext ctx) {
//        int childCount = ctx.getChildCount();
//        sb.append(ctx.getChild(0).getText());
//        for (int i = 1; i < childCount - 1; i++) {
//            sb.append(ctx.getChild(i));
//            if (i != childCount - 2) {
//                sb.append(" ");
//            }
//        }
//        sb.append(ctx.getChild(childCount - 1).getText());
//        super.enterMethodArguments(ctx);
//    }
//
//    @Override
//    public void enterExceptionDeclaration(JavaRefactorParser.ExceptionDeclarationContext ctx) {
//        sb.append(" ").append(ctx.getChild(0).getText()).append(" ");
//        for (int i = 1; i < ctx.getChildCount(); i++) {
//            sb.append(ctx.getChild(i).getText());
//            if (i != ctx.getChildCount() - 1) {
//                sb.append(",");
//            }
//        }
//        super.enterExceptionDeclaration(ctx);
//    }
//
//    @Override
//    public void exitMethodBody(JavaRefactorParser.MethodBodyContext ctx) {
//        sb.append(";\n");
//        super.exitMethodBody(ctx);
//    }
//
//    @Override
//    public void exitClassDeclaration(JavaRefactorParser.ClassDeclarationContext ctx) {
//        sb.append("}");
//        System.out.println(sb);
//        super.exitClassDeclaration(ctx);
//    }
//
//    /**
//     *
//     */
//    static final String JAVA_SNIPPET =
//            "package org.apache.antlr4.impl;\n\n" +
//                    "import java.util.List;\n" +
//                    "import java.util.Map;\n\n" +
//                    "public class Demo {\n\n" +
//                    "\tpublic void init(int x, int y) throws IOException {\n\t}\n\n" +
//                    "\tpublic int[] toString() {\n\t\treturn null;\n\t}\n" +
//                    "\n}\n";
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//
//        System.out.println(JAVA_SNIPPET);
//
//        CharStream stream = CharStreams.fromString(JAVA_SNIPPET);
//        JavaRefactorLexer lexer = new JavaRefactorLexer(stream);
//        JavaRefactorParser parser = new JavaRefactorParser(new CommonTokenStream(lexer));
//        ParseTree tree = parser.classFileDefinition();
//        System.out.println(tree.toStringTree(parser));
//
//        DefaultJavaRefactorListener listener = new DefaultJavaRefactorListener();
//        new ParseTreeWalker().walk(listener, tree);
//        System.out.println("==========================================");
//    }
//}
