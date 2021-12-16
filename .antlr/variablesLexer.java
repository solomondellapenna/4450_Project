// Generated from /Users/kentstuder/Desktop/4450_Project/variables.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, INTEGER=2, FLOAT=3, CHAR=4, STRING=5, BOOLEAN=6, NAMES=7, VARIABLE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "INTEGER", "FLOAT", "CHAR", "STRING", "BOOLEAN", "NAMES", "VARIABLE", 
			"STARTING_CHAR", "DIGIT", "LOW_CHAR", "HIGH_CHAR", "TRUE", "FALSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "INTEGER", "FLOAT", "CHAR", "STRING", "BOOLEAN", "NAMES", 
			"VARIABLE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\ny\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\5\2\"\n\2\3\3\5\3%\n\3"+
		"\3\3\3\3\6\3)\n\3\r\3\16\3*\3\3\5\3.\n\3\3\4\3\4\3\4\7\4\63\n\4\f\4\16"+
		"\4\66\13\4\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\5\6P\n\6\3\7\3\7\5\7T\n"+
		"\7\3\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\t\3\t\3\t\3\t\3\n\3\n\5\nc\n\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16p\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17x\n\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\2\25\2\27\2\31\2\33\2\35\2\3\2\f\4\2--//\3\2\63;\3\2\62\62\3\2$"+
		"$\3\2))\13\2\"\"))CCEFIKTTVVaa~~\t\2\"\"CEGGIKOPTW~~\3\2\62;\3\2c|\3\2"+
		"C\\\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3!\3\2\2\2\5-\3\2\2\2\7/\3\2"+
		"\2\2\t9\3\2\2\2\13O\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21\\\3\2\2\2\23b\3"+
		"\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2\33o\3\2\2\2\35w\3\2\2\2\37"+
		"\"\5\5\3\2 \"\5\7\4\2!\37\3\2\2\2! \3\2\2\2\"\4\3\2\2\2#%\t\2\2\2$#\3"+
		"\2\2\2$%\3\2\2\2%&\3\2\2\2&(\t\3\2\2\')\5\25\13\2(\'\3\2\2\2)*\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,.\t\4\2\2-$\3\2\2\2-,\3\2\2\2.\6\3\2\2"+
		"\2/\60\5\5\3\2\60\64\7\60\2\2\61\63\5\25\13\2\62\61\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\b\3\2\2\2\66\64\3\2\2\2\67:\5\27\f"+
		"\28:\5\31\r\29\67\3\2\2\298\3\2\2\2:\n\3\2\2\2;A\t\5\2\2<@\n\5\2\2=>\7"+
		"^\2\2>@\7$\2\2?<\3\2\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2"+
		"\2\2CA\3\2\2\2DP\t\5\2\2EK\t\6\2\2FJ\n\6\2\2GH\7^\2\2HJ\7)\2\2IF\3\2\2"+
		"\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NP\t\6\2"+
		"\2O;\3\2\2\2OE\3\2\2\2P\f\3\2\2\2QT\5\33\16\2RT\5\35\17\2SQ\3\2\2\2SR"+
		"\3\2\2\2T\16\3\2\2\2UY\5\23\n\2VX\t\7\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2"+
		"\2YZ\3\2\2\2Z\20\3\2\2\2[Y\3\2\2\2\\]\5\17\b\2]^\7?\2\2^_\t\b\2\2_\22"+
		"\3\2\2\2`c\7a\2\2ac\5\t\5\2b`\3\2\2\2ba\3\2\2\2c\24\3\2\2\2de\t\t\2\2"+
		"e\26\3\2\2\2fg\t\n\2\2g\30\3\2\2\2hi\t\13\2\2i\32\3\2\2\2jk\7V\2\2kl\7"+
		"t\2\2lm\7w\2\2mp\7g\2\2np\7\63\2\2oj\3\2\2\2on\3\2\2\2p\34\3\2\2\2qr\7"+
		"H\2\2rs\7c\2\2st\7n\2\2tu\7u\2\2ux\7g\2\2vx\7\62\2\2wq\3\2\2\2wv\3\2\2"+
		"\2x\36\3\2\2\2\23\2!$*-\649?AIKOSYbow\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}