// Generated from JSONFile.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONFileParser}.
 */
public interface JSONFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONFileParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONFileParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONFileParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONFileParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONFileParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JSONFileParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONFileParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JSONFileParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONFileParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONFileParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONFileParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONFileParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONFileParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONFileParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONFileParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONFileParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONFileParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(JSONFileParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONFileParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(JSONFileParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atomic_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_Val(JSONFileParser.Atomic_ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atomic_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_Val(JSONFileParser.Atomic_ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString_Val(JSONFileParser.String_ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString_Val(JSONFileParser.String_ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumber_Val(JSONFileParser.Number_ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumber_Val(JSONFileParser.Number_ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Object_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObject_Val(JSONFileParser.Object_ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Object_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObject_Val(JSONFileParser.Object_ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Array_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArray_Val(JSONFileParser.Array_ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array_Val}
	 * labeled alternative in {@link JSONFileParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArray_Val(JSONFileParser.Array_ValContext ctx);
}