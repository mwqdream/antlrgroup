// Generated from main.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mainParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(mainParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(mainParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(mainParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(mainParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(mainParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(mainParser.ExprContext ctx);
}