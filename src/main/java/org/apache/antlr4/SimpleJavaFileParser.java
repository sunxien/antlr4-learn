// Generated from SimpleJavaFile.g4 by ANTLR 4.13.2

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
public class SimpleJavaFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ASSIGN=2, SEMICOLON=3, L_ROUND_BRACKET=4, R_ROUND_BRACKET=5, L_CURLY_BRACKET=6, 
		R_CURLY_BRACKET=7, CLASS=8, INT_TYPE=9, VOID_TYPE=10, ID=11, INT=12;
	public static final int
		RULE_prog = 0, RULE_classDef = 1, RULE_member = 2, RULE_stat = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "classDef", "member", "stat", "expr"
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

	@Override
	public String getGrammarFileName() { return "SimpleJavaFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleJavaFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaFileVisitor ) return ((SimpleJavaFileVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				classDef();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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
	public static class ClassDefContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode CLASS() { return getToken(SimpleJavaFileParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(SimpleJavaFileParser.ID, 0); }
		public TerminalNode L_CURLY_BRACKET() { return getToken(SimpleJavaFileParser.L_CURLY_BRACKET, 0); }
		public TerminalNode R_CURLY_BRACKET() { return getToken(SimpleJavaFileParser.R_CURLY_BRACKET, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaFileVisitor ) return ((SimpleJavaFileVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(CLASS);
			setState(16);
			((ClassDefContext)_localctx).ID = match(ID);
			setState(17);
			match(L_CURLY_BRACKET);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT_TYPE) {
				{
				{
				setState(18);
				member();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(R_CURLY_BRACKET);

			               System.out.println("class: " + ((ClassDefContext)_localctx).ID.getText());
			           
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
	public static class MemberContext extends ParserRuleContext {
		public Token ID;
		public Token f;
		public List<TerminalNode> INT_TYPE() { return getTokens(SimpleJavaFileParser.INT_TYPE); }
		public TerminalNode INT_TYPE(int i) {
			return getToken(SimpleJavaFileParser.INT_TYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(SimpleJavaFileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleJavaFileParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleJavaFileParser.SEMICOLON, 0); }
		public TerminalNode L_ROUND_BRACKET() { return getToken(SimpleJavaFileParser.L_ROUND_BRACKET, 0); }
		public TerminalNode R_ROUND_BRACKET() { return getToken(SimpleJavaFileParser.R_ROUND_BRACKET, 0); }
		public TerminalNode L_CURLY_BRACKET() { return getToken(SimpleJavaFileParser.L_CURLY_BRACKET, 0); }
		public TerminalNode R_CURLY_BRACKET() { return getToken(SimpleJavaFileParser.R_CURLY_BRACKET, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaFileVisitor ) return ((SimpleJavaFileVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_member);
		int _la;
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(INT_TYPE);
				setState(28);
				((MemberContext)_localctx).ID = match(ID);
				setState(29);
				match(SEMICOLON);

				             System.out.println("found member: int " + ((MemberContext)_localctx).ID.getText() + ";");
				         
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(INT_TYPE);
				setState(32);
				((MemberContext)_localctx).f = match(ID);
				setState(33);
				match(L_ROUND_BRACKET);
				setState(34);
				match(INT_TYPE);
				setState(35);
				((MemberContext)_localctx).ID = match(ID);
				setState(36);
				match(R_ROUND_BRACKET);
				setState(37);
				match(L_CURLY_BRACKET);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==INT) {
					{
					{
					setState(38);
					stat();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(R_CURLY_BRACKET);

				             System.out.println("found member: int " + ((MemberContext)_localctx).f.getText() + "(int " + ((MemberContext)_localctx).ID.getText() + ")");
				         
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
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleJavaFileParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(SimpleJavaFileParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleJavaFileParser.ASSIGN, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaFileVisitor ) return ((SimpleJavaFileVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				expr();
				setState(49);
				match(SEMICOLON);

				           System.out.println("found expr: " + _localctx.getText());
				       
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(ID);
				setState(53);
				match(ASSIGN);
				setState(54);
				expr();
				setState(55);
				match(SEMICOLON);

				           System.out.println("found assign: " + _localctx.getText());
				       
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleJavaFileParser.INT, 0); }
		public TerminalNode ID() { return getToken(SimpleJavaFileParser.ID, 0); }
		public TerminalNode L_ROUND_BRACKET() { return getToken(SimpleJavaFileParser.L_ROUND_BRACKET, 0); }
		public TerminalNode R_ROUND_BRACKET() { return getToken(SimpleJavaFileParser.R_ROUND_BRACKET, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleJavaFileListener ) ((SimpleJavaFileListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleJavaFileVisitor ) return ((SimpleJavaFileVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(ID);
				setState(62);
				match(L_ROUND_BRACKET);
				setState(63);
				match(INT);
				setState(64);
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

	public static final String _serializedATN =
		"\u0004\u0001\fD\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001\u0017"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002"+
		"\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004"+
		"\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000D"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000"+
		"\u0004.\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\bA\u0001"+
		"\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0005\b\u0000\u0000\u0010\u0011\u0005\u000b\u0000\u0000\u0011\u0015\u0005"+
		"\u0006\u0000\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005"+
		"\u0007\u0000\u0000\u0019\u001a\u0006\u0001\uffff\uffff\u0000\u001a\u0003"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005\t\u0000\u0000\u001c\u001d\u0005"+
		"\u000b\u0000\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e/\u0006\u0002"+
		"\uffff\uffff\u0000\u001f \u0005\t\u0000\u0000 !\u0005\u000b\u0000\u0000"+
		"!\"\u0005\u0004\u0000\u0000\"#\u0005\t\u0000\u0000#$\u0005\u000b\u0000"+
		"\u0000$%\u0005\u0005\u0000\u0000%)\u0005\u0006\u0000\u0000&(\u0003\u0006"+
		"\u0003\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000,-\u0005\u0007\u0000\u0000-/\u0006\u0002\uffff"+
		"\uffff\u0000.\u001b\u0001\u0000\u0000\u0000.\u001f\u0001\u0000\u0000\u0000"+
		"/\u0005\u0001\u0000\u0000\u000001\u0003\b\u0004\u000012\u0005\u0003\u0000"+
		"\u000023\u0006\u0003\uffff\uffff\u00003;\u0001\u0000\u0000\u000045\u0005"+
		"\u000b\u0000\u000056\u0005\u0002\u0000\u000067\u0003\b\u0004\u000078\u0005"+
		"\u0003\u0000\u000089\u0006\u0003\uffff\uffff\u00009;\u0001\u0000\u0000"+
		"\u0000:0\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000\u0000;\u0007\u0001"+
		"\u0000\u0000\u0000<B\u0005\f\u0000\u0000=>\u0005\u000b\u0000\u0000>?\u0005"+
		"\u0004\u0000\u0000?@\u0005\f\u0000\u0000@B\u0005\u0005\u0000\u0000A<\u0001"+
		"\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000"+
		"\u0006\r\u0015).:A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}