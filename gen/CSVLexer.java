// Generated from /Users/sunxien/Repository/git/antlr4-learn/src/main/resources/CSVLexer.g4.bak by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CSVLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, DOT=3, COMMA=4, SINGLE_QUOTA=5, DOUBLE_QUOTA=6, PLAIN_TEXT=7, 
		STRING_VALUE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "DOT", "COMMA", "SINGLE_QUOTA", "DOUBLE_QUOTA", "PLAIN_TEXT", 
			"STRING_VALUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'", "','", "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "WS", "DOT", "COMMA", "SINGLE_QUOTA", "DOUBLE_QUOTA", 
			"PLAIN_TEXT", "STRING_VALUE"
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


	public CSVLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "src/main/antlr4/CSVLexer.g4.bak"; }

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
		"\u0004\u0000\bD\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001\u0018\b\u0001\u000b\u0001\f\u0001\u0019\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006\'\b"+
		"\u0006\u000b\u0006\f\u0006(\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007/\b\u0007\n\u0007\f\u00072\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007<\b\u0007\n\u0007\f\u0007?\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007C\b\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0004"+
		"\u0003\u0000\t\n\r\r  \u0006\u0000\n\n\r\r\"\"\'\',,\\\\\u0001\u0000\'"+
		"\'\u0001\u0000\"\"L\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0001\u0012\u0001\u0000\u0000\u0000\u0003\u0017\u0001\u0000\u0000"+
		"\u0000\u0005\u001d\u0001\u0000\u0000\u0000\u0007\u001f\u0001\u0000\u0000"+
		"\u0000\t!\u0001\u0000\u0000\u0000\u000b#\u0001\u0000\u0000\u0000\r&\u0001"+
		"\u0000\u0000\u0000\u000fB\u0001\u0000\u0000\u0000\u0011\u0013\u0005\r"+
		"\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0005\n\u0000"+
		"\u0000\u0015\u0002\u0001\u0000\u0000\u0000\u0016\u0018\u0007\u0000\u0000"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0006\u0001\u0000"+
		"\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0005.\u0000\u0000"+
		"\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0005,\u0000\u0000 \b\u0001"+
		"\u0000\u0000\u0000!\"\u0005\'\u0000\u0000\"\n\u0001\u0000\u0000\u0000"+
		"#$\u0005\"\u0000\u0000$\f\u0001\u0000\u0000\u0000%\'\b\u0001\u0000\u0000"+
		"&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)\u000e\u0001\u0000\u0000\u0000*0\u0003"+
		"\t\u0004\u0000+,\u0005\'\u0000\u0000,/\u0005\'\u0000\u0000-/\b\u0002\u0000"+
		"\u0000.+\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0003\t\u0004\u00004C\u0001"+
		"\u0000\u0000\u00005=\u0003\u000b\u0005\u000067\u0005\\\u0000\u00007<\u0005"+
		"\"\u0000\u000089\u0005\"\u0000\u00009<\u0005\"\u0000\u0000:<\b\u0003\u0000"+
		"\u0000;6\u0001\u0000\u0000\u0000;8\u0001\u0000\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"@A\u0003\u000b\u0005\u0000AC\u0001\u0000\u0000\u0000B*\u0001\u0000\u0000"+
		"\u0000B5\u0001\u0000\u0000\u0000C\u0010\u0001\u0000\u0000\u0000\t\u0000"+
		"\u0012\u0019(.0;=B\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}