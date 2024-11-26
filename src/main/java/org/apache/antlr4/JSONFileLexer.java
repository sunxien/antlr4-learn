// Generated from JSONFile.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JSONFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, ADD=3, SUB=4, DOT=5, COMMA=6, COLON=7, DOUBLE_QUOTA=8, 
		SLASH=9, BACK_SLASH=10, L_ROUND_BRACKET=11, R_ROUND_BRACKET=12, L_SQUARE_BRACKET=13, 
		R_SQUARE_BRACKET=14, L_CURLY_BRACKET=15, R_CURLY_BRACKET=16, NULL=17, 
		TRUE=18, FALSE=19, NUMBER_VALUE=20, STRING_VALUE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "NEWLINE", "ADD", "SUB", "DOT", "COMMA", "COLON", "DOUBLE_QUOTA", 
			"SLASH", "BACK_SLASH", "L_ROUND_BRACKET", "R_ROUND_BRACKET", "L_SQUARE_BRACKET", 
			"R_SQUARE_BRACKET", "L_CURLY_BRACKET", "R_CURLY_BRACKET", "NULL", "TRUE", 
			"FALSE", "NUMBER_VALUE", "STRING_VALUE", "DIGIT", "ZERO", "EXP", "ESC_CHAR", 
			"UNICODE", "HEX_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'.'", "','", "':'", "'\"'", "'/'", "'\\'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'null'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NEWLINE", "ADD", "SUB", "DOT", "COMMA", "COLON", "DOUBLE_QUOTA", 
			"SLASH", "BACK_SLASH", "L_ROUND_BRACKET", "R_ROUND_BRACKET", "L_SQUARE_BRACKET", 
			"R_SQUARE_BRACKET", "L_CURLY_BRACKET", "R_CURLY_BRACKET", "NULL", "TRUE", 
			"FALSE", "NUMBER_VALUE", "STRING_VALUE"
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


	public JSONFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSONFile.g4"; }

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
		"\u0004\u0000\u0015\u00b1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
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
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0003\u0013r\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013x\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013|\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0080\b\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0084\b\u0013\u0001\u0013\u0003\u0013\u0087\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u008c\b\u0014\n\u0014\f\u0014\u008f"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0096\b\u0015\n\u0015\f\u0015\u0099\t\u0015\u0003\u0015\u009b\b"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00a1"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00a8\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0000-\u0000/\u0000"+
		"1\u00003\u00005\u0000\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\"\"\\\\\u0001\u000019\u0001\u000009\u0002\u0000EEee\u0002\u0000++--\b"+
		"\u0000\"\"//\\\\bbffnnrrtt\u0003\u000009AFaf\u00bc\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u00018\u0001\u0000\u0000"+
		"\u0000\u0003?\u0001\u0000\u0000\u0000\u0005C\u0001\u0000\u0000\u0000\u0007"+
		"E\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bI\u0001\u0000"+
		"\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000"+
		"\u0011O\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015S"+
		"\u0001\u0000\u0000\u0000\u0017U\u0001\u0000\u0000\u0000\u0019W\u0001\u0000"+
		"\u0000\u0000\u001bY\u0001\u0000\u0000\u0000\u001d[\u0001\u0000\u0000\u0000"+
		"\u001f]\u0001\u0000\u0000\u0000!_\u0001\u0000\u0000\u0000#d\u0001\u0000"+
		"\u0000\u0000%i\u0001\u0000\u0000\u0000\'\u0086\u0001\u0000\u0000\u0000"+
		")\u0088\u0001\u0000\u0000\u0000+\u009a\u0001\u0000\u0000\u0000-\u009c"+
		"\u0001\u0000\u0000\u0000/\u009e\u0001\u0000\u0000\u00001\u00a4\u0001\u0000"+
		"\u0000\u00003\u00a9\u0001\u0000\u0000\u00005\u00af\u0001\u0000\u0000\u0000"+
		"79\u0007\u0000\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0006\u0000\u0000\u0000=\u0002\u0001\u0000\u0000\u0000"+
		">@\u0005\r\u0000\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AB\u0005\n\u0000\u0000B\u0004\u0001\u0000\u0000"+
		"\u0000CD\u0005+\u0000\u0000D\u0006\u0001\u0000\u0000\u0000EF\u0005-\u0000"+
		"\u0000F\b\u0001\u0000\u0000\u0000GH\u0005.\u0000\u0000H\n\u0001\u0000"+
		"\u0000\u0000IJ\u0005,\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0005:"+
		"\u0000\u0000L\u000e\u0001\u0000\u0000\u0000MN\u0005\"\u0000\u0000N\u0010"+
		"\u0001\u0000\u0000\u0000OP\u0005/\u0000\u0000P\u0012\u0001\u0000\u0000"+
		"\u0000QR\u0005\\\u0000\u0000R\u0014\u0001\u0000\u0000\u0000ST\u0005(\u0000"+
		"\u0000T\u0016\u0001\u0000\u0000\u0000UV\u0005)\u0000\u0000V\u0018\u0001"+
		"\u0000\u0000\u0000WX\u0005[\u0000\u0000X\u001a\u0001\u0000\u0000\u0000"+
		"YZ\u0005]\u0000\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005{\u0000\u0000"+
		"\\\u001e\u0001\u0000\u0000\u0000]^\u0005}\u0000\u0000^ \u0001\u0000\u0000"+
		"\u0000_`\u0005n\u0000\u0000`a\u0005u\u0000\u0000ab\u0005l\u0000\u0000"+
		"bc\u0005l\u0000\u0000c\"\u0001\u0000\u0000\u0000de\u0005t\u0000\u0000"+
		"ef\u0005r\u0000\u0000fg\u0005u\u0000\u0000gh\u0005e\u0000\u0000h$\u0001"+
		"\u0000\u0000\u0000ij\u0005f\u0000\u0000jk\u0005a\u0000\u0000kl\u0005l"+
		"\u0000\u0000lm\u0005s\u0000\u0000mn\u0005e\u0000\u0000n&\u0001\u0000\u0000"+
		"\u0000or\u0003\u0005\u0002\u0000pr\u0003\u0007\u0003\u0000qo\u0001\u0000"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0003+\u0015\u0000tu\u0003\t\u0004\u0000uw\u0003"+
		"+\u0015\u0000vx\u0003/\u0017\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\u0087\u0001\u0000\u0000\u0000y|\u0003\u0005\u0002\u0000"+
		"z|\u0003\u0007\u0003\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0003"+
		"+\u0015\u0000~\u0080\u0003/\u0017\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0087\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0003\u0005\u0002\u0000\u0082\u0084\u0003\u0007\u0003\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0003+\u0015\u0000\u0086q\u0001\u0000\u0000\u0000\u0086{"+
		"\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087(\u0001"+
		"\u0000\u0000\u0000\u0088\u008d\u0003\u000f\u0007\u0000\u0089\u008c\u0003"+
		"1\u0018\u0000\u008a\u008c\b\u0001\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0003\u000f\u0007\u0000\u0091*\u0001\u0000\u0000"+
		"\u0000\u0092\u009b\u0003-\u0016\u0000\u0093\u0097\u0007\u0002\u0000\u0000"+
		"\u0094\u0096\u0007\u0003\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000\u0000"+
		"\u009a\u0093\u0001\u0000\u0000\u0000\u009b,\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u00050\u0000\u0000\u009d.\u0001\u0000\u0000\u0000\u009e\u00a0\u0007"+
		"\u0004\u0000\u0000\u009f\u00a1\u0007\u0005\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0003+\u0015\u0000\u00a30\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a7\u0005\\\u0000\u0000\u00a5\u00a8\u0007\u0006\u0000\u0000"+
		"\u00a6\u00a8\u00033\u0019\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a82\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005u\u0000\u0000\u00aa\u00ab\u00035\u001a\u0000\u00ab\u00ac\u00035"+
		"\u001a\u0000\u00ac\u00ad\u00035\u001a\u0000\u00ad\u00ae\u00035\u001a\u0000"+
		"\u00ae4\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0007\u0000\u0000\u00b0"+
		"6\u0001\u0000\u0000\u0000\u000f\u0000:?qw{\u007f\u0083\u0086\u008b\u008d"+
		"\u0097\u009a\u00a0\u00a7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}