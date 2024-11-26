// Generated from MathInput.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathInputParser}.
 */
public interface MathInputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Mul_Div}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_Div(MathInputParser.Mul_DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul_Div}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_Div(MathInputParser.Mul_DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get_Int}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGet_Int(MathInputParser.Get_IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get_Int}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGet_Int(MathInputParser.Get_IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add_Sub}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_Sub(MathInputParser.Add_SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add_Sub}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_Sub(MathInputParser.Add_SubContext ctx);
}