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
		INT_CONSTANT=1, DOUBLE_CONSTANT=2, IDENTIFIER_CONSTANT=3, COMMENT1=4, 
		COMMENT2=5, CHAR_CONSTANT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_CONSTANT", "DOUBLE_CONSTANT", "IDENTIFIER_CONSTANT", "COMMENT1", 
			"COMMENT2", "CHAR_CONSTANT"
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
			null, "INT_CONSTANT", "DOUBLE_CONSTANT", "IDENTIFIER_CONSTANT", "COMMENT1", 
			"COMMENT2", "CHAR_CONSTANT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\u00a5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\22\n\2\r\2\16\2"+
		"\23\3\2\7\2\27\n\2\f\2\16\2\32\13\2\5\2\34\n\2\3\3\5\3\37\n\3\3\3\3\3"+
		"\7\3#\n\3\f\3\16\3&\13\3\3\3\6\3)\n\3\r\3\16\3*\3\3\3\3\7\3/\n\3\f\3\16"+
		"\3\62\13\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\6\3<\n\3\r\3\16\3=\3"+
		"\3\6\3A\n\3\r\3\16\3B\3\3\3\3\5\3G\n\3\3\3\6\3J\n\3\r\3\16\3K\3\3\5\3"+
		"O\n\3\3\3\3\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\5\3Z\n\3\3\3\6\3]\n\3\r"+
		"\3\16\3^\3\3\6\3b\n\3\r\3\16\3c\3\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3"+
		"\3\5\3o\n\3\3\3\6\3r\n\3\r\3\16\3s\5\3v\n\3\3\4\7\4y\n\4\f\4\16\4|\13"+
		"\4\3\4\5\4\177\n\4\3\4\7\4\u0082\n\4\f\4\16\4\u0085\13\4\3\5\3\5\7\5\u0089"+
		"\n\5\f\5\16\5\u008c\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u0099\n\6\f\6\16\6\u009c\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\4\u008a"+
		"\u009a\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\6\3\2\63;\3\2\62;\4\2C\\c|\4\2"+
		"\13\f\17\17\2\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\3\33\3\2\2\2\5u\3\2\2\2\7z\3\2\2\2\t\u0086\3\2"+
		"\2\2\13\u0093\3\2\2\2\r\u00a3\3\2\2\2\17\34\7\62\2\2\20\22\t\2\2\2\21"+
		"\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\30\3\2\2\2\25"+
		"\27\t\3\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31"+
		"\34\3\2\2\2\32\30\3\2\2\2\33\17\3\2\2\2\33\21\3\2\2\2\34\4\3\2\2\2\35"+
		"\37\7\62\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 $\7\60\2\2!#\t\3"+
		"\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%v\3\2\2\2&$\3\2\2\2\')"+
		"\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,\60\7\60\2"+
		"\2-/\t\3\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61v\3\2\2"+
		"\2\62\60\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29;\7\60\2\2:<\t\3\2\2;:\3\2\2\2"+
		"<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>v\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7G\2\2EG\7/\2\2FE\3\2\2\2FG\3\2\2\2G"+
		"I\3\2\2\2HJ\t\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2Lv\3\2\2\2"+
		"MO\7\62\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PT\7\60\2\2QS\t\3\2\2RQ\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WY\7G\2\2XZ\7/\2\2"+
		"YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_v\3\2\2\2`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2de\3\2\2\2ei\7\60\2\2fh\t\3\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2jl\3\2\2\2ki\3\2\2\2ln\7G\2\2mo\7/\2\2nm\3\2\2\2no\3\2\2\2oq\3\2"+
		"\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2u\36\3"+
		"\2\2\2u(\3\2\2\2u\66\3\2\2\2u@\3\2\2\2uN\3\2\2\2ua\3\2\2\2v\6\3\2\2\2"+
		"wy\t\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2"+
		"}\177\7a\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080\u0082\t\4"+
		"\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\b\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008a\7%\2\2"+
		"\u0087\u0089\13\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\7\17\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7\2\2\3\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\b\5\2\2\u0092\n\3\2\2\2\u0093\u0094\7$\2\2\u0094\u0095"+
		"\7$\2\2\u0095\u0096\7$\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e"+
		"\u009f\7$\2\2\u009f\u00a0\7$\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\6\2"+
		"\2\u00a2\f\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4\16\3\2\2\2\35\2\23\30\33"+
		"\36$*\60\66=BFKNTY^cinsuz~\u0083\u008a\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}