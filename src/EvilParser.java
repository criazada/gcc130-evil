// Generated from Evil.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EvilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SEJA=7, SE=8, SENAO=9, 
		ENQUANTO=10, PCADA=11, RETORNA=12, EM=13, FN=14, BOOL=15, ATR=16, NUM=17, 
		EXP=18, ATRARIT=19, MULMODDIV=20, ADDSUB=21, OPARIT=22, OPEQ=23, OPREL=24, 
		OPBIN=25, LOGAND=26, LOGOR=27, LOGIMPL=28, NOT=29, NEG=30, AP=31, ID=32, 
		STRING=33, COM=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_funcoes = 1, RULE_funcao = 2, RULE_param = 3, RULE_params = 4, 
		RULE_bloco = 5, RULE_corpo = 6, RULE_stmt = 7, RULE_condicional = 8, RULE_declaracao = 9, 
		RULE_atribuicao = 10, RULE_pcada = 11, RULE_enquanto = 12, RULE_retorno = 13, 
		RULE_chamada = 14, RULE_args = 15, RULE_iexpr = 16, RULE_expr = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "funcoes", "funcao", "param", "params", "bloco", "corpo", "stmt", 
			"condicional", "declaracao", "atribuicao", "pcada", "enquanto", "retorno", 
			"chamada", "args", "iexpr", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "')'", "':'", "','", "'{'", "'}'", "';'", "'seja'", "'se'", null, 
			null, "'pcada'", "'retorna'", "'em'", "'fn'", null, "'='", null, "'**'", 
			null, null, null, null, null, null, null, "'&&'", "'||'", "'->'", "'!'", 
			"'-'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "SEJA", "SE", "SENAO", "ENQUANTO", 
			"PCADA", "RETORNA", "EM", "FN", "BOOL", "ATR", "NUM", "EXP", "ATRARIT", 
			"MULMODDIV", "ADDSUB", "OPARIT", "OPEQ", "OPREL", "OPBIN", "LOGAND", 
			"LOGOR", "LOGIMPL", "NOT", "NEG", "AP", "ID", "STRING", "COM", "WS"
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
	public String getGrammarFileName() { return "Evil.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EvilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			funcoes();
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

	public static class FuncoesContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitFuncoes(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FN) {
				{
				{
				setState(38);
				funcao();
				}
				}
				setState(43);
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

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(EvilParser.FN, 0); }
		public List<TerminalNode> ID() { return getTokens(EvilParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EvilParser.ID, i);
		}
		public TerminalNode AP() { return getToken(EvilParser.AP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(FN);
			setState(45);
			match(ID);
			setState(46);
			match(AP);
			setState(47);
			params();
			setState(48);
			match(T__0);
			setState(49);
			match(ID);
			setState(50);
			bloco();
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
		public List<TerminalNode> ID() { return getTokens(EvilParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EvilParser.ID, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(T__1);
			setState(54);
			match(ID);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(56);
				param();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(57);
					match(T__2);
					setState(58);
					param();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class BlocoContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__3);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEJA) | (1L << SE) | (1L << ENQUANTO) | (1L << PCADA) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(67);
				stmt();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__4);
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

	public static class CorpoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_corpo);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				bloco();
				}
				break;
			case SEJA:
			case SE:
			case ENQUANTO:
			case PCADA:
			case RETORNA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmtContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public PcadaContext pcada() {
			return getRuleContext(PcadaContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				condicional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				declaracao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				retorno();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				chamada();
				setState(83);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				atribuicao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				pcada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				enquanto();
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(EvilParser.SE, 0); }
		public TerminalNode AP() { return getToken(EvilParser.AP, 0); }
		public IexprContext iexpr() {
			return getRuleContext(IexprContext.class,0);
		}
		public List<CorpoContext> corpo() {
			return getRuleContexts(CorpoContext.class);
		}
		public CorpoContext corpo(int i) {
			return getRuleContext(CorpoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(EvilParser.SENAO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(SE);
			setState(91);
			match(AP);
			setState(92);
			iexpr();
			setState(93);
			match(T__0);
			setState(94);
			corpo();
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(95);
				match(SENAO);
				setState(96);
				corpo();
				}
				break;
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode SEJA() { return getToken(EvilParser.SEJA, 0); }
		public List<TerminalNode> ID() { return getTokens(EvilParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EvilParser.ID, i);
		}
		public TerminalNode ATR() { return getToken(EvilParser.ATR, 0); }
		public IexprContext iexpr() {
			return getRuleContext(IexprContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(SEJA);
			setState(100);
			match(ID);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(101);
				match(T__1);
				setState(102);
				match(ID);
				}
			}

			setState(105);
			match(ATR);
			setState(106);
			iexpr();
			setState(107);
			match(T__5);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EvilParser.ID, 0); }
		public IexprContext iexpr() {
			return getRuleContext(IexprContext.class,0);
		}
		public TerminalNode ATR() { return getToken(EvilParser.ATR, 0); }
		public TerminalNode ATRARIT() { return getToken(EvilParser.ATRARIT, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==ATR || _la==ATRARIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
			iexpr();
			setState(112);
			match(T__5);
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

	public static class PcadaContext extends ParserRuleContext {
		public TerminalNode PCADA() { return getToken(EvilParser.PCADA, 0); }
		public TerminalNode AP() { return getToken(EvilParser.AP, 0); }
		public TerminalNode ID() { return getToken(EvilParser.ID, 0); }
		public TerminalNode EM() { return getToken(EvilParser.EM, 0); }
		public IexprContext iexpr() {
			return getRuleContext(IexprContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public PcadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pcada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterPcada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitPcada(this);
		}
	}

	public final PcadaContext pcada() throws RecognitionException {
		PcadaContext _localctx = new PcadaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pcada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PCADA);
			setState(115);
			match(AP);
			setState(116);
			match(ID);
			setState(117);
			match(EM);
			setState(118);
			iexpr();
			setState(119);
			match(T__0);
			setState(120);
			corpo();
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

	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(EvilParser.ENQUANTO, 0); }
		public TerminalNode AP() { return getToken(EvilParser.AP, 0); }
		public IexprContext iexpr() {
			return getRuleContext(IexprContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ENQUANTO);
			setState(123);
			match(AP);
			setState(124);
			iexpr();
			setState(125);
			match(T__0);
			setState(126);
			corpo();
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNA() { return getToken(EvilParser.RETORNA, 0); }
		public IexprContext iexpr() {
			return getRuleContext(IexprContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(RETORNA);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUM) | (1L << NOT) | (1L << NEG) | (1L << AP) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(129);
				iexpr();
				}
			}

			setState(132);
			match(T__5);
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

	public static class ChamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EvilParser.ID, 0); }
		public TerminalNode AP() { return getToken(EvilParser.AP, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitChamada(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(135);
			match(AP);
			setState(136);
			args();
			setState(137);
			match(T__0);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<IexprContext> iexpr() {
			return getRuleContexts(IexprContext.class);
		}
		public IexprContext iexpr(int i) {
			return getRuleContext(IexprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUM) | (1L << NOT) | (1L << NEG) | (1L << AP) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(139);
				iexpr();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(140);
					match(T__2);
					setState(141);
					iexpr();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class IexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterIexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitIexpr(this);
		}
	}

	public final IexprContext iexpr() throws RecognitionException {
		IexprContext _localctx = new IexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(EvilParser.NUM, 0); }
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public TerminalNode STRING() { return getToken(EvilParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(EvilParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(EvilParser.ID, 0); }
		public TerminalNode NOT() { return getToken(EvilParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEG() { return getToken(EvilParser.NEG, 0); }
		public TerminalNode AP() { return getToken(EvilParser.AP, 0); }
		public TerminalNode EXP() { return getToken(EvilParser.EXP, 0); }
		public TerminalNode MULMODDIV() { return getToken(EvilParser.MULMODDIV, 0); }
		public TerminalNode OPBIN() { return getToken(EvilParser.OPBIN, 0); }
		public TerminalNode ADDSUB() { return getToken(EvilParser.ADDSUB, 0); }
		public TerminalNode OPEQ() { return getToken(EvilParser.OPEQ, 0); }
		public TerminalNode OPREL() { return getToken(EvilParser.OPREL, 0); }
		public TerminalNode LOGAND() { return getToken(EvilParser.LOGAND, 0); }
		public TerminalNode LOGOR() { return getToken(EvilParser.LOGOR, 0); }
		public TerminalNode LOGIMPL() { return getToken(EvilParser.LOGIMPL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvilListener ) ((EvilListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(152);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(153);
				chamada();
				}
				break;
			case 3:
				{
				setState(154);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(155);
				match(BOOL);
				}
				break;
			case 5:
				{
				setState(156);
				match(ID);
				}
				break;
			case 6:
				{
				setState(157);
				match(NOT);
				setState(158);
				expr(11);
				}
				break;
			case 7:
				{
				setState(159);
				match(NEG);
				setState(160);
				expr(10);
				}
				break;
			case 8:
				{
				setState(161);
				match(AP);
				setState(162);
				expr(0);
				setState(163);
				match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(168);
						match(EXP);
						setState(169);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(171);
						match(MULMODDIV);
						setState(172);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(174);
						match(OPBIN);
						setState(175);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(177);
						match(ADDSUB);
						setState(178);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180);
						_la = _input.LA(1);
						if ( !(_la==OPEQ || _la==OPREL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						match(LOGAND);
						setState(184);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(LOGOR);
						setState(187);
						expr(3);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(189);
						match(LOGIMPL);
						setState(190);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
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
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\5\6C\n\6"+
		"\3\7\3\7\7\7G\n\7\f\7\16\7J\13\7\3\7\3\7\3\b\3\b\5\bP\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nd\n\n"+
		"\3\13\3\13\3\13\3\13\5\13j\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\5\17\u0085\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\7\21\u0091\n\21\f\21\16\21\u0094\13\21\5\21\u0096\n\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00a8\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c2"+
		"\n\23\f\23\16\23\u00c5\13\23\3\23\2\3$\24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\4\4\2\22\22\25\25\3\2\31\32\2\u00d3\2&\3\2\2\2\4+\3\2"+
		"\2\2\6.\3\2\2\2\b\66\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16O\3\2\2\2\20Z\3\2"+
		"\2\2\22\\\3\2\2\2\24e\3\2\2\2\26o\3\2\2\2\30t\3\2\2\2\32|\3\2\2\2\34\u0082"+
		"\3\2\2\2\36\u0088\3\2\2\2 \u0095\3\2\2\2\"\u0097\3\2\2\2$\u00a7\3\2\2"+
		"\2&\'\5\4\3\2\'\3\3\2\2\2(*\5\6\4\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,\5\3\2\2\2-+\3\2\2\2./\7\20\2\2/\60\7\"\2\2\60\61\7!\2\2\61\62"+
		"\5\n\6\2\62\63\7\3\2\2\63\64\7\"\2\2\64\65\5\f\7\2\65\7\3\2\2\2\66\67"+
		"\7\"\2\2\678\7\4\2\289\7\"\2\29\t\3\2\2\2:?\5\b\5\2;<\7\5\2\2<>\5\b\5"+
		"\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B:\3\2\2"+
		"\2BC\3\2\2\2C\13\3\2\2\2DH\7\6\2\2EG\5\20\t\2FE\3\2\2\2GJ\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\7\2\2L\r\3\2\2\2MP\5\f\7\2NP"+
		"\5\20\t\2OM\3\2\2\2ON\3\2\2\2P\17\3\2\2\2Q[\5\22\n\2R[\5\24\13\2S[\5\34"+
		"\17\2TU\5\36\20\2UV\7\b\2\2V[\3\2\2\2W[\5\26\f\2X[\5\30\r\2Y[\5\32\16"+
		"\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2"+
		"\2[\21\3\2\2\2\\]\7\n\2\2]^\7!\2\2^_\5\"\22\2_`\7\3\2\2`c\5\16\b\2ab\7"+
		"\13\2\2bd\5\16\b\2ca\3\2\2\2cd\3\2\2\2d\23\3\2\2\2ef\7\t\2\2fi\7\"\2\2"+
		"gh\7\4\2\2hj\7\"\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\22\2\2lm\5\"\22"+
		"\2mn\7\b\2\2n\25\3\2\2\2op\7\"\2\2pq\t\2\2\2qr\5\"\22\2rs\7\b\2\2s\27"+
		"\3\2\2\2tu\7\r\2\2uv\7!\2\2vw\7\"\2\2wx\7\17\2\2xy\5\"\22\2yz\7\3\2\2"+
		"z{\5\16\b\2{\31\3\2\2\2|}\7\f\2\2}~\7!\2\2~\177\5\"\22\2\177\u0080\7\3"+
		"\2\2\u0080\u0081\5\16\b\2\u0081\33\3\2\2\2\u0082\u0084\7\16\2\2\u0083"+
		"\u0085\5\"\22\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\7\b\2\2\u0087\35\3\2\2\2\u0088\u0089\7\"\2\2\u0089"+
		"\u008a\7!\2\2\u008a\u008b\5 \21\2\u008b\u008c\7\3\2\2\u008c\37\3\2\2\2"+
		"\u008d\u0092\5\"\22\2\u008e\u008f\7\5\2\2\u008f\u0091\5\"\22\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096!\3\2\2\2\u0097\u0098\5$\23\2\u0098#\3\2\2\2\u0099\u009a\b\23"+
		"\1\2\u009a\u00a8\7\23\2\2\u009b\u00a8\5\36\20\2\u009c\u00a8\7#\2\2\u009d"+
		"\u00a8\7\21\2\2\u009e\u00a8\7\"\2\2\u009f\u00a0\7\37\2\2\u00a0\u00a8\5"+
		"$\23\r\u00a1\u00a2\7 \2\2\u00a2\u00a8\5$\23\f\u00a3\u00a4\7!\2\2\u00a4"+
		"\u00a5\5$\23\2\u00a5\u00a6\7\3\2\2\u00a6\u00a8\3\2\2\2\u00a7\u0099\3\2"+
		"\2\2\u00a7\u009b\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a3\3\2"+
		"\2\2\u00a8\u00c3\3\2\2\2\u00a9\u00aa\f\n\2\2\u00aa\u00ab\7\24\2\2\u00ab"+
		"\u00c2\5$\23\13\u00ac\u00ad\f\t\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00c2\5"+
		"$\23\n\u00af\u00b0\f\b\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00c2\5$\23\t\u00b2"+
		"\u00b3\f\7\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00c2\5$\23\b\u00b5\u00b6\f"+
		"\6\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00c2\5$\23\7\u00b8\u00b9\f\5\2\2\u00b9"+
		"\u00ba\7\34\2\2\u00ba\u00c2\5$\23\6\u00bb\u00bc\f\4\2\2\u00bc\u00bd\7"+
		"\35\2\2\u00bd\u00c2\5$\23\5\u00be\u00bf\f\3\2\2\u00bf\u00c0\7\36\2\2\u00c0"+
		"\u00c2\5$\23\4\u00c1\u00a9\3\2\2\2\u00c1\u00ac\3\2\2\2\u00c1\u00af\3\2"+
		"\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1"+
		"\u00bb\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c3\3\2\2\2\20+?BHOZc"+
		"i\u0084\u0092\u0095\u00a7\u00c1\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}