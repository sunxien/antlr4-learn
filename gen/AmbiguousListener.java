// Generated from /Users/sunxien/Repository/git/antlr4-learn/src/main/resources/Ambiguous.g4.bak by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmbiguousParser}.
 */
public interface AmbiguousListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmbiguousParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AmbiguousParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmbiguousParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AmbiguousParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmbiguousParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AmbiguousParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmbiguousParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AmbiguousParser.ExprContext ctx);
}