// Generated from Python3.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Python3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, FLOAT=2, STRING=3, VAR_NAME=4, WHITE_SPACE=5, NEWLINE=6, OPERATOR=7, 
		MULTIPLY_OPERATOR=8, SUBTRACT_OPERATOR=9, ADD_OPERATOR=10, EXP_OPERATOR=11, 
		DIV_OPERATOR=12, INTDIV_OPERATOR=13, MOD_OPERATOR=14, ASSIGN=15, LESS_THAN=16, 
		GREATER_THAN=17, EQUALS_TO=18, GREATER_EQUALS=19, LESSER_EQUALS=20, NOT_EQUALS=21, 
		ADD_EQUALS=22, SUB_EQUALS=23, MULT_EQUALS=24, DIV_EQUALS=25, OR_OPERATOR=26, 
		AND_OPERATOR=27, DOT=28, COMMA=29, COLON=30, SEMI_COLON=31, O_PAR=32, 
		C_PAR=33, O_BRACE=34, C_BRACE=35, O_BRACKET=36, C_BRACKET=37, IF=38, ELSE=39, 
		ELIF=40, FOR=41, WHILE=42, CONTINUE=43, BREAK=44, OR=45, AND=46, NOT=47, 
		TRUE=48, FALSE=49;
	public static final int
		RULE_arithmetic_exp = 0, RULE_arithmetic_comp = 1, RULE_num_addition = 2, 
		RULE_num_substraction = 3, RULE_num_multiplication = 4, RULE_num_reg_division = 5, 
		RULE_num_int_division = 6, RULE_num_exp = 7, RULE_num_mod = 8, RULE_string_addition = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"arithmetic_exp", "arithmetic_comp", "num_addition", "num_substraction", 
			"num_multiplication", "num_reg_division", "num_int_division", "num_exp", 
			"num_mod", "string_addition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'*'", "'-'", "'+'", 
			"'**'", "'/'", "'//'", "'%'", "'='", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='", "'+='", "'-='", "'*='", "'/='", "'|'", "'&'", "'.'", "','", "':'", 
			"';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'if'", "'else'", "'elif'", 
			"'for'", "'while'", "'continue'", "'break'", "'or'", "'and'", "'not'", 
			"'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER", "FLOAT", "STRING", "VAR_NAME", "WHITE_SPACE", "NEWLINE", 
			"OPERATOR", "MULTIPLY_OPERATOR", "SUBTRACT_OPERATOR", "ADD_OPERATOR", 
			"EXP_OPERATOR", "DIV_OPERATOR", "INTDIV_OPERATOR", "MOD_OPERATOR", "ASSIGN", 
			"LESS_THAN", "GREATER_THAN", "EQUALS_TO", "GREATER_EQUALS", "LESSER_EQUALS", 
			"NOT_EQUALS", "ADD_EQUALS", "SUB_EQUALS", "MULT_EQUALS", "DIV_EQUALS", 
			"OR_OPERATOR", "AND_OPERATOR", "DOT", "COMMA", "COLON", "SEMI_COLON", 
			"O_PAR", "C_PAR", "O_BRACE", "C_BRACE", "O_BRACKET", "C_BRACKET", "IF", 
			"ELSE", "ELIF", "FOR", "WHILE", "CONTINUE", "BREAK", "OR", "AND", "NOT", 
			"TRUE", "FALSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Python3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Python3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Arithmetic_expContext extends ParserRuleContext {
		public Arithmetic_compContext arithmetic_comp() {
			return getRuleContext(Arithmetic_compContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(Python3Parser.OPERATOR, 0); }
		public List<Arithmetic_expContext> arithmetic_exp() {
			return getRuleContexts(Arithmetic_expContext.class);
		}
		public Arithmetic_expContext arithmetic_exp(int i) {
			return getRuleContext(Arithmetic_expContext.class,i);
		}
		public TerminalNode INTEGER() { return getToken(Python3Parser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(Python3Parser.FLOAT, 0); }
		public Arithmetic_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterArithmetic_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitArithmetic_exp(this);
		}
	}

	public final Arithmetic_expContext arithmetic_exp() throws RecognitionException {
		return arithmetic_exp(0);
	}

	private Arithmetic_expContext arithmetic_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expContext _localctx = new Arithmetic_expContext(_ctx, _parentState);
		Arithmetic_expContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_arithmetic_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(21);
				arithmetic_comp();
				}
				break;
			case 2:
				{
				setState(22);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(23);
				match(OPERATOR);
				setState(24);
				arithmetic_exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_exp);
						setState(27);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(28);
						match(OPERATOR);
						setState(29);
						arithmetic_exp(4);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_exp);
						setState(30);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(31);
						match(OPERATOR);
						setState(32);
						_la = _input.LA(1);
						if ( !(_la==INTEGER || _la==FLOAT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Arithmetic_compContext extends ParserRuleContext {
		public Num_additionContext num_addition() {
			return getRuleContext(Num_additionContext.class,0);
		}
		public Num_substractionContext num_substraction() {
			return getRuleContext(Num_substractionContext.class,0);
		}
		public Num_multiplicationContext num_multiplication() {
			return getRuleContext(Num_multiplicationContext.class,0);
		}
		public Num_reg_divisionContext num_reg_division() {
			return getRuleContext(Num_reg_divisionContext.class,0);
		}
		public Num_int_divisionContext num_int_division() {
			return getRuleContext(Num_int_divisionContext.class,0);
		}
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public Num_modContext num_mod() {
			return getRuleContext(Num_modContext.class,0);
		}
		public Arithmetic_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterArithmetic_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitArithmetic_comp(this);
		}
	}

	public final Arithmetic_compContext arithmetic_comp() throws RecognitionException {
		Arithmetic_compContext _localctx = new Arithmetic_compContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arithmetic_comp);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				num_addition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				num_substraction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				num_multiplication();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				num_reg_division();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				num_int_division();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				num_exp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				num_mod();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_additionContext extends ParserRuleContext {
		public TerminalNode ADD_OPERATOR() { return getToken(Python3Parser.ADD_OPERATOR, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(Python3Parser.WHITE_SPACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Python3Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Python3Parser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python3Parser.FLOAT, i);
		}
		public Num_additionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNum_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNum_addition(this);
		}
	}

	public final Num_additionContext num_addition() throws RecognitionException {
		Num_additionContext _localctx = new Num_additionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_num_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
			match(ADD_OPERATOR);
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			match(WHITE_SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_substractionContext extends ParserRuleContext {
		public TerminalNode SUBTRACT_OPERATOR() { return getToken(Python3Parser.SUBTRACT_OPERATOR, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(Python3Parser.WHITE_SPACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Python3Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Python3Parser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python3Parser.FLOAT, i);
		}
		public Num_substractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_substraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNum_substraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNum_substraction(this);
		}
	}

	public final Num_substractionContext num_substraction() throws RecognitionException {
		Num_substractionContext _localctx = new Num_substractionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_num_substraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			match(SUBTRACT_OPERATOR);
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(55);
			match(WHITE_SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_multiplicationContext extends ParserRuleContext {
		public TerminalNode MULTIPLY_OPERATOR() { return getToken(Python3Parser.MULTIPLY_OPERATOR, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(Python3Parser.WHITE_SPACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Python3Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Python3Parser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python3Parser.FLOAT, i);
		}
		public Num_multiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNum_multiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNum_multiplication(this);
		}
	}

	public final Num_multiplicationContext num_multiplication() throws RecognitionException {
		Num_multiplicationContext _localctx = new Num_multiplicationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_num_multiplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(58);
			match(MULTIPLY_OPERATOR);
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(60);
			match(WHITE_SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_reg_divisionContext extends ParserRuleContext {
		public TerminalNode DIV_OPERATOR() { return getToken(Python3Parser.DIV_OPERATOR, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(Python3Parser.WHITE_SPACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Python3Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Python3Parser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python3Parser.FLOAT, i);
		}
		public Num_reg_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_reg_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNum_reg_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNum_reg_division(this);
		}
	}

	public final Num_reg_divisionContext num_reg_division() throws RecognitionException {
		Num_reg_divisionContext _localctx = new Num_reg_divisionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num_reg_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(63);
			match(DIV_OPERATOR);
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(WHITE_SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_int_divisionContext extends ParserRuleContext {
		public TerminalNode INTDIV_OPERATOR() { return getToken(Python3Parser.INTDIV_OPERATOR, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(Python3Parser.WHITE_SPACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Python3Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Python3Parser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python3Parser.FLOAT, i);
		}
		public Num_int_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_int_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNum_int_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNum_int_division(this);
		}
	}

	public final Num_int_divisionContext num_int_division() throws RecognitionException {
		Num_int_divisionContext _localctx = new Num_int_divisionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_num_int_division);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(68);
			match(INTDIV_OPERATOR);
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(WHITE_SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_expContext extends ParserRuleContext {
		public TerminalNode EXP_OPERATOR() { return getToken(Python3Parser.EXP_OPERATOR, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(Python3Parser.WHITE_SPACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Python3Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Python3Parser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python3Parser.FLOAT, i);
		}
		public Num_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNum_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNum_exp(this);
		}
	}

	public final Num_expContext num_exp() throws RecognitionException {
		Num_expContext _localctx = new Num_expContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_num_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(73);
			match(EXP_OPERATOR);
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			match(WHITE_SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_modContext extends ParserRuleContext {
		public TerminalNode MOD_OPERATOR() { return getToken(Python3Parser.MOD_OPERATOR, 0); }
		public TerminalNode WHITE_SPACE() { return getToken(Python3Parser.WHITE_SPACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Python3Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Python3Parser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python3Parser.FLOAT, i);
		}
		public Num_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNum_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNum_mod(this);
		}
	}

	public final Num_modContext num_mod() throws RecognitionException {
		Num_modContext _localctx = new Num_modContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_num_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(78);
			match(MOD_OPERATOR);
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			match(WHITE_SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_additionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(Python3Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Python3Parser.STRING, i);
		}
		public TerminalNode ADD_OPERATOR() { return getToken(Python3Parser.ADD_OPERATOR, 0); }
		public String_additionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterString_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitString_addition(this);
		}
	}

	public final String_additionContext string_addition() throws RecognitionException {
		String_additionContext _localctx = new String_additionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(STRING);
			setState(83);
			match(ADD_OPERATOR);
			setState(84);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return arithmetic_exp_sempred((Arithmetic_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_exp_sempred(Arithmetic_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\34\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2$\n\2\f\2\16"+
		"\2\'\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\2\3\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\3\4\2W\2\33\3\2\2\2\4/\3\2"+
		"\2\2\6\61\3\2\2\2\b\66\3\2\2\2\n;\3\2\2\2\f@\3\2\2\2\16E\3\2\2\2\20J\3"+
		"\2\2\2\22O\3\2\2\2\24T\3\2\2\2\26\27\b\2\1\2\27\34\5\4\3\2\30\31\t\2\2"+
		"\2\31\32\7\t\2\2\32\34\5\2\2\3\33\26\3\2\2\2\33\30\3\2\2\2\34%\3\2\2\2"+
		"\35\36\f\5\2\2\36\37\7\t\2\2\37$\5\2\2\6 !\f\4\2\2!\"\7\t\2\2\"$\t\2\2"+
		"\2#\35\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'%"+
		"\3\2\2\2(\60\5\6\4\2)\60\5\b\5\2*\60\5\n\6\2+\60\5\f\7\2,\60\5\16\b\2"+
		"-\60\5\20\t\2.\60\5\22\n\2/(\3\2\2\2/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2/,\3"+
		"\2\2\2/-\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61\62\t\2\2\2\62\63\7\f\2\2\63"+
		"\64\t\2\2\2\64\65\7\7\2\2\65\7\3\2\2\2\66\67\t\2\2\2\678\7\13\2\289\t"+
		"\2\2\29:\7\7\2\2:\t\3\2\2\2;<\t\2\2\2<=\7\n\2\2=>\t\2\2\2>?\7\7\2\2?\13"+
		"\3\2\2\2@A\t\2\2\2AB\7\16\2\2BC\t\2\2\2CD\7\7\2\2D\r\3\2\2\2EF\t\2\2\2"+
		"FG\7\17\2\2GH\t\2\2\2HI\7\7\2\2I\17\3\2\2\2JK\t\2\2\2KL\7\r\2\2LM\t\2"+
		"\2\2MN\7\7\2\2N\21\3\2\2\2OP\t\2\2\2PQ\7\20\2\2QR\t\2\2\2RS\7\7\2\2S\23"+
		"\3\2\2\2TU\7\5\2\2UV\7\f\2\2VW\7\5\2\2W\25\3\2\2\2\6\33#%/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}