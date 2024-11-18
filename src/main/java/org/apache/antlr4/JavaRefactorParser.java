// Generated from JavaRefactor.g4 by ANTLR 4.13.2

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
public class JavaRefactorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DIGIT=2, NEW_LINE=3, DOT=4, COMMA=5, SEMICOLON=6, AT_SYMBOL=7, ADD=8, 
		SUB=9, MUL=10, DIV=11, EQUAL=12, SINGLE_QUOTA=13, DOUBLE_QUOTA=14, SLASH=15, 
		BACK_SLASH=16, STAR=17, ASSIGN=18, L_PARENTHESIS=19, R_PARENTHESIS=20, 
		L_SQUARE_BRACKET=21, R_SQUARE_BRACKET=22, L_BRACE=23, R_BRACE=24, L_ANGLE_BRACKET=25, 
		R_ANGLE_BRACKET=26, PUBLIC=27, PRIVATE=28, PROTECTED=29, DEFAULT=30, VOID=31, 
		NULL=32, EXTENDS=33, IMPLEMENTS=34, ABSTRACT=35, STATIC=36, FINAL=37, 
		CLASS=38, ENUM=39, INTERFACE=40, RETURN=41, PACKAGE=42, IMPORT=43, THROWS=44, 
		ID=45, QUALIFIER_NAME=46, STRING_LITERAL=47, ARRAY_TYPE=48;
	public static final int
		RULE_classFileDefinition = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_classDeclaration = 3, RULE_genericType = 4, RULE_deriveDeclaration = 5, 
		RULE_classBody = 6, RULE_globalVariableDeclaration = 7, RULE_methodDeclaration = 8, 
		RULE_annotationDeclaration = 9, RULE_methodArguments = 10, RULE_exceptionDeclaration = 11, 
		RULE_methodBody = 12, RULE_codeSnippets = 13, RULE_localVariableDeclaration = 14, 
		RULE_otherStatements = 15, RULE_variableDeclaration = 16, RULE_javaType = 17, 
		RULE_stringValue = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"classFileDefinition", "packageDeclaration", "importDeclaration", "classDeclaration", 
			"genericType", "deriveDeclaration", "classBody", "globalVariableDeclaration", 
			"methodDeclaration", "annotationDeclaration", "methodArguments", "exceptionDeclaration", 
			"methodBody", "codeSnippets", "localVariableDeclaration", "otherStatements", 
			"variableDeclaration", "javaType", "stringValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'.'", "','", "';'", "'@'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'''", "'\"'", null, "'\\'", null, null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'>'", "'public'", "'private'", "'protected'", 
			"'default'", "'void'", "'null'", "'extends'", "'implements'", "'abstract'", 
			"'static'", "'final'", "'class'", "'enum'", "'interface'", "'return'", 
			"'package'", "'import'", "'throws'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "DIGIT", "NEW_LINE", "DOT", "COMMA", "SEMICOLON", "AT_SYMBOL", 
			"ADD", "SUB", "MUL", "DIV", "EQUAL", "SINGLE_QUOTA", "DOUBLE_QUOTA", 
			"SLASH", "BACK_SLASH", "STAR", "ASSIGN", "L_PARENTHESIS", "R_PARENTHESIS", 
			"L_SQUARE_BRACKET", "R_SQUARE_BRACKET", "L_BRACE", "R_BRACE", "L_ANGLE_BRACKET", 
			"R_ANGLE_BRACKET", "PUBLIC", "PRIVATE", "PROTECTED", "DEFAULT", "VOID", 
			"NULL", "EXTENDS", "IMPLEMENTS", "ABSTRACT", "STATIC", "FINAL", "CLASS", 
			"ENUM", "INTERFACE", "RETURN", "PACKAGE", "IMPORT", "THROWS", "ID", "QUALIFIER_NAME", 
			"STRING_LITERAL", "ARRAY_TYPE"
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
	public String getGrammarFileName() { return "JavaRefactor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaRefactorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassFileDefinitionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaRefactorParser.EOF, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ClassFileDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classFileDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterClassFileDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitClassFileDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitClassFileDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFileDefinitionContext classFileDefinition() throws RecognitionException {
		ClassFileDefinitionContext _localctx = new ClassFileDefinitionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_classFileDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(38);
				packageDeclaration();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(41);
				importDeclaration();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			classDeclaration();
			}
			setState(49);
			match(EOF);
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
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaRefactorParser.PACKAGE, 0); }
		public TerminalNode QUALIFIER_NAME() { return getToken(JavaRefactorParser.QUALIFIER_NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaRefactorParser.SEMICOLON, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PACKAGE);
			setState(52);
			match(QUALIFIER_NAME);
			setState(53);
			match(SEMICOLON);
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
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaRefactorParser.IMPORT, 0); }
		public TerminalNode QUALIFIER_NAME() { return getToken(JavaRefactorParser.QUALIFIER_NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaRefactorParser.SEMICOLON, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(IMPORT);
			setState(56);
			match(QUALIFIER_NAME);
			setState(57);
			match(SEMICOLON);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaRefactorParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(JavaRefactorParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public DeriveDeclarationContext deriveDeclaration() {
			return getRuleContext(DeriveDeclarationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaRefactorParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaRefactorParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaRefactorParser.PROTECTED, 0); }
		public TerminalNode FINAL() { return getToken(JavaRefactorParser.FINAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaRefactorParser.ABSTRACT, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				setState(59);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==FINAL) {
				{
				setState(62);
				_la = _input.LA(1);
				if ( !(_la==ABSTRACT || _la==FINAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(65);
			match(CLASS);
			setState(66);
			match(ID);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOID || _la==ARRAY_TYPE) {
				{
				setState(67);
				genericType();
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==IMPLEMENTS) {
				{
				setState(70);
				deriveDeclaration();
				}
			}

			setState(73);
			classBody();
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
	public static class GenericTypeContext extends ParserRuleContext {
		public List<JavaTypeContext> javaType() {
			return getRuleContexts(JavaTypeContext.class);
		}
		public JavaTypeContext javaType(int i) {
			return getRuleContext(JavaTypeContext.class,i);
		}
		public TerminalNode L_ANGLE_BRACKET() { return getToken(JavaRefactorParser.L_ANGLE_BRACKET, 0); }
		public TerminalNode R_ANGLE_BRACKET() { return getToken(JavaRefactorParser.R_ANGLE_BRACKET, 0); }
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genericType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			javaType();
			setState(76);
			match(L_ANGLE_BRACKET);
			setState(77);
			javaType();
			setState(78);
			match(R_ANGLE_BRACKET);
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
	public static class DeriveDeclarationContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JavaRefactorParser.EXTENDS, 0); }
		public List<JavaTypeContext> javaType() {
			return getRuleContexts(JavaTypeContext.class);
		}
		public JavaTypeContext javaType(int i) {
			return getRuleContext(JavaTypeContext.class,i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaRefactorParser.IMPLEMENTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaRefactorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaRefactorParser.COMMA, i);
		}
		public DeriveDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriveDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterDeriveDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitDeriveDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitDeriveDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeriveDeclarationContext deriveDeclaration() throws RecognitionException {
		DeriveDeclarationContext _localctx = new DeriveDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deriveDeclaration);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(EXTENDS);
				setState(81);
				javaType();
				}
				break;
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(IMPLEMENTS);
				setState(83);
				javaType();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					javaType();
					}
					}
					setState(90);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(JavaRefactorParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(JavaRefactorParser.R_BRACE, 0); }
		public List<GlobalVariableDeclarationContext> globalVariableDeclaration() {
			return getRuleContexts(GlobalVariableDeclarationContext.class);
		}
		public GlobalVariableDeclarationContext globalVariableDeclaration(int i) {
			return getRuleContext(GlobalVariableDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(L_BRACE);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					globalVariableDeclaration();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281684222148736L) != 0)) {
				{
				{
				setState(100);
				methodDeclaration();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(R_BRACE);
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
	public static class GlobalVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JavaRefactorParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaRefactorParser.FINAL, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaRefactorParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaRefactorParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaRefactorParser.PROTECTED, 0); }
		public GlobalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterGlobalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitGlobalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitGlobalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableDeclarationContext globalVariableDeclaration() throws RecognitionException {
		GlobalVariableDeclarationContext _localctx = new GlobalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_globalVariableDeclaration);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
					{
					setState(108);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(111);
				match(STATIC);
				setState(112);
				match(FINAL);
				setState(113);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
					{
					setState(114);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC || _la==FINAL) {
					{
					setState(117);
					_la = _input.LA(1);
					if ( !(_la==STATIC || _la==FINAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(120);
				variableDeclaration();
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JavaRefactorParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaRefactorParser.FINAL, 0); }
		public JavaTypeContext javaType() {
			return getRuleContext(JavaTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaRefactorParser.ID, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public AnnotationDeclarationContext annotationDeclaration() {
			return getRuleContext(AnnotationDeclarationContext.class,0);
		}
		public ExceptionDeclarationContext exceptionDeclaration() {
			return getRuleContext(ExceptionDeclarationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaRefactorParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaRefactorParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaRefactorParser.PROTECTED, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT_SYMBOL) {
					{
					setState(123);
					annotationDeclaration();
					}
				}

				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
					{
					setState(126);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(129);
				match(STATIC);
				setState(130);
				match(FINAL);
				setState(131);
				javaType();
				setState(132);
				match(ID);
				setState(133);
				methodArguments();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(134);
					exceptionDeclaration();
					}
				}

				setState(137);
				methodBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT_SYMBOL) {
					{
					setState(139);
					annotationDeclaration();
					}
				}

				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
					{
					setState(142);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC || _la==FINAL) {
					{
					setState(145);
					_la = _input.LA(1);
					if ( !(_la==STATIC || _la==FINAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(148);
				javaType();
				setState(149);
				match(ID);
				setState(150);
				methodArguments();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(151);
					exceptionDeclaration();
					}
				}

				setState(154);
				methodBody();
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
	public static class AnnotationDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> AT_SYMBOL() { return getTokens(JavaRefactorParser.AT_SYMBOL); }
		public TerminalNode AT_SYMBOL(int i) {
			return getToken(JavaRefactorParser.AT_SYMBOL, i);
		}
		public List<TerminalNode> ID() { return getTokens(JavaRefactorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaRefactorParser.ID, i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(JavaRefactorParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(JavaRefactorParser.NEW_LINE, i);
		}
		public AnnotationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterAnnotationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitAnnotationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitAnnotationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationDeclarationContext annotationDeclaration() throws RecognitionException {
		AnnotationDeclarationContext _localctx = new AnnotationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_annotationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(AT_SYMBOL);
			setState(159);
			match(ID);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(160);
				match(NEW_LINE);
				setState(161);
				match(AT_SYMBOL);
				setState(162);
				match(ID);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodArgumentsContext extends ParserRuleContext {
		public TerminalNode L_PARENTHESIS() { return getToken(JavaRefactorParser.L_PARENTHESIS, 0); }
		public TerminalNode R_PARENTHESIS() { return getToken(JavaRefactorParser.R_PARENTHESIS, 0); }
		public List<JavaTypeContext> javaType() {
			return getRuleContexts(JavaTypeContext.class);
		}
		public JavaTypeContext javaType(int i) {
			return getRuleContext(JavaTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JavaRefactorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaRefactorParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaRefactorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaRefactorParser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterMethodArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitMethodArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodArguments);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(L_PARENTHESIS);
				setState(169);
				match(R_PARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(L_PARENTHESIS);
				setState(171);
				javaType();
				setState(172);
				match(ID);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173);
					match(COMMA);
					setState(174);
					javaType();
					setState(175);
					match(ID);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(R_PARENTHESIS);
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
	public static class ExceptionDeclarationContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(JavaRefactorParser.THROWS, 0); }
		public List<JavaTypeContext> javaType() {
			return getRuleContexts(JavaTypeContext.class);
		}
		public JavaTypeContext javaType(int i) {
			return getRuleContext(JavaTypeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(JavaRefactorParser.COMMA, 0); }
		public ExceptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterExceptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitExceptionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitExceptionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionDeclarationContext exceptionDeclaration() throws RecognitionException {
		ExceptionDeclarationContext _localctx = new ExceptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exceptionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(THROWS);
			setState(187);
			javaType();
			{
			setState(188);
			match(COMMA);
			setState(189);
			javaType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(JavaRefactorParser.L_BRACE, 0); }
		public CodeSnippetsContext codeSnippets() {
			return getRuleContext(CodeSnippetsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(JavaRefactorParser.R_BRACE, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(L_BRACE);
			setState(192);
			codeSnippets();
			setState(193);
			match(R_BRACE);
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
	public static class CodeSnippetsContext extends ParserRuleContext {
		public List<LocalVariableDeclarationContext> localVariableDeclaration() {
			return getRuleContexts(LocalVariableDeclarationContext.class);
		}
		public LocalVariableDeclarationContext localVariableDeclaration(int i) {
			return getRuleContext(LocalVariableDeclarationContext.class,i);
		}
		public List<OtherStatementsContext> otherStatements() {
			return getRuleContexts(OtherStatementsContext.class);
		}
		public OtherStatementsContext otherStatements(int i) {
			return getRuleContext(OtherStatementsContext.class,i);
		}
		public CodeSnippetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeSnippets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterCodeSnippets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitCodeSnippets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitCodeSnippets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeSnippetsContext codeSnippets() throws RecognitionException {
		CodeSnippetsContext _localctx = new CodeSnippetsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codeSnippets);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281614563147776L) != 0)) {
					{
					{
					setState(195);
					localVariableDeclaration();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RETURN || _la==STRING_LITERAL) {
					{
					{
					setState(201);
					otherStatements();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(JavaRefactorParser.FINAL, 0); }
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(209);
				match(FINAL);
				}
			}

			setState(212);
			variableDeclaration();
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
	public static class OtherStatementsContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(JavaRefactorParser.STRING_LITERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaRefactorParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(JavaRefactorParser.RETURN, 0); }
		public TerminalNode NULL() { return getToken(JavaRefactorParser.NULL, 0); }
		public OtherStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterOtherStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitOtherStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitOtherStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherStatementsContext otherStatements() throws RecognitionException {
		OtherStatementsContext _localctx = new OtherStatementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_otherStatements);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(STRING_LITERAL);
				setState(215);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(RETURN);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL || _la==STRING_LITERAL) {
					{
					setState(217);
					_la = _input.LA(1);
					if ( !(_la==NULL || _la==STRING_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(220);
				match(SEMICOLON);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public JavaTypeContext javaType() {
			return getRuleContext(JavaTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaRefactorParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaRefactorParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaRefactorParser.ASSIGN, 0); }
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDeclaration);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				javaType();
				setState(224);
				match(ID);
				setState(225);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				javaType();
				setState(228);
				match(ID);
				setState(229);
				match(ASSIGN);
				setState(230);
				stringValue();
				setState(231);
				match(SEMICOLON);
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
	public static class JavaTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(JavaRefactorParser.VOID, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(JavaRefactorParser.ARRAY_TYPE, 0); }
		public JavaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterJavaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitJavaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitJavaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaTypeContext javaType() throws RecognitionException {
		JavaTypeContext _localctx = new JavaTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_javaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==ARRAY_TYPE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTA() { return getTokens(JavaRefactorParser.DOUBLE_QUOTA); }
		public TerminalNode DOUBLE_QUOTA(int i) {
			return getToken(JavaRefactorParser.DOUBLE_QUOTA, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(JavaRefactorParser.STRING_LITERAL, 0); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaRefactorListener ) ((JavaRefactorListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaRefactorVisitor ) return ((JavaRefactorVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(DOUBLE_QUOTA);
			setState(238);
			match(STRING_LITERAL);
			setState(239);
			match(DOUBLE_QUOTA);
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
		"\u0004\u00010\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0005\u0000+\b\u0000\n\u0000"+
		"\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0003\u0003"+
		"\u0003@\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003"+
		"\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005W\b\u0005"+
		"\n\u0005\f\u0005Z\t\u0005\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0005\u0006`\b\u0006\n\u0006\f\u0006c\t\u0006\u0001\u0006\u0005\u0006"+
		"f\b\u0006\n\u0006\f\u0006i\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007n\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007t\b\u0007\u0001\u0007\u0003\u0007w\b\u0007\u0001\u0007\u0003"+
		"\u0007z\b\u0007\u0001\b\u0003\b}\b\b\u0001\b\u0003\b\u0080\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0088\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008d\b\b\u0001\b\u0003\b\u0090\b\b\u0001\b\u0003\b"+
		"\u0093\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0099\b\b\u0001\b\u0001"+
		"\b\u0003\b\u009d\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a4"+
		"\b\t\n\t\f\t\u00a7\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00b2\b\n\n\n\f\n\u00b5\t\n\u0001\n\u0001"+
		"\n\u0003\n\u00b9\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0005\r\u00c5\b\r\n\r\f"+
		"\r\u00c8\t\r\u0001\r\u0005\r\u00cb\b\r\n\r\f\r\u00ce\t\r\u0003\r\u00d0"+
		"\b\r\u0001\u000e\u0003\u000e\u00d3\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00db\b\u000f\u0001"+
		"\u000f\u0003\u000f\u00de\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00ea\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0005\u0001\u0000\u001b\u001d\u0002\u0000##%%\u0001\u0000$"+
		"%\u0002\u0000  //\u0002\u0000\u001f\u001f00\u00fe\u0000\'\u0001\u0000"+
		"\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000"+
		"\u0006<\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\n[\u0001\u0000"+
		"\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000"+
		"\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u009e\u0001\u0000\u0000\u0000"+
		"\u0014\u00b8\u0001\u0000\u0000\u0000\u0016\u00ba\u0001\u0000\u0000\u0000"+
		"\u0018\u00bf\u0001\u0000\u0000\u0000\u001a\u00cf\u0001\u0000\u0000\u0000"+
		"\u001c\u00d2\u0001\u0000\u0000\u0000\u001e\u00dd\u0001\u0000\u0000\u0000"+
		" \u00e9\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000\u0000\u0000$\u00ed"+
		"\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(,\u0001\u0000\u0000\u0000)+\u0003\u0004"+
		"\u0002\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000/0\u0003\u0006\u0003\u000001\u0001\u0000\u0000"+
		"\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000\u0000\u000034\u0005"+
		"*\u0000\u000045\u0005.\u0000\u000056\u0005\u0006\u0000\u00006\u0003\u0001"+
		"\u0000\u0000\u000078\u0005+\u0000\u000089\u0005.\u0000\u00009:\u0005\u0006"+
		"\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;=\u0007\u0000\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000>@\u0007\u0001\u0000\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005&\u0000\u0000BD\u0005-\u0000"+
		"\u0000CE\u0003\b\u0004\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EG\u0001\u0000\u0000\u0000FH\u0003\n\u0005\u0000GF\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0003\f\u0006"+
		"\u0000J\u0007\u0001\u0000\u0000\u0000KL\u0003\"\u0011\u0000LM\u0005\u0019"+
		"\u0000\u0000MN\u0003\"\u0011\u0000NO\u0005\u001a\u0000\u0000O\t\u0001"+
		"\u0000\u0000\u0000PQ\u0005!\u0000\u0000Q\\\u0003\"\u0011\u0000RS\u0005"+
		"\"\u0000\u0000SX\u0003\"\u0011\u0000TU\u0005\u0005\u0000\u0000UW\u0003"+
		"\"\u0011\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[P\u0001\u0000\u0000\u0000[R\u0001\u0000\u0000"+
		"\u0000\\\u000b\u0001\u0000\u0000\u0000]a\u0005\u0017\u0000\u0000^`\u0003"+
		"\u000e\u0007\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bg\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000df\u0003\u0010\b\u0000ed\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005"+
		"\u0018\u0000\u0000k\r\u0001\u0000\u0000\u0000ln\u0007\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000op\u0005$\u0000\u0000pq\u0005%\u0000\u0000qz\u0003 \u0010\u0000"+
		"rt\u0007\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tv\u0001\u0000\u0000\u0000uw\u0007\u0002\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0003"+
		" \u0010\u0000ym\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000z\u000f"+
		"\u0001\u0000\u0000\u0000{}\u0003\u0012\t\u0000|{\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~\u0080\u0007"+
		"\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005$\u0000"+
		"\u0000\u0082\u0083\u0005%\u0000\u0000\u0083\u0084\u0003\"\u0011\u0000"+
		"\u0084\u0085\u0005-\u0000\u0000\u0085\u0087\u0003\u0014\n\u0000\u0086"+
		"\u0088\u0003\u0016\u000b\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0003\u0018\f\u0000\u008a\u009d\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0003\u0012\t\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0090\u0007"+
		"\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0093\u0007"+
		"\u0002\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0003"+
		"\"\u0011\u0000\u0095\u0096\u0005-\u0000\u0000\u0096\u0098\u0003\u0014"+
		"\n\u0000\u0097\u0099\u0003\u0016\u000b\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0003\u0018\f\u0000\u009b\u009d\u0001\u0000\u0000\u0000"+
		"\u009c|\u0001\u0000\u0000\u0000\u009c\u008c\u0001\u0000\u0000\u0000\u009d"+
		"\u0011\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f"+
		"\u00a5\u0005-\u0000\u0000\u00a0\u00a1\u0005\u0003\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0007\u0000\u0000\u00a2\u00a4\u0005-\u0000\u0000\u00a3\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0013\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0013\u0000\u0000\u00a9\u00b9\u0005\u0014\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0013\u0000\u0000\u00ab\u00ac\u0003\"\u0011\u0000\u00ac\u00b3\u0005-"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0005\u0000\u0000\u00ae\u00af\u0003\"\u0011"+
		"\u0000\u00af\u00b0\u0005-\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0014\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b8\u00a8\u0001\u0000\u0000\u0000\u00b8\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005,\u0000\u0000\u00bb"+
		"\u00bc\u0003\"\u0011\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000\u00bd\u00be"+
		"\u0003\"\u0011\u0000\u00be\u0017\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0017\u0000\u0000\u00c0\u00c1\u0003\u001a\r\u0000\u00c1\u00c2\u0005\u0018"+
		"\u0000\u0000\u00c2\u0019\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\u001c"+
		"\u000e\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00d0\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u0003\u001e\u000f\u0000\u00ca\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u001b\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d3\u0005%\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u001d\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005/\u0000\u0000\u00d7\u00de\u0005\u0006\u0000\u0000\u00d8"+
		"\u00da\u0005)\u0000\u0000\u00d9\u00db\u0007\u0003\u0000\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00de\u0005\u0006\u0000\u0000\u00dd\u00d6"+
		"\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000\u0000\u00de\u001f"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0003\"\u0011\u0000\u00e0\u00e1\u0005"+
		"-\u0000\u0000\u00e1\u00e2\u0005\u0006\u0000\u0000\u00e2\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0003\"\u0011\u0000\u00e4\u00e5\u0005-\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0012\u0000\u0000\u00e6\u00e7\u0003$\u0012\u0000"+
		"\u00e7\u00e8\u0005\u0006\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e9\u00df\u0001\u0000\u0000\u0000\u00e9\u00e3\u0001\u0000\u0000\u0000"+
		"\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00ec\u0007\u0004\u0000\u0000\u00ec"+
		"#\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u000e\u0000\u0000\u00ee\u00ef"+
		"\u0005/\u0000\u0000\u00ef\u00f0\u0005\u000e\u0000\u0000\u00f0%\u0001\u0000"+
		"\u0000\u0000 \',<?DGX[agmsvy|\u007f\u0087\u008c\u008f\u0092\u0098\u009c"+
		"\u00a5\u00b3\u00b8\u00c6\u00cc\u00cf\u00d2\u00da\u00dd\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}