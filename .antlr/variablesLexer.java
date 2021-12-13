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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "ZERO", "LOW_CHAR", "HIGH_CHAR", "CHAR", "STRING", "INTEGER", 
			"FLOAT", "TRUE", "FALSE", "BOOLEAN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\2V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\5\2\34\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6&\n"+
		"\6\3\7\7\7)\n\7\f\7\16\7,\13\7\3\b\7\b/\n\b\f\b\16\b\62\13\b\3\b\5\b\65"+
		"\n\b\3\t\5\t8\n\t\3\t\3\t\7\t<\n\t\f\t\16\t?\13\t\3\t\5\tB\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\nI\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13Q\n\13\3\f\3\f"+
		"\5\fU\n\f\2\2\r\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\3\2"+
		"\5\3\2\63;\3\2c|\3\2C\\\2U\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3"+
		"\2\2\2\13%\3\2\2\2\r*\3\2\2\2\17\64\3\2\2\2\21A\3\2\2\2\23H\3\2\2\2\25"+
		"P\3\2\2\2\27T\3\2\2\2\31\34\t\2\2\2\32\34\5\5\3\2\33\31\3\2\2\2\33\32"+
		"\3\2\2\2\34\4\3\2\2\2\35\36\7\62\2\2\36\6\3\2\2\2\37 \t\3\2\2 \b\3\2\2"+
		"\2!\"\t\4\2\2\"\n\3\2\2\2#&\5\t\5\2$&\5\7\4\2%#\3\2\2\2%$\3\2\2\2&\f\3"+
		"\2\2\2\')\5\13\6\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\16\3\2\2"+
		"\2,*\3\2\2\2-/\5\3\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2"+
		"\61\65\3\2\2\2\62\60\3\2\2\2\63\65\5\5\3\2\64\60\3\2\2\2\64\63\3\2\2\2"+
		"\65\20\3\2\2\2\668\5\5\3\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29=\7\60"+
		"\2\2:<\5\3\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?=\3\2"+
		"\2\2@B\5\17\b\2A\67\3\2\2\2A@\3\2\2\2B\22\3\2\2\2CD\7V\2\2DE\7t\2\2EF"+
		"\7w\2\2FI\7g\2\2GI\7\63\2\2HC\3\2\2\2HG\3\2\2\2I\24\3\2\2\2JK\7H\2\2K"+
		"L\7c\2\2LM\7n\2\2MN\7u\2\2NQ\7g\2\2OQ\7\62\2\2PJ\3\2\2\2PO\3\2\2\2Q\26"+
		"\3\2\2\2RU\5\23\n\2SU\5\25\13\2TR\3\2\2\2TS\3\2\2\2U\30\3\2\2\2\16\2\33"+
		"%*\60\64\67=AHPT\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}