// Generated from variables.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link variablesParser}.
 */
public interface variablesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link variablesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(variablesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link variablesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(variablesParser.StatementContext ctx);
}