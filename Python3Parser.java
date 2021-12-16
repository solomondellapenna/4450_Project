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
		INTEGER=1, FLOAT=2, STRING=3, VAR_NAME=4, WHITE_SPACE=5, NEWLINE=6, ADD_OPERATOR=7, 
		MINUS_OPERATOR=8, EXP_OPERATOR=9, DIV_OPERATOR=10, INTDIV_OPERATOR=11, 
		MOD_OPERATOR=12, ASSIGN=13, LESS_THAN=14, GREATER_THAN=15, EQUALS_TO=16, 
		GREATER_EQUALS=17, LESSER_EQUALS=18, NOT_EQUALS=19, ADD_EQUALS=20, SUB_EQUALS=21, 
		MULT_EQUALS=22, DIV_EQUALS=23, OR_OPERATOR=24, AND_OPERATOR=25, DOT=26, 
		COMMA=27, COLON=28, SEMI_COLON=29, O_PAR=30, C_PAR=31, O_BRACE=32, C_BRACE=33, 
		O_BRACKET=34, C_BRACKET=35, IF=36, ELSE=37, ELIF=38, FOR=39, WHILE=40, 
		CONTINUE=41, BREAK=42, OR=43, AND=44, NOT=45, TRUE=46, FALSE=47;
	public static final int
		RULE_num_addition = 0, RULE_string_addition = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"num_addition", "string_addition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'+'", "'-'", "'**'", "'/'", 
			"'//'", "'%'", "'='", "'<'", "'>'", "'=='", "'>='", "'<='", "'!='", "'+='", 
			"'-='", "'*='", "'/='", "'|'", "'&'", "'.'", "','", "':'", "';'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'if'", "'else'", "'elif'", "'for'", 
			"'while'", "'continue'", "'break'", "'or'", "'and'", "'not'", "'True'", 
			"'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER", "FLOAT", "STRING", "VAR_NAME", "WHITE_SPACE", "NEWLINE", 
			"ADD_OPERATOR", "MINUS_OPERATOR", "EXP_OPERATOR", "DIV_OPERATOR", "INTDIV_OPERATOR", 
			"MOD_OPERATOR", "ASSIGN", "LESS_THAN", "GREATER_THAN", "EQUALS_TO", "GREATER_EQUALS", 
			"LESSER_EQUALS", "NOT_EQUALS", "ADD_EQUALS", "SUB_EQUALS", "MULT_EQUALS", 
			"DIV_EQUALS", "OR_OPERATOR", "AND_OPERATOR", "DOT", "COMMA", "COLON", 
			"SEMI_COLON", "O_PAR", "C_PAR", "O_BRACE", "C_BRACE", "O_BRACKET", "C_BRACKET", 
			"IF", "ELSE", "ELIF", "FOR", "WHILE", "CONTINUE", "BREAK", "OR", "AND", 
			"NOT", "TRUE", "FALSE"
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

	public static class Num_additionContext extends ParserRuleContext {
		public TerminalNode ADD_OPERATOR() { return getToken(Python3Parser.ADD_OPERATOR, 0); }
		public TerminalNode NEWLINE() { return getToken(Python3Parser.NEWLINE, 0); }
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
		enterRule(_localctx, 0, RULE_num_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(5);
			match(ADD_OPERATOR);
			setState(6);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(7);
			match(NEWLINE);
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
		enterRule(_localctx, 2, RULE_string_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			match(STRING);
			setState(10);
			match(ADD_OPERATOR);
			setState(11);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\20\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\3\3\2\3\4\2\r"+
		"\2\6\3\2\2\2\4\13\3\2\2\2\6\7\t\2\2\2\7\b\7\t\2\2\b\t\t\2\2\2\t\n\7\b"+
		"\2\2\n\3\3\2\2\2\13\f\7\5\2\2\f\r\7\t\2\2\r\16\7\5\2\2\16\5\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}