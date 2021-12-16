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
	 * Enter a parse tree produced by {@link Python3Parser#arithmetic_comp}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_comp(Python3Parser.Arithmetic_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arithmetic_comp}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_comp(Python3Parser.Arithmetic_compContext ctx);
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
	 * Enter a parse tree produced by {@link Python3Parser#num_substraction}.
	 * @param ctx the parse tree
	 */
	void enterNum_substraction(Python3Parser.Num_substractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#num_substraction}.
	 * @param ctx the parse tree
	 */
	void exitNum_substraction(Python3Parser.Num_substractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#num_multiplication}.
	 * @param ctx the parse tree
	 */
	void enterNum_multiplication(Python3Parser.Num_multiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#num_multiplication}.
	 * @param ctx the parse tree
	 */
	void exitNum_multiplication(Python3Parser.Num_multiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#num_reg_division}.
	 * @param ctx the parse tree
	 */
	void enterNum_reg_division(Python3Parser.Num_reg_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#num_reg_division}.
	 * @param ctx the parse tree
	 */
	void exitNum_reg_division(Python3Parser.Num_reg_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#num_int_division}.
	 * @param ctx the parse tree
	 */
	void enterNum_int_division(Python3Parser.Num_int_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#num_int_division}.
	 * @param ctx the parse tree
	 */
	void exitNum_int_division(Python3Parser.Num_int_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterNum_exp(Python3Parser.Num_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitNum_exp(Python3Parser.Num_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#num_mod}.
	 * @param ctx the parse tree
	 */
	void enterNum_mod(Python3Parser.Num_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#num_mod}.
	 * @param ctx the parse tree
	 */
	void exitNum_mod(Python3Parser.Num_modContext ctx);
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