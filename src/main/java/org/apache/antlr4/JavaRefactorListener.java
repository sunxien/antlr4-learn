// Generated from JavaRefactor.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaRefactorParser}.
 */
public interface JavaRefactorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#classFileDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassFileDefinition(JavaRefactorParser.ClassFileDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#classFileDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassFileDefinition(JavaRefactorParser.ClassFileDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaRefactorParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaRefactorParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaRefactorParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaRefactorParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaRefactorParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaRefactorParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(JavaRefactorParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(JavaRefactorParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#deriveDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeriveDeclaration(JavaRefactorParser.DeriveDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#deriveDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeriveDeclaration(JavaRefactorParser.DeriveDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaRefactorParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaRefactorParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclaration(JavaRefactorParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclaration(JavaRefactorParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaRefactorParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaRefactorParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationDeclaration(JavaRefactorParser.AnnotationDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationDeclaration(JavaRefactorParser.AnnotationDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void enterMethodArguments(JavaRefactorParser.MethodArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void exitMethodArguments(JavaRefactorParser.MethodArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptionDeclaration(JavaRefactorParser.ExceptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptionDeclaration(JavaRefactorParser.ExceptionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaRefactorParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaRefactorParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#codeSnippets}.
	 * @param ctx the parse tree
	 */
	void enterCodeSnippets(JavaRefactorParser.CodeSnippetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#codeSnippets}.
	 * @param ctx the parse tree
	 */
	void exitCodeSnippets(JavaRefactorParser.CodeSnippetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaRefactorParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaRefactorParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#otherStatements}.
	 * @param ctx the parse tree
	 */
	void enterOtherStatements(JavaRefactorParser.OtherStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#otherStatements}.
	 * @param ctx the parse tree
	 */
	void exitOtherStatements(JavaRefactorParser.OtherStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JavaRefactorParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JavaRefactorParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#javaType}.
	 * @param ctx the parse tree
	 */
	void enterJavaType(JavaRefactorParser.JavaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#javaType}.
	 * @param ctx the parse tree
	 */
	void exitJavaType(JavaRefactorParser.JavaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaRefactorParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(JavaRefactorParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaRefactorParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(JavaRefactorParser.StringValueContext ctx);
}