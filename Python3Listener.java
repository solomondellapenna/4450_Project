// Generated from Python3.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python3Parser#num_addition}.
	 * @param ctx the parse tree
	 */
	void enterNum_addition(Python3Parser.Num_additionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#num_addition}.
	 * @param ctx the parse tree
	 */
	void exitNum_addition(Python3Parser.Num_additionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#string_addition}.
	 * @param ctx the parse tree
	 */
	void enterString_addition(Python3Parser.String_additionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#string_addition}.
	 * @param ctx the parse tree
	 */
	void exitString_addition(Python3Parser.String_additionContext ctx);
}