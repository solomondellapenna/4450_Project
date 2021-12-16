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
		T__0=1, T__1=2, INTEGER=3, FLOAT=4, STRING=5, VAR_NAME=6, SKIP_WS=7, NEWLINE=8, 
		TAB=9, OPERATOR=10, MULTIPLY_OPERATOR=11, SUBTRACT_OPERATOR=12, ADD_OPERATOR=13, 
		EXP_OPERATOR=14, DIV_OPERATOR=15, INTDIV_OPERATOR=16, MOD_OPERATOR=17, 
		ASSIGN=18, LESS_THAN=19, GREATER_THAN=20, EQUALS_TO=21, GREATER_EQUALS=22, 
		LESSER_EQUALS=23, NOT_EQUALS=24, ADD_EQUALS=25, SUB_EQUALS=26, MULT_EQUALS=27, 
		DIV_EQUALS=28, OR_OPERATOR=29, AND_OPERATOR=30, NOT_OPERATOR=31, DOT=32, 
		COMMA=33, COLON=34, SEMI_COLON=35, O_PAR=36, C_PAR=37, O_BRACE=38, C_BRACE=39, 
		O_BRACKET=40, C_BRACKET=41, IF=42, ELSE=43, ELIF=44, FOR=45, WHILE=46, 
		CONTINUE=47, BREAK=48, OR=49, AND=50, NOT=51, COMPOUND_EXP=52, NONE=53, 
		TRUE=54, FALSE=55;
	public static final int
		RULE_arithmetic_exp = 0, RULE_num_arithmetic = 1, RULE_string_addition = 2, 
		RULE_atom = 3, RULE_comp_op = 4, RULE_test = 5, RULE_definition = 6, RULE_while_exp = 7, 
		RULE_stmt = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"arithmetic_exp", "num_arithmetic", "string_addition", "atom", "comp_op", 
			"test", "definition", "while_exp", "stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<>'", "' '", null, null, null, null, null, null, "'\t'", null, 
			"'*'", "'-'", "'+'", "'**'", "'/'", "'//'", "'%'", "'='", "'<'", "'>'", 
			"'=='", "'>='", "'<='", "'!='", "'+='", "'-='", "'*='", "'/='", "'|'", 
			"'&'", "'!'", "'.'", "','", "':'", "';'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'if'", "'else'", "'elif'", "'for'", "'while'", "'continue'", 
			"'break'", "'or'", "'and'", "'not'", null, "'None'", "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "INTEGER", "FLOAT", "STRING", "VAR_NAME", "SKIP_WS", 
			"NEWLINE", "TAB", "OPERATOR", "MULTIPLY_OPERATOR", "SUBTRACT_OPERATOR", 
			"ADD_OPERATOR", "EXP_OPERATOR", "DIV_OPERATOR", "INTDIV_OPERATOR", "MOD_OPERATOR", 
			"ASSIGN", "LESS_THAN", "GREATER_THAN", "EQUALS_TO", "GREATER_EQUALS", 
			"LESSER_EQUALS", "NOT_EQUALS", "ADD_EQUALS", "SUB_EQUALS", "MULT_EQUALS", 
			"DIV_EQUALS", "OR_OPERATOR", "AND_OPERATOR", "NOT_OPERATOR", "DOT", "COMMA", 
			"COLON", "SEMI_COLON", "O_PAR", "C_PAR", "O_BRACE", "C_BRACE", "O_BRACKET", 
			"C_BRACKET", "IF", "ELSE", "ELIF", "FOR", "WHILE", "CONTINUE", "BREAK", 
			"OR", "AND", "NOT", "COMPOUND_EXP", "NONE", "TRUE", "FALSE"
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
		public TerminalNode OPERATOR() { return getToken(Python3Parser.OPERATOR, 0); }
		public List<Arithmetic_expContext> arithmetic_exp() {
			return getRuleContexts(Arithmetic_expContext.class);
		}
		public Arithmetic_expContext arithmetic_exp(int i) {
			return getRuleContext(Arithmetic_expContext.class,i);
		}
		public TerminalNode INTEGER() { return getToken(Python3Parser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(Python3Parser.FLOAT, 0); }
		public Num_arithmeticContext num_arithmetic() {
			return getRuleContext(Num_arithmeticContext.class,0);
		}
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
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(19);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(20);
				match(OPERATOR);
				setState(21);
				arithmetic_exp(2);
				}
				break;
			case 2:
				{
				setState(22);
				num_arithmetic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_exp);
						setState(25);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(26);
						match(OPERATOR);
						setState(27);
						arithmetic_exp(5);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_exp);
						setState(28);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(29);
						match(OPERATOR);
						setState(30);
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
				setState(35);
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

	public static class Num_arithmeticContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(Python3Parser.OPERATOR, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Python3Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Python3Parser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(Python3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Python3Parser.FLOAT, i);
		}
		public Num_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterNum_arithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitNum_arithmetic(this);
		}
	}

	public final Num_arithmeticContext num_arithmetic() throws RecognitionException {
		Num_arithmeticContext _localctx = new Num_arithmeticContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_num_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(37);
			match(OPERATOR);
			setState(38);
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
		enterRule(_localctx, 4, RULE_string_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(STRING);
			setState(41);
			match(ADD_OPERATOR);
			setState(42);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Python3Parser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(Python3Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(Python3Parser.STRING, 0); }
		public TerminalNode VAR_NAME() { return getToken(Python3Parser.VAR_NAME, 0); }
		public TerminalNode NONE() { return getToken(Python3Parser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(Python3Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Python3Parser.FALSE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << VAR_NAME) | (1L << NONE) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(Python3Parser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Python3Parser.GREATER_THAN, 0); }
		public TerminalNode EQUALS_TO() { return getToken(Python3Parser.EQUALS_TO, 0); }
		public TerminalNode GREATER_EQUALS() { return getToken(Python3Parser.GREATER_EQUALS, 0); }
		public TerminalNode LESSER_EQUALS() { return getToken(Python3Parser.LESSER_EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(Python3Parser.NOT_EQUALS, 0); }
		public TerminalNode AND_OPERATOR() { return getToken(Python3Parser.AND_OPERATOR, 0); }
		public TerminalNode OR_OPERATOR() { return getToken(Python3Parser.OR_OPERATOR, 0); }
		public TerminalNode NOT_OPERATOR() { return getToken(Python3Parser.NOT_OPERATOR, 0); }
		public TerminalNode OR() { return getToken(Python3Parser.OR, 0); }
		public TerminalNode NOT() { return getToken(Python3Parser.NOT, 0); }
		public TerminalNode AND() { return getToken(Python3Parser.AND, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS_TO) | (1L << GREATER_EQUALS) | (1L << LESSER_EQUALS) | (1L << NOT_EQUALS) | (1L << OR_OPERATOR) | (1L << AND_OPERATOR) | (1L << NOT_OPERATOR) | (1L << OR) | (1L << AND) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TestContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitTest(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			atom();
			setState(49);
			comp_op();
			setState(50);
			atom();
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(Python3Parser.VAR_NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(Python3Parser.ASSIGN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(VAR_NAME);
			setState(53);
			match(ASSIGN);
			setState(54);
			atom();
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

	public static class While_expContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Python3Parser.WHILE, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Python3Parser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
		public TerminalNode TAB() { return getToken(Python3Parser.TAB, 0); }
		public List<TerminalNode> COMPOUND_EXP() { return getTokens(Python3Parser.COMPOUND_EXP); }
		public TerminalNode COMPOUND_EXP(int i) {
			return getToken(Python3Parser.COMPOUND_EXP, i);
		}
		public While_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterWhile_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitWhile_exp(this);
		}
	}

	public final While_expContext while_exp() throws RecognitionException {
		While_expContext _localctx = new While_expContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_exp);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(WHILE);
				setState(57);
				match(T__1);
				setState(58);
				test();
				setState(59);
				match(COLON);
				setState(60);
				match(NEWLINE);
				setState(61);
				match(TAB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(WHILE);
				setState(64);
				match(T__1);
				setState(65);
				test();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMPOUND_EXP) {
					{
					{
					setState(66);
					match(COMPOUND_EXP);
					setState(67);
					match(T__1);
					setState(68);
					test();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(COLON);
				setState(75);
				match(NEWLINE);
				setState(76);
				match(TAB);
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

	public static class StmtContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public Arithmetic_expContext arithmetic_exp() {
			return getRuleContext(Arithmetic_expContext.class,0);
		}
		public While_expContext while_exp() {
			return getRuleContext(While_expContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Python3Listener ) ((Python3Listener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				arithmetic_exp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				while_exp();
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39Y\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\32\n\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tH\n\t\f"+
		"\t\16\tK\13\t\3\t\3\t\3\t\3\t\5\tQ\n\t\3\n\3\n\3\n\3\n\5\nW\n\n\3\n\2"+
		"\3\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\5\6\4\2\5\b\679\6\2\3\3\25\32\37"+
		"!\63\65\2W\2\31\3\2\2\2\4&\3\2\2\2\6*\3\2\2\2\b.\3\2\2\2\n\60\3\2\2\2"+
		"\f\62\3\2\2\2\16\66\3\2\2\2\20P\3\2\2\2\22V\3\2\2\2\24\25\b\2\1\2\25\26"+
		"\t\2\2\2\26\27\7\f\2\2\27\32\5\2\2\4\30\32\5\4\3\2\31\24\3\2\2\2\31\30"+
		"\3\2\2\2\32#\3\2\2\2\33\34\f\6\2\2\34\35\7\f\2\2\35\"\5\2\2\7\36\37\f"+
		"\5\2\2\37 \7\f\2\2 \"\t\2\2\2!\33\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&\'\t\2\2\2\'(\7\f\2\2()\t\2\2\2)\5"+
		"\3\2\2\2*+\7\7\2\2+,\7\17\2\2,-\7\7\2\2-\7\3\2\2\2./\t\3\2\2/\t\3\2\2"+
		"\2\60\61\t\4\2\2\61\13\3\2\2\2\62\63\5\b\5\2\63\64\5\n\6\2\64\65\5\b\5"+
		"\2\65\r\3\2\2\2\66\67\7\b\2\2\678\7\24\2\289\5\b\5\29\17\3\2\2\2:;\7\60"+
		"\2\2;<\7\4\2\2<=\5\f\7\2=>\7$\2\2>?\7\n\2\2?@\7\13\2\2@Q\3\2\2\2AB\7\60"+
		"\2\2BC\7\4\2\2CI\5\f\7\2DE\7\66\2\2EF\7\4\2\2FH\5\f\7\2GD\3\2\2\2HK\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7$\2\2MN\7\n\2\2NO\7"+
		"\13\2\2OQ\3\2\2\2P:\3\2\2\2PA\3\2\2\2Q\21\3\2\2\2RW\5\f\7\2SW\5\16\b\2"+
		"TW\5\2\2\2UW\5\20\t\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\23\3\2"+
		"\2\2\b\31!#IPV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}