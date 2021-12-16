// Generated from Python3.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Python3Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTEGER", "FLOAT", "STRING", "VAR_NAME", "WHITE_SPACE", "NEWLINE", "NZ_DIGIT", 
			"DIGIT", "ZERO", "LETTER", "DECIMAL", "EXPONENT", "START_CHAR", "COMMENT", 
			"ADD_OPERATOR", "MINUS_OPERATOR", "EXP_OPERATOR", "DIV_OPERATOR", "INTDIV_OPERATOR", 
			"MOD_OPERATOR", "ASSIGN", "LESS_THAN", "GREATER_THAN", "EQUALS_TO", "GREATER_EQUALS", 
			"LESSER_EQUALS", "NOT_EQUALS", "ADD_EQUALS", "SUB_EQUALS", "MULT_EQUALS", 
			"DIV_EQUALS", "OR_OPERATOR", "AND_OPERATOR", "DOT", "COMMA", "COLON", 
			"SEMI_COLON", "O_PAR", "C_PAR", "O_BRACE", "C_BRACE", "O_BRACKET", "C_BRACKET", 
			"IF", "ELSE", "ELIF", "FOR", "WHILE", "CONTINUE", "BREAK", "OR", "AND", 
			"NOT", "TRUE", "FALSE"
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


	public Python3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0156\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\7\2t\n\2\f\2\16\2w\13"+
		"\2\3\2\5\2z\n\2\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\6\3\u0084\n\3"+
		"\r\3\16\3\u0085\3\3\3\3\5\3\u008a\n\3\3\4\3\4\3\4\3\4\7\4\u0090\n\4\f"+
		"\4\16\4\u0093\13\4\3\4\3\4\3\4\3\4\3\4\7\4\u009a\n\4\f\4\16\4\u009d\13"+
		"\4\3\4\5\4\u00a0\n\4\3\5\3\5\3\5\3\5\7\5\u00a6\n\5\f\5\16\5\u00a9\13\5"+
		"\3\6\6\6\u00ac\n\6\r\6\16\6\u00ad\3\6\3\6\3\7\5\7\u00b3\n\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\6\f\u00c1\n\f\r\f\16\f\u00c2"+
		"\3\r\5\r\u00c6\n\r\3\r\6\r\u00c9\n\r\r\r\16\r\u00ca\3\16\5\16\u00ce\n"+
		"\16\3\17\3\17\7\17\u00d2\n\17\f\17\16\17\u00d5\13\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\2\29\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\t!\n#\13%\f\'\r)"+
		"\16+\17-\20/\21\61\22\63\23\65\24\67\259\26;\27=\30?\31A\32C\33E\34G\35"+
		"I\36K\37M O!Q\"S#U$W%Y&[\'](_)a*c+e,g-i.k/m\60o\61\3\2\13\3\2$$\3\2))"+
		"\4\2\13\13\"\"\3\2\63;\3\2\62;\4\2C\\c|\4\2--//\5\2C\\aac|\4\2\f\f\16"+
		"\17\2\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3y\3\2\2\2\5"+
		"\u0089\3\2\2\2\7\u009f\3\2\2\2\t\u00a1\3\2\2\2\13\u00ab\3\2\2\2\r\u00b2"+
		"\3\2\2\2\17\u00b6\3\2\2\2\21\u00b8\3\2\2\2\23\u00ba\3\2\2\2\25\u00bc\3"+
		"\2\2\2\27\u00be\3\2\2\2\31\u00c5\3\2\2\2\33\u00cd\3\2\2\2\35\u00cf\3\2"+
		"\2\2\37\u00d6\3\2\2\2!\u00d8\3\2\2\2#\u00da\3\2\2\2%\u00dd\3\2\2\2\'\u00df"+
		"\3\2\2\2)\u00e2\3\2\2\2+\u00e4\3\2\2\2-\u00e6\3\2\2\2/\u00e8\3\2\2\2\61"+
		"\u00ea\3\2\2\2\63\u00ed\3\2\2\2\65\u00f0\3\2\2\2\67\u00f3\3\2\2\29\u00f6"+
		"\3\2\2\2;\u00f9\3\2\2\2=\u00fc\3\2\2\2?\u00ff\3\2\2\2A\u0102\3\2\2\2C"+
		"\u0104\3\2\2\2E\u0106\3\2\2\2G\u0108\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2"+
		"\2\2M\u010e\3\2\2\2O\u0110\3\2\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0116"+
		"\3\2\2\2W\u0118\3\2\2\2Y\u011a\3\2\2\2[\u011d\3\2\2\2]\u0122\3\2\2\2_"+
		"\u0127\3\2\2\2a\u012b\3\2\2\2c\u0131\3\2\2\2e\u013a\3\2\2\2g\u0140\3\2"+
		"\2\2i\u0143\3\2\2\2k\u0147\3\2\2\2m\u014b\3\2\2\2o\u0150\3\2\2\2qu\5\17"+
		"\b\2rt\5\21\t\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vz\3\2\2\2wu\3"+
		"\2\2\2xz\5\23\n\2yq\3\2\2\2yx\3\2\2\2z\4\3\2\2\2{}\5\21\t\2|{\3\2\2\2"+
		"}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2"+
		"\2\u0081\u008a\5\27\f\2\u0082\u0084\5\21\t\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\5E#\2\u0088\u008a\3\2\2\2\u0089~\3\2\2\2\u0089\u0083"+
		"\3\2\2\2\u008a\6\3\2\2\2\u008b\u0091\t\2\2\2\u008c\u0090\n\2\2\2\u008d"+
		"\u008e\7^\2\2\u008e\u0090\7$\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u00a0\t\2\2\2\u0095\u009b\t\3\2\2\u0096"+
		"\u009a\n\3\2\2\u0097\u0098\7^\2\2\u0098\u009a\7)\2\2\u0099\u0096\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\t\3\2\2\u009f"+
		"\u008b\3\2\2\2\u009f\u0095\3\2\2\2\u00a0\b\3\2\2\2\u00a1\u00a7\5\33\16"+
		"\2\u00a2\u00a6\5\25\13\2\u00a3\u00a6\5\3\2\2\u00a4\u00a6\7a\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\n\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\6"+
		"\2\2\u00b0\f\3\2\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\16\3\2\2\2\u00b6"+
		"\u00b7\t\5\2\2\u00b7\20\3\2\2\2\u00b8\u00b9\t\6\2\2\u00b9\22\3\2\2\2\u00ba"+
		"\u00bb\7\62\2\2\u00bb\24\3\2\2\2\u00bc\u00bd\t\7\2\2\u00bd\26\3\2\2\2"+
		"\u00be\u00c0\5E#\2\u00bf\u00c1\5\21\t\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\30\3\2\2\2\u00c4"+
		"\u00c6\t\b\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c9\5\21\t\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\32\3\2\2\2\u00cc\u00ce\t\t\2"+
		"\2\u00cd\u00cc\3\2\2\2\u00ce\34\3\2\2\2\u00cf\u00d3\7%\2\2\u00d0\u00d2"+
		"\n\n\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\36\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7-\2\2"+
		"\u00d7 \3\2\2\2\u00d8\u00d9\7/\2\2\u00d9\"\3\2\2\2\u00da\u00db\7,\2\2"+
		"\u00db\u00dc\7,\2\2\u00dc$\3\2\2\2\u00dd\u00de\7\61\2\2\u00de&\3\2\2\2"+
		"\u00df\u00e0\7\61\2\2\u00e0\u00e1\7\61\2\2\u00e1(\3\2\2\2\u00e2\u00e3"+
		"\7\'\2\2\u00e3*\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5,\3\2\2\2\u00e6\u00e7"+
		"\7>\2\2\u00e7.\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9\60\3\2\2\2\u00ea\u00eb"+
		"\7?\2\2\u00eb\u00ec\7?\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef"+
		"\7?\2\2\u00ef\64\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\7?\2\2\u00f2\66"+
		"\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\7?\2\2\u00f58\3\2\2\2\u00f6\u00f7"+
		"\7-\2\2\u00f7\u00f8\7?\2\2\u00f8:\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb"+
		"\7?\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7,\2\2\u00fd\u00fe\7?\2\2\u00fe>\3"+
		"\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\7?\2\2\u0101@\3\2\2\2\u0102\u0103"+
		"\7~\2\2\u0103B\3\2\2\2\u0104\u0105\7(\2\2\u0105D\3\2\2\2\u0106\u0107\7"+
		"\60\2\2\u0107F\3\2\2\2\u0108\u0109\7.\2\2\u0109H\3\2\2\2\u010a\u010b\7"+
		"<\2\2\u010bJ\3\2\2\2\u010c\u010d\7=\2\2\u010dL\3\2\2\2\u010e\u010f\7*"+
		"\2\2\u010fN\3\2\2\2\u0110\u0111\7+\2\2\u0111P\3\2\2\2\u0112\u0113\7}\2"+
		"\2\u0113R\3\2\2\2\u0114\u0115\7\177\2\2\u0115T\3\2\2\2\u0116\u0117\7]"+
		"\2\2\u0117V\3\2\2\2\u0118\u0119\7_\2\2\u0119X\3\2\2\2\u011a\u011b\7k\2"+
		"\2\u011b\u011c\7h\2\2\u011cZ\3\2\2\2\u011d\u011e\7g\2\2\u011e\u011f\7"+
		"n\2\2\u011f\u0120\7u\2\2\u0120\u0121\7g\2\2\u0121\\\3\2\2\2\u0122\u0123"+
		"\7g\2\2\u0123\u0124\7n\2\2\u0124\u0125\7k\2\2\u0125\u0126\7h\2\2\u0126"+
		"^\3\2\2\2\u0127\u0128\7h\2\2\u0128\u0129\7q\2\2\u0129\u012a\7t\2\2\u012a"+
		"`\3\2\2\2\u012b\u012c\7y\2\2\u012c\u012d\7j\2\2\u012d\u012e\7k\2\2\u012e"+
		"\u012f\7n\2\2\u012f\u0130\7g\2\2\u0130b\3\2\2\2\u0131\u0132\7e\2\2\u0132"+
		"\u0133\7q\2\2\u0133\u0134\7p\2\2\u0134\u0135\7v\2\2\u0135\u0136\7k\2\2"+
		"\u0136\u0137\7p\2\2\u0137\u0138\7w\2\2\u0138\u0139\7g\2\2\u0139d\3\2\2"+
		"\2\u013a\u013b\7d\2\2\u013b\u013c\7t\2\2\u013c\u013d\7g\2\2\u013d\u013e"+
		"\7c\2\2\u013e\u013f\7m\2\2\u013ff\3\2\2\2\u0140\u0141\7q\2\2\u0141\u0142"+
		"\7t\2\2\u0142h\3\2\2\2\u0143\u0144\7c\2\2\u0144\u0145\7p\2\2\u0145\u0146"+
		"\7f\2\2\u0146j\3\2\2\2\u0147\u0148\7p\2\2\u0148\u0149\7q\2\2\u0149\u014a"+
		"\7v\2\2\u014al\3\2\2\2\u014b\u014c\7V\2\2\u014c\u014d\7t\2\2\u014d\u014e"+
		"\7w\2\2\u014e\u014f\7g\2\2\u014fn\3\2\2\2\u0150\u0151\7H\2\2\u0151\u0152"+
		"\7c\2\2\u0152\u0153\7n\2\2\u0153\u0154\7u\2\2\u0154\u0155\7g\2\2\u0155"+
		"p\3\2\2\2\26\2uy~\u0085\u0089\u008f\u0091\u0099\u009b\u009f\u00a5\u00a7"+
		"\u00ad\u00b2\u00c2\u00c5\u00ca\u00cd\u00d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}