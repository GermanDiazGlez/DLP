// Generated from C:/Users/germa/Documents/DLP/src/parser\Pmm.g4 by ANTLR 4.9.1
package parser;
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
		INT_CONSTANT=32, REAL_CONSTANT=33, ID=34, CHAR_CONSTANT=35, COMMENT1=36, 
		COMMENT2=37, WHITESPACE=38;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "LETTER", "INT_CONSTANT", 
			"REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT1", "COMMENT2", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'char'", "'double'", "':'", "';'", "'['", "']'", "'struct'", 
			"'{'", "'}'", "'('", "')'", "'.'", "'!'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", 
			"'='", "','", "'return'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", 
			"ID", "CHAR_CONSTANT", "COMMENT1", "COMMENT2", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\6\"\u00b0\n\"\r\"\16"+
		"\"\u00b1\3\"\7\"\u00b5\n\"\f\"\16\"\u00b8\13\"\5\"\u00ba\n\"\3#\5#\u00bd"+
		"\n#\3#\3#\7#\u00c1\n#\f#\16#\u00c4\13#\3#\6#\u00c7\n#\r#\16#\u00c8\3#"+
		"\3#\7#\u00cd\n#\f#\16#\u00d0\13#\3#\7#\u00d3\n#\f#\16#\u00d6\13#\3#\3"+
		"#\6#\u00da\n#\r#\16#\u00db\3#\6#\u00df\n#\r#\16#\u00e0\3#\3#\5#\u00e5"+
		"\n#\3#\6#\u00e8\n#\r#\16#\u00e9\3#\5#\u00ed\n#\3#\3#\7#\u00f1\n#\f#\16"+
		"#\u00f4\13#\3#\3#\5#\u00f8\n#\3#\6#\u00fb\n#\r#\16#\u00fc\3#\6#\u0100"+
		"\n#\r#\16#\u0101\3#\3#\7#\u0106\n#\f#\16#\u0109\13#\3#\3#\5#\u010d\n#"+
		"\3#\6#\u0110\n#\r#\16#\u0111\5#\u0114\n#\3$\3$\5$\u0118\n$\3$\3$\7$\u011c"+
		"\n$\f$\16$\u011f\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u012f"+
		"\n%\3&\3&\7&\u0133\n&\f&\16&\u0136\13&\3&\5&\u0139\n&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\7\'\u0142\n\'\f\'\16\'\u0145\13\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\6(\u014f\n(\r(\16(\u0150\3(\3(\4\u0134\u0143\2)\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\"E#G$I%"+
		"K&M\'O(\3\2\13\4\2C\\c|\3\2\63;\3\2\62;\4\2GGgg\4\2\62;aa\4\2ppvv\4\3"+
		"\f\f\17\17\3\2$$\5\2\13\f\17\17\"\"\2\u0173\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7Z\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3"+
		"\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23p\3\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31"+
		"v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0080\3\2\2\2"+
		"%\u0082\3\2\2\2\'\u0084\3\2\2\2)\u0086\3\2\2\2+\u0088\3\2\2\2-\u008a\3"+
		"\2\2\2/\u008d\3\2\2\2\61\u0090\3\2\2\2\63\u0093\3\2\2\2\65\u0096\3\2\2"+
		"\2\67\u0099\3\2\2\29\u009c\3\2\2\2;\u009e\3\2\2\2=\u00a0\3\2\2\2?\u00a7"+
		"\3\2\2\2A\u00ab\3\2\2\2C\u00b9\3\2\2\2E\u0113\3\2\2\2G\u0117\3\2\2\2I"+
		"\u012e\3\2\2\2K\u0130\3\2\2\2M\u013c\3\2\2\2O\u014e\3\2\2\2QR\7k\2\2R"+
		"S\7p\2\2ST\7v\2\2T\4\3\2\2\2UV\7e\2\2VW\7j\2\2WX\7c\2\2XY\7t\2\2Y\6\3"+
		"\2\2\2Z[\7f\2\2[\\\7q\2\2\\]\7w\2\2]^\7d\2\2^_\7n\2\2_`\7g\2\2`\b\3\2"+
		"\2\2ab\7<\2\2b\n\3\2\2\2cd\7=\2\2d\f\3\2\2\2ef\7]\2\2f\16\3\2\2\2gh\7"+
		"_\2\2h\20\3\2\2\2ij\7u\2\2jk\7v\2\2kl\7t\2\2lm\7w\2\2mn\7e\2\2no\7v\2"+
		"\2o\22\3\2\2\2pq\7}\2\2q\24\3\2\2\2rs\7\177\2\2s\26\3\2\2\2tu\7*\2\2u"+
		"\30\3\2\2\2vw\7+\2\2w\32\3\2\2\2xy\7\60\2\2y\34\3\2\2\2z{\7#\2\2{\36\3"+
		"\2\2\2|}\7,\2\2} \3\2\2\2~\177\7\61\2\2\177\"\3\2\2\2\u0080\u0081\7\'"+
		"\2\2\u0081$\3\2\2\2\u0082\u0083\7-\2\2\u0083&\3\2\2\2\u0084\u0085\7/\2"+
		"\2\u0085(\3\2\2\2\u0086\u0087\7>\2\2\u0087*\3\2\2\2\u0088\u0089\7@\2\2"+
		"\u0089,\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c.\3\2\2\2\u008d"+
		"\u008e\7@\2\2\u008e\u008f\7?\2\2\u008f\60\3\2\2\2\u0090\u0091\7#\2\2\u0091"+
		"\u0092\7?\2\2\u0092\62\3\2\2\2\u0093\u0094\7?\2\2\u0094\u0095\7?\2\2\u0095"+
		"\64\3\2\2\2\u0096\u0097\7(\2\2\u0097\u0098\7(\2\2\u0098\66\3\2\2\2\u0099"+
		"\u009a\7~\2\2\u009a\u009b\7~\2\2\u009b8\3\2\2\2\u009c\u009d\7?\2\2\u009d"+
		":\3\2\2\2\u009e\u009f\7.\2\2\u009f<\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2"+
		"\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7t\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6>\3\2\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7h\2\2\u00aa@\3\2\2\2\u00ab\u00ac\t\2\2\2\u00acB\3\2\2\2\u00ad"+
		"\u00ba\7\62\2\2\u00ae\u00b0\t\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2\2\2\u00b3"+
		"\u00b5\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ad\3\2\2\2\u00b9\u00af\3\2\2\2\u00baD\3\2\2\2\u00bb\u00bd\7\62\2\2"+
		"\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2"+
		"\7\60\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u0114\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c7\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\7\60"+
		"\2\2\u00cb\u00cd\t\4\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u0114\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d3\t\3\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d9\7\60\2\2\u00d8\u00da\t\4\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u0114\3\2"+
		"\2\2\u00dd\u00df\t\3\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\t\5"+
		"\2\2\u00e3\u00e5\7/\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e8\t\3\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u0114\3\2\2\2\u00eb"+
		"\u00ed\7\62\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3"+
		"\2\2\2\u00ee\u00f2\7\60\2\2\u00ef\u00f1\t\4\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\t\5\2\2\u00f6\u00f8\7/\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb\t\3"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0114\3\2\2\2\u00fe\u0100\t\3\2\2\u00ff\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0107\7\60\2\2\u0104\u0106\t\4\2\2\u0105\u0104\3"+
		"\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\t\5\2\2\u010b\u010d\7/"+
		"\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0110\t\3\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u00bc\3\2\2\2\u0113"+
		"\u00c6\3\2\2\2\u0113\u00d4\3\2\2\2\u0113\u00de\3\2\2\2\u0113\u00ec\3\2"+
		"\2\2\u0113\u00ff\3\2\2\2\u0114F\3\2\2\2\u0115\u0118\7a\2\2\u0116\u0118"+
		"\5A!\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u011d\3\2\2\2\u0119"+
		"\u011c\5A!\2\u011a\u011c\t\6\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2"+
		"\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eH"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7)\2\2\u0121\u0122\13\2\2\2\u0122"+
		"\u012f\7)\2\2\u0123\u0124\7)\2\2\u0124\u0125\7^\2\2\u0125\u0126\3\2\2"+
		"\2\u0126\u0127\t\7\2\2\u0127\u012f\7)\2\2\u0128\u0129\7)\2\2\u0129\u012a"+
		"\7^\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5C\"\2\u012c\u012d\7)\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0120\3\2\2\2\u012e\u0123\3\2\2\2\u012e\u0128\3\2"+
		"\2\2\u012fJ\3\2\2\2\u0130\u0134\7%\2\2\u0131\u0133\13\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\t\b\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b&\2\2\u013bL\3\2\2\2\u013c\u013d"+
		"\7$\2\2\u013d\u013e\7$\2\2\u013e\u013f\7$\2\2\u013f\u0143\3\2\2\2\u0140"+
		"\u0142\13\2\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0144\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0147\n\t\2\2\u0147\u0148\7$\2\2\u0148\u0149\7$\2\2\u0149\u014a\7$\2"+
		"\2\u014a\u014b\3\2\2\2\u014b\u014c\b\'\2\2\u014cN\3\2\2\2\u014d\u014f"+
		"\t\n\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b(\2\2\u0153P\3\2\2\2 "+
		"\2\u00b1\u00b6\u00b9\u00bc\u00c2\u00c8\u00ce\u00d4\u00db\u00e0\u00e4\u00e9"+
		"\u00ec\u00f2\u00f7\u00fc\u0101\u0107\u010c\u0111\u0113\u0117\u011b\u011d"+
		"\u012e\u0134\u0138\u0143\u0150\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}