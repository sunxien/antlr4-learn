// Generated from SimpleJavaLexer.g4 by ANTLR 4.13.2

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
public class SimpleJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ASSIGN=2, SEMICOLON=3, L_ROUND_BRACKET=4, R_ROUND_BRACKET=5, L_CURLY_BRACKET=6, 
		R_CURLY_BRACKET=7, CLASS=8, INT_TYPE=9, VOID_TYPE=10, ID=11, INT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "ASSIGN", "SEMICOLON", "L_ROUND_BRACKET", "R_ROUND_BRACKET", "L_CURLY_BRACKET", 
			"R_CURLY_BRACKET", "CLASS", "INT_TYPE", "VOID_TYPE", "ID", "INT", "DIGIT", 
			"LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "';'", "'('", "')'", "'{'", "'}'", "'class'", "'int'", 
			"'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ASSIGN", "SEMICOLON", "L_ROUND_BRACKET", "R_ROUND_BRACKET", 
			"L_CURLY_BRACKET", "R_CURLY_BRACKET", "CLASS", "INT_TYPE", "VOID_TYPE", 
			"ID", "INT"
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


	public SimpleJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleJavaLexer.g4"; }

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
		"\u0004\u0000\fM\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001f"+
		"\b\u0000\u000b\u0000\f\u0000 \u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004"+
		"\nA\b\n\u000b\n\f\nB\u0001\u000b\u0004\u000bF\b\u000b\u000b\u000b\f\u000b"+
		"G\u0001\f\u0001\f\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000\u001b\u0000\u0001\u0000\u0003"+
		"\u0003\u0000\t\n\r\r  \u0001\u000009\u0002\u0000AZazM\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u001e\u0001\u0000\u0000"+
		"\u0000\u0003$\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u0007"+
		"(\u0001\u0000\u0000\u0000\t*\u0001\u0000\u0000\u0000\u000b,\u0001\u0000"+
		"\u0000\u0000\r.\u0001\u0000\u0000\u0000\u000f0\u0001\u0000\u0000\u0000"+
		"\u00116\u0001\u0000\u0000\u0000\u0013:\u0001\u0000\u0000\u0000\u0015@"+
		"\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019I\u0001\u0000"+
		"\u0000\u0000\u001bK\u0001\u0000\u0000\u0000\u001d\u001f\u0007\u0000\u0000"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"#\u0006\u0000\u0000\u0000#\u0002\u0001\u0000\u0000\u0000"+
		"$%\u0005=\u0000\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005;\u0000\u0000"+
		"\'\u0006\u0001\u0000\u0000\u0000()\u0005(\u0000\u0000)\b\u0001\u0000\u0000"+
		"\u0000*+\u0005)\u0000\u0000+\n\u0001\u0000\u0000\u0000,-\u0005{\u0000"+
		"\u0000-\f\u0001\u0000\u0000\u0000./\u0005}\u0000\u0000/\u000e\u0001\u0000"+
		"\u0000\u000001\u0005c\u0000\u000012\u0005l\u0000\u000023\u0005a\u0000"+
		"\u000034\u0005s\u0000\u000045\u0005s\u0000\u00005\u0010\u0001\u0000\u0000"+
		"\u000067\u0005i\u0000\u000078\u0005n\u0000\u000089\u0005t\u0000\u0000"+
		"9\u0012\u0001\u0000\u0000\u0000:;\u0005v\u0000\u0000;<\u0005o\u0000\u0000"+
		"<=\u0005i\u0000\u0000=>\u0005d\u0000\u0000>\u0014\u0001\u0000\u0000\u0000"+
		"?A\u0003\u001b\r\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0016\u0001\u0000"+
		"\u0000\u0000DF\u0003\u0019\f\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0018"+
		"\u0001\u0000\u0000\u0000IJ\u0007\u0001\u0000\u0000J\u001a\u0001\u0000"+
		"\u0000\u0000KL\u0007\u0002\u0000\u0000L\u001c\u0001\u0000\u0000\u0000"+
		"\u0004\u0000 BG\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}