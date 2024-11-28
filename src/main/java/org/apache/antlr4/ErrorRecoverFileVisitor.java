// Generated from ErrorRecoverFile.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ErrorRecoverFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ErrorRecoverFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ErrorRecoverFileParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(ErrorRecoverFileParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErrorRecoverFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ErrorRecoverFileParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErrorRecoverFileParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ErrorRecoverFileParser.AtomContext ctx);
}