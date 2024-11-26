// Generated from JSONFile.g4 by ANTLR 4.13.2

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
public class JSONFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, ADD=3, SUB=4, DOT=5, COMMA=6, COLON=7, DOUBLE_QUOTA=8, 
		SLASH=9, BACK_SLASH=10, L_ROUND_BRACKET=11, R_ROUND_BRACKET=12, L_SQUARE_BRACKET=13, 
		R_SQUARE_BRACKET=14, L_CURLY_BRACKET=15, R_CURLY_BRACKET=16, NULL=17, 
		TRUE=18, FALSE=19, NUMBER_VALUE=20, STRING_VALUE=21;
	public static final int
		RULE_json = 0, RULE_object = 1, RULE_array = 2, RULE_pair = 3, RULE_key = 4, 
		RULE_value = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "object", "array", "pair", "key", "value"
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

	@Override
	public String getGrammarFileName() { return "JSONFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JSONFileParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JSONFileParser.NEWLINE, i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		int _la;
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				object();
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(13);
					match(NEWLINE);
					}
					}
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case L_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				array();
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(20);
					match(NEWLINE);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode L_CURLY_BRACKET() { return getToken(JSONFileParser.L_CURLY_BRACKET, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode R_CURLY_BRACKET() { return getToken(JSONFileParser.R_CURLY_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JSONFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONFileParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		int _la;
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(L_CURLY_BRACKET);
				setState(29);
				pair();
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(30);
					match(COMMA);
					setState(31);
					pair();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(R_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(L_CURLY_BRACKET);
				setState(40);
				match(R_CURLY_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode L_SQUARE_BRACKET() { return getToken(JSONFileParser.L_SQUARE_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode R_SQUARE_BRACKET() { return getToken(JSONFileParser.R_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JSONFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONFileParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(L_SQUARE_BRACKET);
				setState(44);
				value();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(45);
					match(COMMA);
					setState(46);
					value();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				match(R_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(L_SQUARE_BRACKET);
				setState(55);
				match(R_SQUARE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JSONFileParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			key();
			setState(59);
			match(COLON);
			setState(60);
			value();
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
	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(JSONFileParser.STRING_VALUE, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(STRING_VALUE);
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
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class String_ValContext extends ValueContext {
		public TerminalNode STRING_VALUE() { return getToken(JSONFileParser.STRING_VALUE, 0); }
		public String_ValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterString_Val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitString_Val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitString_Val(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Atomic_ValContext extends ValueContext {
		public TerminalNode TRUE() { return getToken(JSONFileParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JSONFileParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(JSONFileParser.NULL, 0); }
		public Atomic_ValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterAtomic_Val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitAtomic_Val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitAtomic_Val(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_ValContext extends ValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Array_ValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterArray_Val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitArray_Val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitArray_Val(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Object_ValContext extends ValueContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Object_ValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterObject_Val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitObject_Val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitObject_Val(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Number_ValContext extends ValueContext {
		public TerminalNode NUMBER_VALUE() { return getToken(JSONFileParser.NUMBER_VALUE, 0); }
		public Number_ValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).enterNumber_Val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONFileListener ) ((JSONFileListener)listener).exitNumber_Val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONFileVisitor ) return ((JSONFileVisitor<? extends T>)visitor).visitNumber_Val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new Atomic_ValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new Atomic_ValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(FALSE);
				}
				break;
			case NULL:
				_localctx = new Atomic_ValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(NULL);
				}
				break;
			case STRING_VALUE:
				_localctx = new String_ValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(STRING_VALUE);
				}
				break;
			case NUMBER_VALUE:
				_localctx = new Number_ValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				match(NUMBER_VALUE);
				}
				break;
			case L_CURLY_BRACKET:
				_localctx = new Object_ValContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				object();
				}
				break;
			case L_SQUARE_BRACKET:
				_localctx = new Array_ValContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				array();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015J\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000\n"+
		"\u0000\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0016"+
		"\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0003\u0000\u001b\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001"+
		"\f\u0001$\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001*\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u00020\b\u0002\n\u0002\f\u00023\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005H\b"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0000P\u0000\u001a\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000"+
		"\u00048\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b>\u0001"+
		"\u0000\u0000\u0000\nG\u0001\u0000\u0000\u0000\f\u0010\u0003\u0002\u0001"+
		"\u0000\r\u000f\u0005\u0002\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u001b\u0001\u0000\u0000\u0000"+
		"\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0017\u0003\u0004\u0002\u0000"+
		"\u0014\u0016\u0005\u0002\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u001a\f\u0001\u0000\u0000\u0000\u001a"+
		"\u0013\u0001\u0000\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u000f\u0000\u0000\u001d\"\u0003\u0006\u0003\u0000\u001e\u001f"+
		"\u0005\u0006\u0000\u0000\u001f!\u0003\u0006\u0003\u0000 \u001e\u0001\u0000"+
		"\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"%&\u0005\u0010\u0000\u0000&*\u0001\u0000\u0000\u0000\'(\u0005\u000f\u0000"+
		"\u0000(*\u0005\u0010\u0000\u0000)\u001c\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005\r\u0000\u0000"+
		",1\u0003\n\u0005\u0000-.\u0005\u0006\u0000\u0000.0\u0003\n\u0005\u0000"+
		"/-\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000045\u0005\u000e\u0000\u000059\u0001\u0000\u0000\u000067\u0005"+
		"\r\u0000\u000079\u0005\u000e\u0000\u00008+\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u00009\u0005\u0001\u0000\u0000\u0000:;\u0003\b\u0004\u0000"+
		";<\u0005\u0007\u0000\u0000<=\u0003\n\u0005\u0000=\u0007\u0001\u0000\u0000"+
		"\u0000>?\u0005\u0015\u0000\u0000?\t\u0001\u0000\u0000\u0000@H\u0005\u0012"+
		"\u0000\u0000AH\u0005\u0013\u0000\u0000BH\u0005\u0011\u0000\u0000CH\u0005"+
		"\u0015\u0000\u0000DH\u0005\u0014\u0000\u0000EH\u0003\u0002\u0001\u0000"+
		"FH\u0003\u0004\u0002\u0000G@\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000"+
		"\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u000b"+
		"\u0001\u0000\u0000\u0000\b\u0010\u0017\u001a\")18G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}