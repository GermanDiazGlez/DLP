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
		INT_CONSTANT=1, REAL_CONSTANT=2, ID=3, CHAR_CONSTANT=4, COMMENT1=5, COMMENT2=6, 
		WHITESPACE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT1", 
			"COMMENT2", "WHITESPACE"
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
			null, "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", "COMMENT1", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u00bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3"+
		"\3\3\6\3\30\n\3\r\3\16\3\31\3\3\7\3\35\n\3\f\3\16\3 \13\3\5\3\"\n\3\3"+
		"\4\5\4%\n\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\6\4/\n\4\r\4\16\4\60\3"+
		"\4\3\4\7\4\65\n\4\f\4\16\48\13\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\6"+
		"\4B\n\4\r\4\16\4C\3\4\6\4G\n\4\r\4\16\4H\3\4\3\4\5\4M\n\4\3\4\6\4P\n\4"+
		"\r\4\16\4Q\3\4\5\4U\n\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\5\4`"+
		"\n\4\3\4\6\4c\n\4\r\4\16\4d\3\4\6\4h\n\4\r\4\16\4i\3\4\3\4\7\4n\n\4\f"+
		"\4\16\4q\13\4\3\4\3\4\5\4u\n\4\3\4\6\4x\n\4\r\4\16\4y\5\4|\n\4\3\5\3\5"+
		"\5\5\u0080\n\5\3\5\3\5\7\5\u0084\n\5\f\5\16\5\u0087\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0097\n\6\3\7\3\7\7\7\u009b"+
		"\n\7\f\7\16\7\u009e\13\7\3\7\5\7\u00a1\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00aa\n\b\f\b\16\b\u00ad\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\t"+
		"\u00b7\n\t\r\t\16\t\u00b8\3\t\3\t\4\u009c\u00ab\2\n\3\2\5\3\7\4\t\5\13"+
		"\6\r\7\17\b\21\t\3\2\13\4\2C\\c|\3\2\63;\3\2\62;\4\2GGgg\4\2\62;aa\4\2"+
		"ppvv\4\3\f\f\17\17\3\2$$\5\2\13\f\17\17\"\"\2\u00db\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\3\23\3\2\2\2\5!\3\2\2\2\7{\3\2\2\2\t\177\3\2\2\2\13\u0096\3\2\2\2\r\u0098"+
		"\3\2\2\2\17\u00a4\3\2\2\2\21\u00b6\3\2\2\2\23\24\t\2\2\2\24\4\3\2\2\2"+
		"\25\"\7\62\2\2\26\30\t\3\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2"+
		"\31\32\3\2\2\2\32\36\3\2\2\2\33\35\t\4\2\2\34\33\3\2\2\2\35 \3\2\2\2\36"+
		"\34\3\2\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2!\25\3\2\2\2!\27\3\2"+
		"\2\2\"\6\3\2\2\2#%\7\62\2\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&*\7\60\2\2\'"+
		")\t\4\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+|\3\2\2\2,*\3\2\2\2"+
		"-/\t\3\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2"+
		"\2\62\66\7\60\2\2\63\65\t\4\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\67|\3\2\2\28\66\3\2\2\29;\t\3\2\2:9\3\2\2\2;>\3\2\2\2"+
		"<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?A\7\60\2\2@B\t\4\2\2A@\3\2\2"+
		"\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D|\3\2\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JL\t\5\2\2KM\7/\2\2LK\3\2\2\2LM\3\2\2"+
		"\2MO\3\2\2\2NP\t\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R|\3\2\2"+
		"\2SU\7\62\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VZ\7\60\2\2WY\t\4\2\2XW\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]_\t\5\2\2^`\7"+
		"/\2\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\t\3\2\2ba\3\2\2\2cd\3\2\2\2db\3"+
		"\2\2\2de\3\2\2\2e|\3\2\2\2fh\t\3\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2jk\3\2\2\2ko\7\60\2\2ln\t\4\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op"+
		"\3\2\2\2pr\3\2\2\2qo\3\2\2\2rt\t\5\2\2su\7/\2\2ts\3\2\2\2tu\3\2\2\2uw"+
		"\3\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{"+
		"$\3\2\2\2{.\3\2\2\2{<\3\2\2\2{F\3\2\2\2{T\3\2\2\2{g\3\2\2\2|\b\3\2\2\2"+
		"}\u0080\7a\2\2~\u0080\5\3\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0085\3"+
		"\2\2\2\u0081\u0084\5\3\2\2\u0082\u0084\t\6\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\n\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7)\2\2\u0089\u008a"+
		"\13\2\2\2\u008a\u0097\7)\2\2\u008b\u008c\7)\2\2\u008c\u008d\7^\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\t\7\2\2\u008f\u0097\7)\2\2\u0090\u0091\7)\2"+
		"\2\u0091\u0092\7^\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5\5\3\2\u0094\u0095"+
		"\7)\2\2\u0095\u0097\3\2\2\2\u0096\u0088\3\2\2\2\u0096\u008b\3\2\2\2\u0096"+
		"\u0090\3\2\2\2\u0097\f\3\2\2\2\u0098\u009c\7%\2\2\u0099\u009b\13\2\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009d\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\t\b\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\7\2\2\u00a3\16\3\2\2"+
		"\2\u00a4\u00a5\7$\2\2\u00a5\u00a6\7$\2\2\u00a6\u00a7\7$\2\2\u00a7\u00ab"+
		"\3\2\2\2\u00a8\u00aa\13\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00af\n\t\2\2\u00af\u00b0\7$\2\2\u00b0\u00b1\7$\2\2\u00b1"+
		"\u00b2\7$\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\b\2\2\u00b4\20\3\2\2\2"+
		"\u00b5\u00b7\t\n\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\t\2\2\u00bb"+
		"\22\3\2\2\2 \2\31\36!$*\60\66<CHLQTZ_dioty{\177\u0083\u0085\u0096\u009c"+
		"\u00a0\u00ab\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}