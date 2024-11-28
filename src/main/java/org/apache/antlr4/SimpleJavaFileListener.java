// Generated from SimpleJavaFile.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaFileParser}.
 */
public interface SimpleJavaFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleJavaFileParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleJavaFileParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaFileParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleJavaFileParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaFileParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(SimpleJavaFileParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaFileParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(SimpleJavaFileParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaFileParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(SimpleJavaFileParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaFileParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(SimpleJavaFileParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaFileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleJavaFileParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaFileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleJavaFileParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleJavaFileParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleJavaFileParser.ExprContext ctx);
}