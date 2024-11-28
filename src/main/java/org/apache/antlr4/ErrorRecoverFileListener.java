// Generated from ErrorRecoverFile.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErrorRecoverFileParser}.
 */
public interface ErrorRecoverFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErrorRecoverFileParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(ErrorRecoverFileParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErrorRecoverFileParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(ErrorRecoverFileParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErrorRecoverFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ErrorRecoverFileParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErrorRecoverFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ErrorRecoverFileParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErrorRecoverFileParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ErrorRecoverFileParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErrorRecoverFileParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ErrorRecoverFileParser.AtomContext ctx);
}