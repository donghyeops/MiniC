// Generated from MiniC.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ANNOTATIONS=1, ANNOTATION=2, NEWLINE=3, SPACE=4, OP=5, CP=6, OB=7, CB=8, 
		COMMA=9, REF=10, PLUSPLUS=11, MINMIN=12, OR=13, AND=14, EQ=15, NEQ=16, 
		LI=17, RI=18, LIEQ=19, RIEQ=20, PLUS=21, MINUS=22, MUL=23, DIV=24, MOD=25, 
		NOT=26, ASSIGN=27, SEMICOLON=28, KW_INT=29, KW_DOUBLE=30, KW_STRING=31, 
		KW_IF=32, KW_ELSE=33, KW_WHILE=34, KW_FOR=35, PW_PRINT=36, PW_SCAN=37, 
		INT=38, DOUBLE=39, STRING=40, ID=41, PARAMETER=42, SCANPARAMETER=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ANNOTATIONS", "ANNOTATION", "NEWLINE", "SPACE", "OP", "CP", "OB", "CB", 
		"COMMA", "REF", "PLUSPLUS", "MINMIN", "OR", "AND", "EQ", "NEQ", "LI", 
		"RI", "LIEQ", "RIEQ", "PLUS", "MINUS", "MUL", "DIV", "MOD", "NOT", "ASSIGN", 
		"SEMICOLON", "KW_INT", "KW_DOUBLE", "KW_STRING", "KW_IF", "KW_ELSE", "KW_WHILE", 
		"KW_FOR", "PW_PRINT", "PW_SCAN", "INT", "DOUBLE", "STRING", "ID", "PARAMETER", 
		"SCANPARAMETER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'('", "')'", "'{'", "'}'", "','", "'&'", 
		"'++'", "'--'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'='", "';'", "'정수'", 
		"'실수'", "'문자'", "'만약'", "'아니면'", "'조건반복'", "'반복'", "'출력'", "'입력'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANNOTATIONS", "ANNOTATION", "NEWLINE", "SPACE", "OP", "CP", "OB", 
		"CB", "COMMA", "REF", "PLUSPLUS", "MINMIN", "OR", "AND", "EQ", "NEQ", 
		"LI", "RI", "LIEQ", "RIEQ", "PLUS", "MINUS", "MUL", "DIV", "MOD", "NOT", 
		"ASSIGN", "SEMICOLON", "KW_INT", "KW_DOUBLE", "KW_STRING", "KW_IF", "KW_ELSE", 
		"KW_WHILE", "KW_FOR", "PW_PRINT", "PW_SCAN", "INT", "DOUBLE", "STRING", 
		"ID", "PARAMETER", "SCANPARAMETER"
	};
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


	public MiniCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			ANNOTATIONS_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			ANNOTATION_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ANNOTATIONS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void ANNOTATION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\3\3\3\4\6\4t\n\4\r\4\16\4u\3\4"+
		"\3\4\3\5\6\5{\n\5\r\5\16\5|\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\7\'\u00d9"+
		"\n\'\f\'\16\'\u00dc\13\'\3\'\5\'\u00df\n\'\3(\3(\7(\u00e3\n(\f(\16(\u00e6"+
		"\13(\3(\5(\u00e9\n(\3(\3(\7(\u00ed\n(\f(\16(\u00f0\13(\5(\u00f2\n(\3)"+
		"\3)\7)\u00f6\n)\f)\16)\u00f9\13)\3)\3)\3*\3*\7*\u00ff\n*\f*\16*\u0102"+
		"\13*\3+\3+\7+\u0106\n+\f+\16+\u0109\13+\3+\3+\3+\3+\7+\u010f\n+\f+\16"+
		"+\u0112\13+\3+\7+\u0115\n+\f+\16+\u0118\13+\3,\3,\3,\7,\u011d\n,\f,\16"+
		",\u0120\13,\3,\3,\3,\3,\3,\7,\u0127\n,\f,\16,\u012a\13,\3,\7,\u012d\n"+
		",\f,\16,\u0130\13,\3_\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\t\4\2\f\f\17"+
		"\17\5\2\13\13\"\"\uff01\uff01\3\2\63;\3\2\62;\3\2$$\6\2C\\aac|\uac02\ud7a5"+
		"\7\2\62;C\\aac|\uac02\ud7a5\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5g\3"+
		"\2\2\2\7s\3\2\2\2\tz\3\2\2\2\13\u0080\3\2\2\2\r\u0082\3\2\2\2\17\u0084"+
		"\3\2\2\2\21\u0086\3\2\2\2\23\u0088\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3"+
		"\2\2\2\31\u008f\3\2\2\2\33\u0092\3\2\2\2\35\u0095\3\2\2\2\37\u0098\3\2"+
		"\2\2!\u009b\3\2\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2"+
		"\63\u00b0\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3\2\2\29\u00b6\3\2\2\2;\u00b8"+
		"\3\2\2\2=\u00bb\3\2\2\2?\u00be\3\2\2\2A\u00c1\3\2\2\2C\u00c4\3\2\2\2E"+
		"\u00c8\3\2\2\2G\u00cd\3\2\2\2I\u00d0\3\2\2\2K\u00d3\3\2\2\2M\u00de\3\2"+
		"\2\2O\u00e8\3\2\2\2Q\u00f3\3\2\2\2S\u00fc\3\2\2\2U\u0103\3\2\2\2W\u0119"+
		"\3\2\2\2YZ\7\61\2\2Z[\7,\2\2[_\3\2\2\2\\^\13\2\2\2]\\\3\2\2\2^a\3\2\2"+
		"\2_`\3\2\2\2_]\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7,\2\2cd\7\61\2\2de\3\2\2"+
		"\2ef\b\2\2\2f\4\3\2\2\2gh\7\61\2\2hi\7\61\2\2im\3\2\2\2jl\n\2\2\2kj\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\b\3\3\2q\6"+
		"\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2w"+
		"x\b\4\4\2x\b\3\2\2\2y{\t\3\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}~\3\2\2\2~\177\b\5\5\2\177\n\3\2\2\2\u0080\u0081\7*\2\2\u0081\f\3\2\2"+
		"\2\u0082\u0083\7+\2\2\u0083\16\3\2\2\2\u0084\u0085\7}\2\2\u0085\20\3\2"+
		"\2\2\u0086\u0087\7\177\2\2\u0087\22\3\2\2\2\u0088\u0089\7.\2\2\u0089\24"+
		"\3\2\2\2\u008a\u008b\7(\2\2\u008b\26\3\2\2\2\u008c\u008d\7-\2\2\u008d"+
		"\u008e\7-\2\2\u008e\30\3\2\2\2\u008f\u0090\7/\2\2\u0090\u0091\7/\2\2\u0091"+
		"\32\3\2\2\2\u0092\u0093\7~\2\2\u0093\u0094\7~\2\2\u0094\34\3\2\2\2\u0095"+
		"\u0096\7(\2\2\u0096\u0097\7(\2\2\u0097\36\3\2\2\2\u0098\u0099\7?\2\2\u0099"+
		"\u009a\7?\2\2\u009a \3\2\2\2\u009b\u009c\7#\2\2\u009c\u009d\7?\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7@\2\2\u009f$\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1"+
		"&\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4\7?\2\2\u00a4(\3\2\2\2\u00a5\u00a6"+
		"\7>\2\2\u00a6\u00a7\7?\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9,\3"+
		"\2\2\2\u00aa\u00ab\7/\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7,\2\2\u00ad\60\3"+
		"\2\2\2\u00ae\u00af\7\61\2\2\u00af\62\3\2\2\2\u00b0\u00b1\7\'\2\2\u00b1"+
		"\64\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5"+
		"8\3\2\2\2\u00b6\u00b7\7=\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7\uc817\2\2\u00b9"+
		"\u00ba\7\uc21a\2\2\u00ba<\3\2\2\2\u00bb\u00bc\7\uc2e6\2\2\u00bc\u00bd"+
		"\7\uc21a\2\2\u00bd>\3\2\2\2\u00be\u00bf\7\ubb3a\2\2\u00bf\u00c0\7\uc792"+
		"\2\2\u00c0@\3\2\2\2\u00c1\u00c2\7\ub9ce\2\2\u00c2\u00c3\7\uc57f\2\2\u00c3"+
		"B\3\2\2\2\u00c4\u00c5\7\uc546\2\2\u00c5\u00c6\7\ub2ca\2\2\u00c6\u00c7"+
		"\7\uba76\2\2\u00c7D\3\2\2\2\u00c8\u00c9\7\uc872\2\2\u00c9\u00ca\7\uac76"+
		"\2\2\u00ca\u00cb\7\ubc1a\2\2\u00cb\u00cc\7\ubcf7\2\2\u00ccF\3\2\2\2\u00cd"+
		"\u00ce\7\ubc1a\2\2\u00ce\u00cf\7\ubcf7\2\2\u00cfH\3\2\2\2\u00d0\u00d1"+
		"\7\ucd9e\2\2\u00d1\u00d2\7\ub827\2\2\u00d2J\3\2\2\2\u00d3\u00d4\7\uc787"+
		"\2\2\u00d4\u00d5\7\ub827\2\2\u00d5L\3\2\2\2\u00d6\u00da\t\4\2\2\u00d7"+
		"\u00d9\t\5\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\7\62\2\2\u00de\u00d6\3\2\2\2\u00de\u00dd\3\2\2\2\u00dfN\3\2\2\2"+
		"\u00e0\u00e4\t\4\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e9\7\62\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\u00f1\3\2\2\2\u00ea\u00ee\7\60\2\2\u00eb\u00ed\t\5\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2P\3\2\2\2\u00f3\u00f7\7$\2\2\u00f4\u00f6\n\6\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb"+
		"R\3\2\2\2\u00fc\u0100\t\7\2\2\u00fd\u00ff\t\b\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101T\3"+
		"\2\2\2\u0102\u0100\3\2\2\2\u0103\u0107\7.\2\2\u0104\u0106\7\"\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\5S*\2\u010b\u0116"+
		"\3\2\2\2\u010c\u0110\7.\2\2\u010d\u010f\7\"\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u0115\5S*\2\u0114\u010c\3\2\2\2\u0115\u0118"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117V\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\7.\2\2\u011a\u011e\7\"\2\2\u011b\u011d\5\25"+
		"\13\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\5S"+
		"*\2\u0122\u012e\3\2\2\2\u0123\u0124\7.\2\2\u0124\u0128\7\"\2\2\u0125\u0127"+
		"\5\25\13\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d"+
		"\5S*\2\u012c\u0123\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012fX\3\2\2\2\u0130\u012e\3\2\2\2\25\2_mu|\u00da\u00de"+
		"\u00e4\u00e8\u00ee\u00f1\u00f7\u0100\u0107\u0110\u0116\u011e\u0128\u012e"+
		"\6\3\2\2\3\3\3\3\4\4\3\5\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}