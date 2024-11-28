// Generated from SimpleJavaFile.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleJavaFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleJavaFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleJavaFileParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimpleJavaFileParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaFileParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(SimpleJavaFileParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaFileParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(SimpleJavaFileParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaFileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SimpleJavaFileParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleJavaFileParser.ExprContext ctx);
}