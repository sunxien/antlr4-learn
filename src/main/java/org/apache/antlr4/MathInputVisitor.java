// Generated from MathInput.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathInputParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathInputVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Mul_Div}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_Div(MathInputParser.Mul_DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get_Int}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_Int(MathInputParser.Get_IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add_Sub}
	 * labeled alternative in {@link MathInputParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_Sub(MathInputParser.Add_SubContext ctx);
}