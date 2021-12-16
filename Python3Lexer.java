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
public class python3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, NUMBER=2, INTEGER=3, DEF=4, RETURN=5, RAISE=6, FROM=7, IMPORT=8, 
		AS=9, GLOBAL=10, NONLOCAL=11, ASSERT=12, IF=13, ELIF=14, ELSE=15, WHILE=16, 
		FOR=17, IN=18, TRY=19, FINALLY=20, WITH=21, EXCEPT=22, LAMBDA=23, OR=24, 
		AND=25, NOT=26, IS=27, NONE=28, TRUE=29, FALSE=30, CLASS=31, YIELD=32, 
		DEL=33, PASS=34, CONTINUE=35, BREAK=36, ASYNC=37, AWAIT=38, NEWLINE=39, 
		NAME=40, STRING_LITERAL=41, DECIMAL_INTEGER=42, FLOAT_NUMBER=43, DOT=44, 
		OPEN_PAREN=45, CLOSE_PAREN=46, COMMA=47, COLON=48, SEMI_COLON=49, POWER=50, 
		ASSIGN=51, OPEN_BRACK=52, CLOSE_BRACK=53, OR_OP=54, AND_OP=55, ADD=56, 
		MINUS=57, DIV=58, MOD=59, IDIV=60, OPEN_BRACE=61, CLOSE_BRACE=62, LESS_THAN=63, 
		GREATER_THAN=64, EQUALS=65, GT_EQ=66, LT_EQ=67, NOT_EQ_1=68, NOT_EQ_2=69, 
		ADD_ASSIGN=70, SUB_ASSIGN=71, MULT_ASSIGN=72, DIV_ASSIGN=73, SKIP_=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "NUMBER", "INTEGER", "DEF", "RETURN", "RAISE", "FROM", "IMPORT", 
			"AS", "GLOBAL", "NONLOCAL", "ASSERT", "IF", "ELIF", "ELSE", "WHILE", 
			"FOR", "IN", "TRY", "FINALLY", "WITH", "EXCEPT", "LAMBDA", "OR", "AND", 
			"NOT", "IS", "NONE", "TRUE", "FALSE", "CLASS", "YIELD", "DEL", "PASS", 
			"CONTINUE", "BREAK", "ASYNC", "AWAIT", "NEWLINE", "NAME", "STRING_LITERAL", 
			"DECIMAL_INTEGER", "FLOAT_NUMBER", "DOT", "OPEN_PAREN", "CLOSE_PAREN", 
			"COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OR_OP", "AND_OP", "ADD", "MINUS", "DIV", "MOD", "IDIV", "OPEN_BRACE", 
			"CLOSE_BRACE", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", 
			"NOT_EQ_1", "NOT_EQ_2", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", 
			"SKIP_", "SHORT_STRING", "LONG_STRING", "LONG_STRING_ITEM", "LONG_STRING_CHAR", 
			"STRING_ESCAPE_SEQ", "NON_ZERO_DIGIT", "DIGIT", "POINT_FLOAT", "EXPONENT_FLOAT", 
			"INT_PART", "FRACTION", "EXPONENT", "SPACES", "COMMENT", "LINE_JOINING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'def'", "'return'", "'raise'", "'from'", "'import'", 
			"'as'", "'global'", "'nonlocal'", "'assert'", "'if'", "'elif'", "'else'", 
			"'while'", "'for'", "'in'", "'try'", "'finally'", "'with'", "'except'", 
			"'lambda'", "'or'", "'and'", "'not'", "'is'", "'None'", "'True'", "'False'", 
			"'class'", "'yield'", "'del'", "'pass'", "'continue'", "'break'", "'async'", 
			"'await'", null, null, null, null, null, "'.'", "'('", "')'", "','", 
			"':'", "';'", "'**'", "'='", "'['", "']'", "'|'", "'&'", "'+'", "'-'", 
			"'/'", "'%'", "'//'", "'{'", "'}'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'<>'", "'!='", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "NUMBER", "INTEGER", "DEF", "RETURN", "RAISE", "FROM", 
			"IMPORT", "AS", "GLOBAL", "NONLOCAL", "ASSERT", "IF", "ELIF", "ELSE", 
			"WHILE", "FOR", "IN", "TRY", "FINALLY", "WITH", "EXCEPT", "LAMBDA", "OR", 
			"AND", "NOT", "IS", "NONE", "TRUE", "FALSE", "CLASS", "YIELD", "DEL", 
			"PASS", "CONTINUE", "BREAK", "ASYNC", "AWAIT", "NEWLINE", "NAME", "STRING_LITERAL", 
			"DECIMAL_INTEGER", "FLOAT_NUMBER", "DOT", "OPEN_PAREN", "CLOSE_PAREN", 
			"COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OR_OP", "AND_OP", "ADD", "MINUS", "DIV", "MOD", "IDIV", "OPEN_BRACE", 
			"CLOSE_BRACE", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", 
			"NOT_EQ_1", "NOT_EQ_2", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", 
			"SKIP_"
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


	public python3Lexer(CharStream input) {
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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return self.atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u0270\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\3\3\3\5\3\u00ba\n\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u017f"+
		"\n(\3(\3(\5(\u0183\n(\3(\5(\u0186\n(\5(\u0188\n(\3)\3)\3*\3*\3*\3*\3*"+
		"\5*\u0191\n*\3*\3*\5*\u0195\n*\3+\3+\7+\u0199\n+\f+\16+\u019c\13+\3+\6"+
		"+\u019f\n+\r+\16+\u01a0\5+\u01a3\n+\3,\3,\5,\u01a7\n,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@"+
		"\3@\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H"+
		"\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\5K\u01f3\nK\3K\3K\3L\3L\3L\7L\u01fa\nL"+
		"\fL\16L\u01fd\13L\3L\3L\3L\3L\7L\u0203\nL\fL\16L\u0206\13L\3L\5L\u0209"+
		"\nL\3M\3M\3M\3M\3M\7M\u0210\nM\fM\16M\u0213\13M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\7M\u021d\nM\fM\16M\u0220\13M\3M\3M\3M\5M\u0225\nM\3N\3N\5N\u0229\nN"+
		"\3O\3O\3P\3P\3P\3P\5P\u0231\nP\3Q\3Q\3R\3R\3S\5S\u0238\nS\3S\3S\3S\3S"+
		"\5S\u023e\nS\3T\3T\5T\u0242\nT\3T\3T\3U\6U\u0247\nU\rU\16U\u0248\3V\3"+
		"V\6V\u024d\nV\rV\16V\u024e\3W\3W\5W\u0253\nW\3W\6W\u0256\nW\rW\16W\u0257"+
		"\3X\6X\u025b\nX\rX\16X\u025c\3Y\3Y\7Y\u0261\nY\fY\16Y\u0264\13Y\3Z\3Z"+
		"\5Z\u0268\nZ\3Z\5Z\u026b\nZ\3Z\3Z\5Z\u026f\nZ\4\u0211\u021e\2[\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\u00a3"+
		"\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\3\2"+
		"\16\b\2HHTTWWhhttww\4\2HHhh\4\2TTtt\6\2\f\f\16\17))^^\6\2\f\f\16\17$$"+
		"^^\3\2^^\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2\13\13\"\"\4\2\f\f\16\17\2"+
		"\u0285\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\3\u00b5\3\2\2\2\5\u00b9\3\2\2\2\7\u00bb\3\2\2\2\t\u00bd\3\2\2"+
		"\2\13\u00c1\3\2\2\2\r\u00c8\3\2\2\2\17\u00ce\3\2\2\2\21\u00d3\3\2\2\2"+
		"\23\u00da\3\2\2\2\25\u00dd\3\2\2\2\27\u00e4\3\2\2\2\31\u00ed\3\2\2\2\33"+
		"\u00f4\3\2\2\2\35\u00f7\3\2\2\2\37\u00fc\3\2\2\2!\u0101\3\2\2\2#\u0107"+
		"\3\2\2\2%\u010b\3\2\2\2\'\u010e\3\2\2\2)\u0112\3\2\2\2+\u011a\3\2\2\2"+
		"-\u011f\3\2\2\2/\u0126\3\2\2\2\61\u012d\3\2\2\2\63\u0130\3\2\2\2\65\u0134"+
		"\3\2\2\2\67\u0138\3\2\2\29\u013b\3\2\2\2;\u0140\3\2\2\2=\u0145\3\2\2\2"+
		"?\u014b\3\2\2\2A\u0151\3\2\2\2C\u0157\3\2\2\2E\u015b\3\2\2\2G\u0160\3"+
		"\2\2\2I\u0169\3\2\2\2K\u016f\3\2\2\2M\u0175\3\2\2\2O\u0187\3\2\2\2Q\u0189"+
		"\3\2\2\2S\u0190\3\2\2\2U\u01a2\3\2\2\2W\u01a6\3\2\2\2Y\u01a8\3\2\2\2["+
		"\u01aa\3\2\2\2]\u01ac\3\2\2\2_\u01ae\3\2\2\2a\u01b0\3\2\2\2c\u01b2\3\2"+
		"\2\2e\u01b4\3\2\2\2g\u01b7\3\2\2\2i\u01b9\3\2\2\2k\u01bb\3\2\2\2m\u01bd"+
		"\3\2\2\2o\u01bf\3\2\2\2q\u01c1\3\2\2\2s\u01c3\3\2\2\2u\u01c5\3\2\2\2w"+
		"\u01c7\3\2\2\2y\u01c9\3\2\2\2{\u01cc\3\2\2\2}\u01ce\3\2\2\2\177\u01d0"+
		"\3\2\2\2\u0081\u01d2\3\2\2\2\u0083\u01d4\3\2\2\2\u0085\u01d7\3\2\2\2\u0087"+
		"\u01da\3\2\2\2\u0089\u01dd\3\2\2\2\u008b\u01e0\3\2\2\2\u008d\u01e3\3\2"+
		"\2\2\u008f\u01e6\3\2\2\2\u0091\u01e9\3\2\2\2\u0093\u01ec\3\2\2\2\u0095"+
		"\u01f2\3\2\2\2\u0097\u0208\3\2\2\2\u0099\u0224\3\2\2\2\u009b\u0228\3\2"+
		"\2\2\u009d\u022a\3\2\2\2\u009f\u0230\3\2\2\2\u00a1\u0232\3\2\2\2\u00a3"+
		"\u0234\3\2\2\2\u00a5\u023d\3\2\2\2\u00a7\u0241\3\2\2\2\u00a9\u0246\3\2"+
		"\2\2\u00ab\u024a\3\2\2\2\u00ad\u0250\3\2\2\2\u00af\u025a\3\2\2\2\u00b1"+
		"\u025e\3\2\2\2\u00b3\u0265\3\2\2\2\u00b5\u00b6\5S*\2\u00b6\4\3\2\2\2\u00b7"+
		"\u00ba\5\7\4\2\u00b8\u00ba\5W,\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\6\3\2\2\2\u00bb\u00bc\5U+\2\u00bc\b\3\2\2\2\u00bd\u00be\7f\2"+
		"\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7h\2\2\u00c0\n\3\2\2\2\u00c1\u00c2\7"+
		"t\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6\u00c7\7p\2\2\u00c7\f\3\2\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7c\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\16\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7q\2\2\u00d1"+
		"\u00d2\7o\2\2\u00d2\20\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7r\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9\22\3\2\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7u\2\2\u00dc\24\3\2\2"+
		"\2\u00dd\u00de\7i\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1"+
		"\7d\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\26\3\2\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7n\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7n\2\2"+
		"\u00ec\30\3\2\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7"+
		"u\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7v\2\2\u00f3\32"+
		"\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7h\2\2\u00f6\34\3\2\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7h\2\2"+
		"\u00fb\36\3\2\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7"+
		"u\2\2\u00ff\u0100\7g\2\2\u0100 \3\2\2\2\u0101\u0102\7y\2\2\u0102\u0103"+
		"\7j\2\2\u0103\u0104\7k\2\2\u0104\u0105\7n\2\2\u0105\u0106\7g\2\2\u0106"+
		"\"\3\2\2\2\u0107\u0108\7h\2\2\u0108\u0109\7q\2\2\u0109\u010a\7t\2\2\u010a"+
		"$\3\2\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d&\3\2\2\2\u010e\u010f"+
		"\7v\2\2\u010f\u0110\7t\2\2\u0110\u0111\7{\2\2\u0111(\3\2\2\2\u0112\u0113"+
		"\7h\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115\u0116\7c\2\2\u0116"+
		"\u0117\7n\2\2\u0117\u0118\7n\2\2\u0118\u0119\7{\2\2\u0119*\3\2\2\2\u011a"+
		"\u011b\7y\2\2\u011b\u011c\7k\2\2\u011c\u011d\7v\2\2\u011d\u011e\7j\2\2"+
		"\u011e,\3\2\2\2\u011f\u0120\7g\2\2\u0120\u0121\7z\2\2\u0121\u0122\7e\2"+
		"\2\u0122\u0123\7g\2\2\u0123\u0124\7r\2\2\u0124\u0125\7v\2\2\u0125.\3\2"+
		"\2\2\u0126\u0127\7n\2\2\u0127\u0128\7c\2\2\u0128\u0129\7o\2\2\u0129\u012a"+
		"\7d\2\2\u012a\u012b\7f\2\2\u012b\u012c\7c\2\2\u012c\60\3\2\2\2\u012d\u012e"+
		"\7q\2\2\u012e\u012f\7t\2\2\u012f\62\3\2\2\2\u0130\u0131\7c\2\2\u0131\u0132"+
		"\7p\2\2\u0132\u0133\7f\2\2\u0133\64\3\2\2\2\u0134\u0135\7p\2\2\u0135\u0136"+
		"\7q\2\2\u0136\u0137\7v\2\2\u0137\66\3\2\2\2\u0138\u0139\7k\2\2\u0139\u013a"+
		"\7u\2\2\u013a8\3\2\2\2\u013b\u013c\7P\2\2\u013c\u013d\7q\2\2\u013d\u013e"+
		"\7p\2\2\u013e\u013f\7g\2\2\u013f:\3\2\2\2\u0140\u0141\7V\2\2\u0141\u0142"+
		"\7t\2\2\u0142\u0143\7w\2\2\u0143\u0144\7g\2\2\u0144<\3\2\2\2\u0145\u0146"+
		"\7H\2\2\u0146\u0147\7c\2\2\u0147\u0148\7n\2\2\u0148\u0149\7u\2\2\u0149"+
		"\u014a\7g\2\2\u014a>\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7n\2\2\u014d"+
		"\u014e\7c\2\2\u014e\u014f\7u\2\2\u014f\u0150\7u\2\2\u0150@\3\2\2\2\u0151"+
		"\u0152\7{\2\2\u0152\u0153\7k\2\2\u0153\u0154\7g\2\2\u0154\u0155\7n\2\2"+
		"\u0155\u0156\7f\2\2\u0156B\3\2\2\2\u0157\u0158\7f\2\2\u0158\u0159\7g\2"+
		"\2\u0159\u015a\7n\2\2\u015aD\3\2\2\2\u015b\u015c\7r\2\2\u015c\u015d\7"+
		"c\2\2\u015d\u015e\7u\2\2\u015e\u015f\7u\2\2\u015fF\3\2\2\2\u0160\u0161"+
		"\7e\2\2\u0161\u0162\7q\2\2\u0162\u0163\7p\2\2\u0163\u0164\7v\2\2\u0164"+
		"\u0165\7k\2\2\u0165\u0166\7p\2\2\u0166\u0167\7w\2\2\u0167\u0168\7g\2\2"+
		"\u0168H\3\2\2\2\u0169\u016a\7d\2\2\u016a\u016b\7t\2\2\u016b\u016c\7g\2"+
		"\2\u016c\u016d\7c\2\2\u016d\u016e\7m\2\2\u016eJ\3\2\2\2\u016f\u0170\7"+
		"c\2\2\u0170\u0171\7u\2\2\u0171\u0172\7{\2\2\u0172\u0173\7p\2\2\u0173\u0174"+
		"\7e\2\2\u0174L\3\2\2\2\u0175\u0176\7c\2\2\u0176\u0177\7y\2\2\u0177\u0178"+
		"\7c\2\2\u0178\u0179\7k\2\2\u0179\u017a\7v\2\2\u017aN\3\2\2\2\u017b\u017c"+
		"\6(\2\2\u017c\u0188\5\u00afX\2\u017d\u017f\7\17\2\2\u017e\u017d\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\7\f\2\2\u0181\u0183"+
		"\4\16\17\2\u0182\u017e\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0185\3\2\2\2"+
		"\u0184\u0186\5\u00afX\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u017b\3\2\2\2\u0187\u0182\3\2\2\2\u0188P\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018aR\3\2\2\2\u018b\u0191\t\2\2\2\u018c\u018d\t"+
		"\3\2\2\u018d\u0191\t\4\2\2\u018e\u018f\t\4\2\2\u018f\u0191\t\3\2\2\u0190"+
		"\u018b\3\2\2\2\u0190\u018c\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0194\3\2\2\2\u0192\u0195\5\u0097L\2\u0193\u0195\5\u0099M\2"+
		"\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195T\3\2\2\2\u0196\u019a\5"+
		"\u00a1Q\2\u0197\u0199\5\u00a3R\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2"+
		"\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a3\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u019f\7\62\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2"+
		"\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u0196"+
		"\3\2\2\2\u01a2\u019e\3\2\2\2\u01a3V\3\2\2\2\u01a4\u01a7\5\u00a5S\2\u01a5"+
		"\u01a7\5\u00a7T\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7X\3\2\2"+
		"\2\u01a8\u01a9\7\60\2\2\u01a9Z\3\2\2\2\u01aa\u01ab\7*\2\2\u01ab\\\3\2"+
		"\2\2\u01ac\u01ad\7+\2\2\u01ad^\3\2\2\2\u01ae\u01af\7.\2\2\u01af`\3\2\2"+
		"\2\u01b0\u01b1\7<\2\2\u01b1b\3\2\2\2\u01b2\u01b3\7=\2\2\u01b3d\3\2\2\2"+
		"\u01b4\u01b5\7,\2\2\u01b5\u01b6\7,\2\2\u01b6f\3\2\2\2\u01b7\u01b8\7?\2"+
		"\2\u01b8h\3\2\2\2\u01b9\u01ba\7]\2\2\u01baj\3\2\2\2\u01bb\u01bc\7_\2\2"+
		"\u01bcl\3\2\2\2\u01bd\u01be\7~\2\2\u01ben\3\2\2\2\u01bf\u01c0\7(\2\2\u01c0"+
		"p\3\2\2\2\u01c1\u01c2\7-\2\2\u01c2r\3\2\2\2\u01c3\u01c4\7/\2\2\u01c4t"+
		"\3\2\2\2\u01c5\u01c6\7\61\2\2\u01c6v\3\2\2\2\u01c7\u01c8\7\'\2\2\u01c8"+
		"x\3\2\2\2\u01c9\u01ca\7\61\2\2\u01ca\u01cb\7\61\2\2\u01cbz\3\2\2\2\u01cc"+
		"\u01cd\7}\2\2\u01cd|\3\2\2\2\u01ce\u01cf\7\177\2\2\u01cf~\3\2\2\2\u01d0"+
		"\u01d1\7>\2\2\u01d1\u0080\3\2\2\2\u01d2\u01d3\7@\2\2\u01d3\u0082\3\2\2"+
		"\2\u01d4\u01d5\7?\2\2\u01d5\u01d6\7?\2\2\u01d6\u0084\3\2\2\2\u01d7\u01d8"+
		"\7@\2\2\u01d8\u01d9\7?\2\2\u01d9\u0086\3\2\2\2\u01da\u01db\7>\2\2\u01db"+
		"\u01dc\7?\2\2\u01dc\u0088\3\2\2\2\u01dd\u01de\7>\2\2\u01de\u01df\7@\2"+
		"\2\u01df\u008a\3\2\2\2\u01e0\u01e1\7#\2\2\u01e1\u01e2\7?\2\2\u01e2\u008c"+
		"\3\2\2\2\u01e3\u01e4\7-\2\2\u01e4\u01e5\7?\2\2\u01e5\u008e\3\2\2\2\u01e6"+
		"\u01e7\7/\2\2\u01e7\u01e8\7?\2\2\u01e8\u0090\3\2\2\2\u01e9\u01ea\7,\2"+
		"\2\u01ea\u01eb\7?\2\2\u01eb\u0092\3\2\2\2\u01ec\u01ed\7\61\2\2\u01ed\u01ee"+
		"\7?\2\2\u01ee\u0094\3\2\2\2\u01ef\u01f3\5\u00afX\2\u01f0\u01f3\5\u00b1"+
		"Y\2\u01f1\u01f3\5\u00b3Z\2\u01f2\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\bK\2\2\u01f5\u0096\3\2"+
		"\2\2\u01f6\u01fb\7)\2\2\u01f7\u01fa\5\u009fP\2\u01f8\u01fa\n\5\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u0209\7)\2\2\u01ff\u0204\7$\2\2\u0200\u0203\5\u009fP\2\u0201\u0203\n"+
		"\6\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207\u0209\7$\2\2\u0208\u01f6\3\2\2\2\u0208\u01ff\3\2\2\2\u0209"+
		"\u0098\3\2\2\2\u020a\u020b\7)\2\2\u020b\u020c\7)\2\2\u020c\u020d\7)\2"+
		"\2\u020d\u0211\3\2\2\2\u020e\u0210\5\u009bN\2\u020f\u020e\3\2\2\2\u0210"+
		"\u0213\3\2\2\2\u0211\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0214\u0215\7)\2\2\u0215\u0216\7)\2\2\u0216\u0225"+
		"\7)\2\2\u0217\u0218\7$\2\2\u0218\u0219\7$\2\2\u0219\u021a\7$\2\2\u021a"+
		"\u021e\3\2\2\2\u021b\u021d\5\u009bN\2\u021c\u021b\3\2\2\2\u021d\u0220"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0221\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0221\u0222\7$\2\2\u0222\u0223\7$\2\2\u0223\u0225\7$\2"+
		"\2\u0224\u020a\3\2\2\2\u0224\u0217\3\2\2\2\u0225\u009a\3\2\2\2\u0226\u0229"+
		"\5\u009dO\2\u0227\u0229\5\u009fP\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2"+
		"\2\2\u0229\u009c\3\2\2\2\u022a\u022b\n\7\2\2\u022b\u009e\3\2\2\2\u022c"+
		"\u022d\7^\2\2\u022d\u0231\13\2\2\2\u022e\u022f\7^\2\2\u022f\u0231\5O("+
		"\2\u0230\u022c\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u00a0\3\2\2\2\u0232\u0233"+
		"\t\b\2\2\u0233\u00a2\3\2\2\2\u0234\u0235\t\t\2\2\u0235\u00a4\3\2\2\2\u0236"+
		"\u0238\5\u00a9U\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023e\5\u00abV\2\u023a\u023b\5\u00a9U\2\u023b\u023c\7\60"+
		"\2\2\u023c\u023e\3\2\2\2\u023d\u0237\3\2\2\2\u023d\u023a\3\2\2\2\u023e"+
		"\u00a6\3\2\2\2\u023f\u0242\5\u00a9U\2\u0240\u0242\5\u00a5S\2\u0241\u023f"+
		"\3\2\2\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\5\u00adW"+
		"\2\u0244\u00a8\3\2\2\2\u0245\u0247\5\u00a3R\2\u0246\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u00aa\3\2"+
		"\2\2\u024a\u024c\7\60\2\2\u024b\u024d\5\u00a3R\2\u024c\u024b\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u00ac\3\2"+
		"\2\2\u0250\u0252\t\n\2\2\u0251\u0253\t\13\2\2\u0252\u0251\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0256\5\u00a3R\2\u0255\u0254"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u00ae\3\2\2\2\u0259\u025b\t\f\2\2\u025a\u0259\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u00b0\3\2\2\2\u025e"+
		"\u0262\7%\2\2\u025f\u0261\n\r\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u00b2\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0265\u0267\7^\2\2\u0266\u0268\5\u00afX\2\u0267\u0266\3"+
		"\2\2\2\u0267\u0268\3\2\2\2\u0268\u026e\3\2\2\2\u0269\u026b\7\17\2\2\u026a"+
		"\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026f\7\f"+
		"\2\2\u026d\u026f\4\16\17\2\u026e\u026a\3\2\2\2\u026e\u026d\3\2\2\2\u026f"+
		"\u00b4\3\2\2\2%\2\u00b9\u017e\u0182\u0185\u0187\u0190\u0194\u019a\u01a0"+
		"\u01a2\u01a6\u01f2\u01f9\u01fb\u0202\u0204\u0208\u0211\u021e\u0224\u0228"+
		"\u0230\u0237\u023d\u0241\u0248\u024e\u0252\u0257\u025c\u0262\u0267\u026a"+
		"\u026e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}