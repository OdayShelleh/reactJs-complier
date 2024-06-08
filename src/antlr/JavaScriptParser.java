// Generated from D:/temp/reactJs-complier/src/antlr/JavaScriptParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpenBracket=1, CloseBracket=2, OpenParen=3, CloseParen=4, OpenBrace=5, 
		CloseBrace=6, SemiColon=7, Comma=8, Assign=9, QuestionMark=10, Colon=11, 
		Dot=12, Plus=13, Minus=14, Not=15, Multiply=16, Divide=17, LessThan=18, 
		MoreThan=19, LessThanEquals=20, GreaterThanEquals=21, Equals=22, NotEquals=23, 
		And=24, Or=25, ARROW=26, Modulus=27, Let=28, If=29, Else=30, While=31, 
		Break=32, Continue=33, Function=34, Return=35, New=36, Import=37, From=38, 
		Export=39, Default=40, NullLiteral=41, BooleanLiteral=42, StringLiteral=43, 
		NumberLiteral=44, Identifier=45, WhiteSpaces=46, LineTerminator=47, JsxComment=48, 
		MultiLineComment=49, SingleLineComment=50, Catch=51, Finally=52, This=53, 
		Throw=54, Try=55, UseState=56, Modules=57;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_if = 2, RULE_elseif = 3, RULE_else = 4, 
		RULE_expression = 5, RULE_jsxElement = 6, RULE_jsxContentNode = 7, RULE_htmlAttribute = 8, 
		RULE_htmlAttributeValue = 9, RULE_eos = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "if", "elseif", "else", "expression", "jsxElement", 
			"jsxContentNode", "htmlAttribute", "htmlAttributeValue", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", 
			"'?'", "':'", "'.'", "'+'", "'-'", "'!'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'=>'", "'%'", "'let'", 
			"'if'", "'else'", "'while'", "'break'", "'continue'", "'function'", "'return'", 
			"'new'", "'import'", "'from'", "'export'", "'default'", "'null'", null, 
			null, null, null, null, null, null, null, null, "'catch'", "'finally'", 
			"'this'", "'throw'", "'try'", "'useState'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
			"Dot", "Plus", "Minus", "Not", "Multiply", "Divide", "LessThan", "MoreThan", 
			"LessThanEquals", "GreaterThanEquals", "Equals", "NotEquals", "And", 
			"Or", "ARROW", "Modulus", "Let", "If", "Else", "While", "Break", "Continue", 
			"Function", "Return", "New", "Import", "From", "Export", "Default", "NullLiteral", 
			"BooleanLiteral", "StringLiteral", "NumberLiteral", "Identifier", "WhiteSpaces", 
			"LineTerminator", "JsxComment", "MultiLineComment", "SingleLineComment", 
			"Catch", "Finally", "This", "Throw", "Try", "UseState", "Modules"
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
	public String getGrammarFileName() { return "JavaScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaScriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68993012760618L) != 0)) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode Break() { return getToken(JavaScriptParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends StatementContext {
		public TerminalNode Export() { return getToken(JavaScriptParser.Export, 0); }
		public TerminalNode Default() { return getToken(JavaScriptParser.Default, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationStatementContext extends StatementContext {
		public TerminalNode Let() { return getToken(JavaScriptParser.Let, 0); }
		public TerminalNode OpenBracket() { return getToken(JavaScriptParser.OpenBracket, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JavaScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaScriptParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaScriptParser.Comma, i);
		}
		public TerminalNode CloseBracket() { return getToken(JavaScriptParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(JavaScriptParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ArrayDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrayDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrayDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitArrayDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStatementContext extends StatementContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public ConditionalStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode Return() { return getToken(JavaScriptParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends StatementContext {
		public TerminalNode Let() { return getToken(JavaScriptParser.Let, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(JavaScriptParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDectarationStatementContext extends StatementContext {
		public TerminalNode Function() { return getToken(JavaScriptParser.Function, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JavaScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaScriptParser.Identifier, i);
		}
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaScriptParser.Comma, i);
		}
		public FunctionDectarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFunctionDectarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFunctionDectarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitFunctionDectarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends StatementContext {
		public TerminalNode While() { return getToken(JavaScriptParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends StatementContext {
		public TerminalNode Import() { return getToken(JavaScriptParser.Import, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public TerminalNode From() { return getToken(JavaScriptParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaScriptParser.StringLiteral, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends StatementContext {
		public TerminalNode Continue() { return getToken(JavaScriptParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(Let);
				setState(31);
				match(Identifier);
				setState(32);
				match(Assign);
				setState(33);
				expression(0);
				setState(34);
				eos();
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(Let);
				setState(37);
				match(OpenBracket);
				setState(38);
				match(Identifier);
				setState(39);
				match(Comma);
				setState(40);
				match(Identifier);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(41);
					match(Comma);
					setState(42);
					match(Identifier);
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				match(CloseBracket);
				setState(49);
				match(Assign);
				setState(50);
				expression(0);
				setState(51);
				eos();
				}
				break;
			case 3:
				_localctx = new ConditionalStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				if_();
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(54);
						elseif();
						}
						} 
					}
					setState(59);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(60);
					else_();
					}
				}

				}
				break;
			case 4:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(While);
				setState(64);
				match(OpenParen);
				setState(65);
				expression(0);
				setState(66);
				match(CloseParen);
				setState(67);
				match(OpenBrace);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68993012760618L) != 0)) {
					{
					{
					setState(68);
					statement();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(CloseBrace);
				}
				break;
			case 5:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(Break);
				setState(77);
				eos();
				}
				break;
			case 6:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				match(Continue);
				setState(79);
				eos();
				}
				break;
			case 7:
				_localctx = new FunctionDectarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				match(Function);
				setState(81);
				match(Identifier);
				setState(82);
				match(OpenParen);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(83);
					match(Identifier);
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(84);
						match(Comma);
						setState(85);
						match(Identifier);
						}
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(93);
				match(CloseParen);
				setState(94);
				match(OpenBrace);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68993012760618L) != 0)) {
					{
					{
					setState(95);
					statement();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(CloseBrace);
				}
				break;
			case 8:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				match(Return);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68255620562986L) != 0)) {
					{
					setState(103);
					expression(0);
					}
				}

				setState(106);
				eos();
				}
				break;
			case 9:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				expression(0);
				setState(108);
				eos();
				}
				break;
			case 10:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				match(Import);
				setState(111);
				match(Identifier);
				setState(112);
				match(From);
				setState(113);
				match(StringLiteral);
				setState(114);
				eos();
				}
				break;
			case 11:
				_localctx = new ExportStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(115);
				match(Export);
				setState(116);
				match(Default);
				setState(117);
				match(Identifier);
				setState(118);
				eos();
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JavaScriptParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(If);
			setState(122);
			match(OpenParen);
			setState(123);
			expression(0);
			setState(124);
			match(CloseParen);
			setState(125);
			match(OpenBrace);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68993012760618L) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(CloseBrace);
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
	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JavaScriptParser.Else, 0); }
		public TerminalNode If() { return getToken(JavaScriptParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(Else);
			setState(135);
			match(If);
			setState(136);
			match(OpenParen);
			setState(137);
			expression(0);
			setState(138);
			match(CloseParen);
			setState(139);
			match(OpenBrace);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68993012760618L) != 0)) {
				{
				{
				setState(140);
				statement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(CloseBrace);
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JavaScriptParser.Else, 0); }
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(Else);
			setState(149);
			match(OpenBrace);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68993012760618L) != 0)) {
				{
				{
				setState(150);
				statement();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(CloseBrace);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(JavaScriptParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(JavaScriptParser.Colon, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(JavaScriptParser.And, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionStatementContext extends ExpressionContext {
		public TerminalNode Not() { return getToken(JavaScriptParser.Not, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNotExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNotExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitNotExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDotPropertyExpressionContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaScriptParser.Identifier, i);
		}
		public TerminalNode Dot() { return getToken(JavaScriptParser.Dot, 0); }
		public ObjectDotPropertyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterObjectDotPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitObjectDotPropertyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitObjectDotPropertyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralExpressionContext extends ExpressionContext {
		public TerminalNode StringLiteral() { return getToken(JavaScriptParser.StringLiteral, 0); }
		public StringLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterStringLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitStringLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExpressionContext extends ExpressionContext {
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JavaScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaScriptParser.Identifier, i);
		}
		public List<TerminalNode> Colon() { return getTokens(JavaScriptParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(JavaScriptParser.Colon, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaScriptParser.Comma, i);
		}
		public ObjectLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(JavaScriptParser.Or, 0); }
		public LogicalOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessOrEqualComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThanEquals() { return getToken(JavaScriptParser.LessThanEquals, 0); }
		public LessOrEqualComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLessOrEqualComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLessOrEqualComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitLessOrEqualComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaScriptParser.Comma, i);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(JavaScriptParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralExpressionContext extends ExpressionContext {
		public TerminalNode BooleanLiteral() { return getToken(JavaScriptParser.BooleanLiteral, 0); }
		public BooleanLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterBooleanLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitBooleanLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitBooleanLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(JavaScriptParser.Equals, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralExpressionContext extends ExpressionContext {
		public TerminalNode NullLiteral() { return getToken(JavaScriptParser.NullLiteral, 0); }
		public NullLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNullLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNullLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitNullLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralExpressionContext extends ExpressionContext {
		public TerminalNode NumberLiteral() { return getToken(JavaScriptParser.NumberLiteral, 0); }
		public NumberLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNumberLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNumberLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitNumberLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(JavaScriptParser.Plus, 0); }
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoreOrEqualComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GreaterThanEquals() { return getToken(JavaScriptParser.GreaterThanEquals, 0); }
		public MoreOrEqualComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMoreOrEqualComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMoreOrEqualComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitMoreOrEqualComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Modules() { return getToken(JavaScriptParser.Modules, 0); }
		public ModulusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterModulusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitModulusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitModulusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ExpressionContext {
		public TerminalNode New() { return getToken(JavaScriptParser.New, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaScriptParser.Comma, i);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoreComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MoreThan() { return getToken(JavaScriptParser.MoreThan, 0); }
		public MoreComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMoreComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMoreComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitMoreComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(JavaScriptParser.Multiply, 0); }
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralExpressionContext extends ExpressionContext {
		public TerminalNode OpenBracket() { return getToken(JavaScriptParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(JavaScriptParser.CloseBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaScriptParser.Comma, i);
		}
		public ArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitArrayLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberIndexExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public TerminalNode OpenBracket() { return getToken(JavaScriptParser.OpenBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(JavaScriptParser.CloseBracket, 0); }
		public MemberIndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMemberIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitMemberIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnonFunctionExpressionContext extends ExpressionContext {
		public TerminalNode Function() { return getToken(JavaScriptParser.Function, 0); }
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JavaScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaScriptParser.Identifier, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaScriptParser.Comma, i);
		}
		public AnonFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterAnonFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitAnonFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitAnonFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Minus() { return getToken(JavaScriptParser.Minus, 0); }
		public SubtractionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSubtractionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSubtractionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitSubtractionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDotFunctionCallExpressionContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaScriptParser.Identifier, i);
		}
		public TerminalNode Dot() { return getToken(JavaScriptParser.Dot, 0); }
		public TerminalNode OpenParen() { return getToken(JavaScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JavaScriptParser.CloseParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaScriptParser.Comma, i);
		}
		public ObjectDotFunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterObjectDotFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitObjectDotFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitObjectDotFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Divide() { return getToken(JavaScriptParser.Divide, 0); }
		public DivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonEqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NotEquals() { return getToken(JavaScriptParser.NotEquals, 0); }
		public NonEqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNonEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNonEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitNonEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAssignmentExpressionContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaScriptParser.Identifier, i);
		}
		public TerminalNode Dot() { return getToken(JavaScriptParser.Dot, 0); }
		public TerminalNode Assign() { return getToken(JavaScriptParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberAssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterMemberAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitMemberAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitMemberAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(JavaScriptParser.LessThan, 0); }
		public LessComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterLessComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitLessComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitLessComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementExpressionContext extends ExpressionContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public JsxElementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterJsxElementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitJsxElementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitJsxElementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new MemberIndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159);
				match(Identifier);
				setState(160);
				match(OpenBracket);
				setState(161);
				expression(0);
				setState(162);
				match(CloseBracket);
				}
				break;
			case 2:
				{
				_localctx = new ObjectDotPropertyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(Identifier);
				setState(165);
				match(Dot);
				setState(166);
				match(Identifier);
				}
				break;
			case 3:
				{
				_localctx = new MemberAssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(Identifier);
				setState(168);
				match(Dot);
				setState(169);
				match(Identifier);
				setState(170);
				match(Assign);
				setState(171);
				expression(30);
				}
				break;
			case 4:
				{
				_localctx = new ObjectDotFunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(Identifier);
				setState(173);
				match(Dot);
				setState(174);
				match(Identifier);
				setState(175);
				match(OpenParen);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68255620562986L) != 0)) {
					{
					setState(176);
					expression(0);
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(177);
						match(Comma);
						setState(178);
						expression(0);
						}
						}
						setState(183);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(186);
				match(CloseParen);
				}
				break;
			case 5:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(New);
				setState(188);
				match(Identifier);
				setState(189);
				match(OpenParen);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68255620562986L) != 0)) {
					{
					setState(190);
					expression(0);
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(191);
						match(Comma);
						setState(192);
						expression(0);
						}
						}
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(200);
				match(CloseParen);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(Identifier);
				setState(202);
				match(OpenParen);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68255620562986L) != 0)) {
					{
					setState(203);
					expression(0);
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(204);
						match(Comma);
						setState(205);
						expression(0);
						}
						}
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(213);
				match(CloseParen);
				}
				break;
			case 7:
				{
				_localctx = new AnonFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(Function);
				setState(215);
				match(OpenParen);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(216);
					match(Identifier);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(217);
						match(Comma);
						setState(218);
						match(Identifier);
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(226);
				match(CloseParen);
				setState(227);
				match(OpenBrace);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68993012760618L) != 0)) {
					{
					{
					setState(228);
					statement();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(CloseBrace);
				}
				break;
			case 8:
				{
				_localctx = new NotExpressionStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(Not);
				setState(236);
				expression(25);
				}
				break;
			case 9:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(OpenParen);
				setState(238);
				expression(0);
				setState(239);
				match(CloseParen);
				}
				break;
			case 10:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(Identifier);
				}
				break;
			case 11:
				{
				_localctx = new NullLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(NullLiteral);
				}
				break;
			case 12:
				{
				_localctx = new BooleanLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(BooleanLiteral);
				}
				break;
			case 13:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(StringLiteral);
				}
				break;
			case 14:
				{
				_localctx = new NumberLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(NumberLiteral);
				}
				break;
			case 15:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(OpenBracket);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68255620562986L) != 0)) {
					{
					setState(247);
					expression(0);
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(248);
						match(Comma);
						setState(249);
						expression(0);
						}
						}
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(257);
				match(CloseBracket);
				}
				break;
			case 16:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(OpenBrace);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(259);
					match(Identifier);
					setState(260);
					match(Colon);
					setState(261);
					expression(0);
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(262);
							match(Comma);
							setState(263);
							match(Identifier);
							setState(264);
							match(Colon);
							setState(265);
							expression(0);
							}
							} 
						}
						setState(270);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(271);
						match(Comma);
						}
					}

					}
				}

				setState(276);
				match(CloseBrace);
				}
				break;
			case 17:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(Identifier);
				setState(278);
				match(Assign);
				setState(279);
				expression(2);
				}
				break;
			case 18:
				{
				_localctx = new JsxElementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				jsxElement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ModulusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(284);
						match(Modules);
						setState(285);
						expression(24);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(287);
						match(Multiply);
						setState(288);
						expression(23);
						}
						break;
					case 3:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(290);
						match(Divide);
						setState(291);
						expression(22);
						}
						break;
					case 4:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(293);
						match(Plus);
						setState(294);
						expression(21);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(296);
						match(Minus);
						setState(297);
						expression(20);
						}
						break;
					case 6:
						{
						_localctx = new LessComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(299);
						match(LessThan);
						setState(300);
						expression(19);
						}
						break;
					case 7:
						{
						_localctx = new MoreComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(302);
						match(MoreThan);
						setState(303);
						expression(18);
						}
						break;
					case 8:
						{
						_localctx = new LessOrEqualComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(305);
						match(LessThanEquals);
						setState(306);
						expression(17);
						}
						break;
					case 9:
						{
						_localctx = new MoreOrEqualComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(308);
						match(GreaterThanEquals);
						setState(309);
						expression(16);
						}
						break;
					case 10:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(311);
						match(Equals);
						setState(312);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new NonEqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(314);
						match(NotEquals);
						setState(315);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(317);
						match(And);
						setState(318);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(320);
						match(Or);
						setState(321);
						expression(12);
						}
						break;
					case 14:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(323);
						match(QuestionMark);
						setState(324);
						expression(0);
						setState(325);
						match(Colon);
						setState(326);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
	 
		public JsxElementContext() { }
		public void copyFrom(JsxElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingHTMLElementContext extends JsxElementContext {
		public TerminalNode LessThan() { return getToken(JavaScriptParser.LessThan, 0); }
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public TerminalNode Divide() { return getToken(JavaScriptParser.Divide, 0); }
		public TerminalNode MoreThan() { return getToken(JavaScriptParser.MoreThan, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public SelfClosingHTMLElementContext(JsxElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterSelfClosingHTMLElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitSelfClosingHTMLElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitSelfClosingHTMLElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FragmentHTMLElementContext extends JsxElementContext {
		public List<TerminalNode> LessThan() { return getTokens(JavaScriptParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(JavaScriptParser.LessThan, i);
		}
		public List<TerminalNode> MoreThan() { return getTokens(JavaScriptParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(JavaScriptParser.MoreThan, i);
		}
		public TerminalNode Divide() { return getToken(JavaScriptParser.Divide, 0); }
		public List<JsxContentNodeContext> jsxContentNode() {
			return getRuleContexts(JsxContentNodeContext.class);
		}
		public JsxContentNodeContext jsxContentNode(int i) {
			return getRuleContext(JsxContentNodeContext.class,i);
		}
		public FragmentHTMLElementContext(JsxElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterFragmentHTMLElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitFragmentHTMLElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitFragmentHTMLElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalHTMLElementContext extends JsxElementContext {
		public List<TerminalNode> LessThan() { return getTokens(JavaScriptParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(JavaScriptParser.LessThan, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaScriptParser.Identifier, i);
		}
		public List<TerminalNode> MoreThan() { return getTokens(JavaScriptParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(JavaScriptParser.MoreThan, i);
		}
		public TerminalNode Divide() { return getToken(JavaScriptParser.Divide, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<JsxContentNodeContext> jsxContentNode() {
			return getRuleContexts(JsxContentNodeContext.class);
		}
		public JsxContentNodeContext jsxContentNode(int i) {
			return getRuleContext(JsxContentNodeContext.class,i);
		}
		public NormalHTMLElementContext(JsxElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterNormalHTMLElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitNormalHTMLElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitNormalHTMLElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jsxElement);
		int _la;
		try {
			int _alt;
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new FragmentHTMLElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(LessThan);
				setState(334);
				match(MoreThan);
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(335);
						jsxContentNode();
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(341);
				match(LessThan);
				setState(342);
				match(Divide);
				setState(343);
				match(MoreThan);
				}
				break;
			case 2:
				_localctx = new NormalHTMLElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(LessThan);
				setState(345);
				match(Identifier);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(346);
					htmlAttribute();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				match(MoreThan);
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(353);
						jsxContentNode();
						}
						} 
					}
					setState(358);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(359);
				match(LessThan);
				setState(360);
				match(Divide);
				setState(361);
				match(Identifier);
				setState(362);
				match(MoreThan);
				}
				break;
			case 3:
				_localctx = new SelfClosingHTMLElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(LessThan);
				setState(364);
				match(Identifier);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(365);
					htmlAttribute();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				match(Divide);
				setState(372);
				match(MoreThan);
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
	public static class JsxContentNodeContext extends ParserRuleContext {
		public JsxContentNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxContentNode; }
	 
		public JsxContentNodeContext() { }
		public void copyFrom(JsxContentNodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxExpressionContentNodeContext extends JsxContentNodeContext {
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public JsxExpressionContentNodeContext(JsxContentNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterJsxExpressionContentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitJsxExpressionContentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitJsxExpressionContentNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharDataContentNodeContext extends JsxContentNodeContext {
		public List<TerminalNode> OpenBrace() { return getTokens(JavaScriptParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(JavaScriptParser.OpenBrace, i);
		}
		public List<TerminalNode> LessThan() { return getTokens(JavaScriptParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(JavaScriptParser.LessThan, i);
		}
		public CharDataContentNodeContext(JsxContentNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterCharDataContentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitCharDataContentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitCharDataContentNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLElementContentNodeContext extends JsxContentNodeContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public HTMLElementContentNodeContext(JsxContentNodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterHTMLElementContentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitHTMLElementContentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitHTMLElementContentNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxContentNodeContext jsxContentNode() throws RecognitionException {
		JsxContentNodeContext _localctx = new JsxContentNodeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jsxContentNode);
		int _la;
		try {
			int _alt;
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
			case CloseBracket:
			case OpenParen:
			case CloseParen:
			case CloseBrace:
			case SemiColon:
			case Comma:
			case Assign:
			case QuestionMark:
			case Colon:
			case Dot:
			case Plus:
			case Minus:
			case Not:
			case Multiply:
			case Divide:
			case MoreThan:
			case LessThanEquals:
			case GreaterThanEquals:
			case Equals:
			case NotEquals:
			case And:
			case Or:
			case ARROW:
			case Modulus:
			case Let:
			case If:
			case Else:
			case While:
			case Break:
			case Continue:
			case Function:
			case Return:
			case New:
			case Import:
			case From:
			case Export:
			case Default:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
			case NumberLiteral:
			case Identifier:
			case WhiteSpaces:
			case LineTerminator:
			case JsxComment:
			case MultiLineComment:
			case SingleLineComment:
			case Catch:
			case Finally:
			case This:
			case Throw:
			case Try:
			case UseState:
			case Modules:
				_localctx = new CharDataContentNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(375);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==OpenBrace || _la==LessThan) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(378); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LessThan:
				_localctx = new HTMLElementContentNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				jsxElement();
				}
				break;
			case OpenBrace:
				_localctx = new JsxExpressionContentNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(OpenBrace);
				setState(382);
				expression(0);
				setState(383);
				match(CloseBrace);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaScriptParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(JavaScriptParser.Assign, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(Identifier);
			setState(388);
			match(Assign);
			setState(389);
			htmlAttributeValue();
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
	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
	 
		public HtmlAttributeValueContext() { }
		public void copyFrom(HtmlAttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeValueContext extends HtmlAttributeValueContext {
		public TerminalNode OpenBrace() { return getToken(JavaScriptParser.OpenBrace, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(JavaScriptParser.CloseBrace, 0); }
		public JsxAttributeValueContext(HtmlAttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterJsxAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitJsxAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitJsxAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralAttributeValueContext extends HtmlAttributeValueContext {
		public TerminalNode StringLiteral() { return getToken(JavaScriptParser.StringLiteral, 0); }
		public StringLiteralAttributeValueContext(HtmlAttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterStringLiteralAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitStringLiteralAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitStringLiteralAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlAttributeValue);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				_localctx = new StringLiteralAttributeValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(StringLiteral);
				}
				break;
			case OpenBrace:
				_localctx = new JsxAttributeValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(OpenBrace);
				setState(393);
				expression(0);
				setState(394);
				match(CloseBrace);
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(JavaScriptParser.SemiColon, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaScriptParserListener ) ((JavaScriptParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaScriptParserVisitor ) return ((JavaScriptParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(SemiColon);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0191\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"8\b\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001W\b\u0001\n\u0001"+
		"\f\u0001Z\t\u0001\u0003\u0001\\\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001a\b\u0001\n\u0001\f\u0001d\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001i\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001x\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u0080\b\u0002\n\u0002\f\u0002\u0083\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u008e\b\u0003\n\u0003\f\u0003\u0091"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0098\b\u0004\n\u0004\f\u0004\u009b\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b4\b\u0005\n\u0005"+
		"\f\u0005\u00b7\t\u0005\u0003\u0005\u00b9\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00c2\b\u0005\n\u0005\f\u0005\u00c5\t\u0005\u0003\u0005\u00c7\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00cf\b\u0005\n\u0005\f\u0005\u00d2\t\u0005\u0003\u0005\u00d4"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00dc\b\u0005\n\u0005\f\u0005\u00df\t\u0005\u0003\u0005"+
		"\u00e1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00e6\b"+
		"\u0005\n\u0005\f\u0005\u00e9\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00fb\b\u0005\n\u0005\f\u0005\u00fe\t\u0005\u0003"+
		"\u0005\u0100\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u010b"+
		"\b\u0005\n\u0005\f\u0005\u010e\t\u0005\u0001\u0005\u0003\u0005\u0111\b"+
		"\u0005\u0003\u0005\u0113\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u011a\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u0149\b\u0005\n\u0005\f\u0005\u014c\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0151\b\u0006\n\u0006\f\u0006\u0154"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u015c\b\u0006\n\u0006\f\u0006\u015f\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0163\b\u0006\n\u0006\f\u0006\u0166\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u016f\b\u0006\n\u0006\f\u0006\u0172\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0176\b\u0006\u0001\u0007\u0004\u0007\u0179\b"+
		"\u0007\u000b\u0007\f\u0007\u017a\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0182\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u018d\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0001\n\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0001\u0002\u0000\u0005\u0005\u0012\u0012\u01d2\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0002w\u0001\u0000\u0000\u0000\u0004y\u0001"+
		"\u0000\u0000\u0000\u0006\u0086\u0001\u0000\u0000\u0000\b\u0094\u0001\u0000"+
		"\u0000\u0000\n\u0119\u0001\u0000\u0000\u0000\f\u0175\u0001\u0000\u0000"+
		"\u0000\u000e\u0181\u0001\u0000\u0000\u0000\u0010\u0183\u0001\u0000\u0000"+
		"\u0000\u0012\u018c\u0001\u0000\u0000\u0000\u0014\u018e\u0001\u0000\u0000"+
		"\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000"+
		"\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u001c\u0000"+
		"\u0000\u001f \u0005-\u0000\u0000 !\u0005\t\u0000\u0000!\"\u0003\n\u0005"+
		"\u0000\"#\u0003\u0014\n\u0000#x\u0001\u0000\u0000\u0000$%\u0005\u001c"+
		"\u0000\u0000%&\u0005\u0001\u0000\u0000&\'\u0005-\u0000\u0000\'(\u0005"+
		"\b\u0000\u0000(-\u0005-\u0000\u0000)*\u0005\b\u0000\u0000*,\u0005-\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u000001\u0005\u0002\u0000\u000012\u0005\t\u0000\u000023\u0003"+
		"\n\u0005\u000034\u0003\u0014\n\u00004x\u0001\u0000\u0000\u000059\u0003"+
		"\u0004\u0002\u000068\u0003\u0006\u0003\u000076\u0001\u0000\u0000\u0000"+
		"8;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0003\b\u0004"+
		"\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>x\u0001\u0000"+
		"\u0000\u0000?@\u0005\u001f\u0000\u0000@A\u0005\u0003\u0000\u0000AB\u0003"+
		"\n\u0005\u0000BC\u0005\u0004\u0000\u0000CG\u0005\u0005\u0000\u0000DF\u0003"+
		"\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JK\u0005\u0006\u0000\u0000Kx\u0001\u0000"+
		"\u0000\u0000LM\u0005 \u0000\u0000Mx\u0003\u0014\n\u0000NO\u0005!\u0000"+
		"\u0000Ox\u0003\u0014\n\u0000PQ\u0005\"\u0000\u0000QR\u0005-\u0000\u0000"+
		"R[\u0005\u0003\u0000\u0000SX\u0005-\u0000\u0000TU\u0005\b\u0000\u0000"+
		"UW\u0005-\u0000\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[S\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0004\u0000\u0000^b\u0005"+
		"\u0005\u0000\u0000_a\u0003\u0002\u0001\u0000`_\u0001\u0000\u0000\u0000"+
		"ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ex\u0005\u0006"+
		"\u0000\u0000fh\u0005#\u0000\u0000gi\u0003\n\u0005\u0000hg\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jx\u0003"+
		"\u0014\n\u0000kl\u0003\n\u0005\u0000lm\u0003\u0014\n\u0000mx\u0001\u0000"+
		"\u0000\u0000no\u0005%\u0000\u0000op\u0005-\u0000\u0000pq\u0005&\u0000"+
		"\u0000qr\u0005+\u0000\u0000rx\u0003\u0014\n\u0000st\u0005\'\u0000\u0000"+
		"tu\u0005(\u0000\u0000uv\u0005-\u0000\u0000vx\u0003\u0014\n\u0000w\u001e"+
		"\u0001\u0000\u0000\u0000w$\u0001\u0000\u0000\u0000w5\u0001\u0000\u0000"+
		"\u0000w?\u0001\u0000\u0000\u0000wL\u0001\u0000\u0000\u0000wN\u0001\u0000"+
		"\u0000\u0000wP\u0001\u0000\u0000\u0000wf\u0001\u0000\u0000\u0000wk\u0001"+
		"\u0000\u0000\u0000wn\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000"+
		"x\u0003\u0001\u0000\u0000\u0000yz\u0005\u001d\u0000\u0000z{\u0005\u0003"+
		"\u0000\u0000{|\u0003\n\u0005\u0000|}\u0005\u0004\u0000\u0000}\u0081\u0005"+
		"\u0005\u0000\u0000~\u0080\u0003\u0002\u0001\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0006\u0000"+
		"\u0000\u0085\u0005\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u001e\u0000"+
		"\u0000\u0087\u0088\u0005\u001d\u0000\u0000\u0088\u0089\u0005\u0003\u0000"+
		"\u0000\u0089\u008a\u0003\n\u0005\u0000\u008a\u008b\u0005\u0004\u0000\u0000"+
		"\u008b\u008f\u0005\u0005\u0000\u0000\u008c\u008e\u0003\u0002\u0001\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0006\u0000\u0000\u0093\u0007\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\u001e\u0000\u0000\u0095\u0099\u0005\u0005\u0000\u0000"+
		"\u0096\u0098\u0003\u0002\u0001\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0006\u0000\u0000"+
		"\u009d\t\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0005\uffff\uffff\u0000"+
		"\u009f\u00a0\u0005-\u0000\u0000\u00a0\u00a1\u0005\u0001\u0000\u0000\u00a1"+
		"\u00a2\u0003\n\u0005\u0000\u00a2\u00a3\u0005\u0002\u0000\u0000\u00a3\u011a"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005-\u0000\u0000\u00a5\u00a6\u0005"+
		"\f\u0000\u0000\u00a6\u011a\u0005-\u0000\u0000\u00a7\u00a8\u0005-\u0000"+
		"\u0000\u00a8\u00a9\u0005\f\u0000\u0000\u00a9\u00aa\u0005-\u0000\u0000"+
		"\u00aa\u00ab\u0005\t\u0000\u0000\u00ab\u011a\u0003\n\u0005\u001e\u00ac"+
		"\u00ad\u0005-\u0000\u0000\u00ad\u00ae\u0005\f\u0000\u0000\u00ae\u00af"+
		"\u0005-\u0000\u0000\u00af\u00b8\u0005\u0003\u0000\u0000\u00b0\u00b5\u0003"+
		"\n\u0005\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00b4\u0003\n\u0005"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b0\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u011a\u0005\u0004\u0000"+
		"\u0000\u00bb\u00bc\u0005$\u0000\u0000\u00bc\u00bd\u0005-\u0000\u0000\u00bd"+
		"\u00c6\u0005\u0003\u0000\u0000\u00be\u00c3\u0003\n\u0005\u0000\u00bf\u00c0"+
		"\u0005\b\u0000\u0000\u00c0\u00c2\u0003\n\u0005\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00be\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u011a\u0005\u0004\u0000\u0000\u00c9\u00ca\u0005"+
		"-\u0000\u0000\u00ca\u00d3\u0005\u0003\u0000\u0000\u00cb\u00d0\u0003\n"+
		"\u0005\u0000\u00cc\u00cd\u0005\b\u0000\u0000\u00cd\u00cf\u0003\n\u0005"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u011a\u0005\u0004\u0000"+
		"\u0000\u00d6\u00d7\u0005\"\u0000\u0000\u00d7\u00e0\u0005\u0003\u0000\u0000"+
		"\u00d8\u00dd\u0005-\u0000\u0000\u00d9\u00da\u0005\b\u0000\u0000\u00da"+
		"\u00dc\u0005-\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005\u0004\u0000\u0000\u00e3\u00e7\u0005\u0005\u0000\u0000\u00e4\u00e6"+
		"\u0003\u0002\u0001\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u011a\u0005\u0006\u0000\u0000\u00eb\u00ec"+
		"\u0005\u000f\u0000\u0000\u00ec\u011a\u0003\n\u0005\u0019\u00ed\u00ee\u0005"+
		"\u0003\u0000\u0000\u00ee\u00ef\u0003\n\u0005\u0000\u00ef\u00f0\u0005\u0004"+
		"\u0000\u0000\u00f0\u011a\u0001\u0000\u0000\u0000\u00f1\u011a\u0005-\u0000"+
		"\u0000\u00f2\u011a\u0005)\u0000\u0000\u00f3\u011a\u0005*\u0000\u0000\u00f4"+
		"\u011a\u0005+\u0000\u0000\u00f5\u011a\u0005,\u0000\u0000\u00f6\u00ff\u0005"+
		"\u0001\u0000\u0000\u00f7\u00fc\u0003\n\u0005\u0000\u00f8\u00f9\u0005\b"+
		"\u0000\u0000\u00f9\u00fb\u0003\n\u0005\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u011a\u0005\u0002\u0000\u0000\u0102\u0112\u0005\u0005\u0000"+
		"\u0000\u0103\u0104\u0005-\u0000\u0000\u0104\u0105\u0005\u000b\u0000\u0000"+
		"\u0105\u010c\u0003\n\u0005\u0000\u0106\u0107\u0005\b\u0000\u0000\u0107"+
		"\u0108\u0005-\u0000\u0000\u0108\u0109\u0005\u000b\u0000\u0000\u0109\u010b"+
		"\u0003\n\u0005\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010b\u010e\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0005\b\u0000\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000"+
		"\u0000\u0000\u0112\u0103\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u011a\u0005\u0006"+
		"\u0000\u0000\u0115\u0116\u0005-\u0000\u0000\u0116\u0117\u0005\t\u0000"+
		"\u0000\u0117\u011a\u0003\n\u0005\u0002\u0118\u011a\u0003\f\u0006\u0000"+
		"\u0119\u009e\u0001\u0000\u0000\u0000\u0119\u00a4\u0001\u0000\u0000\u0000"+
		"\u0119\u00a7\u0001\u0000\u0000\u0000\u0119\u00ac\u0001\u0000\u0000\u0000"+
		"\u0119\u00bb\u0001\u0000\u0000\u0000\u0119\u00c9\u0001\u0000\u0000\u0000"+
		"\u0119\u00d6\u0001\u0000\u0000\u0000\u0119\u00eb\u0001\u0000\u0000\u0000"+
		"\u0119\u00ed\u0001\u0000\u0000\u0000\u0119\u00f1\u0001\u0000\u0000\u0000"+
		"\u0119\u00f2\u0001\u0000\u0000\u0000\u0119\u00f3\u0001\u0000\u0000\u0000"+
		"\u0119\u00f4\u0001\u0000\u0000\u0000\u0119\u00f5\u0001\u0000\u0000\u0000"+
		"\u0119\u00f6\u0001\u0000\u0000\u0000\u0119\u0102\u0001\u0000\u0000\u0000"+
		"\u0119\u0115\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u014a\u0001\u0000\u0000\u0000\u011b\u011c\n\u0017\u0000\u0000\u011c"+
		"\u011d\u00059\u0000\u0000\u011d\u0149\u0003\n\u0005\u0018\u011e\u011f"+
		"\n\u0016\u0000\u0000\u011f\u0120\u0005\u0010\u0000\u0000\u0120\u0149\u0003"+
		"\n\u0005\u0017\u0121\u0122\n\u0015\u0000\u0000\u0122\u0123\u0005\u0011"+
		"\u0000\u0000\u0123\u0149\u0003\n\u0005\u0016\u0124\u0125\n\u0014\u0000"+
		"\u0000\u0125\u0126\u0005\r\u0000\u0000\u0126\u0149\u0003\n\u0005\u0015"+
		"\u0127\u0128\n\u0013\u0000\u0000\u0128\u0129\u0005\u000e\u0000\u0000\u0129"+
		"\u0149\u0003\n\u0005\u0014\u012a\u012b\n\u0012\u0000\u0000\u012b\u012c"+
		"\u0005\u0012\u0000\u0000\u012c\u0149\u0003\n\u0005\u0013\u012d\u012e\n"+
		"\u0011\u0000\u0000\u012e\u012f\u0005\u0013\u0000\u0000\u012f\u0149\u0003"+
		"\n\u0005\u0012\u0130\u0131\n\u0010\u0000\u0000\u0131\u0132\u0005\u0014"+
		"\u0000\u0000\u0132\u0149\u0003\n\u0005\u0011\u0133\u0134\n\u000f\u0000"+
		"\u0000\u0134\u0135\u0005\u0015\u0000\u0000\u0135\u0149\u0003\n\u0005\u0010"+
		"\u0136\u0137\n\u000e\u0000\u0000\u0137\u0138\u0005\u0016\u0000\u0000\u0138"+
		"\u0149\u0003\n\u0005\u000f\u0139\u013a\n\r\u0000\u0000\u013a\u013b\u0005"+
		"\u0017\u0000\u0000\u013b\u0149\u0003\n\u0005\u000e\u013c\u013d\n\f\u0000"+
		"\u0000\u013d\u013e\u0005\u0018\u0000\u0000\u013e\u0149\u0003\n\u0005\r"+
		"\u013f\u0140\n\u000b\u0000\u0000\u0140\u0141\u0005\u0019\u0000\u0000\u0141"+
		"\u0149\u0003\n\u0005\f\u0142\u0143\n\n\u0000\u0000\u0143\u0144\u0005\n"+
		"\u0000\u0000\u0144\u0145\u0003\n\u0005\u0000\u0145\u0146\u0005\u000b\u0000"+
		"\u0000\u0146\u0147\u0003\n\u0005\u000b\u0147\u0149\u0001\u0000\u0000\u0000"+
		"\u0148\u011b\u0001\u0000\u0000\u0000\u0148\u011e\u0001\u0000\u0000\u0000"+
		"\u0148\u0121\u0001\u0000\u0000\u0000\u0148\u0124\u0001\u0000\u0000\u0000"+
		"\u0148\u0127\u0001\u0000\u0000\u0000\u0148\u012a\u0001\u0000\u0000\u0000"+
		"\u0148\u012d\u0001\u0000\u0000\u0000\u0148\u0130\u0001\u0000\u0000\u0000"+
		"\u0148\u0133\u0001\u0000\u0000\u0000\u0148\u0136\u0001\u0000\u0000\u0000"+
		"\u0148\u0139\u0001\u0000\u0000\u0000\u0148\u013c\u0001\u0000\u0000\u0000"+
		"\u0148\u013f\u0001\u0000\u0000\u0000\u0148\u0142\u0001\u0000\u0000\u0000"+
		"\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u000b\u0001\u0000\u0000\u0000"+
		"\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0012\u0000\u0000"+
		"\u014e\u0152\u0005\u0013\u0000\u0000\u014f\u0151\u0003\u000e\u0007\u0000"+
		"\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0005\u0012\u0000\u0000\u0156\u0157\u0005\u0011\u0000\u0000"+
		"\u0157\u0176\u0005\u0013\u0000\u0000\u0158\u0159\u0005\u0012\u0000\u0000"+
		"\u0159\u015d\u0005-\u0000\u0000\u015a\u015c\u0003\u0010\b\u0000\u015b"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160"+
		"\u0164\u0005\u0013\u0000\u0000\u0161\u0163\u0003\u000e\u0007\u0000\u0162"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0167\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0005\u0012\u0000\u0000\u0168\u0169\u0005\u0011\u0000\u0000\u0169"+
		"\u016a\u0005-\u0000\u0000\u016a\u0176\u0005\u0013\u0000\u0000\u016b\u016c"+
		"\u0005\u0012\u0000\u0000\u016c\u0170\u0005-\u0000\u0000\u016d\u016f\u0003"+
		"\u0010\b\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000"+
		"\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0005\u0011\u0000\u0000\u0174\u0176\u0005\u0013"+
		"\u0000\u0000\u0175\u014d\u0001\u0000\u0000\u0000\u0175\u0158\u0001\u0000"+
		"\u0000\u0000\u0175\u016b\u0001\u0000\u0000\u0000\u0176\r\u0001\u0000\u0000"+
		"\u0000\u0177\u0179\b\u0000\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u0182\u0001\u0000\u0000\u0000"+
		"\u017c\u0182\u0003\f\u0006\u0000\u017d\u017e\u0005\u0005\u0000\u0000\u017e"+
		"\u017f\u0003\n\u0005\u0000\u017f\u0180\u0005\u0006\u0000\u0000\u0180\u0182"+
		"\u0001\u0000\u0000\u0000\u0181\u0178\u0001\u0000\u0000\u0000\u0181\u017c"+
		"\u0001\u0000\u0000\u0000\u0181\u017d\u0001\u0000\u0000\u0000\u0182\u000f"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0005-\u0000\u0000\u0184\u0185\u0005"+
		"\t\u0000\u0000\u0185\u0186\u0003\u0012\t\u0000\u0186\u0011\u0001\u0000"+
		"\u0000\u0000\u0187\u018d\u0005+\u0000\u0000\u0188\u0189\u0005\u0005\u0000"+
		"\u0000\u0189\u018a\u0003\n\u0005\u0000\u018a\u018b\u0005\u0006\u0000\u0000"+
		"\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u0187\u0001\u0000\u0000\u0000"+
		"\u018c\u0188\u0001\u0000\u0000\u0000\u018d\u0013\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0005\u0007\u0000\u0000\u018f\u0015\u0001\u0000\u0000\u0000"+
		"&\u0019-9=GX[bhw\u0081\u008f\u0099\u00b5\u00b8\u00c3\u00c6\u00d0\u00d3"+
		"\u00dd\u00e0\u00e7\u00fc\u00ff\u010c\u0110\u0112\u0119\u0148\u014a\u0152"+
		"\u015d\u0164\u0170\u0175\u017a\u0181\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}