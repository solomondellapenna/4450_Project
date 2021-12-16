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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "INTEGER", "FLOAT", "STRING", "VAR_NAME", "SKIP_WS", 
			"SPACES", "LINE_JOINING", "NEWLINE", "TAB", "OPERATOR", "NZ_DIGIT", "DIGIT", 
			"ZERO", "LETTER", "DECIMAL", "EXPONENT", "START_CHAR", "COMMENT", "MULTIPLY_OPERATOR", 
			"SUBTRACT_OPERATOR", "ADD_OPERATOR", "EXP_OPERATOR", "DIV_OPERATOR", 
			"INTDIV_OPERATOR", "MOD_OPERATOR", "ASSIGN", "LESS_THAN", "GREATER_THAN", 
			"EQUALS_TO", "GREATER_EQUALS", "LESSER_EQUALS", "NOT_EQUALS", "ADD_EQUALS", 
			"SUB_EQUALS", "MULT_EQUALS", "DIV_EQUALS", "OR_OPERATOR", "AND_OPERATOR", 
			"NOT_OPERATOR", "DOT", "COMMA", "COLON", "SEMI_COLON", "O_PAR", "C_PAR", 
			"O_BRACE", "C_BRACE", "O_BRACKET", "C_BRACKET", "IF", "ELSE", "ELIF", 
			"FOR", "WHILE", "CONTINUE", "BREAK", "OR", "AND", "NOT", "COMPOUND_EXP", 
			"NONE", "TRUE", "FALSE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0198\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\3\3\3\3\4\3\4\7\4\u008d\n"+
		"\4\f\4\16\4\u0090\13\4\3\4\5\4\u0093\n\4\3\5\7\5\u0096\n\5\f\5\16\5\u0099"+
		"\13\5\3\5\3\5\6\5\u009d\n\5\r\5\16\5\u009e\3\5\3\5\5\5\u00a3\n\5\3\6\3"+
		"\6\3\6\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b3"+
		"\n\6\f\6\16\6\u00b6\13\6\3\6\5\6\u00b9\n\6\3\7\3\7\3\7\3\7\7\7\u00bf\n"+
		"\7\f\7\16\7\u00c2\13\7\3\b\3\b\3\b\5\b\u00c7\n\b\3\b\3\b\3\t\6\t\u00cc"+
		"\n\t\r\t\16\t\u00cd\3\n\3\n\5\n\u00d2\n\n\3\n\5\n\u00d5\n\n\3\n\3\n\5"+
		"\n\u00d9\n\n\3\13\5\13\u00dc\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00e9\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\6\22\u00f5\n\22\r\22\16\22\u00f6\3\23\5\23\u00fa\n\23\3\23\6\23"+
		"\u00fd\n\23\r\23\16\23\u00fe\3\24\5\24\u0102\n\24\3\25\3\25\7\25\u0106"+
		"\n\25\f\25\16\25\u0109\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>"+
		"\3?\3?\3?\5?\u0187\n?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B"+
		"\2\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\n\27\13\31\f\33\2\35"+
		"\2\37\2!\2#\2%\2\'\2)\2+\r-\16/\17\61\20\63\21\65\22\67\239\24;\25=\26"+
		"?\27A\30C\31E\32G\33I\34K\35M\36O\37Q S!U\"W#Y$[%]&_\'a(c)e*g+i,k-m.o"+
		"/q\60s\61u\62w\63y\64{\65}\66\177\67\u00818\u00839\3\2\13\3\2$$\3\2))"+
		"\4\2\13\13\"\"\3\2\63;\3\2\62;\4\2C\\c|\4\2--//\5\2C\\aac|\4\2\f\f\16"+
		"\17\2\u01ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2+"+
		"\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0088\3\2\2\2\7\u0092\3\2\2"+
		"\2\t\u00a2\3\2\2\2\13\u00b8\3\2\2\2\r\u00ba\3\2\2\2\17\u00c6\3\2\2\2\21"+
		"\u00cb\3\2\2\2\23\u00cf\3\2\2\2\25\u00db\3\2\2\2\27\u00df\3\2\2\2\31\u00e8"+
		"\3\2\2\2\33\u00ea\3\2\2\2\35\u00ec\3\2\2\2\37\u00ee\3\2\2\2!\u00f0\3\2"+
		"\2\2#\u00f2\3\2\2\2%\u00f9\3\2\2\2\'\u0101\3\2\2\2)\u0103\3\2\2\2+\u010a"+
		"\3\2\2\2-\u010c\3\2\2\2/\u010e\3\2\2\2\61\u0110\3\2\2\2\63\u0113\3\2\2"+
		"\2\65\u0115\3\2\2\2\67\u0118\3\2\2\29\u011a\3\2\2\2;\u011c\3\2\2\2=\u011e"+
		"\3\2\2\2?\u0120\3\2\2\2A\u0123\3\2\2\2C\u0126\3\2\2\2E\u0129\3\2\2\2G"+
		"\u012c\3\2\2\2I\u012f\3\2\2\2K\u0132\3\2\2\2M\u0135\3\2\2\2O\u0138\3\2"+
		"\2\2Q\u013a\3\2\2\2S\u013c\3\2\2\2U\u013e\3\2\2\2W\u0140\3\2\2\2Y\u0142"+
		"\3\2\2\2[\u0144\3\2\2\2]\u0146\3\2\2\2_\u0148\3\2\2\2a\u014a\3\2\2\2c"+
		"\u014c\3\2\2\2e\u014e\3\2\2\2g\u0150\3\2\2\2i\u0152\3\2\2\2k\u0155\3\2"+
		"\2\2m\u015a\3\2\2\2o\u015f\3\2\2\2q\u0163\3\2\2\2s\u0169\3\2\2\2u\u0172"+
		"\3\2\2\2w\u0178\3\2\2\2y\u017b\3\2\2\2{\u017f\3\2\2\2}\u0186\3\2\2\2\177"+
		"\u0188\3\2\2\2\u0081\u018d\3\2\2\2\u0083\u0192\3\2\2\2\u0085\u0086\7>"+
		"\2\2\u0086\u0087\7@\2\2\u0087\4\3\2\2\2\u0088\u0089\7\"\2\2\u0089\6\3"+
		"\2\2\2\u008a\u008e\5\33\16\2\u008b\u008d\5\35\17\2\u008c\u008b\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\5\37\20\2\u0092\u008a\3\2\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\b\3\2\2\2\u0094\u0096\5\35\17\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a3\5#\22\2\u009b\u009d\5\35"+
		"\17\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5U+\2\u00a1\u00a3\3\2\2"+
		"\2\u00a2\u0097\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\n\3\2\2\2\u00a4\u00aa"+
		"\t\2\2\2\u00a5\u00a9\n\2\2\2\u00a6\u00a7\7^\2\2\u00a7\u00a9\7$\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b9\t\2\2\2\u00ae\u00b4\t\3\2\2\u00af\u00b3\n\3\2\2\u00b0\u00b1\7^"+
		"\2\2\u00b1\u00b3\7)\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00a4\3\2\2\2\u00b8"+
		"\u00ae\3\2\2\2\u00b9\f\3\2\2\2\u00ba\u00c0\5\'\24\2\u00bb\u00bf\5!\21"+
		"\2\u00bc\u00bf\5\7\4\2\u00bd\u00bf\7a\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\16\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c7\5\21\t"+
		"\2\u00c4\u00c7\5)\25\2\u00c5\u00c7\5\23\n\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\b"+
		"\2\2\u00c9\20\3\2\2\2\u00ca\u00cc\t\4\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\22\3\2\2\2\u00cf"+
		"\u00d1\7^\2\2\u00d0\u00d2\5\21\t\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\7\f\2\2\u00d7\u00d9\4\16"+
		"\17\2\u00d8\u00d4\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\24\3\2\2\2\u00da\u00dc"+
		"\7\17\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00de\7\f\2\2\u00de\26\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0\30\3"+
		"\2\2\2\u00e1\u00e9\5+\26\2\u00e2\u00e9\5-\27\2\u00e3\u00e9\5/\30\2\u00e4"+
		"\u00e9\5\61\31\2\u00e5\u00e9\5\63\32\2\u00e6\u00e9\5\65\33\2\u00e7\u00e9"+
		"\5\67\34\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2"+
		"\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e9\32\3\2\2\2\u00ea\u00eb\t\5\2\2\u00eb\34\3\2\2\2\u00ec\u00ed"+
		"\t\6\2\2\u00ed\36\3\2\2\2\u00ee\u00ef\7\62\2\2\u00ef \3\2\2\2\u00f0\u00f1"+
		"\t\7\2\2\u00f1\"\3\2\2\2\u00f2\u00f4\5U+\2\u00f3\u00f5\5\35\17\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7$\3\2\2\2\u00f8\u00fa\t\b\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\5\35\17\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff&\3"+
		"\2\2\2\u0100\u0102\t\t\2\2\u0101\u0100\3\2\2\2\u0102(\3\2\2\2\u0103\u0107"+
		"\7%\2\2\u0104\u0106\n\n\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108*\3\2\2\2\u0109\u0107\3\2\2\2"+
		"\u010a\u010b\7,\2\2\u010b,\3\2\2\2\u010c\u010d\7/\2\2\u010d.\3\2\2\2\u010e"+
		"\u010f\7-\2\2\u010f\60\3\2\2\2\u0110\u0111\7,\2\2\u0111\u0112\7,\2\2\u0112"+
		"\62\3\2\2\2\u0113\u0114\7\61\2\2\u0114\64\3\2\2\2\u0115\u0116\7\61\2\2"+
		"\u0116\u0117\7\61\2\2\u0117\66\3\2\2\2\u0118\u0119\7\'\2\2\u01198\3\2"+
		"\2\2\u011a\u011b\7?\2\2\u011b:\3\2\2\2\u011c\u011d\7>\2\2\u011d<\3\2\2"+
		"\2\u011e\u011f\7@\2\2\u011f>\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0122\7"+
		"?\2\2\u0122@\3\2\2\2\u0123\u0124\7@\2\2\u0124\u0125\7?\2\2\u0125B\3\2"+
		"\2\2\u0126\u0127\7>\2\2\u0127\u0128\7?\2\2\u0128D\3\2\2\2\u0129\u012a"+
		"\7#\2\2\u012a\u012b\7?\2\2\u012bF\3\2\2\2\u012c\u012d\7-\2\2\u012d\u012e"+
		"\7?\2\2\u012eH\3\2\2\2\u012f\u0130\7/\2\2\u0130\u0131\7?\2\2\u0131J\3"+
		"\2\2\2\u0132\u0133\7,\2\2\u0133\u0134\7?\2\2\u0134L\3\2\2\2\u0135\u0136"+
		"\7\61\2\2\u0136\u0137\7?\2\2\u0137N\3\2\2\2\u0138\u0139\7~\2\2\u0139P"+
		"\3\2\2\2\u013a\u013b\7(\2\2\u013bR\3\2\2\2\u013c\u013d\7#\2\2\u013dT\3"+
		"\2\2\2\u013e\u013f\7\60\2\2\u013fV\3\2\2\2\u0140\u0141\7.\2\2\u0141X\3"+
		"\2\2\2\u0142\u0143\7<\2\2\u0143Z\3\2\2\2\u0144\u0145\7=\2\2\u0145\\\3"+
		"\2\2\2\u0146\u0147\7*\2\2\u0147^\3\2\2\2\u0148\u0149\7+\2\2\u0149`\3\2"+
		"\2\2\u014a\u014b\7}\2\2\u014bb\3\2\2\2\u014c\u014d\7\177\2\2\u014dd\3"+
		"\2\2\2\u014e\u014f\7]\2\2\u014ff\3\2\2\2\u0150\u0151\7_\2\2\u0151h\3\2"+
		"\2\2\u0152\u0153\7k\2\2\u0153\u0154\7h\2\2\u0154j\3\2\2\2\u0155\u0156"+
		"\7g\2\2\u0156\u0157\7n\2\2\u0157\u0158\7u\2\2\u0158\u0159\7g\2\2\u0159"+
		"l\3\2\2\2\u015a\u015b\7g\2\2\u015b\u015c\7n\2\2\u015c\u015d\7k\2\2\u015d"+
		"\u015e\7h\2\2\u015en\3\2\2\2\u015f\u0160\7h\2\2\u0160\u0161\7q\2\2\u0161"+
		"\u0162\7t\2\2\u0162p\3\2\2\2\u0163\u0164\7y\2\2\u0164\u0165\7j\2\2\u0165"+
		"\u0166\7k\2\2\u0166\u0167\7n\2\2\u0167\u0168\7g\2\2\u0168r\3\2\2\2\u0169"+
		"\u016a\7e\2\2\u016a\u016b\7q\2\2\u016b\u016c\7p\2\2\u016c\u016d\7v\2\2"+
		"\u016d\u016e\7k\2\2\u016e\u016f\7p\2\2\u016f\u0170\7w\2\2\u0170\u0171"+
		"\7g\2\2\u0171t\3\2\2\2\u0172\u0173\7d\2\2\u0173\u0174\7t\2\2\u0174\u0175"+
		"\7g\2\2\u0175\u0176\7c\2\2\u0176\u0177\7m\2\2\u0177v\3\2\2\2\u0178\u0179"+
		"\7q\2\2\u0179\u017a\7t\2\2\u017ax\3\2\2\2\u017b\u017c\7c\2\2\u017c\u017d"+
		"\7p\2\2\u017d\u017e\7f\2\2\u017ez\3\2\2\2\u017f\u0180\7p\2\2\u0180\u0181"+
		"\7q\2\2\u0181\u0182\7v\2\2\u0182|\3\2\2\2\u0183\u0187\5w<\2\u0184\u0187"+
		"\5y=\2\u0185\u0187\5{>\2\u0186\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0185\3\2\2\2\u0187~\3\2\2\2\u0188\u0189\7P\2\2\u0189\u018a\7q\2\2\u018a"+
		"\u018b\7p\2\2\u018b\u018c\7g\2\2\u018c\u0080\3\2\2\2\u018d\u018e\7V\2"+
		"\2\u018e\u018f\7t\2\2\u018f\u0190\7w\2\2\u0190\u0191\7g\2\2\u0191\u0082"+
		"\3\2\2\2\u0192\u0193\7H\2\2\u0193\u0194\7c\2\2\u0194\u0195\7n\2\2\u0195"+
		"\u0196\7u\2\2\u0196\u0197\7g\2\2\u0197\u0084\3\2\2\2\34\2\u008e\u0092"+
		"\u0097\u009e\u00a2\u00a8\u00aa\u00b2\u00b4\u00b8\u00be\u00c0\u00c6\u00cd"+
		"\u00d1\u00d4\u00d8\u00db\u00e8\u00f6\u00f9\u00fe\u0101\u0107\u0186\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}