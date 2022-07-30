// Generated from Evil.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EvilLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEJA=1, SE=2, SENAO=3, ENQUANTO=4, PCADA=5, ATR=6, NUM=7, OPARIT=8, OPREL=9, 
		OPBIN=10, OPBOOL=11, ATRARIT=12, OPACC=13, ID=14, STRING=15, COM=16, EM=17, 
		FN=18, VIRG=19, DP=20, FL=21, AP=22, FP=23, ACH=24, FCH=25, ACO=26, FCO=27, 
		WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEJA", "SE", "SENAO", "ENQUANTO", "PCADA", "ATR", "NUM", "OPARIT", "OPREL", 
			"OPBIN", "OPBOOL", "ATRARIT", "OPACC", "ID", "STRING", "COM", "EM", "FN", 
			"VIRG", "DP", "FL", "AP", "FP", "ACH", "FCH", "ACO", "FCO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'seja'", "'se'", null, null, "'pcada'", "'='", null, null, null, 
			null, null, null, "'.'", null, null, null, "'em'", "'fn'", "','", "':'", 
			"';'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEJA", "SE", "SENAO", "ENQUANTO", "PCADA", "ATR", "NUM", "OPARIT", 
			"OPREL", "OPBIN", "OPBOOL", "ATRARIT", "OPACC", "ID", "STRING", "COM", 
			"EM", "FN", "VIRG", "DP", "FL", "AP", "FP", "ACH", "FCH", "ACO", "FCO", 
			"WS"
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


	public EvilLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Evil.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\5\be\n\b\3\b\3\b\3\b\5\bj\n\b\3\b\7\bm\n\b\f\b\16\bp\13\b\5\br\n"+
		"\b\3\b\3\b\3\b\5\bw\n\b\3\b\7\bz\n\b\f\b\16\b}\13\b\5\b\177\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\5\n\u008a\n\n\3\n\3\n\5\n\u008e\n"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\7\17\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\20\3\20\3\21\3\21\7"+
		"\21\u00b4\n\21\f\21\16\21\u00b7\13\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00d4\n\35\r\35\16\35\u00d5\3\35"+
		"\3\35\4\u00ac\u00b5\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36\3\2\r\3\2\63;\3\2\62;\6\2\'\',-//\61\61\4\2>>@@\4"+
		"\2##??\5\2((``~~\5\2C\\aac|\6\2\62;C\\aac|\4\2$$``\3\2\f\f\5\2\13\f\17"+
		"\17\"\"\2\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\3;\3\2\2\2\5@\3\2\2\2\7J\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\ra\3"+
		"\2\2\2\17d\3\2\2\2\21\u0085\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2"+
		"\27\u0097\3\2\2\2\31\u0099\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37"+
		"\u00a5\3\2\2\2!\u00b1\3\2\2\2#\u00ba\3\2\2\2%\u00bd\3\2\2\2\'\u00c0\3"+
		"\2\2\2)\u00c2\3\2\2\2+\u00c4\3\2\2\2-\u00c6\3\2\2\2/\u00c8\3\2\2\2\61"+
		"\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce\3\2\2\2\67\u00d0\3\2\2\29\u00d3"+
		"\3\2\2\2;<\7u\2\2<=\7g\2\2=>\7l\2\2>?\7c\2\2?\4\3\2\2\2@A\7u\2\2AB\7g"+
		"\2\2B\6\3\2\2\2CD\7u\2\2DE\7g\2\2EF\7p\2\2FG\7c\2\2GK\7q\2\2HI\7u\2\2"+
		"IK\7p\2\2JC\3\2\2\2JH\3\2\2\2K\b\3\2\2\2LM\7g\2\2MN\7p\2\2NO\7s\2\2OP"+
		"\7w\2\2PQ\7c\2\2QR\7p\2\2RS\7v\2\2SZ\7q\2\2TU\7g\2\2UV\7p\2\2VW\7s\2\2"+
		"WX\7v\2\2XZ\7q\2\2YL\3\2\2\2YT\3\2\2\2Z\n\3\2\2\2[\\\7r\2\2\\]\7e\2\2"+
		"]^\7c\2\2^_\7f\2\2_`\7c\2\2`\f\3\2\2\2ab\7?\2\2b\16\3\2\2\2ce\7/\2\2d"+
		"c\3\2\2\2de\3\2\2\2eq\3\2\2\2fr\7\62\2\2gn\t\2\2\2hj\7a\2\2ih\3\2\2\2"+
		"ij\3\2\2\2jk\3\2\2\2km\t\3\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2qf\3\2\2\2qg\3\2\2\2r~\3\2\2\2st\7\60\2\2t{\t\3\2"+
		"\2uw\7a\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\t\3\2\2yv\3\2\2\2z}\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~s\3\2\2\2~\177\3\2\2\2\177"+
		"\20\3\2\2\2\u0080\u0086\t\4\2\2\u0081\u0082\7\61\2\2\u0082\u0086\7\61"+
		"\2\2\u0083\u0084\7,\2\2\u0084\u0086\7,\2\2\u0085\u0080\3\2\2\2\u0085\u0081"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\22\3\2\2\2\u0087\u0089\t\5\2\2\u0088"+
		"\u008a\7?\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2"+
		"\2\2\u008b\u008c\t\6\2\2\u008c\u008e\7?\2\2\u008d\u0087\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\24\3\2\2\2\u008f\u0090\t\7\2\2\u0090\26\3\2\2\2\u0091"+
		"\u0092\7(\2\2\u0092\u0098\7(\2\2\u0093\u0094\7~\2\2\u0094\u0098\7~\2\2"+
		"\u0095\u0096\7/\2\2\u0096\u0098\7@\2\2\u0097\u0091\3\2\2\2\u0097\u0093"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\30\3\2\2\2\u0099\u009a\5\21\t\2\u009a"+
		"\u009b\7?\2\2\u009b\32\3\2\2\2\u009c\u009d\7\60\2\2\u009d\34\3\2\2\2\u009e"+
		"\u00a2\t\b\2\2\u009f\u00a1\t\t\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\36\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00ac\7$\2\2\u00a6\u00ab\t\n\2\2\u00a7\u00a8\7^\2\2\u00a8"+
		"\u00ab\7$\2\2\u00a9\u00ab\13\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7$"+
		"\2\2\u00b0 \3\2\2\2\u00b1\u00b5\7%\2\2\u00b2\u00b4\13\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\t\13\2\2\u00b9\"\3\2\2"+
		"\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7o\2\2\u00bc$\3\2\2\2\u00bd\u00be\7"+
		"h\2\2\u00be\u00bf\7p\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1(\3\2"+
		"\2\2\u00c2\u00c3\7<\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5,\3\2\2"+
		"\2\u00c6\u00c7\7*\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7+\2\2\u00c9\60\3\2\2"+
		"\2\u00ca\u00cb\7}\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7\177\2\2\u00cd\64"+
		"\3\2\2\2\u00ce\u00cf\7]\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7_\2\2\u00d1"+
		"8\3\2\2\2\u00d2\u00d4\t\f\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\b\35\2\2\u00d8:\3\2\2\2\25\2JYdinqv{~\u0085\u0089\u008d\u0097\u00a2\u00aa"+
		"\u00ac\u00b5\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}