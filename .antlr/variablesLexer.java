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
		NUMBER=1, INTEGER=2, FLOAT=3, CHAR=4, STRING=5, BOOLEAN=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "INTEGER", "FLOAT", "CHAR", "STRING", "BOOLEAN", "DIGIT", "NEG_DIGIT", 
			"POS_DIGIT", "LOW_CHAR", "HIGH_CHAR", "TRUE", "FALSE"
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
			null, "NUMBER", "INTEGER", "FLOAT", "CHAR", "STRING", "BOOLEAN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bn\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2 \n\2\3\3\5\3#\n\3\3\3\3\3\6"+
		"\3\'\n\3\r\3\16\3(\3\3\5\3,\n\3\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13"+
		"\4\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\5\6N\n\6\3\7\3\7\5\7R\n\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\re"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16m\n\16\2\2\17\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\3\2\n\4\2--//\3\2\63;\3\2\62"+
		"\62\3\2$$\3\2))\3\2\62;\3\2c|\3\2C\\\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\37\3\2\2\2\5+\3\2\2\2\7"+
		"-\3\2\2\2\t\67\3\2\2\2\13M\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2"+
		"\23X\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31d\3\2\2\2\33l\3\2\2\2\35 \5\5\3"+
		"\2\36 \5\7\4\2\37\35\3\2\2\2\37\36\3\2\2\2 \4\3\2\2\2!#\t\2\2\2\"!\3\2"+
		"\2\2\"#\3\2\2\2#$\3\2\2\2$&\t\3\2\2%\'\5\17\b\2&%\3\2\2\2\'(\3\2\2\2("+
		"&\3\2\2\2()\3\2\2\2),\3\2\2\2*,\t\4\2\2+\"\3\2\2\2+*\3\2\2\2,\6\3\2\2"+
		"\2-.\5\5\3\2.\62\7\60\2\2/\61\5\17\b\2\60/\3\2\2\2\61\64\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\b\3\2\2\2\64\62\3\2\2\2\658\5\25\13\2\668\5"+
		"\27\f\2\67\65\3\2\2\2\67\66\3\2\2\28\n\3\2\2\29?\t\5\2\2:>\n\5\2\2;<\7"+
		"^\2\2<>\7$\2\2=:\3\2\2\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2"+
		"\2\2A?\3\2\2\2BN\t\5\2\2CI\t\6\2\2DH\n\6\2\2EF\7^\2\2FH\7)\2\2GD\3\2\2"+
		"\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LN\t\6\2"+
		"\2M9\3\2\2\2MC\3\2\2\2N\f\3\2\2\2OR\5\31\r\2PR\5\33\16\2QO\3\2\2\2QP\3"+
		"\2\2\2R\16\3\2\2\2ST\t\7\2\2T\20\3\2\2\2UV\7/\2\2VW\5\17\b\2W\22\3\2\2"+
		"\2XY\7-\2\2YZ\5\17\b\2Z\24\3\2\2\2[\\\t\b\2\2\\\26\3\2\2\2]^\t\t\2\2^"+
		"\30\3\2\2\2_`\7V\2\2`a\7t\2\2ab\7w\2\2be\7g\2\2ce\7\63\2\2d_\3\2\2\2d"+
		"c\3\2\2\2e\32\3\2\2\2fg\7H\2\2gh\7c\2\2hi\7n\2\2ij\7u\2\2jm\7g\2\2km\7"+
		"\62\2\2lf\3\2\2\2lk\3\2\2\2m\34\3\2\2\2\21\2\37\"(+\62\67=?GIMQdl\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}