// Generated from Python3.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arithmetic_exp}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_exp(Python3Parser.Arithmetic_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arithmetic_exp}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_exp(Python3Parser.Arithmetic_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#num_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterNum_arithmetic(Python3Parser.Num_arithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#num_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitNum_arithmetic(Python3Parser.Num_arithmeticContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(Python3Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(Python3Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(Python3Parser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(Python3Parser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(Python3Parser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(Python3Parser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(Python3Parser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#while_exp}.
	 * @param ctx the parse tree
	 */
	void enterWhile_exp(Python3Parser.While_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#while_exp}.
	 * @param ctx the parse tree
	 */
	void exitWhile_exp(Python3Parser.While_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Python3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Python3Parser.StmtContext ctx);
}