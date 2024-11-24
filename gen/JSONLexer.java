// Generated from /Users/sunxien/Repository/git/antlr4-learn/src/main/resources/JSONLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, ADD=3, SUB=4, BIG_E=5, DOT=6, COMMA=7, COLON=8, DOUBLE_QUOTA=9, 
		SLASH=10, BACK_SLASH=11, L_ROUND_BRACKET=12, R_ROUND_BRACKET=13, L_SQUARE_BRACKET=14, 
		R_SQUARE_BRACKET=15, L_CURLY_BRACKET=16, R_CURLY_BRACKET=17, NULL=18, 
		TRUE=19, FALSE=20, NUMBER_VALUE=21, STRING_VALUE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "NEWLINE", "ADD", "SUB", "BIG_E", "DOT", "COMMA", "COLON", "DOUBLE_QUOTA", 
			"SLASH", "BACK_SLASH", "L_ROUND_BRACKET", "R_ROUND_BRACKET", "L_SQUARE_BRACKET", 
			"R_SQUARE_BRACKET", "L_CURLY_BRACKET", "R_CURLY_BRACKET", "NULL", "TRUE", 
			"FALSE", "NUMBER_VALUE", "STRING_VALUE", "DIGIT", "ZERO", "ESC_CHAR", 
			"UNICODE", "HEX_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'E'", "'.'", "','", "':'", "'\"'", "'/'", 
			"'\\'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'null'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NEWLINE", "ADD", "SUB", "BIG_E", "DOT", "COMMA", "COLON", 
			"DOUBLE_QUOTA", "SLASH", "BACK_SLASH", "L_ROUND_BRACKET", "R_ROUND_BRACKET", 
			"L_SQUARE_BRACKET", "R_SQUARE_BRACKET", "L_CURLY_BRACKET", "R_CURLY_BRACKET", 
			"NULL", "TRUE", "FALSE", "NUMBER_VALUE", "STRING_VALUE"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSONLexer.g4"; }

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
		"\u0004\u0000\u0016\u00b1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0004\u00009\b\u0000\u000b\u0000\f\u0000:\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014t\b\u0014\u0001\u0014\u0004\u0014"+
		"w\b\u0014\u000b\u0014\f\u0014x\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014~\b\u0014\n\u0014\f\u0014\u0081\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0085\b\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u0089\b"+
		"\u0014\u000b\u0014\f\u0014\u008a\u0003\u0014\u008d\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0092\b\u0015\n\u0015\f\u0015\u0095"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u009c\b\u0016\n\u0016\f\u0016\u009f\t\u0016\u0003\u0016\u00a1\b"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00a8\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0000/\u0000"+
		"1\u00003\u00005\u0000\u0001\u0000\u0006\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\"\"\\\\\u0001\u000019\u0001\u000009\b\u0000\"\"//\\\\bbffnnrrtt\u0003"+
		"\u000009AFaf\u00ba\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u00018\u0001\u0000\u0000"+
		"\u0000\u0003?\u0001\u0000\u0000\u0000\u0005C\u0001\u0000\u0000\u0000\u0007"+
		"E\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bI\u0001\u0000"+
		"\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000"+
		"\u0011O\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015S"+
		"\u0001\u0000\u0000\u0000\u0017U\u0001\u0000\u0000\u0000\u0019W\u0001\u0000"+
		"\u0000\u0000\u001bY\u0001\u0000\u0000\u0000\u001d[\u0001\u0000\u0000\u0000"+
		"\u001f]\u0001\u0000\u0000\u0000!_\u0001\u0000\u0000\u0000#a\u0001\u0000"+
		"\u0000\u0000%f\u0001\u0000\u0000\u0000\'k\u0001\u0000\u0000\u0000)\u008c"+
		"\u0001\u0000\u0000\u0000+\u008e\u0001\u0000\u0000\u0000-\u00a0\u0001\u0000"+
		"\u0000\u0000/\u00a2\u0001\u0000\u0000\u00001\u00a4\u0001\u0000\u0000\u0000"+
		"3\u00a9\u0001\u0000\u0000\u00005\u00af\u0001\u0000\u0000\u000079\u0007"+
		"\u0000\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0006\u0000\u0000\u0000=\u0002\u0001\u0000\u0000\u0000>@\u0005"+
		"\r\u0000\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AB\u0005\n\u0000\u0000B\u0004\u0001\u0000\u0000\u0000"+
		"CD\u0005+\u0000\u0000D\u0006\u0001\u0000\u0000\u0000EF\u0005-\u0000\u0000"+
		"F\b\u0001\u0000\u0000\u0000GH\u0005E\u0000\u0000H\n\u0001\u0000\u0000"+
		"\u0000IJ\u0005.\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0005,\u0000"+
		"\u0000L\u000e\u0001\u0000\u0000\u0000MN\u0005:\u0000\u0000N\u0010\u0001"+
		"\u0000\u0000\u0000OP\u0005\"\u0000\u0000P\u0012\u0001\u0000\u0000\u0000"+
		"QR\u0005/\u0000\u0000R\u0014\u0001\u0000\u0000\u0000ST\u0005\\\u0000\u0000"+
		"T\u0016\u0001\u0000\u0000\u0000UV\u0005(\u0000\u0000V\u0018\u0001\u0000"+
		"\u0000\u0000WX\u0005)\u0000\u0000X\u001a\u0001\u0000\u0000\u0000YZ\u0005"+
		"[\u0000\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005]\u0000\u0000\\\u001e"+
		"\u0001\u0000\u0000\u0000]^\u0005{\u0000\u0000^ \u0001\u0000\u0000\u0000"+
		"_`\u0005}\u0000\u0000`\"\u0001\u0000\u0000\u0000ab\u0005n\u0000\u0000"+
		"bc\u0005u\u0000\u0000cd\u0005l\u0000\u0000de\u0005l\u0000\u0000e$\u0001"+
		"\u0000\u0000\u0000fg\u0005t\u0000\u0000gh\u0005r\u0000\u0000hi\u0005u"+
		"\u0000\u0000ij\u0005e\u0000\u0000j&\u0001\u0000\u0000\u0000kl\u0005f\u0000"+
		"\u0000lm\u0005a\u0000\u0000mn\u0005l\u0000\u0000no\u0005s\u0000\u0000"+
		"op\u0005e\u0000\u0000p(\u0001\u0000\u0000\u0000qt\u0003\u0005\u0002\u0000"+
		"rt\u0003\u0007\u0003\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000uw\u0003-\u0016"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u007f\u0001\u0000\u0000\u0000"+
		"z{\u0003\u000b\u0005\u0000{|\u0003-\u0016\u0000|~\u0001\u0000\u0000\u0000"+
		"}z\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u008d\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0003"+
		"\u0005\u0002\u0000\u0083\u0085\u0003\u0007\u0003\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0003"+
		"\u000b\u0005\u0000\u0087\u0089\u0003-\u0016\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000"+
		"\u0000\u0000\u008cs\u0001\u0000\u0000\u0000\u008c\u0084\u0001\u0000\u0000"+
		"\u0000\u008d*\u0001\u0000\u0000\u0000\u008e\u0093\u0003\u0011\b\u0000"+
		"\u008f\u0092\u00031\u0018\u0000\u0090\u0092\b\u0001\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0011\b\u0000\u0097,"+
		"\u0001\u0000\u0000\u0000\u0098\u00a1\u0003/\u0017\u0000\u0099\u009d\u0007"+
		"\u0002\u0000\u0000\u009a\u009c\u0007\u0003\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u0098\u0001"+
		"\u0000\u0000\u0000\u00a0\u0099\u0001\u0000\u0000\u0000\u00a1.\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u00050\u0000\u0000\u00a30\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a7\u0005\\\u0000\u0000\u00a5\u00a8\u0007\u0004\u0000\u0000\u00a6"+
		"\u00a8\u00033\u0019\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a82\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"u\u0000\u0000\u00aa\u00ab\u00035\u001a\u0000\u00ab\u00ac\u00035\u001a"+
		"\u0000\u00ac\u00ad\u00035\u001a\u0000\u00ad\u00ae\u00035\u001a\u0000\u00ae"+
		"4\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0005\u0000\u0000\u00b06\u0001"+
		"\u0000\u0000\u0000\u000e\u0000:?sx\u007f\u0084\u008a\u008c\u0091\u0093"+
		"\u009d\u00a0\u00a7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}