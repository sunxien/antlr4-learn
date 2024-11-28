// Generated from ErrorRecoverFile.g4 by ANTLR 4.13.2

package org.apache.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ErrorRecoverFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, XOR_SYMBOL=2, L_ROUND_BRACKET=3, R_ROUND_BRACKET=4, L_SQUARE_BRACKET=5, 
		R_SQUARE_BRACKET=6, ID=7, INT=8;
	public static final int
		RULE_group = 0, RULE_expr = 1, RULE_atom = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"group", "expr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'^'", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "XOR_SYMBOL", "L_ROUND_BRACKET", "R_ROUND_BRACKET", "L_SQUARE_BRACKET", 
			"R_SQUARE_BRACKET", "ID", "INT"
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
	public String getGrammarFileName() { return "ErrorRecoverFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ErrorRecoverFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupContext extends ParserRuleContext {
		public TerminalNode L_SQUARE_BRACKET() { return getToken(ErrorRecoverFileParser.L_SQUARE_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_SQUARE_BRACKET() { return getToken(ErrorRecoverFileParser.R_SQUARE_BRACKET, 0); }
		public TerminalNode L_ROUND_BRACKET() { return getToken(ErrorRecoverFileParser.L_ROUND_BRACKET, 0); }
		public TerminalNode R_ROUND_BRACKET() { return getToken(ErrorRecoverFileParser.R_ROUND_BRACKET, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErrorRecoverFileListener ) ((ErrorRecoverFileListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErrorRecoverFileListener ) ((ErrorRecoverFileListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErrorRecoverFileVisitor ) return ((ErrorRecoverFileVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_group);
		try {
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(L_SQUARE_BRACKET);
				setState(7);
				expr();
				setState(8);
				match(R_SQUARE_BRACKET);
				}
				break;
			case L_ROUND_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				match(L_ROUND_BRACKET);
				setState(11);
				expr();
				setState(12);
				match(R_ROUND_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode XOR_SYMBOL() { return getToken(ErrorRecoverFileParser.XOR_SYMBOL, 0); }
		public TerminalNode INT() { return getToken(ErrorRecoverFileParser.INT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErrorRecoverFileListener ) ((ErrorRecoverFileListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErrorRecoverFileListener ) ((ErrorRecoverFileListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErrorRecoverFileVisitor ) return ((ErrorRecoverFileVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			atom();
			setState(17);
			match(XOR_SYMBOL);
			setState(18);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ErrorRecoverFileParser.ID, 0); }
		public TerminalNode INT() { return getToken(ErrorRecoverFileParser.INT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErrorRecoverFileListener ) ((ErrorRecoverFileListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErrorRecoverFileListener ) ((ErrorRecoverFileListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErrorRecoverFileVisitor ) return ((ErrorRecoverFileVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\b\u0017\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0001\u0001\u0000\u0007"+
		"\b\u0014\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000"+
		"\u0000\u0004\u0014\u0001\u0000\u0000\u0000\u0006\u0007\u0005\u0005\u0000"+
		"\u0000\u0007\b\u0003\u0002\u0001\u0000\b\t\u0005\u0006\u0000\u0000\t\u000f"+
		"\u0001\u0000\u0000\u0000\n\u000b\u0005\u0003\u0000\u0000\u000b\f\u0003"+
		"\u0002\u0001\u0000\f\r\u0005\u0004\u0000\u0000\r\u000f\u0001\u0000\u0000"+
		"\u0000\u000e\u0006\u0001\u0000\u0000\u0000\u000e\n\u0001\u0000\u0000\u0000"+
		"\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0004\u0002\u0000"+
		"\u0011\u0012\u0005\u0002\u0000\u0000\u0012\u0013\u0005\b\u0000\u0000\u0013"+
		"\u0003\u0001\u0000\u0000\u0000\u0014\u0015\u0007\u0000\u0000\u0000\u0015"+
		"\u0005\u0001\u0000\u0000\u0000\u0001\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}