// Generated from /Users/sunxien/Repository/git/antlr4-learn/src/main/resources/Ambiguous.g4.bak by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AmbiguousParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AmbiguousVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AmbiguousParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(AmbiguousParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmbiguousParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AmbiguousParser.ExprContext ctx);
}