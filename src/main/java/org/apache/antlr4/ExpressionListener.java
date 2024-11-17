// Generated from Expression.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpressionParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpressionParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Target_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterTarget_Label(ExpressionParser.Target_LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Target_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitTarget_Label(ExpressionParser.Target_LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign_Label(ExpressionParser.Assign_LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign_Label(ExpressionParser.Assign_LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code None_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNone_Label(ExpressionParser.None_LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code None_Label}
	 * labeled alternative in {@link ExpressionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNone_Label(ExpressionParser.None_LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulAndDiv_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulAndDiv_Label(ExpressionParser.MulAndDiv_LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulAndDiv_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulAndDiv_Label(ExpressionParser.MulAndDiv_LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable_Label(ExpressionParser.Variable_LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable_Label(ExpressionParser.Variable_LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddAndSub_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddAndSub_Label(ExpressionParser.AddAndSub_LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddAndSub_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddAndSub_Label(ExpressionParser.AddAndSub_LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexExpr_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComplexExpr_Label(ExpressionParser.ComplexExpr_LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexExpr_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComplexExpr_Label(ExpressionParser.ComplexExpr_LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber_Label(ExpressionParser.Number_LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number_Label}
	 * labeled alternative in {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber_Label(ExpressionParser.Number_LabelContext ctx);
}