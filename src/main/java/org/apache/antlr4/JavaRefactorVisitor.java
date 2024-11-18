// Generated from JavaRefactor.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaRefactorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaRefactorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#classFileDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFileDefinition(JavaRefactorParser.ClassFileDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaRefactorParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaRefactorParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaRefactorParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(JavaRefactorParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#deriveDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriveDeclaration(JavaRefactorParser.DeriveDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaRefactorParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariableDeclaration(JavaRefactorParser.GlobalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaRefactorParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#annotationDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationDeclaration(JavaRefactorParser.AnnotationDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#methodArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArguments(JavaRefactorParser.MethodArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionDeclaration(JavaRefactorParser.ExceptionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaRefactorParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#codeSnippets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeSnippets(JavaRefactorParser.CodeSnippetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaRefactorParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#otherStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherStatements(JavaRefactorParser.OtherStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JavaRefactorParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#javaType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaType(JavaRefactorParser.JavaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaRefactorParser#stringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(JavaRefactorParser.StringValueContext ctx);
}