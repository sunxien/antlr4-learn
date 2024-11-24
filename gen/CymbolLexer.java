// Generated from /Users/sunxien/Repository/git/antlr4-learn/src/main/resources/CymbolLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, ADD=2, SUB=3, ASSIGN=4, EQUAL=5, SEMICOLON=6, STAR_MARK=7, EXCLAMATION_MARK=8, 
		L_ROUND_BRACKET=9, R_ROUND_BRACKET=10, L_SQUARE_BRACKET=11, R_SQUARE_BRACKET=12, 
		L_CURLY_BRACKET=13, R_CURLY_BRACKET=14, FLOAT_TYPE=15, INT_TYPE=16, VOID_TYPE=17, 
		IF=18, ELSEIF=19, ELSE=20, RETURN=21, THEN=22, ID=23, INT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMA", "ADD", "SUB", "ASSIGN", "EQUAL", "SEMICOLON", "STAR_MARK", "EXCLAMATION_MARK", 
			"L_ROUND_BRACKET", "R_ROUND_BRACKET", "L_SQUARE_BRACKET", "R_SQUARE_BRACKET", 
			"L_CURLY_BRACKET", "R_CURLY_BRACKET", "FLOAT_TYPE", "INT_TYPE", "VOID_TYPE", 
			"IF", "ELSEIF", "ELSE", "RETURN", "THEN", "ID", "INT", "DIGIT", "LETTER", 
			"ASTERISK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'+'", "'-'", "'='", "'=='", "';'", null, "'!'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'float'", "'int'", "'void'", "'if'", 
			"'else if'", "'else'", "'return'", "'then'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "ADD", "SUB", "ASSIGN", "EQUAL", "SEMICOLON", "STAR_MARK", 
			"EXCLAMATION_MARK", "L_ROUND_BRACKET", "R_ROUND_BRACKET", "L_SQUARE_BRACKET", 
			"R_SQUARE_BRACKET", "L_CURLY_BRACKET", "R_CURLY_BRACKET", "FLOAT_TYPE", 
			"INT_TYPE", "VOID_TYPE", "IF", "ELSEIF", "ELSE", "RETURN", "THEN", "ID", 
			"INT"
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


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CymbolLexer.g4"; }

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
		"\u0004\u0000\u0018\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u0081\b\u0016\u000b"+
		"\u0016\f\u0016\u0082\u0001\u0017\u0004\u0017\u0086\b\u0017\u000b\u0017"+
		"\f\u0017\u0087\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00003\u00005\u0000\u0001\u0000"+
		"\u0002\u0001\u000009\u0002\u0000AZaz\u008d\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00017"+
		"\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005;\u0001\u0000"+
		"\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000"+
		"\u000bB\u0001\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000fF\u0001"+
		"\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000"+
		"\u0000\u0015L\u0001\u0000\u0000\u0000\u0017N\u0001\u0000\u0000\u0000\u0019"+
		"P\u0001\u0000\u0000\u0000\u001bR\u0001\u0000\u0000\u0000\u001dT\u0001"+
		"\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000!^\u0001\u0000\u0000"+
		"\u0000#c\u0001\u0000\u0000\u0000%f\u0001\u0000\u0000\u0000\'n\u0001\u0000"+
		"\u0000\u0000)s\u0001\u0000\u0000\u0000+z\u0001\u0000\u0000\u0000-\u0080"+
		"\u0001\u0000\u0000\u0000/\u0085\u0001\u0000\u0000\u00001\u0089\u0001\u0000"+
		"\u0000\u00003\u008b\u0001\u0000\u0000\u00005\u008d\u0001\u0000\u0000\u0000"+
		"78\u0005,\u0000\u00008\u0002\u0001\u0000\u0000\u00009:\u0005+\u0000\u0000"+
		":\u0004\u0001\u0000\u0000\u0000;<\u0005-\u0000\u0000<\u0006\u0001\u0000"+
		"\u0000\u0000=>\u0005=\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005="+
		"\u0000\u0000@A\u0005=\u0000\u0000A\n\u0001\u0000\u0000\u0000BC\u0005;"+
		"\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u00035\u001a\u0000E\u000e\u0001"+
		"\u0000\u0000\u0000FG\u0005!\u0000\u0000G\u0010\u0001\u0000\u0000\u0000"+
		"HI\u0005(\u0000\u0000I\u0012\u0001\u0000\u0000\u0000JK\u0005)\u0000\u0000"+
		"K\u0014\u0001\u0000\u0000\u0000LM\u0005[\u0000\u0000M\u0016\u0001\u0000"+
		"\u0000\u0000NO\u0005]\u0000\u0000O\u0018\u0001\u0000\u0000\u0000PQ\u0005"+
		"{\u0000\u0000Q\u001a\u0001\u0000\u0000\u0000RS\u0005}\u0000\u0000S\u001c"+
		"\u0001\u0000\u0000\u0000TU\u0005f\u0000\u0000UV\u0005l\u0000\u0000VW\u0005"+
		"o\u0000\u0000WX\u0005a\u0000\u0000XY\u0005t\u0000\u0000Y\u001e\u0001\u0000"+
		"\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005t\u0000"+
		"\u0000] \u0001\u0000\u0000\u0000^_\u0005v\u0000\u0000_`\u0005o\u0000\u0000"+
		"`a\u0005i\u0000\u0000ab\u0005d\u0000\u0000b\"\u0001\u0000\u0000\u0000"+
		"cd\u0005i\u0000\u0000de\u0005f\u0000\u0000e$\u0001\u0000\u0000\u0000f"+
		"g\u0005e\u0000\u0000gh\u0005l\u0000\u0000hi\u0005s\u0000\u0000ij\u0005"+
		"e\u0000\u0000jk\u0005 \u0000\u0000kl\u0005i\u0000\u0000lm\u0005f\u0000"+
		"\u0000m&\u0001\u0000\u0000\u0000no\u0005e\u0000\u0000op\u0005l\u0000\u0000"+
		"pq\u0005s\u0000\u0000qr\u0005e\u0000\u0000r(\u0001\u0000\u0000\u0000s"+
		"t\u0005r\u0000\u0000tu\u0005e\u0000\u0000uv\u0005t\u0000\u0000vw\u0005"+
		"u\u0000\u0000wx\u0005r\u0000\u0000xy\u0005n\u0000\u0000y*\u0001\u0000"+
		"\u0000\u0000z{\u0005t\u0000\u0000{|\u0005h\u0000\u0000|}\u0005e\u0000"+
		"\u0000}~\u0005n\u0000\u0000~,\u0001\u0000\u0000\u0000\u007f\u0081\u0003"+
		"3\u0019\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083.\u0001\u0000\u0000\u0000\u0084\u0086\u00031\u0018\u0000"+
		"\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u00880\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0000\u0000\u0000\u008a"+
		"2\u0001\u0000\u0000\u0000\u008b\u008c\u0007\u0001\u0000\u0000\u008c4\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005*\u0000\u0000\u008e6\u0001\u0000\u0000"+
		"\u0000\u0003\u0000\u0082\u0087\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}