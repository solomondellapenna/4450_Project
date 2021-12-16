// Generated from variables.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class variablesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, INTEGER=2, FLOAT=3, CHAR=4, STRING=5, BOOLEAN=6, VAR_NAMES=7, 
		NEWLINES=8, EQUALS=9, WHITE_SPACE=10, DIGIT=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "INTEGER", "FLOAT", "CHAR", "STRING", "BOOLEAN", "VAR_NAMES", 
			"NEWLINES", "EQUALS", "WHITE_SPACE", "ARITH_EXP1", "ARITH_FULLEXP", "STARTING_CHAR", 
			"AFTER_CHAR", "DIGIT", "LOW_CHAR", "HIGH_CHAR", "TRUE", "FALSE"
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


	public variablesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "variables.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u00a1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\5\2,\n\2\3\3\5\3/\n\3\3\3\3\3\6\3\63\n\3"+
		"\r\3\16\3\64\3\3\5\38\n\3\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5"+
		"\5\5D\n\5\3\6\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6T\n\6\f\6\16\6W\13\6\3\6\5\6Z\n\6\3\7\3\7\5\7^\n\7\3\b\3\b\7\bb\n"+
		"\b\f\b\16\be\13\b\3\t\5\th\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\5\fw\n\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\177\n\r\f\r\16\r"+
		"\u0082\13\r\3\16\3\16\5\16\u0086\n\16\3\17\3\17\3\17\5\17\u008b\n\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0098\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a0\n\24\2\2\25\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2\37\r!\2#\2%\2\'\2\3"+
		"\2\n\4\2--//\3\2\63;\3\2\62\62\3\2$$\3\2))\4\2\13\13\"\"\4\2,,\61\61\3"+
		"\2\62;\2\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\37\3\2\2\2\3+\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\tC\3\2\2\2\13Y\3\2\2"+
		"\2\r]\3\2\2\2\17_\3\2\2\2\21g\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27q\3\2"+
		"\2\2\31z\3\2\2\2\33\u0085\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008e"+
		"\3\2\2\2#\u0090\3\2\2\2%\u0097\3\2\2\2\'\u009f\3\2\2\2),\5\5\3\2*,\5\7"+
		"\4\2+)\3\2\2\2+*\3\2\2\2,\4\3\2\2\2-/\t\2\2\2.-\3\2\2\2./\3\2\2\2/\60"+
		"\3\2\2\2\60\62\t\3\2\2\61\63\5\37\20\2\62\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\668\t\4\2\2\67.\3\2\2\2\67\66\3"+
		"\2\2\28\6\3\2\2\29:\5\5\3\2:>\7\60\2\2;=\5\37\20\2<;\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?\b\3\2\2\2@>\3\2\2\2AD\5!\21\2BD\5#\22\2CA\3\2\2"+
		"\2CB\3\2\2\2D\n\3\2\2\2EK\t\5\2\2FJ\n\5\2\2GH\7^\2\2HJ\7$\2\2IF\3\2\2"+
		"\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NZ\t\5\2"+
		"\2OU\t\6\2\2PT\n\6\2\2QR\7^\2\2RT\7)\2\2SP\3\2\2\2SQ\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XZ\t\6\2\2YE\3\2\2\2YO\3\2\2\2"+
		"Z\f\3\2\2\2[^\5%\23\2\\^\5\'\24\2][\3\2\2\2]\\\3\2\2\2^\16\3\2\2\2_c\5"+
		"\33\16\2`b\5\35\17\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\20\3\2\2"+
		"\2ec\3\2\2\2fh\7\17\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\f\2\2j\22\3"+
		"\2\2\2kl\7?\2\2l\24\3\2\2\2mn\t\7\2\2no\3\2\2\2op\b\13\2\2p\26\3\2\2\2"+
		"qv\5\3\2\2rw\t\b\2\2st\7\61\2\2tw\7\61\2\2uw\7\'\2\2vr\3\2\2\2vs\3\2\2"+
		"\2vu\3\2\2\2wx\3\2\2\2xy\5\3\2\2y\30\3\2\2\2z\u0080\5\3\2\2{\177\7-\2"+
		"\2|}\7/\2\2}\177\5\27\f\2~{\3\2\2\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\32\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0086\7a\2\2\u0084\u0086\5\t\5\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\34\3\2\2\2\u0087\u008b\5\t\5\2\u0088\u008b\5\37\20\2\u0089"+
		"\u008b\7a\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\36\3\2\2\2\u008c\u008d\t\t\2\2\u008d \3\2\2\2\u008e\u008f\4"+
		"c|\2\u008f\"\3\2\2\2\u0090\u0091\4C\\\2\u0091$\3\2\2\2\u0092\u0093\7V"+
		"\2\2\u0093\u0094\7t\2\2\u0094\u0095\7w\2\2\u0095\u0098\7g\2\2\u0096\u0098"+
		"\7\63\2\2\u0097\u0092\3\2\2\2\u0097\u0096\3\2\2\2\u0098&\3\2\2\2\u0099"+
		"\u009a\7H\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2"+
		"\u009d\u00a0\7g\2\2\u009e\u00a0\7\62\2\2\u009f\u0099\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0(\3\2\2\2\30\2+.\64\67>CIKSUY]cgv~\u0080\u0085\u008a\u0097"+
		"\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}