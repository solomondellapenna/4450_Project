// Generated from variables.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class variablesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, INTEGER=2, FLOAT=3, CHAR=4, STRING=5, BOOLEAN=6, VAR_NAMES=7, 
		NEWLINES=8, EQUALS=9, WHITE_SPACE=10, DIGIT=11;
	public static final int
		RULE_statement = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "INTEGER", "FLOAT", "CHAR", "STRING", "BOOLEAN", "VAR_NAMES", 
			"NEWLINES", "EQUALS", "WHITE_SPACE", "DIGIT"
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
	public String getGrammarFileName() { return "variables.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public variablesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode VAR_NAMES() { return getToken(variablesParser.VAR_NAMES, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(variablesParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(variablesParser.WHITE_SPACE, i);
		}
		public TerminalNode EQUALS() { return getToken(variablesParser.EQUALS, 0); }
		public TerminalNode DIGIT() { return getToken(variablesParser.DIGIT, 0); }
		public TerminalNode NEWLINES() { return getToken(variablesParser.NEWLINES, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof variablesListener ) ((variablesListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof variablesListener ) ((variablesListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(VAR_NAMES);
			setState(3);
			match(WHITE_SPACE);
			setState(4);
			match(EQUALS);
			setState(5);
			match(WHITE_SPACE);
			setState(6);
			match(DIGIT);
			setState(7);
			match(NEWLINES);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\f\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\n\2\4\3\2\2\2\4\5\7\t\2\2\5\6"+
		"\7\f\2\2\6\7\7\13\2\2\7\b\7\f\2\2\b\t\7\r\2\2\t\n\7\n\2\2\n\3\3\2\2\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}