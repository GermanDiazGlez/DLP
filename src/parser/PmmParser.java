// Generated from C:/Users/germa/Documents/DLP/src/parser\Pmm.g4 by ANTLR 4.9.1
package parser;

import ast.*;
import ast.expression.*;
import ast.program.type.*;
import ast.program.definition.*;
import ast.statement.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_mainMethod = 1, RULE_definitions = 2, RULE_type = 3, 
		RULE_builtinType = 4, RULE_varDefinitions = 5, RULE_varDefinition = 6, 
		RULE_ids = 7, RULE_param = 8, RULE_funParam = 9, RULE_statements = 10, 
		RULE_funDefinition = 11, RULE_expList = 12, RULE_expression = 13, RULE_statement = 14, 
		RULE_if_statement = 15, RULE_while_statement = 16, RULE_return_statement = 17, 
		RULE_give_params = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainMethod", "definitions", "type", "builtinType", "varDefinitions", 
			"varDefinition", "ids", "param", "funParam", "statements", "funDefinition", 
			"expList", "expression", "statement", "if_statement", "while_statement", 
			"return_statement", "give_params"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "'['", "']'", 
			"'struct'", "'int'", "'char'", "'double'", "';'", "','", "'.'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'<'", "'>'", "'<='", "'>='", "'!='", 
			"'=='", "'&&'", "'||'", "'print'", "'input'", "'='", "'if'", "'else'", 
			"'while'", "'return'"
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

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public DefinitionsContext d;
		public MainMethodContext m;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((ProgramContext)_localctx).d = definitions();
			setState(39);
			((ProgramContext)_localctx).m = mainMethod();
			setState(40);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program((((ProgramContext)_localctx).d!=null?(((ProgramContext)_localctx).d.start):null).getLine(), (((ProgramContext)_localctx).d!=null?(((ProgramContext)_localctx).d.start):null).getCharPositionInLine(), ((ProgramContext)_localctx).d.ast, ((ProgramContext)_localctx).m.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainMethodContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token d;
		public Token m;
		public VarDefinitionsContext v;
		public StatementsContext s;
		public VarDefinitionsContext varDefinitions() {
			return getRuleContext(VarDefinitionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterMainMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitMainMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((MainMethodContext)_localctx).d = match(T__0);
			setState(44);
			((MainMethodContext)_localctx).m = match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			match(T__3);
			setState(47);
			match(T__4);
			setState(48);
			match(T__5);
			setState(49);
			((MainMethodContext)_localctx).v = varDefinitions();
			setState(50);
			((MainMethodContext)_localctx).s = statements();
			setState(51);
			match(T__6);
			((MainMethodContext)_localctx).ast =  new FuncDefinition(((MainMethodContext)_localctx).d.getLine(), ((MainMethodContext)_localctx).d.getCharPositionInLine() + 1, ((MainMethodContext)_localctx).v.ast, ((MainMethodContext)_localctx).s.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public VarDefinitionContext vd;
		public FunDefinitionContext fd;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FunDefinitionContext> funDefinition() {
			return getRuleContexts(FunDefinitionContext.class);
		}
		public FunDefinitionContext funDefinition(int i) {
			return getRuleContext(FunDefinitionContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(60);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(54);
						((DefinitionsContext)_localctx).vd = varDefinition();
						_localctx.ast.addAll(((DefinitionsContext)_localctx).vd.ast);
						}
						break;
					case T__0:
						{
						setState(57);
						((DefinitionsContext)_localctx).fd = funDefinition();
						_localctx.ast.add(((DefinitionsContext)_localctx).fd.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public BuiltinTypeContext bt;
		public Token a;
		public TypeContext t;
		public Token s;
		public VarDefinitionsContext vd;
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionsContext varDefinitions() {
			return getRuleContext(VarDefinitionsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
				{
				setState(65);
				((TypeContext)_localctx).bt = builtinType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).bt.ast; 
				}
				break;
			case T__7:
				{
				setState(68);
				match(T__7);
				setState(69);
				((TypeContext)_localctx).a = match(INT_CONSTANT);
				setState(70);
				match(T__8);
				setState(71);
				((TypeContext)_localctx).t = type();
				 ((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).a.getLine(),
				                                         ((TypeContext)_localctx).a.getCharPositionInLine()+1,
				                                         ((TypeContext)_localctx).t.ast,
				                                         LexerHelper.lexemeToInt((((TypeContext)_localctx).a!=null?((TypeContext)_localctx).a.getText():null)));
				}
				break;
			case T__9:
				{
				setState(74);
				((TypeContext)_localctx).s = match(T__9);
				setState(75);
				match(T__5);
				setState(76);
				((TypeContext)_localctx).vd = varDefinitions();
				setState(77);
				match(T__6);
				 ((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).s.getLine(),
				                                         ((TypeContext)_localctx).s.getCharPositionInLine()+1,
				                                         ((TypeContext)_localctx).vd.ast); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltinTypeContext extends ParserRuleContext {
		public Type ast;
		public BuiltinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterBuiltinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitBuiltinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBuiltinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltinTypeContext builtinType() throws RecognitionException {
		BuiltinTypeContext _localctx = new BuiltinTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_builtinType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(82);
				match(T__10);
				 ((BuiltinTypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__11:
				{
				setState(84);
				match(T__11);
				 ((BuiltinTypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__12:
				{
				setState(86);
				match(T__12);
				 ((BuiltinTypeContext)_localctx).ast =  DoubleType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public VarDefinitionContext v;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public VarDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterVarDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitVarDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionsContext varDefinitions() throws RecognitionException {
		VarDefinitionsContext _localctx = new VarDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDefinitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					((VarDefinitionsContext)_localctx).v = varDefinition();
					_localctx.ast.addAll(((VarDefinitionsContext)_localctx).v.ast);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public IdsContext i;
		public BuiltinTypeContext bt;
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			((VarDefinitionContext)_localctx).i = ids();
			setState(99);
			match(T__4);
			setState(100);
			((VarDefinitionContext)_localctx).bt = builtinType();
			setState(101);
			match(T__13);

			                for(String id : ((VarDefinitionContext)_localctx).i.ast) {
			                    _localctx.ast.add(new VarDefinition(((VarDefinitionContext)_localctx).i.ast.getLine(),
			                    ((VarDefinitionContext)_localctx).i.ast.getCharPositionInLine()+1,
			                    ((VarDefinitionContext)_localctx).bt.ast,
			                    id));
			                }
			            
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdsContext extends ParserRuleContext {
		public List<String> ast = new ArrayList<String>();
		public Token i;
		public Token j;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((IdsContext)_localctx).i = match(ID);
			_localctx.ast.add((((IdsContext)_localctx).i!=null?((IdsContext)_localctx).i.getText():null));
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(106);
				match(T__14);
				setState(107);
				((IdsContext)_localctx).j = match(ID);
				_localctx.ast.add((((IdsContext)_localctx).j!=null?((IdsContext)_localctx).j.getText():null));
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token i;
		public BuiltinTypeContext bt;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((ParamContext)_localctx).i = match(ID);
			setState(115);
			match(T__4);
			setState(116);
			((ParamContext)_localctx).bt = builtinType();
			 ((ParamContext)_localctx).ast =  new VarDefinition(((ParamContext)_localctx).i.getLine(), ((ParamContext)_localctx).i.getCharPositionInLine() + 1, ((ParamContext)_localctx).bt.ast, (((ParamContext)_localctx).i!=null?((ParamContext)_localctx).i.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunParamContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public ParamContext p1;
		public ParamContext p2;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public FunParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFunParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFunParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunParamContext funParam() throws RecognitionException {
		FunParamContext _localctx = new FunParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funParam);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__2);
				setState(120);
				((FunParamContext)_localctx).p1 = param();
				_localctx.ast.add(((FunParamContext)_localctx).p1.ast);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(122);
					match(T__14);
					setState(123);
					((FunParamContext)_localctx).p2 = param();
					_localctx.ast.add(((FunParamContext)_localctx).p2.ast);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__2);
				setState(134);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(137);
				((StatementsContext)_localctx).s = statement();
				_localctx.ast.addAll(((StatementsContext)_localctx).s.ast);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token d;
		public Token i;
		public FunParamContext p;
		public BuiltinTypeContext bt;
		public VarDefinitionsContext vd;
		public StatementsContext st;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FunParamContext funParam() {
			return getRuleContext(FunParamContext.class,0);
		}
		public VarDefinitionsContext varDefinitions() {
			return getRuleContext(VarDefinitionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public FunDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFunDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFunDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefinitionContext funDefinition() throws RecognitionException {
		FunDefinitionContext _localctx = new FunDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funDefinition);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((FunDefinitionContext)_localctx).d = match(T__0);
				setState(146);
				((FunDefinitionContext)_localctx).i = match(ID);
				setState(147);
				((FunDefinitionContext)_localctx).p = funParam();
				setState(148);
				match(T__4);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					setState(149);
					((FunDefinitionContext)_localctx).bt = builtinType();
					}
				}

				setState(152);
				match(T__5);
				setState(153);
				((FunDefinitionContext)_localctx).vd = varDefinitions();
				setState(154);
				((FunDefinitionContext)_localctx).st = statements();
				setState(155);
				match(T__6);
				 ((FunDefinitionContext)_localctx).ast =  new FuncDefinition(((FunDefinitionContext)_localctx).d.getLine(), ((FunDefinitionContext)_localctx).d.getCharPositionInLine()+1,
				            new FunctionType(((FunDefinitionContext)_localctx).d.getLine(), ((FunDefinitionContext)_localctx).d.getCharPositionInLine()+1, ((FunDefinitionContext)_localctx).bt.ast, ((FunDefinitionContext)_localctx).p.ast),
				            (((FunDefinitionContext)_localctx).i!=null?((FunDefinitionContext)_localctx).i.getText():null), vd.ast, ((FunDefinitionContext)_localctx).st.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				((FunDefinitionContext)_localctx).d = match(T__0);
				setState(159);
				((FunDefinitionContext)_localctx).i = match(ID);
				setState(160);
				((FunDefinitionContext)_localctx).p = funParam();
				setState(161);
				match(T__4);
				setState(162);
				match(T__5);
				setState(163);
				((FunDefinitionContext)_localctx).vd = varDefinitions();
				setState(164);
				((FunDefinitionContext)_localctx).st = statements();
				setState(165);
				match(T__6);
				((FunDefinitionContext)_localctx).ast =  new FuncDefinition(((FunDefinitionContext)_localctx).d.getLine(), ((FunDefinitionContext)_localctx).d.getCharPositionInLine()+1,
				            new FunctionType(((FunDefinitionContext)_localctx).d.getLine(), ((FunDefinitionContext)_localctx).d.getCharPositionInLine()+1, VoidType.getInstance(), ((FunDefinitionContext)_localctx).p.ast),
				            (((FunDefinitionContext)_localctx).i!=null?((FunDefinitionContext)_localctx).i.getText():null), ((FunDefinitionContext)_localctx).vd.ast, ((FunDefinitionContext)_localctx).st.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpListContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext exp1;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterExpList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitExpList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			((ExpListContext)_localctx).exp1 = expression(0);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(171);
				match(T__14);
				setState(172);
				expression(0);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.ast.add(((ExpListContext)_localctx).exp1.ast); 
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext exp;
		public ExpressionContext exp1;
		public Token ID;
		public Token CH;
		public BuiltinTypeContext t;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token OP;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(181);
				match(T__2);
				setState(182);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(183);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).exp.ast; 
				}
				break;
			case 2:
				{
				setState(186);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(187);
				match(T__2);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(188);
					expList();
					}
				}

				setState(191);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(192);
				((ExpressionContext)_localctx).CH = match(T__2);
				setState(193);
				((ExpressionContext)_localctx).t = builtinType();
				setState(194);
				match(T__3);
				setState(195);
				((ExpressionContext)_localctx).exp = expression(11);
				 ((ExpressionContext)_localctx).ast =  new Cast(
				                          ((ExpressionContext)_localctx).CH.getLine(),
				                          ((ExpressionContext)_localctx).CH.getCharPositionInLine()+1,
				                          ((ExpressionContext)_localctx).exp.ast
				                          ((ExpressionContext)_localctx).t.ast
				                          );
				            
				}
				break;
			case 4:
				{
				setState(198);
				((ExpressionContext)_localctx).CH = match(T__16);
				setState(199);
				((ExpressionContext)_localctx).exp = expression(10);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(
				                          ((ExpressionContext)_localctx).CH.getLine(),
				                          ((ExpressionContext)_localctx).CH.getCharPositionInLine()+1,
				                          ((ExpressionContext)_localctx).exp.ast
				                          );
				            
				}
				break;
			case 5:
				{
				setState(202);
				((ExpressionContext)_localctx).CH = match(T__17);
				setState(203);
				((ExpressionContext)_localctx).exp = expression(9);
				 ((ExpressionContext)_localctx).ast =  new Not(
				                          ((ExpressionContext)_localctx).CH.getLine(),
				                          ((ExpressionContext)_localctx).CH.getCharPositionInLine()+1,
				                          ((ExpressionContext)_localctx).exp.ast
				                          );
				            
				}
				break;
			case 6:
				{
				setState(206);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                          ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				                          LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(208);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                          ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,
				                          LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(210);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                          ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,
				                          LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(212);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(217);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						((ExpressionContext)_localctx).exp2 = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                                    ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).exp1.ast.getColumn(),
						                                    ((ExpressionContext)_localctx).exp1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).exp2.ast
						                                    );
						                      
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(222);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__21) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						((ExpressionContext)_localctx).exp2 = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                                    ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).exp1.ast.getColumn(),
						                                    ((ExpressionContext)_localctx).exp1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).exp2.ast
						                                    );
						                      
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(227);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(228);
						((ExpressionContext)_localctx).exp2 = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Comparison(
						                                    ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).exp1.ast.getColumn(),
						                                    ((ExpressionContext)_localctx).exp1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).exp2.ast
						                                    );
						                      
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(232);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						((ExpressionContext)_localctx).exp2 = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Logical(
						                                    ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).exp1.ast.getColumn(),
						                                    ((ExpressionContext)_localctx).exp1.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).exp2.ast
						                                    );
						                      
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(237);
						match(T__15);
						setState(238);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess(
						                                    ((ExpressionContext)_localctx).exp.ast.getLine(),
						                                    ((ExpressionContext)_localctx).exp.ast.getColumn(),
						                                    ((ExpressionContext)_localctx).exp.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)
						                                    );
						                      
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(241);
						match(T__7);
						setState(242);
						((ExpressionContext)_localctx).exp2 = expression(0);
						setState(243);
						match(T__8);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(
						                                    ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                                    ((ExpressionContext)_localctx).exp1.ast.getColumn(),
						                                    ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast
						                                    );
						                      
						}
						break;
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public If_statementContext i;
		public While_statementContext w;
		public Return_statementContext r;
		public Token p;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token id;
		public Give_paramsContext g;
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public Give_paramsContext give_params() {
			return getRuleContext(Give_paramsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((StatementContext)_localctx).i = if_statement();
				_localctx.ast.addAll(((StatementContext)_localctx).i.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				((StatementContext)_localctx).w = while_statement();
				_localctx.ast.addAll(((StatementContext)_localctx).w.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				((StatementContext)_localctx).r = return_statement();
				_localctx.ast.add(((StatementContext)_localctx).r.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				((StatementContext)_localctx).p = match(T__30);
				setState(261);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new PrintStatement(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).e1.ast));
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(263);
					match(T__14);
					setState(264);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new PrintStatement(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).e2.ast));
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				((StatementContext)_localctx).p = match(T__31);
				setState(275);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new InputStatement(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).e1.ast));
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(277);
					match(T__14);
					setState(278);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new InputStatement(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).e2.ast));
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
				((StatementContext)_localctx).e1 = expression(0);
				setState(289);
				match(T__32);
				setState(290);
				((StatementContext)_localctx).e2 = expression(0);
				setState(291);
				match(T__13);
				 _localctx.ast.add(new AssignmentStatement((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine() + 1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				((StatementContext)_localctx).id = match(ID);
				setState(295);
				((StatementContext)_localctx).g = give_params();
				setState(296);
				match(T__13);
				_localctx.ast.add(new Function(((StatementContext)_localctx).id.getLine(), ((StatementContext)_localctx).id.getCharPositionInLine() + 1, ((StatementContext)_localctx).g.ast,
				                    new Variable(((StatementContext)_localctx).id.getLine(), ((StatementContext)_localctx).id.getCharPositionInLine() + 1, (((StatementContext)_localctx).id!=null?((StatementContext)_localctx).id.getText():null))));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Token i;
		public ExpressionContext e;
		public StatementsContext s1;
		public StatementsContext s2;
		public StatementContext st1;
		public StatementContext st2;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				((If_statementContext)_localctx).i = match(T__33);
				setState(302);
				((If_statementContext)_localctx).e = expression(0);
				setState(303);
				match(T__4);
				setState(304);
				match(T__5);
				setState(305);
				((If_statementContext)_localctx).s1 = statements();
				setState(306);
				match(T__6);
				setState(307);
				match(T__34);
				setState(308);
				match(T__5);
				setState(309);
				((If_statementContext)_localctx).s2 = statements();
				setState(310);
				match(T__6);
				_localctx.ast.add(new IfElseStatement(((If_statementContext)_localctx).i.getLine(), ((If_statementContext)_localctx).i.getCharPositionInLine() + 1, ((If_statementContext)_localctx).e.ast, ((If_statementContext)_localctx).s1.ast, ((If_statementContext)_localctx).s2.ast) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				((If_statementContext)_localctx).i = match(T__33);
				setState(314);
				((If_statementContext)_localctx).e = expression(0);
				setState(315);
				match(T__4);
				setState(316);
				((If_statementContext)_localctx).st1 = statement();
				setState(317);
				match(T__34);
				setState(318);
				((If_statementContext)_localctx).st2 = statement();
				_localctx.ast.add(new IfElseStatement(((If_statementContext)_localctx).i.getLine(), ((If_statementContext)_localctx).i.getCharPositionInLine() + 1, ((If_statementContext)_localctx).e.ast, ((If_statementContext)_localctx).st1.ast, ((If_statementContext)_localctx).st2.ast) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				((If_statementContext)_localctx).i = match(T__33);
				setState(322);
				((If_statementContext)_localctx).e = expression(0);
				setState(323);
				match(T__4);
				setState(324);
				match(T__5);
				setState(325);
				((If_statementContext)_localctx).s1 = statements();
				setState(326);
				match(T__6);
				setState(327);
				match(T__34);
				setState(328);
				((If_statementContext)_localctx).st2 = statement();
				_localctx.ast.add(new IfElseStatement(((If_statementContext)_localctx).i.getLine(), ((If_statementContext)_localctx).i.getCharPositionInLine() + 1, ((If_statementContext)_localctx).e.ast, ((If_statementContext)_localctx).s1.ast, ((If_statementContext)_localctx).st2.ast) );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				((If_statementContext)_localctx).i = match(T__33);
				setState(332);
				((If_statementContext)_localctx).e = expression(0);
				setState(333);
				match(T__4);
				setState(334);
				((If_statementContext)_localctx).st1 = statement();
				setState(335);
				match(T__34);
				setState(336);
				match(T__5);
				setState(337);
				((If_statementContext)_localctx).s2 = statements();
				setState(338);
				match(T__6);
				_localctx.ast.add(new IfElseStatement(((If_statementContext)_localctx).i.getLine(), ((If_statementContext)_localctx).i.getCharPositionInLine() + 1, ((If_statementContext)_localctx).e.ast, ((If_statementContext)_localctx).st1.ast, ((If_statementContext)_localctx).s2.ast) );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				((If_statementContext)_localctx).i = match(T__33);
				setState(342);
				((If_statementContext)_localctx).e = expression(0);
				setState(343);
				match(T__4);
				setState(344);
				match(T__5);
				setState(345);
				((If_statementContext)_localctx).s1 = statements();
				setState(346);
				match(T__6);
				_localctx.ast.add(new IfElseStatement(((If_statementContext)_localctx).i.getLine(), ((If_statementContext)_localctx).i.getCharPositionInLine() + 1, ((If_statementContext)_localctx).e.ast, ((If_statementContext)_localctx).s1.ast) );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				((If_statementContext)_localctx).i = match(T__33);
				setState(350);
				((If_statementContext)_localctx).e = expression(0);
				setState(351);
				match(T__4);
				setState(352);
				((If_statementContext)_localctx).st1 = statement();
				_localctx.ast.add(new IfElseStatement(((If_statementContext)_localctx).i.getLine(), ((If_statementContext)_localctx).i.getCharPositionInLine() + 1, ((If_statementContext)_localctx).e.ast, ((If_statementContext)_localctx).st1.ast) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Token i;
		public ExpressionContext e;
		public StatementsContext s;
		public StatementContext st;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_statement);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((While_statementContext)_localctx).i = match(T__35);
				setState(358);
				((While_statementContext)_localctx).e = expression(0);
				setState(359);
				match(T__4);
				setState(360);
				match(T__5);
				setState(361);
				((While_statementContext)_localctx).s = statements();
				setState(362);
				match(T__6);
				_localctx.ast.add(new WhileStatement(((While_statementContext)_localctx).i.getLine(), ((While_statementContext)_localctx).i.getCharPositionInLine() + 1, ((While_statementContext)_localctx).e.ast, ((While_statementContext)_localctx).s.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				((While_statementContext)_localctx).i = match(T__35);
				setState(366);
				((While_statementContext)_localctx).e = expression(0);
				setState(367);
				match(T__4);
				setState(368);
				((While_statementContext)_localctx).st = statement();
				_localctx.ast.add(new WhileStatement(((While_statementContext)_localctx).i.getLine(), ((While_statementContext)_localctx).i.getCharPositionInLine() + 1, ((While_statementContext)_localctx).e.ast, ((While_statementContext)_localctx).st.ast));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ReturnStatement ast;
		public Token r;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((Return_statementContext)_localctx).r = match(T__36);
			setState(374);
			((Return_statementContext)_localctx).e = expression(0);
			setState(375);
			match(T__13);
			((Return_statementContext)_localctx).ast =  new ReturnStatement(((Return_statementContext)_localctx).r.getLine(), ((Return_statementContext)_localctx).r.getCharPositionInLine() + 1, ((Return_statementContext)_localctx).e.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Give_paramsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Give_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_give_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterGive_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitGive_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitGive_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Give_paramsContext give_params() throws RecognitionException {
		Give_paramsContext _localctx = new Give_paramsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_give_params);
		int _la;
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(T__2);
				setState(379);
				((Give_paramsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((Give_paramsContext)_localctx).e1.ast);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(381);
					match(T__14);
					setState(382);
					((Give_paramsContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((Give_paramsContext)_localctx).e2.ast);
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(T__2);
				setState(393);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u018f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f\13\16"+
		"\13\u0084\13\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\7\f\u008f"+
		"\n\f\f\f\16\f\u0092\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16"+
		"\3\16\3\16\7\16\u00b0\n\16\f\16\16\16\u00b3\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c0\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00d9\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00f9\n\17\f\17"+
		"\16\17\u00fc\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u010e\n\20\f\20\16\20\u0111\13\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u011c\n\20\f\20\16\20"+
		"\u011f\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u012e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0166\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0176\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0184\n\24\f\24\16\24\u0187\13"+
		"\24\3\24\3\24\3\24\3\24\5\24\u018d\n\24\3\24\2\3\34\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\25\27\4\2\23\23\30\30\3\2\31\36"+
		"\3\2\37 \2\u01a8\2(\3\2\2\2\4-\3\2\2\2\6@\3\2\2\2\bR\3\2\2\2\nZ\3\2\2"+
		"\2\fa\3\2\2\2\16d\3\2\2\2\20j\3\2\2\2\22t\3\2\2\2\24\u0089\3\2\2\2\26"+
		"\u0090\3\2\2\2\30\u00aa\3\2\2\2\32\u00ac\3\2\2\2\34\u00d8\3\2\2\2\36\u012d"+
		"\3\2\2\2 \u0165\3\2\2\2\"\u0175\3\2\2\2$\u0177\3\2\2\2&\u018c\3\2\2\2"+
		"()\5\6\4\2)*\5\4\3\2*+\7\2\2\3+,\b\2\1\2,\3\3\2\2\2-.\7\3\2\2./\7\4\2"+
		"\2/\60\7\5\2\2\60\61\7\6\2\2\61\62\7\7\2\2\62\63\7\b\2\2\63\64\5\f\7\2"+
		"\64\65\5\26\f\2\65\66\7\t\2\2\66\67\b\3\1\2\67\5\3\2\2\289\5\16\b\29:"+
		"\b\4\1\2:?\3\2\2\2;<\5\30\r\2<=\b\4\1\2=?\3\2\2\2>8\3\2\2\2>;\3\2\2\2"+
		"?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2B@\3\2\2\2CD\5\n\6\2DE\b\5\1"+
		"\2ES\3\2\2\2FG\7\n\2\2GH\7(\2\2HI\7\13\2\2IJ\5\b\5\2JK\b\5\1\2KS\3\2\2"+
		"\2LM\7\f\2\2MN\7\b\2\2NO\5\f\7\2OP\7\t\2\2PQ\b\5\1\2QS\3\2\2\2RC\3\2\2"+
		"\2RF\3\2\2\2RL\3\2\2\2S\t\3\2\2\2TU\7\r\2\2U[\b\6\1\2VW\7\16\2\2W[\b\6"+
		"\1\2XY\7\17\2\2Y[\b\6\1\2ZT\3\2\2\2ZV\3\2\2\2ZX\3\2\2\2[\13\3\2\2\2\\"+
		"]\5\16\b\2]^\b\7\1\2^`\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2b\r\3\2\2\2ca\3\2\2\2de\5\20\t\2ef\7\7\2\2fg\5\n\6\2gh\7\20\2\2hi\b"+
		"\b\1\2i\17\3\2\2\2jk\7*\2\2kq\b\t\1\2lm\7\21\2\2mn\7*\2\2np\b\t\1\2ol"+
		"\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\21\3\2\2\2sq\3\2\2\2tu\7*\2\2"+
		"uv\7\7\2\2vw\5\n\6\2wx\b\n\1\2x\23\3\2\2\2yz\7\5\2\2z{\5\22\n\2{\u0082"+
		"\b\13\1\2|}\7\21\2\2}~\5\22\n\2~\177\b\13\1\2\177\u0081\3\2\2\2\u0080"+
		"|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\6\2\2\u0086\u008a"+
		"\3\2\2\2\u0087\u0088\7\5\2\2\u0088\u008a\7\6\2\2\u0089y\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\25\3\2\2\2\u008b\u008c\5\36\20\2\u008c\u008d\b\f"+
		"\1\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\27\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0093\u0094\7\3\2\2\u0094\u0095\7*\2\2\u0095\u0096\5\24\13\2\u0096"+
		"\u0098\7\7\2\2\u0097\u0099\5\n\6\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c\5\f\7\2\u009c"+
		"\u009d\5\26\f\2\u009d\u009e\7\t\2\2\u009e\u009f\b\r\1\2\u009f\u00ab\3"+
		"\2\2\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\7*\2\2\u00a2\u00a3\5\24\13\2\u00a3"+
		"\u00a4\7\7\2\2\u00a4\u00a5\7\b\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00a7\5\26"+
		"\f\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\b\r\1\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u0093\3\2\2\2\u00aa\u00a0\3\2\2\2\u00ab\31\3\2\2\2\u00ac\u00b1\5\34\17"+
		"\2\u00ad\u00ae\7\21\2\2\u00ae\u00b0\5\34\17\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\16\1\2\u00b5\33\3\2\2\2\u00b6\u00b7"+
		"\b\17\1\2\u00b7\u00b8\7\5\2\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\7\6\2"+
		"\2\u00ba\u00bb\b\17\1\2\u00bb\u00d9\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd\u00bf"+
		"\7\5\2\2\u00be\u00c0\5\32\16\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00d9\7\6\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4"+
		"\5\n\6\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\5\34\17\r\u00c6\u00c7\b\17\1"+
		"\2\u00c7\u00d9\3\2\2\2\u00c8\u00c9\7\23\2\2\u00c9\u00ca\5\34\17\f\u00ca"+
		"\u00cb\b\17\1\2\u00cb\u00d9\3\2\2\2\u00cc\u00cd\7\24\2\2\u00cd\u00ce\5"+
		"\34\17\13\u00ce\u00cf\b\17\1\2\u00cf\u00d9\3\2\2\2\u00d0\u00d1\7(\2\2"+
		"\u00d1\u00d9\b\17\1\2\u00d2\u00d3\7)\2\2\u00d3\u00d9\b\17\1\2\u00d4\u00d5"+
		"\7+\2\2\u00d5\u00d9\b\17\1\2\u00d6\u00d7\7*\2\2\u00d7\u00d9\b\17\1\2\u00d8"+
		"\u00b6\3\2\2\2\u00d8\u00bc\3\2\2\2\u00d8\u00c2\3\2\2\2\u00d8\u00c8\3\2"+
		"\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00fa\3\2\2\2\u00da\u00db\f\n"+
		"\2\2\u00db\u00dc\t\2\2\2\u00dc\u00dd\5\34\17\13\u00dd\u00de\b\17\1\2\u00de"+
		"\u00f9\3\2\2\2\u00df\u00e0\f\t\2\2\u00e0\u00e1\t\3\2\2\u00e1\u00e2\5\34"+
		"\17\n\u00e2\u00e3\b\17\1\2\u00e3\u00f9\3\2\2\2\u00e4\u00e5\f\b\2\2\u00e5"+
		"\u00e6\t\4\2\2\u00e6\u00e7\5\34\17\t\u00e7\u00e8\b\17\1\2\u00e8\u00f9"+
		"\3\2\2\2\u00e9\u00ea\f\7\2\2\u00ea\u00eb\t\5\2\2\u00eb\u00ec\5\34\17\b"+
		"\u00ec\u00ed\b\17\1\2\u00ed\u00f9\3\2\2\2\u00ee\u00ef\f\17\2\2\u00ef\u00f0"+
		"\7\22\2\2\u00f0\u00f1\7*\2\2\u00f1\u00f9\b\17\1\2\u00f2\u00f3\f\16\2\2"+
		"\u00f3\u00f4\7\n\2\2\u00f4\u00f5\5\34\17\2\u00f5\u00f6\7\13\2\2\u00f6"+
		"\u00f7\b\17\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00da\3\2\2\2\u00f8\u00df\3"+
		"\2\2\2\u00f8\u00e4\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8"+
		"\u00f2\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\35\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5 \21\2\u00fe\u00ff"+
		"\b\20\1\2\u00ff\u012e\3\2\2\2\u0100\u0101\5\"\22\2\u0101\u0102\b\20\1"+
		"\2\u0102\u012e\3\2\2\2\u0103\u0104\5$\23\2\u0104\u0105\b\20\1\2\u0105"+
		"\u012e\3\2\2\2\u0106\u0107\7!\2\2\u0107\u0108\5\34\17\2\u0108\u010f\b"+
		"\20\1\2\u0109\u010a\7\21\2\2\u010a\u010b\5\34\17\2\u010b\u010c\b\20\1"+
		"\2\u010c\u010e\3\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\7\20\2\2\u0113\u012e\3\2\2\2\u0114\u0115\7\"\2\2\u0115\u0116\5"+
		"\34\17\2\u0116\u011d\b\20\1\2\u0117\u0118\7\21\2\2\u0118\u0119\5\34\17"+
		"\2\u0119\u011a\b\20\1\2\u011a\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\20\2\2\u0121\u012e\3\2\2\2\u0122"+
		"\u0123\5\34\17\2\u0123\u0124\7#\2\2\u0124\u0125\5\34\17\2\u0125\u0126"+
		"\7\20\2\2\u0126\u0127\b\20\1\2\u0127\u012e\3\2\2\2\u0128\u0129\7*\2\2"+
		"\u0129\u012a\5&\24\2\u012a\u012b\7\20\2\2\u012b\u012c\b\20\1\2\u012c\u012e"+
		"\3\2\2\2\u012d\u00fd\3\2\2\2\u012d\u0100\3\2\2\2\u012d\u0103\3\2\2\2\u012d"+
		"\u0106\3\2\2\2\u012d\u0114\3\2\2\2\u012d\u0122\3\2\2\2\u012d\u0128\3\2"+
		"\2\2\u012e\37\3\2\2\2\u012f\u0130\7$\2\2\u0130\u0131\5\34\17\2\u0131\u0132"+
		"\7\7\2\2\u0132\u0133\7\b\2\2\u0133\u0134\5\26\f\2\u0134\u0135\7\t\2\2"+
		"\u0135\u0136\7%\2\2\u0136\u0137\7\b\2\2\u0137\u0138\5\26\f\2\u0138\u0139"+
		"\7\t\2\2\u0139\u013a\b\21\1\2\u013a\u0166\3\2\2\2\u013b\u013c\7$\2\2\u013c"+
		"\u013d\5\34\17\2\u013d\u013e\7\7\2\2\u013e\u013f\5\36\20\2\u013f\u0140"+
		"\7%\2\2\u0140\u0141\5\36\20\2\u0141\u0142\b\21\1\2\u0142\u0166\3\2\2\2"+
		"\u0143\u0144\7$\2\2\u0144\u0145\5\34\17\2\u0145\u0146\7\7\2\2\u0146\u0147"+
		"\7\b\2\2\u0147\u0148\5\26\f\2\u0148\u0149\7\t\2\2\u0149\u014a\7%\2\2\u014a"+
		"\u014b\5\36\20\2\u014b\u014c\b\21\1\2\u014c\u0166\3\2\2\2\u014d\u014e"+
		"\7$\2\2\u014e\u014f\5\34\17\2\u014f\u0150\7\7\2\2\u0150\u0151\5\36\20"+
		"\2\u0151\u0152\7%\2\2\u0152\u0153\7\b\2\2\u0153\u0154\5\26\f\2\u0154\u0155"+
		"\7\t\2\2\u0155\u0156\b\21\1\2\u0156\u0166\3\2\2\2\u0157\u0158\7$\2\2\u0158"+
		"\u0159\5\34\17\2\u0159\u015a\7\7\2\2\u015a\u015b\7\b\2\2\u015b\u015c\5"+
		"\26\f\2\u015c\u015d\7\t\2\2\u015d\u015e\b\21\1\2\u015e\u0166\3\2\2\2\u015f"+
		"\u0160\7$\2\2\u0160\u0161\5\34\17\2\u0161\u0162\7\7\2\2\u0162\u0163\5"+
		"\36\20\2\u0163\u0164\b\21\1\2\u0164\u0166\3\2\2\2\u0165\u012f\3\2\2\2"+
		"\u0165\u013b\3\2\2\2\u0165\u0143\3\2\2\2\u0165\u014d\3\2\2\2\u0165\u0157"+
		"\3\2\2\2\u0165\u015f\3\2\2\2\u0166!\3\2\2\2\u0167\u0168\7&\2\2\u0168\u0169"+
		"\5\34\17\2\u0169\u016a\7\7\2\2\u016a\u016b\7\b\2\2\u016b\u016c\5\26\f"+
		"\2\u016c\u016d\7\t\2\2\u016d\u016e\b\22\1\2\u016e\u0176\3\2\2\2\u016f"+
		"\u0170\7&\2\2\u0170\u0171\5\34\17\2\u0171\u0172\7\7\2\2\u0172\u0173\5"+
		"\36\20\2\u0173\u0174\b\22\1\2\u0174\u0176\3\2\2\2\u0175\u0167\3\2\2\2"+
		"\u0175\u016f\3\2\2\2\u0176#\3\2\2\2\u0177\u0178\7\'\2\2\u0178\u0179\5"+
		"\34\17\2\u0179\u017a\7\20\2\2\u017a\u017b\b\23\1\2\u017b%\3\2\2\2\u017c"+
		"\u017d\7\5\2\2\u017d\u017e\5\34\17\2\u017e\u0185\b\24\1\2\u017f\u0180"+
		"\7\21\2\2\u0180\u0181\5\34\17\2\u0181\u0182\b\24\1\2\u0182\u0184\3\2\2"+
		"\2\u0183\u017f\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7\6\2\2\u0189"+
		"\u018d\3\2\2\2\u018a\u018b\7\5\2\2\u018b\u018d\7\6\2\2\u018c\u017c\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\'\3\2\2\2\31>@RZaq\u0082\u0089\u0090\u0098"+
		"\u00aa\u00b1\u00bf\u00d8\u00f8\u00fa\u010f\u011d\u012d\u0165\u0175\u0185"+
		"\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}