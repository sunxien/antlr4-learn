// Generated from JSONFile.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONFileParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JSONFileParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONFileParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JSONFileParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONFileParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JSONFileParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONFileParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(JSONFileParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONFileParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(JSONFileParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atomic_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_Val(JSONFileParser.Atomic_ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Val(JSONFileParser.String_ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_Val(JSONFileParser.Number_ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Object_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_Val(JSONFileParser.Object_ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Array_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Val(JSONFileParser.Array_ValContext ctx);
}