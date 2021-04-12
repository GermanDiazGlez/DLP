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
		RULE_fields = 4, RULE_builtinType = 5, RULE_varDefinitions = 6, RULE_varDefinition = 7, 
		RULE_ids = 8, RULE_param = 9, RULE_funParam = 10, RULE_giveParams = 11, 
		RULE_statements = 12, RULE_funDefinition = 13, RULE_expression = 14, RULE_statement = 15, 
		RULE_block = 16, RULE_ifStatement = 17, RULE_whileStatement = 18, RULE_give_params = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainMethod", "definitions", "type", "fields", "builtinType", 
			"varDefinitions", "varDefinition", "ids", "param", "funParam", "giveParams", 
			"statements", "funDefinition", "expression", "statement", "block", "ifStatement", 
			"whileStatement", "give_params"
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
			setState(40);
			((ProgramContext)_localctx).d = definitions();
			setState(41);
			((ProgramContext)_localctx).m = mainMethod();
			setState(42);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program((((ProgramContext)_localctx).d!=null?(((ProgramContext)_localctx).d.start):null).getLine(), (((ProgramContext)_localctx).d!=null?(((ProgramContext)_localctx).d.start):null).getCharPositionInLine()+1, ((ProgramContext)_localctx).d.ast, ((ProgramContext)_localctx).m.ast); 
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
		public StatementsContext s;
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
			setState(45);
			((MainMethodContext)_localctx).d = match(T__0);
			setState(46);
			((MainMethodContext)_localctx).m = match(T__1);
			setState(47);
			match(T__2);
			setState(48);
			match(T__3);
			setState(49);
			match(T__4);
			setState(50);
			match(T__5);
			setState(51);
			((MainMethodContext)_localctx).s = statements();
			setState(52);
			match(T__6);
			((MainMethodContext)_localctx).ast =  new FuncDefinition(((MainMethodContext)_localctx).d.getLine(), ((MainMethodContext)_localctx).d.getCharPositionInLine()+1, ((MainMethodContext)_localctx).s.ast);
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
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(61);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(55);
						((DefinitionsContext)_localctx).vd = varDefinition();
						_localctx.ast.addAll(((DefinitionsContext)_localctx).vd.ast);
						}
						break;
					case T__0:
						{
						setState(58);
						((DefinitionsContext)_localctx).fd = funDefinition();
						_localctx.ast.add(((DefinitionsContext)_localctx).fd.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(65);
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
		public FieldsContext f;
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
				{
				setState(66);
				((TypeContext)_localctx).bt = builtinType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).bt.ast; 
				}
				break;
			case T__7:
				{
				setState(69);
				match(T__7);
				setState(70);
				((TypeContext)_localctx).a = match(INT_CONSTANT);
				setState(71);
				match(T__8);
				setState(72);
				((TypeContext)_localctx).t = type();
				 ((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).a.getLine(),
				                                         ((TypeContext)_localctx).a.getCharPositionInLine()+1,
				                                         ((TypeContext)_localctx).t.ast,
				                                         LexerHelper.lexemeToInt((((TypeContext)_localctx).a!=null?((TypeContext)_localctx).a.getText():null)));
				}
				break;
			case T__9:
				{
				setState(75);
				((TypeContext)_localctx).s = match(T__9);
				setState(76);
				match(T__5);
				setState(77);
				((TypeContext)_localctx).f = fields();
				setState(78);
				match(T__6);
				 ((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).s.getLine(),
				                                         ((TypeContext)_localctx).s.getCharPositionInLine()+1,
				                                         ((TypeContext)_localctx).f.ast); 
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

	public static class FieldsContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<>();
		public IdsContext i;
		public BuiltinTypeContext bt;
		public List<IdsContext> ids() {
			return getRuleContexts(IdsContext.class);
		}
		public IdsContext ids(int i) {
			return getRuleContext(IdsContext.class,i);
		}
		public List<BuiltinTypeContext> builtinType() {
			return getRuleContexts(BuiltinTypeContext.class);
		}
		public BuiltinTypeContext builtinType(int i) {
			return getRuleContext(BuiltinTypeContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(83);
				((FieldsContext)_localctx).i = ids();
				setState(84);
				match(T__4);
				setState(85);
				((FieldsContext)_localctx).bt = builtinType();
				setState(86);
				match(T__10);

				            List<String> alreadyAdded = new ArrayList<>();
				            for(String id : ((FieldsContext)_localctx).i.ast)
				            {
				                if(alreadyAdded.contains(id)){
				                    new ErrorType((((FieldsContext)_localctx).i!=null?(((FieldsContext)_localctx).i.start):null).getLine(), (((FieldsContext)_localctx).i!=null?(((FieldsContext)_localctx).i.start):null).getCharPositionInLine()+1, "Campo duplicado: " + id );
				                }
				                else{
				                    boolean repeated = false;
				                    for(RecordField field: _localctx.ast){
				                        if(field.getName().equals(id)){
				                            new ErrorType((((FieldsContext)_localctx).i!=null?(((FieldsContext)_localctx).i.start):null).getLine(), (((FieldsContext)_localctx).i!=null?(((FieldsContext)_localctx).i.start):null).getCharPositionInLine()+1, "Campo duplicado: " + id );
				                            repeated = true;
				                            break;
				                        }
				                    }
				                    if(!repeated){
				                        _localctx.ast.add(new RecordField((((FieldsContext)_localctx).i!=null?(((FieldsContext)_localctx).i.start):null).getLine(), (((FieldsContext)_localctx).i!=null?(((FieldsContext)_localctx).i.start):null).getCharPositionInLine()+1, id, ((FieldsContext)_localctx).bt.ast));
				                    }
				                }
				            }
				        
				}
				}
				setState(93);
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
		enterRule(_localctx, 10, RULE_builtinType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(94);
				match(T__11);
				 ((BuiltinTypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__12:
				{
				setState(96);
				match(T__12);
				 ((BuiltinTypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__13:
				{
				setState(98);
				match(T__13);
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
		enterRule(_localctx, 12, RULE_varDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(102);
				((VarDefinitionsContext)_localctx).v = varDefinition();
				_localctx.ast.addAll(((VarDefinitionsContext)_localctx).v.ast);
				}
				}
				setState(109);
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public IdsContext i;
		public TypeContext t;
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 14, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			((VarDefinitionContext)_localctx).i = ids();
			setState(111);
			match(T__4);
			setState(112);
			((VarDefinitionContext)_localctx).t = type();
			setState(113);
			match(T__10);

			                for(String id : ((VarDefinitionContext)_localctx).i.ast) {
			                    _localctx.ast.add(new VarDefinition((((VarDefinitionContext)_localctx).i!=null?(((VarDefinitionContext)_localctx).i.start):null).getLine(),
			                    (((VarDefinitionContext)_localctx).i!=null?(((VarDefinitionContext)_localctx).i.start):null).getCharPositionInLine()+1,
			                    ((VarDefinitionContext)_localctx).t.ast,
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
		enterRule(_localctx, 16, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((IdsContext)_localctx).i = match(ID);
			_localctx.ast.add((((IdsContext)_localctx).i!=null?((IdsContext)_localctx).i.getText():null));
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(118);
				match(T__14);
				setState(119);
				((IdsContext)_localctx).j = match(ID);
				_localctx.ast.add((((IdsContext)_localctx).j!=null?((IdsContext)_localctx).j.getText():null));
				}
				}
				setState(125);
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
		enterRule(_localctx, 18, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((ParamContext)_localctx).i = match(ID);
			setState(127);
			match(T__4);
			setState(128);
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
		enterRule(_localctx, 20, RULE_funParam);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__2);
				setState(132);
				((FunParamContext)_localctx).p1 = param();
				_localctx.ast.add(((FunParamContext)_localctx).p1.ast);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(134);
					match(T__14);
					setState(135);
					((FunParamContext)_localctx).p2 = param();
					_localctx.ast.add(((FunParamContext)_localctx).p2.ast);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__2);
				setState(146);
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

	public static class GiveParamsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GiveParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giveParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterGiveParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitGiveParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitGiveParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GiveParamsContext giveParams() throws RecognitionException {
		GiveParamsContext _localctx = new GiveParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_giveParams);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__2);
				setState(150);
				((GiveParamsContext)_localctx).exp1 = expression(0);
				_localctx.ast.add(((GiveParamsContext)_localctx).exp1.ast);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(152);
					match(T__14);
					setState(153);
					((GiveParamsContext)_localctx).exp2 = expression(0);
					_localctx.ast.add(((GiveParamsContext)_localctx).exp2.ast);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__2);
				setState(164);
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
		enterRule(_localctx, 24, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(167);
				((StatementsContext)_localctx).s = statement();
				_localctx.ast.addAll(((StatementsContext)_localctx).s.ast);
				}
				}
				setState(174);
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
		public Token c;
		public BuiltinTypeContext bt;
		public StatementsContext st;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FunParamContext funParam() {
			return getRuleContext(FunParamContext.class,0);
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
		enterRule(_localctx, 26, RULE_funDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((FunDefinitionContext)_localctx).d = match(T__0);
			setState(176);
			((FunDefinitionContext)_localctx).i = match(ID);
			setState(177);
			((FunDefinitionContext)_localctx).p = funParam();
			setState(178);
			((FunDefinitionContext)_localctx).c = match(T__4);
			Type type = VoidType.getInstance();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(180);
				((FunDefinitionContext)_localctx).bt = builtinType();
				type = ((FunDefinitionContext)_localctx).bt.ast;
				}
			}

			setState(185);
			match(T__5);
			setState(186);
			((FunDefinitionContext)_localctx).st = statements();
			setState(187);
			match(T__6);
			 ((FunDefinitionContext)_localctx).ast =  new FuncDefinition(((FunDefinitionContext)_localctx).d.getLine(), ((FunDefinitionContext)_localctx).d.getCharPositionInLine()+1,
			            new FunctionType(((FunDefinitionContext)_localctx).c.getLine(), ((FunDefinitionContext)_localctx).c.getCharPositionInLine()+1, type, ((FunDefinitionContext)_localctx).p.ast),
			            (((FunDefinitionContext)_localctx).i!=null?((FunDefinitionContext)_localctx).i.getText():null), ((FunDefinitionContext)_localctx).st.ast); 
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
		public Token i;
		public GiveParamsContext gp;
		public Token CH;
		public BuiltinTypeContext t;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public Token OP;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public GiveParamsContext giveParams() {
			return getRuleContext(GiveParamsContext.class,0);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(191);
				match(T__2);
				setState(192);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(193);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).exp.ast; 
				}
				break;
			case 2:
				{
				setState(196);
				((ExpressionContext)_localctx).i = match(ID);
				setState(197);
				((ExpressionContext)_localctx).gp = giveParams();
				 ((ExpressionContext)_localctx).ast =  new Function(
				                          ((ExpressionContext)_localctx).i.getLine(),
				                          ((ExpressionContext)_localctx).i.getCharPositionInLine()+1,
				                          new Variable(((ExpressionContext)_localctx).i.getLine(), ((ExpressionContext)_localctx).i.getCharPositionInLine()+1, (((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null)),
				                          ((ExpressionContext)_localctx).gp.ast
				                          );
				            
				}
				break;
			case 3:
				{
				setState(200);
				((ExpressionContext)_localctx).CH = match(T__2);
				setState(201);
				((ExpressionContext)_localctx).t = builtinType();
				setState(202);
				match(T__3);
				setState(203);
				((ExpressionContext)_localctx).exp = expression(11);
				 ((ExpressionContext)_localctx).ast =  new Cast(
				                          ((ExpressionContext)_localctx).CH.getLine(),
				                          ((ExpressionContext)_localctx).CH.getCharPositionInLine()+1,
				                          ((ExpressionContext)_localctx).exp.ast,
				                          ((ExpressionContext)_localctx).t.ast
				                          );
				            
				}
				break;
			case 4:
				{
				setState(206);
				((ExpressionContext)_localctx).CH = match(T__16);
				setState(207);
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
				setState(210);
				((ExpressionContext)_localctx).CH = match(T__17);
				setState(211);
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
				setState(214);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                          ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				                          LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(216);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                          ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,
				                          LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(218);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                          ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,
				                          LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(220);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(225);
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
						setState(226);
						((ExpressionContext)_localctx).exp2 = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(),
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
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
						setState(229);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(230);
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
						setState(231);
						((ExpressionContext)_localctx).exp2 = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(),
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
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
						setState(234);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(235);
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
						setState(236);
						((ExpressionContext)_localctx).exp2 = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Comparison(
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(),
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
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
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
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
						setState(241);
						((ExpressionContext)_localctx).exp2 = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Logical(
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(),
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
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
						setState(244);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(245);
						match(T__15);
						setState(246);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess(
						                                    (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(),
						                                    (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine()+1,
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
						setState(248);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(249);
						match(T__7);
						setState(250);
						((ExpressionContext)_localctx).exp2 = expression(0);
						setState(251);
						match(T__8);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(),
						                                    (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
						                                    ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast
						                                    );
						                      
						}
						break;
					}
					} 
				}
				setState(258);
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
		public List<Statement> ast = new ArrayList<>();
		public IfStatementContext i;
		public WhileStatementContext w;
		public Token r;
		public ExpressionContext exp;
		public Token p;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public Token id;
		public Give_paramsContext g;
		public VarDefinitionContext v;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
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
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
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
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((StatementContext)_localctx).i = ifStatement();
				_localctx.ast.addAll(((StatementContext)_localctx).i.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				((StatementContext)_localctx).w = whileStatement();
				_localctx.ast.addAll(((StatementContext)_localctx).w.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				((StatementContext)_localctx).r = match(T__30);
				setState(266);
				((StatementContext)_localctx).exp = expression(0);
				setState(267);
				match(T__10);
				_localctx.ast.add(new ReturnStatement(((StatementContext)_localctx).r.getLine(), ((StatementContext)_localctx).r.getCharPositionInLine()+1, ((StatementContext)_localctx).exp.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				((StatementContext)_localctx).p = match(T__31);
				setState(271);
				((StatementContext)_localctx).exp1 = expression(0);
				_localctx.ast.add(new PrintStatement(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).exp1.ast));
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(273);
					match(T__14);
					setState(274);
					((StatementContext)_localctx).exp2 = expression(0);
					_localctx.ast.add(new PrintStatement(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).exp2.ast));
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				((StatementContext)_localctx).p = match(T__32);
				setState(285);
				((StatementContext)_localctx).exp1 = expression(0);
				_localctx.ast.add(new InputStatement(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).exp1.ast));
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(287);
					match(T__14);
					setState(288);
					((StatementContext)_localctx).exp2 = expression(0);
					_localctx.ast.add(new InputStatement(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine() + 1, ((StatementContext)_localctx).exp2.ast));
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				((StatementContext)_localctx).exp1 = expression(0);
				setState(299);
				match(T__33);
				setState(300);
				((StatementContext)_localctx).exp2 = expression(0);
				setState(301);
				match(T__10);
				 _localctx.ast.add(new AssignmentStatement((((StatementContext)_localctx).exp1!=null?(((StatementContext)_localctx).exp1.start):null).getLine(), (((StatementContext)_localctx).exp1!=null?(((StatementContext)_localctx).exp1.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).exp1.ast, ((StatementContext)_localctx).exp2.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				((StatementContext)_localctx).id = match(ID);
				setState(305);
				((StatementContext)_localctx).g = give_params();
				setState(306);
				match(T__10);
				_localctx.ast.add(new Function(((StatementContext)_localctx).id.getLine(), ((StatementContext)_localctx).id.getCharPositionInLine()+1,
				        new Variable(((StatementContext)_localctx).id.getLine(), ((StatementContext)_localctx).id.getCharPositionInLine()+1, (((StatementContext)_localctx).id!=null?((StatementContext)_localctx).id.getText():null)),
				        ((StatementContext)_localctx).g.ast));
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(312); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(309);
						((StatementContext)_localctx).v = varDefinition();
						_localctx.ast.addAll(((StatementContext)_localctx).v.ast);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(314); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext s1;
		public StatementContext s2;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((BlockContext)_localctx).s1 = statement();
				_localctx.ast.addAll(((BlockContext)_localctx).s1.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(321);
					match(T__5);
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(322);
						((BlockContext)_localctx).s2 = statement();
						}
						}
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(328);
					match(T__6);
					_localctx.ast.addAll(((BlockContext)_localctx).s2.ast);
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Token i;
		public ExpressionContext exp;
		public BlockContext b1;
		public BlockContext b2;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				((IfStatementContext)_localctx).i = match(T__34);
				setState(338);
				((IfStatementContext)_localctx).exp = expression(0);
				setState(339);
				match(T__4);
				setState(340);
				((IfStatementContext)_localctx).b1 = block();
				setState(341);
				match(T__35);
				setState(342);
				((IfStatementContext)_localctx).b2 = block();

				        _localctx.ast.add(new IfElseStatement(((IfStatementContext)_localctx).i.getLine(), ((IfStatementContext)_localctx).i.getCharPositionInLine()+1, ((IfStatementContext)_localctx).exp.ast, ((IfStatementContext)_localctx).b1.ast, ((IfStatementContext)_localctx).b2.ast) );
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				((IfStatementContext)_localctx).i = match(T__34);
				setState(346);
				((IfStatementContext)_localctx).exp = expression(0);
				setState(347);
				match(T__4);
				setState(348);
				((IfStatementContext)_localctx).b1 = block();

				        _localctx.ast.add(new IfElseStatement(((IfStatementContext)_localctx).i.getLine(), ((IfStatementContext)_localctx).i.getCharPositionInLine()+1, ((IfStatementContext)_localctx).exp.ast, ((IfStatementContext)_localctx).b1.ast) );
				    
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

	public static class WhileStatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public Token wh;
		public ExpressionContext exp;
		public StatementsContext st;
		public StatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmmListener ) ((PmmListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileStatement);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				((WhileStatementContext)_localctx).wh = match(T__36);
				setState(354);
				((WhileStatementContext)_localctx).exp = expression(0);
				setState(355);
				match(T__4);
				setState(356);
				match(T__5);
				setState(357);
				((WhileStatementContext)_localctx).st = statements();
				setState(358);
				match(T__6);
				_localctx.ast.add(new WhileStatement(((WhileStatementContext)_localctx).wh.getLine(), ((WhileStatementContext)_localctx).wh.getCharPositionInLine()+1, ((WhileStatementContext)_localctx).exp.ast, ((WhileStatementContext)_localctx).st.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				((WhileStatementContext)_localctx).wh = match(T__36);
				setState(362);
				((WhileStatementContext)_localctx).exp = expression(0);
				setState(363);
				match(T__4);
				setState(364);
				((WhileStatementContext)_localctx).s = statement();
				_localctx.ast.add(new WhileStatement(((WhileStatementContext)_localctx).wh.getLine(), ((WhileStatementContext)_localctx).wh.getCharPositionInLine()+1, ((WhileStatementContext)_localctx).exp.ast, ((WhileStatementContext)_localctx).s.ast));
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

	public static class Give_paramsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext exp1;
		public ExpressionContext exp2;
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
		enterRule(_localctx, 38, RULE_give_params);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(T__2);
				setState(370);
				((Give_paramsContext)_localctx).exp1 = expression(0);
				_localctx.ast.add(((Give_paramsContext)_localctx).exp1.ast);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(372);
					match(T__14);
					setState(373);
					((Give_paramsContext)_localctx).exp2 = expression(0);
					_localctx.ast.add(((Give_paramsContext)_localctx).exp2.ast);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(T__2);
				setState(384);
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0186\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7g\n\7\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008d\n\f\f\f\16\f\u0090\13\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009f\n\r"+
		"\f\r\16\r\u00a2\13\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\3\16\7\16"+
		"\u00ad\n\16\f\16\16\16\u00b0\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00ba\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00e1\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0101\n\20\f\20\16\20\u0104\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u0118\n\21\f\21\16\21\u011b\13\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0126\n\21\f\21\16\21\u0129\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\6\21\u013b\n\21\r\21\16\21\u013c\5\21\u013f\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u0146\n\22\f\22\16\22\u0149\13\22\3\22\3\22\7\22\u014d"+
		"\n\22\f\22\16\22\u0150\13\22\5\22\u0152\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0162\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0172"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u017b\n\25\f\25\16\25\u017e"+
		"\13\25\3\25\3\25\3\25\3\25\5\25\u0184\n\25\3\25\2\3\36\26\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\25\27\4\2\23\23\30\30\3\2\31"+
		"\36\3\2\37 \2\u019f\2*\3\2\2\2\4/\3\2\2\2\6A\3\2\2\2\bS\3\2\2\2\n]\3\2"+
		"\2\2\ff\3\2\2\2\16m\3\2\2\2\20p\3\2\2\2\22v\3\2\2\2\24\u0080\3\2\2\2\26"+
		"\u0095\3\2\2\2\30\u00a7\3\2\2\2\32\u00ae\3\2\2\2\34\u00b1\3\2\2\2\36\u00e0"+
		"\3\2\2\2 \u013e\3\2\2\2\"\u0151\3\2\2\2$\u0161\3\2\2\2&\u0171\3\2\2\2"+
		"(\u0183\3\2\2\2*+\5\6\4\2+,\5\4\3\2,-\7\2\2\3-.\b\2\1\2.\3\3\2\2\2/\60"+
		"\7\3\2\2\60\61\7\4\2\2\61\62\7\5\2\2\62\63\7\6\2\2\63\64\7\7\2\2\64\65"+
		"\7\b\2\2\65\66\5\32\16\2\66\67\7\t\2\2\678\b\3\1\28\5\3\2\2\29:\5\20\t"+
		"\2:;\b\4\1\2;@\3\2\2\2<=\5\34\17\2=>\b\4\1\2>@\3\2\2\2?9\3\2\2\2?<\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2\2DE\5\f\7\2EF\b"+
		"\5\1\2FT\3\2\2\2GH\7\n\2\2HI\7(\2\2IJ\7\13\2\2JK\5\b\5\2KL\b\5\1\2LT\3"+
		"\2\2\2MN\7\f\2\2NO\7\b\2\2OP\5\n\6\2PQ\7\t\2\2QR\b\5\1\2RT\3\2\2\2SD\3"+
		"\2\2\2SG\3\2\2\2SM\3\2\2\2T\t\3\2\2\2UV\5\22\n\2VW\7\7\2\2WX\5\f\7\2X"+
		"Y\7\r\2\2YZ\b\6\1\2Z\\\3\2\2\2[U\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^\13\3\2\2\2_]\3\2\2\2`a\7\16\2\2ag\b\7\1\2bc\7\17\2\2cg\b\7\1\2de\7"+
		"\20\2\2eg\b\7\1\2f`\3\2\2\2fb\3\2\2\2fd\3\2\2\2g\r\3\2\2\2hi\5\20\t\2"+
		"ij\b\b\1\2jl\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\17\3\2\2"+
		"\2om\3\2\2\2pq\5\22\n\2qr\7\7\2\2rs\5\b\5\2st\7\r\2\2tu\b\t\1\2u\21\3"+
		"\2\2\2vw\7*\2\2w}\b\n\1\2xy\7\21\2\2yz\7*\2\2z|\b\n\1\2{x\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\23\3\2\2\2\177}\3\2\2\2\u0080\u0081\7*\2"+
		"\2\u0081\u0082\7\7\2\2\u0082\u0083\5\f\7\2\u0083\u0084\b\13\1\2\u0084"+
		"\25\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u0087\5\24\13\2\u0087\u008e\b\f"+
		"\1\2\u0088\u0089\7\21\2\2\u0089\u008a\5\24\13\2\u008a\u008b\b\f\1\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7\6\2\2\u0092\u0096\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u0096\7\6"+
		"\2\2\u0095\u0085\3\2\2\2\u0095\u0093\3\2\2\2\u0096\27\3\2\2\2\u0097\u0098"+
		"\7\5\2\2\u0098\u0099\5\36\20\2\u0099\u00a0\b\r\1\2\u009a\u009b\7\21\2"+
		"\2\u009b\u009c\5\36\20\2\u009c\u009d\b\r\1\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\6\2\2\u00a4"+
		"\u00a8\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00a8\7\6\2\2\u00a7\u0097\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\5 \21\2\u00aa\u00ab"+
		"\b\16\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b3\7*\2\2\u00b3\u00b4\5\26\f\2\u00b4"+
		"\u00b5\7\7\2\2\u00b5\u00b9\b\17\1\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\b"+
		"\17\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5\32\16\2\u00bd\u00be\7"+
		"\t\2\2\u00be\u00bf\b\17\1\2\u00bf\35\3\2\2\2\u00c0\u00c1\b\20\1\2\u00c1"+
		"\u00c2\7\5\2\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\b"+
		"\20\1\2\u00c5\u00e1\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c8\5\30\r\2\u00c8"+
		"\u00c9\b\20\1\2\u00c9\u00e1\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00cc\5"+
		"\f\7\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\5\36\20\r\u00ce\u00cf\b\20\1\2"+
		"\u00cf\u00e1\3\2\2\2\u00d0\u00d1\7\23\2\2\u00d1\u00d2\5\36\20\f\u00d2"+
		"\u00d3\b\20\1\2\u00d3\u00e1\3\2\2\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\5"+
		"\36\20\13\u00d6\u00d7\b\20\1\2\u00d7\u00e1\3\2\2\2\u00d8\u00d9\7(\2\2"+
		"\u00d9\u00e1\b\20\1\2\u00da\u00db\7)\2\2\u00db\u00e1\b\20\1\2\u00dc\u00dd"+
		"\7+\2\2\u00dd\u00e1\b\20\1\2\u00de\u00df\7*\2\2\u00df\u00e1\b\20\1\2\u00e0"+
		"\u00c0\3\2\2\2\u00e0\u00c6\3\2\2\2\u00e0\u00ca\3\2\2\2\u00e0\u00d0\3\2"+
		"\2\2\u00e0\u00d4\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0"+
		"\u00dc\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u0102\3\2\2\2\u00e2\u00e3\f\n"+
		"\2\2\u00e3\u00e4\t\2\2\2\u00e4\u00e5\5\36\20\13\u00e5\u00e6\b\20\1\2\u00e6"+
		"\u0101\3\2\2\2\u00e7\u00e8\f\t\2\2\u00e8\u00e9\t\3\2\2\u00e9\u00ea\5\36"+
		"\20\n\u00ea\u00eb\b\20\1\2\u00eb\u0101\3\2\2\2\u00ec\u00ed\f\b\2\2\u00ed"+
		"\u00ee\t\4\2\2\u00ee\u00ef\5\36\20\t\u00ef\u00f0\b\20\1\2\u00f0\u0101"+
		"\3\2\2\2\u00f1\u00f2\f\7\2\2\u00f2\u00f3\t\5\2\2\u00f3\u00f4\5\36\20\b"+
		"\u00f4\u00f5\b\20\1\2\u00f5\u0101\3\2\2\2\u00f6\u00f7\f\17\2\2\u00f7\u00f8"+
		"\7\22\2\2\u00f8\u00f9\7*\2\2\u00f9\u0101\b\20\1\2\u00fa\u00fb\f\16\2\2"+
		"\u00fb\u00fc\7\n\2\2\u00fc\u00fd\5\36\20\2\u00fd\u00fe\7\13\2\2\u00fe"+
		"\u00ff\b\20\1\2\u00ff\u0101\3\2\2\2\u0100\u00e2\3\2\2\2\u0100\u00e7\3"+
		"\2\2\2\u0100\u00ec\3\2\2\2\u0100\u00f1\3\2\2\2\u0100\u00f6\3\2\2\2\u0100"+
		"\u00fa\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\37\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5$\23\2\u0106\u0107"+
		"\b\21\1\2\u0107\u013f\3\2\2\2\u0108\u0109\5&\24\2\u0109\u010a\b\21\1\2"+
		"\u010a\u013f\3\2\2\2\u010b\u010c\7!\2\2\u010c\u010d\5\36\20\2\u010d\u010e"+
		"\7\r\2\2\u010e\u010f\b\21\1\2\u010f\u013f\3\2\2\2\u0110\u0111\7\"\2\2"+
		"\u0111\u0112\5\36\20\2\u0112\u0119\b\21\1\2\u0113\u0114\7\21\2\2\u0114"+
		"\u0115\5\36\20\2\u0115\u0116\b\21\1\2\u0116\u0118\3\2\2\2\u0117\u0113"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\r\2\2\u011d\u013f\3\2"+
		"\2\2\u011e\u011f\7#\2\2\u011f\u0120\5\36\20\2\u0120\u0127\b\21\1\2\u0121"+
		"\u0122\7\21\2\2\u0122\u0123\5\36\20\2\u0123\u0124\b\21\1\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0121\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\r"+
		"\2\2\u012b\u013f\3\2\2\2\u012c\u012d\5\36\20\2\u012d\u012e\7$\2\2\u012e"+
		"\u012f\5\36\20\2\u012f\u0130\7\r\2\2\u0130\u0131\b\21\1\2\u0131\u013f"+
		"\3\2\2\2\u0132\u0133\7*\2\2\u0133\u0134\5(\25\2\u0134\u0135\7\r\2\2\u0135"+
		"\u0136\b\21\1\2\u0136\u013f\3\2\2\2\u0137\u0138\5\20\t\2\u0138\u0139\b"+
		"\21\1\2\u0139\u013b\3\2\2\2\u013a\u0137\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0105\3\2"+
		"\2\2\u013e\u0108\3\2\2\2\u013e\u010b\3\2\2\2\u013e\u0110\3\2\2\2\u013e"+
		"\u011e\3\2\2\2\u013e\u012c\3\2\2\2\u013e\u0132\3\2\2\2\u013e\u013a\3\2"+
		"\2\2\u013f!\3\2\2\2\u0140\u0141\5 \21\2\u0141\u0142\b\22\1\2\u0142\u0152"+
		"\3\2\2\2\u0143\u0147\7\b\2\2\u0144\u0146\5 \21\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\t\2\2\u014b\u014d\b\22\1\2\u014c"+
		"\u0143\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0140\3\2\2\2\u0151"+
		"\u014e\3\2\2\2\u0152#\3\2\2\2\u0153\u0154\7%\2\2\u0154\u0155\5\36\20\2"+
		"\u0155\u0156\7\7\2\2\u0156\u0157\5\"\22\2\u0157\u0158\7&\2\2\u0158\u0159"+
		"\5\"\22\2\u0159\u015a\b\23\1\2\u015a\u0162\3\2\2\2\u015b\u015c\7%\2\2"+
		"\u015c\u015d\5\36\20\2\u015d\u015e\7\7\2\2\u015e\u015f\5\"\22\2\u015f"+
		"\u0160\b\23\1\2\u0160\u0162\3\2\2\2\u0161\u0153\3\2\2\2\u0161\u015b\3"+
		"\2\2\2\u0162%\3\2\2\2\u0163\u0164\7\'\2\2\u0164\u0165\5\36\20\2\u0165"+
		"\u0166\7\7\2\2\u0166\u0167\7\b\2\2\u0167\u0168\5\32\16\2\u0168\u0169\7"+
		"\t\2\2\u0169\u016a\b\24\1\2\u016a\u0172\3\2\2\2\u016b\u016c\7\'\2\2\u016c"+
		"\u016d\5\36\20\2\u016d\u016e\7\7\2\2\u016e\u016f\5 \21\2\u016f\u0170\b"+
		"\24\1\2\u0170\u0172\3\2\2\2\u0171\u0163\3\2\2\2\u0171\u016b\3\2\2\2\u0172"+
		"\'\3\2\2\2\u0173\u0174\7\5\2\2\u0174\u0175\5\36\20\2\u0175\u017c\b\25"+
		"\1\2\u0176\u0177\7\21\2\2\u0177\u0178\5\36\20\2\u0178\u0179\b\25\1\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0176\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0180\7\6\2\2\u0180\u0184\3\2\2\2\u0181\u0182\7\5\2\2\u0182\u0184\7\6"+
		"\2\2\u0183\u0173\3\2\2\2\u0183\u0181\3\2\2\2\u0184)\3\2\2\2\35?AS]fm}"+
		"\u008e\u0095\u00a0\u00a7\u00ae\u00b9\u00e0\u0100\u0102\u0119\u0127\u013c"+
		"\u013e\u0147\u014e\u0151\u0161\u0171\u017c\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}