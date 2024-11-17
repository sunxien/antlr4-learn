// Generated from Expression.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExpressionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Target_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_Label(ExpressionParser.Target_LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_Label(ExpressionParser.Assign_LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code None_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNone_Label(ExpressionParser.None_LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulAndDiv_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulAndDiv_Label(ExpressionParser.MulAndDiv_LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_Label(ExpressionParser.Variable_LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddAndSub_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddAndSub_Label(ExpressionParser.AddAndSub_LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexExpr_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExpr_Label(ExpressionParser.ComplexExpr_LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_Label(ExpressionParser.Number_LabelContext ctx);
}