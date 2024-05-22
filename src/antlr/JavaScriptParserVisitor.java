// Generated from C:/Users/oday/Desktop/reactJs/src/antlr/JavaScriptParser.g4 by ANTLR 4.13.1
package antlr;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaScriptParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(JavaScriptParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarationStatement(JavaScriptParser.ArrayDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(JavaScriptParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(JavaScriptParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDectarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDectarationStatement(JavaScriptParser.FunctionDectarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(JavaScriptParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(JavaScriptParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(JavaScriptParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(JavaScriptParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(JavaScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpressionStatement}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpressionStatement(JavaScriptParser.NotExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectDotPropertyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDotPropertyExpression(JavaScriptParser.ObjectDotPropertyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(JavaScriptParser.StringLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(JavaScriptParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(JavaScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessOrEqualComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessOrEqualComparisonExpression(JavaScriptParser.LessOrEqualComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(JavaScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralExpression(JavaScriptParser.BooleanLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(JavaScriptParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteralExpression(JavaScriptParser.NullLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteralExpression(JavaScriptParser.NumberLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(JavaScriptParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreOrEqualComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreOrEqualComparisonExpression(JavaScriptParser.MoreOrEqualComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModulusExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusExpression(JavaScriptParser.ModulusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreComparisonExpression(JavaScriptParser.MoreComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(JavaScriptParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(JavaScriptParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(JavaScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonFunctionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonFunctionExpression(JavaScriptParser.AnonFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(JavaScriptParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionExpression(JavaScriptParser.SubtractionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectDotFunctionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDotFunctionCallExpression(JavaScriptParser.ObjectDotFunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpression(JavaScriptParser.DivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonEqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEqualityExpression(JavaScriptParser.NonEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessComparisonExpression(JavaScriptParser.LessComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxElementExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementExpression(JavaScriptParser.JsxElementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FragmentHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentHTMLElement(JavaScriptParser.FragmentHTMLElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalHTMLElement(JavaScriptParser.NormalHTMLElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingHTMLElement(JavaScriptParser.SelfClosingHTMLElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharDataContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharDataContentNode(JavaScriptParser.CharDataContentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLElementContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLElementContentNode(JavaScriptParser.HTMLElementContentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxExpressionContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxExpressionContentNode(JavaScriptParser.JsxExpressionContentNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralAttributeValue}
	 * labeled alternative in {@link JavaScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralAttributeValue(JavaScriptParser.StringLiteralAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JsxAttributeValue}
	 * labeled alternative in {@link JavaScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributeValue(JavaScriptParser.JsxAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(JavaScriptParser.EosContext ctx);
}