package sources;

// Generated from mvgn.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mvgnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, INTEGER=31, IDENTIFIER=32, 
		WHITESPACE=33, OP=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'return'", "'new'", "'true'", "'class'", 
		"';'", "'while'", "'void'", "'{'", "'='", "'extends'", "'}'", "'if'", 
		"'int'", "'('", "','", "'this'", "'false'", "'.'", "'boolean'", "'System.out.println'", 
		"'['", "'String'", "']'", "'public'", "'!'", "'static'", "'else'", "')'", 
		"INTEGER", "IDENTIFIER", "WHITESPACE", "OP"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDecl = 2, RULE_statement = 3, 
		RULE_exp = 4, RULE_expList = 5, RULE_expRest = 6, RULE_varDecl = 7, RULE_methodDecl = 8, 
		RULE_formalList = 9, RULE_formal = 10, RULE_type = 11;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDecl", "statement", "exp", "expList", "expRest", 
		"varDecl", "methodDecl", "formalList", "formal", "type"
	};

	@Override
	public String getGrammarFileName() { return "mvgn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mvgnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mvgnParser.EOF, 0); }
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); mainClass();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(25); classDecl();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(mvgnParser.IDENTIFIER, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(mvgnParser.IDENTIFIER); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(T__24);
			setState(34); match(IDENTIFIER);
			setState(35); match(T__20);
			setState(36); match(T__4);
			setState(37); match(T__2);
			setState(38); match(T__21);
			setState(39); match(T__29);
			setState(40); match(T__14);
			setState(41); match(T__6);
			setState(42); match(T__7);
			setState(43); match(T__5);
			setState(44); match(IDENTIFIER);
			setState(45); match(T__0);
			setState(46); match(T__20);
			setState(47); statement();
			setState(48); match(T__17);
			setState(49); match(T__17);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(mvgnParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(mvgnParser.IDENTIFIER); }
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDecl);
		int _la;
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); match(T__24);
				setState(52); match(IDENTIFIER);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(53); varDecl();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(59); methodDecl();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(T__24);
				setState(66); match(IDENTIFIER);
				{
				setState(67); match(T__18);
				setState(68); match(IDENTIFIER);
				}
				setState(70); match(T__20);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(71); varDecl();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(77); methodDecl();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83); match(T__17);
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(T__20);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(87); statement();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93); match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); match(T__16);
				setState(95); match(T__14);
				setState(96); exp(0);
				setState(97); match(T__0);
				setState(98); statement();
				setState(99); match(T__1);
				setState(100); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); match(T__22);
				setState(103); match(T__14);
				setState(104); exp(0);
				setState(105); match(T__0);
				setState(106); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); match(T__8);
				setState(109); match(T__14);
				setState(110); exp(0);
				setState(111); match(T__0);
				setState(112); match(T__23);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114); match(IDENTIFIER);
				setState(115); match(T__19);
				setState(116); exp(0);
				setState(117); match(T__23);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119); match(IDENTIFIER);
				setState(120); match(T__7);
				setState(121); exp(0);
				setState(122); match(T__5);
				setState(123); match(T__19);
				setState(124); exp(0);
				setState(125); match(T__23);
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

	public static class ExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(mvgnParser.INTEGER, 0); }
		public TerminalNode OP() { return getToken(mvgnParser.OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(130); match(T__3);
				setState(131); exp(2);
				}
				break;
			case 2:
				{
				setState(132); match(INTEGER);
				}
				break;
			case 3:
				{
				setState(133); match(T__25);
				}
				break;
			case 4:
				{
				setState(134); match(T__11);
				}
				break;
			case 5:
				{
				setState(135); match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(136); match(T__12);
				}
				break;
			case 7:
				{
				setState(137); match(T__26);
				setState(138); match(T__15);
				setState(139); match(T__7);
				setState(140); exp(0);
				setState(141); match(T__5);
				}
				break;
			case 8:
				{
				setState(143); match(T__26);
				setState(144); match(IDENTIFIER);
				setState(145); match(T__14);
				setState(146); match(T__0);
				}
				break;
			case 9:
				{
				setState(147); match(T__14);
				setState(148); exp(0);
				setState(149); match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(153);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(154); match(OP);
						setState(155); exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(156);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(157); match(T__7);
						setState(158); exp(0);
						setState(159); match(T__5);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(161);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(162); match(T__10);
						setState(163); match(T__28);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(164);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(165); match(T__10);
						setState(166); match(IDENTIFIER);
						setState(167); match(T__14);
						setState(168); expList();
						setState(169); match(T__0);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ExpListContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<ExpRestContext> expRest() {
			return getRuleContexts(ExpRestContext.class);
		}
		public ExpRestContext expRest(int i) {
			return getRuleContext(ExpRestContext.class,i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterExpList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitExpList(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); exp(0);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(177); expRest();
				}
				}
				setState(182);
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

	public static class ExpRestContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterExpRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitExpRest(this);
		}
	}

	public final ExpRestContext expRest() throws RecognitionException {
		ExpRestContext _localctx = new ExpRestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(T__13);
			setState(184); exp(0);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); type();
			setState(187); match(IDENTIFIER);
			setState(188); match(T__23);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(T__4);
			setState(191); type();
			setState(192); match(IDENTIFIER);
			{
			setState(193); formalList();
			}
			setState(194); match(T__20);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(195); varDecl();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(201); methodDecl();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207); match(T__27);
			setState(208); exp(0);
			setState(209); match(T__23);
			setState(210); match(T__17);
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

	public static class FormalListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitFormalList(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); type();
			setState(213); match(IDENTIFIER);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(214); match(T__13);
				setState(215); formal();
				}
				}
				setState(220);
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

	public static class FormalContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); type();
			setState(222); match(IDENTIFIER);
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
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224); match(T__15);
				setState(225); match(T__7);
				setState(226); match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229); match(IDENTIFIER);
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
		case 4: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\7\4Q\n\4\f\4\16\4T\13\4\3"+
		"\4\5\4W\n\4\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u009a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00ae\n\6\f\6\16\6\u00b1\13\6\3\7\3\7\7\7\u00b5"+
		"\n\7\f\7\16\7\u00b8\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00c7\n\n\f\n\16\n\u00ca\13\n\3\n\7\n\u00cd\n\n\f\n\16\n\u00d0"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00db\n\13\f\13\16"+
		"\13\u00de\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e9\n\r\3\r"+
		"\2\3\n\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u00fd\2\32\3\2\2\2\4#\3\2"+
		"\2\2\6V\3\2\2\2\b\u0081\3\2\2\2\n\u0099\3\2\2\2\f\u00b2\3\2\2\2\16\u00b9"+
		"\3\2\2\2\20\u00bc\3\2\2\2\22\u00c0\3\2\2\2\24\u00d6\3\2\2\2\26\u00df\3"+
		"\2\2\2\30\u00e8\3\2\2\2\32\36\5\4\3\2\33\35\5\6\4\2\34\33\3\2\2\2\35 "+
		"\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\2\2"+
		"\3\"\3\3\2\2\2#$\7\b\2\2$%\7\"\2\2%&\7\f\2\2&\'\7\34\2\2\'(\7\36\2\2("+
		")\7\13\2\2)*\7\3\2\2*+\7\22\2\2+,\7\32\2\2,-\7\31\2\2-.\7\33\2\2./\7\""+
		"\2\2/\60\7 \2\2\60\61\7\f\2\2\61\62\5\b\5\2\62\63\7\17\2\2\63\64\7\17"+
		"\2\2\64\5\3\2\2\2\65\66\7\b\2\2\66:\7\"\2\2\679\5\20\t\28\67\3\2\2\29"+
		"<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\5\22\n\2>=\3\2\2\2"+
		"?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AW\3\2\2\2B@\3\2\2\2CD\7\b\2\2DE\7\"\2\2"+
		"EF\7\16\2\2FG\7\"\2\2GH\3\2\2\2HL\7\f\2\2IK\5\20\t\2JI\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\5\22\n\2PO\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UW\7\17\2\2V\65\3\2\2\2VC"+
		"\3\2\2\2W\7\3\2\2\2X\\\7\f\2\2Y[\5\b\5\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_\u0082\7\17\2\2`a\7\20\2\2ab\7\22\2"+
		"\2bc\5\n\6\2cd\7 \2\2de\5\b\5\2ef\7\37\2\2fg\5\b\5\2g\u0082\3\2\2\2hi"+
		"\7\n\2\2ij\7\22\2\2jk\5\n\6\2kl\7 \2\2lm\5\b\5\2m\u0082\3\2\2\2no\7\30"+
		"\2\2op\7\22\2\2pq\5\n\6\2qr\7 \2\2rs\7\t\2\2s\u0082\3\2\2\2tu\7\"\2\2"+
		"uv\7\r\2\2vw\5\n\6\2wx\7\t\2\2x\u0082\3\2\2\2yz\7\"\2\2z{\7\31\2\2{|\5"+
		"\n\6\2|}\7\33\2\2}~\7\r\2\2~\177\5\n\6\2\177\u0080\7\t\2\2\u0080\u0082"+
		"\3\2\2\2\u0081X\3\2\2\2\u0081`\3\2\2\2\u0081h\3\2\2\2\u0081n\3\2\2\2\u0081"+
		"t\3\2\2\2\u0081y\3\2\2\2\u0082\t\3\2\2\2\u0083\u0084\b\6\1\2\u0084\u0085"+
		"\7\35\2\2\u0085\u009a\5\n\6\4\u0086\u009a\7!\2\2\u0087\u009a\7\7\2\2\u0088"+
		"\u009a\7\25\2\2\u0089\u009a\7\"\2\2\u008a\u009a\7\24\2\2\u008b\u008c\7"+
		"\6\2\2\u008c\u008d\7\21\2\2\u008d\u008e\7\31\2\2\u008e\u008f\5\n\6\2\u008f"+
		"\u0090\7\33\2\2\u0090\u009a\3\2\2\2\u0091\u0092\7\6\2\2\u0092\u0093\7"+
		"\"\2\2\u0093\u0094\7\22\2\2\u0094\u009a\7 \2\2\u0095\u0096\7\22\2\2\u0096"+
		"\u0097\5\n\6\2\u0097\u0098\7 \2\2\u0098\u009a\3\2\2\2\u0099\u0083\3\2"+
		"\2\2\u0099\u0086\3\2\2\2\u0099\u0087\3\2\2\2\u0099\u0088\3\2\2\2\u0099"+
		"\u0089\3\2\2\2\u0099\u008a\3\2\2\2\u0099\u008b\3\2\2\2\u0099\u0091\3\2"+
		"\2\2\u0099\u0095\3\2\2\2\u009a\u00af\3\2\2\2\u009b\u009c\f\17\2\2\u009c"+
		"\u009d\7$\2\2\u009d\u00ae\5\n\6\20\u009e\u009f\f\16\2\2\u009f\u00a0\7"+
		"\31\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\7\33\2\2\u00a2\u00ae\3\2\2\2\u00a3"+
		"\u00a4\f\r\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00ae\7\4\2\2\u00a6\u00a7\f"+
		"\f\2\2\u00a7\u00a8\7\26\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\7\22\2\2\u00aa"+
		"\u00ab\5\f\7\2\u00ab\u00ac\7 \2\2\u00ac\u00ae\3\2\2\2\u00ad\u009b\3\2"+
		"\2\2\u00ad\u009e\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\13\3\2\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\5\n\6\2\u00b3\u00b5\5\16\b\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\r\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb"+
		"\5\n\6\2\u00bb\17\3\2\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\7\"\2\2\u00be"+
		"\u00bf\7\t\2\2\u00bf\21\3\2\2\2\u00c0\u00c1\7\34\2\2\u00c1\u00c2\5\30"+
		"\r\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\5\24\13\2\u00c4\u00c8\7\f\2\2\u00c5"+
		"\u00c7\5\20\t\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cd\5\22\n\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\7\5\2\2\u00d2\u00d3\5\n\6\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\7\17"+
		"\2\2\u00d5\23\3\2\2\2\u00d6\u00d7\5\30\r\2\u00d7\u00dc\7\"\2\2\u00d8\u00d9"+
		"\7\23\2\2\u00d9\u00db\5\26\f\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\25\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\5\30\r\2\u00e0\u00e1\7\"\2\2\u00e1\27\3\2\2\2\u00e2"+
		"\u00e3\7\21\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e9\7\33\2\2\u00e5\u00e9"+
		"\7\21\2\2\u00e6\u00e9\7\27\2\2\u00e7\u00e9\7\"\2\2\u00e8\u00e2\3\2\2\2"+
		"\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\31"+
		"\3\2\2\2\22\36:@LRV\\\u0081\u0099\u00ad\u00af\u00b6\u00c8\u00ce\u00dc"+
		"\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}