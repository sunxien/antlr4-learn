// Generated from MathInput.g4 by ANTLR 4.13.2

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
public class MathInputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, ADD=3, SUB=4, MUL=5, DIV=6, ASSIGN=7, INT=8;
	public static final int
		RULE_expr = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NEWLINE", "ADD", "SUB", "MUL", "DIV", "ASSIGN", "INT"
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
	public String getGrammarFileName() { return "MathInput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathInputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public int value;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mul_DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MathInputParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MathInputParser.DIV, 0); }
		public TerminalNode NEWLINE() { return getToken(MathInputParser.NEWLINE, 0); }
		public Mul_DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathInputListener ) ((MathInputListener)listener).enterMul_Div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathInputListener ) ((MathInputListener)listener).exitMul_Div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathInputVisitor ) return ((MathInputVisitor<? extends T>)visitor).visitMul_Div(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Get_IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(MathInputParser.INT, 0); }
		public Get_IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathInputListener ) ((MathInputListener)listener).enterGet_Int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathInputListener ) ((MathInputListener)listener).exitGet_Int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathInputVisitor ) return ((MathInputVisitor<? extends T>)visitor).visitGet_Int(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add_SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MathInputParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MathInputParser.SUB, 0); }
		public TerminalNode NEWLINE() { return getToken(MathInputParser.NEWLINE, 0); }
		public Add_SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathInputListener ) ((MathInputListener)listener).enterAdd_Sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathInputListener ) ((MathInputListener)listener).exitAdd_Sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathInputVisitor ) return ((MathInputVisitor<? extends T>)visitor).visitAdd_Sub(this);
			else return visitor.visitChildren(this);
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Get_IntContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(3);
			match(INT);
			}
			_ctx.stop = _input.LT(-1);
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(17);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(5);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(6);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(7);
						expr(0);
						setState(9);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
						case 1:
							{
							setState(8);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new Add_SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(11);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(12);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(13);
						expr(0);
						setState(15);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
						case 1:
							{
							setState(14);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b\u0017\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\n\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001"+
		"\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0002\u0001\u0000\u0005\u0006"+
		"\u0001\u0000\u0003\u0004\u0019\u0000\u0002\u0001\u0000\u0000\u0000\u0002"+
		"\u0003\u0006\u0000\uffff\uffff\u0000\u0003\u0004\u0005\b\u0000\u0000\u0004"+
		"\u0013\u0001\u0000\u0000\u0000\u0005\u0006\n\u0003\u0000\u0000\u0006\u0007"+
		"\u0007\u0000\u0000\u0000\u0007\t\u0003\u0000\u0000\u0000\b\n\u0005\u0002"+
		"\u0000\u0000\t\b\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n"+
		"\u0012\u0001\u0000\u0000\u0000\u000b\f\n\u0002\u0000\u0000\f\r\u0007\u0001"+
		"\u0000\u0000\r\u000f\u0003\u0000\u0000\u0000\u000e\u0010\u0005\u0002\u0000"+
		"\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000"+
		"\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u0005\u0001\u0000\u0000"+
		"\u0000\u0011\u000b\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000"+
		"\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0004\t\u000f\u0011\u0013";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}