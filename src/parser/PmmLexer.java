// Generated from C:/Users/germa/Documents/DLP/src/parser\Pmm.g4 by ANTLR 4.9.1
package parser;

import ast.*;
import ast.expression.*;
import ast.program.type.*;
import ast.program.definition.*;
import ast.statement.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, ID=40, CHAR_CONSTANT=41, COMMENT1=42, COMMENT2=43, WHITESPACE=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "LETTER", "EXPONENT", "INT_CONSTANT", 
			"REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT1", "COMMENT2", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "'['", "']'", 
			"'struct'", "';'", "'int'", "'char'", "'double'", "','", "'.'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'<'", "'>'", "'<='", "'>='", "'!='", 
			"'=='", "'&&'", "'||'", "'return'", "'print'", "'input'", "'='", "'if'", 
			"'else'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT1", 
			"COMMENT2", "WHITESPACE"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u016f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\5(\u00dd"+
		"\n(\3(\3(\3)\3)\6)\u00e3\n)\r)\16)\u00e4\3)\7)\u00e8\n)\f)\16)\u00eb\13"+
		")\5)\u00ed\n)\3*\5*\u00f0\n*\3*\3*\7*\u00f4\n*\f*\16*\u00f7\13*\3*\6*"+
		"\u00fa\n*\r*\16*\u00fb\3*\3*\7*\u0100\n*\f*\16*\u0103\13*\3*\7*\u0106"+
		"\n*\f*\16*\u0109\13*\3*\3*\6*\u010d\n*\r*\16*\u010e\3*\6*\u0112\n*\r*"+
		"\16*\u0113\3*\3*\5*\u0118\n*\3*\3*\7*\u011c\n*\f*\16*\u011f\13*\3*\3*"+
		"\6*\u0123\n*\r*\16*\u0124\3*\3*\7*\u0129\n*\f*\16*\u012c\13*\3*\5*\u012f"+
		"\n*\3+\3+\5+\u0133\n+\3+\3+\7+\u0137\n+\f+\16+\u013a\13+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u014a\n,\3-\3-\7-\u014e\n-\f-\16-\u0151"+
		"\13-\3-\5-\u0154\n-\3-\3-\3.\3.\3.\3.\3.\7.\u015d\n.\f.\16.\u0160\13."+
		"\3.\3.\3.\3.\3.\3.\3.\3/\6/\u016a\n/\r/\16/\u016b\3/\3/\4\u014f\u015e"+
		"\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M\2O\2Q(S)U*W+Y,[-].\3\2\f\4\2C\\c|\4\2GGgg\4\2"+
		"--//\3\2\63;\3\2\62;\4\2\62;aa\4\2ppvv\4\3\f\f\17\17\3\2$$\5\2\13\f\17"+
		"\17\"\"\2\u0188\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5c\3\2\2\2\7"+
		"h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23"+
		"t\3\2\2\2\25v\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0083\3\2\2\2\35\u0088"+
		"\3\2\2\2\37\u008f\3\2\2\2!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2"+
		"\'\u0097\3\2\2\2)\u0099\3\2\2\2+\u009b\3\2\2\2-\u009d\3\2\2\2/\u009f\3"+
		"\2\2\2\61\u00a1\3\2\2\2\63\u00a3\3\2\2\2\65\u00a6\3\2\2\2\67\u00a9\3\2"+
		"\2\29\u00ac\3\2\2\2;\u00af\3\2\2\2=\u00b2\3\2\2\2?\u00b5\3\2\2\2A\u00bc"+
		"\3\2\2\2C\u00c2\3\2\2\2E\u00c8\3\2\2\2G\u00ca\3\2\2\2I\u00cd\3\2\2\2K"+
		"\u00d2\3\2\2\2M\u00d8\3\2\2\2O\u00da\3\2\2\2Q\u00ec\3\2\2\2S\u012e\3\2"+
		"\2\2U\u0132\3\2\2\2W\u0149\3\2\2\2Y\u014b\3\2\2\2[\u0157\3\2\2\2]\u0169"+
		"\3\2\2\2_`\7f\2\2`a\7g\2\2ab\7h\2\2b\4\3\2\2\2cd\7o\2\2de\7c\2\2ef\7k"+
		"\2\2fg\7p\2\2g\6\3\2\2\2hi\7*\2\2i\b\3\2\2\2jk\7+\2\2k\n\3\2\2\2lm\7<"+
		"\2\2m\f\3\2\2\2no\7}\2\2o\16\3\2\2\2pq\7\177\2\2q\20\3\2\2\2rs\7]\2\2"+
		"s\22\3\2\2\2tu\7_\2\2u\24\3\2\2\2vw\7u\2\2wx\7v\2\2xy\7t\2\2yz\7w\2\2"+
		"z{\7e\2\2{|\7v\2\2|\26\3\2\2\2}~\7=\2\2~\30\3\2\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082\32\3\2\2\2\u0083\u0084\7e\2\2\u0084"+
		"\u0085\7j\2\2\u0085\u0086\7c\2\2\u0086\u0087\7t\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\7f\2\2\u0089\u008a\7q\2\2\u008a\u008b\7w\2\2\u008b\u008c\7d\2\2"+
		"\u008c\u008d\7n\2\2\u008d\u008e\7g\2\2\u008e\36\3\2\2\2\u008f\u0090\7"+
		".\2\2\u0090 \3\2\2\2\u0091\u0092\7\60\2\2\u0092\"\3\2\2\2\u0093\u0094"+
		"\7/\2\2\u0094$\3\2\2\2\u0095\u0096\7#\2\2\u0096&\3\2\2\2\u0097\u0098\7"+
		",\2\2\u0098(\3\2\2\2\u0099\u009a\7\61\2\2\u009a*\3\2\2\2\u009b\u009c\7"+
		"\'\2\2\u009c,\3\2\2\2\u009d\u009e\7-\2\2\u009e.\3\2\2\2\u009f\u00a0\7"+
		">\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\62\3\2\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4\u00a5\7?\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7?\2\2\u00ab8"+
		"\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad\u00ae\7?\2\2\u00ae:\3\2\2\2\u00af\u00b0"+
		"\7(\2\2\u00b0\u00b1\7(\2\2\u00b1<\3\2\2\2\u00b2\u00b3\7~\2\2\u00b3\u00b4"+
		"\7~\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"@\3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7v\2\2"+
		"\u00c7D\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7h\2\2\u00ccH\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d1\7g\2\2\u00d1J\3\2\2\2\u00d2\u00d3\7y\2\2\u00d3"+
		"\u00d4\7j\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7L\3\2\2\2\u00d8\u00d9\t\2\2\2\u00d9N\3\2\2\2\u00da\u00dc\t\3\2\2"+
		"\u00db\u00dd\t\4\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\5Q)\2\u00dfP\3\2\2\2\u00e0\u00ed\7\62\2\2\u00e1\u00e3"+
		"\t\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e8\t\6\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e2\3\2"+
		"\2\2\u00edR\3\2\2\2\u00ee\u00f0\7\62\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\7\60\2\2\u00f2\u00f4\t\6\2\2"+
		"\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u012f\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\t\5\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\7\60\2\2\u00fe\u0100\t\6\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u012f\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\t\5\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7\60\2\2\u010b"+
		"\u010d\t\6\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u012f\3\2\2\2\u0110\u0112\t\5\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u012f\5O(\2\u0116\u0118\7\62\2\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011d\7\60"+
		"\2\2\u011a\u011c\t\6\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u012f\5O(\2\u0121\u0123\t\5\2\2\u0122\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u012a\7\60\2\2\u0127\u0129\t\6\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u012f\5O(\2\u012e\u00ef\3\2\2\2\u012e\u00f9\3\2\2"+
		"\2\u012e\u0107\3\2\2\2\u012e\u0111\3\2\2\2\u012e\u0117\3\2\2\2\u012e\u0122"+
		"\3\2\2\2\u012fT\3\2\2\2\u0130\u0133\7a\2\2\u0131\u0133\5M\'\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0138\3\2\2\2\u0134\u0137\5M\'\2\u0135"+
		"\u0137\t\7\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139V\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013b\u013c\7)\2\2\u013c\u013d\13\2\2\2\u013d\u014a\7)\2\2\u013e"+
		"\u013f\7)\2\2\u013f\u0140\7^\2\2\u0140\u0141\3\2\2\2\u0141\u0142\t\b\2"+
		"\2\u0142\u014a\7)\2\2\u0143\u0144\7)\2\2\u0144\u0145\7^\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\5Q)\2\u0147\u0148\7)\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u013b\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0143\3\2\2\2\u014aX\3\2\2\2"+
		"\u014b\u014f\7%\2\2\u014c\u014e\13\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0154\t\t\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\b-\2\2\u0156Z\3\2\2\2\u0157\u0158\7$\2\2\u0158\u0159"+
		"\7$\2\2\u0159\u015a\7$\2\2\u015a\u015e\3\2\2\2\u015b\u015d\13\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015f\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\n\n\2\2\u0162"+
		"\u0163\7$\2\2\u0163\u0164\7$\2\2\u0164\u0165\7$\2\2\u0165\u0166\3\2\2"+
		"\2\u0166\u0167\b.\2\2\u0167\\\3\2\2\2\u0168\u016a\t\13\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\b/\2\2\u016e^\3\2\2\2\33\2\u00dc\u00e4\u00e9"+
		"\u00ec\u00ef\u00f5\u00fb\u0101\u0107\u010e\u0113\u0117\u011d\u0124\u012a"+
		"\u012e\u0132\u0136\u0138\u0149\u014f\u0153\u015e\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}