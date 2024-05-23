// Generated from C:/Users/oday/Desktop/reactJs/src/antlr/JavaScriptParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaScriptParser}.
 */
public interface JavaScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(JavaScriptParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(JavaScriptParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarationStatement(JavaScriptParser.ArrayDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarationStatement(JavaScriptParser.ArrayDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(JavaScriptParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(JavaScriptParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(JavaScriptParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(JavaScriptParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDectarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDectarationStatement(JavaScriptParser.FunctionDectarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDectarationStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDectarationStatement(JavaScriptParser.FunctionDectarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(JavaScriptParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(JavaScriptParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(JavaScriptParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(JavaScriptParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(JavaScriptParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(JavaScriptParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(JavaScriptParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(JavaScriptParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(JavaScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(JavaScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpressionStatement}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpressionStatement(JavaScriptParser.NotExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpressionStatement}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpressionStatement(JavaScriptParser.NotExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectDotPropertyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectDotPropertyExpression(JavaScriptParser.ObjectDotPropertyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectDotPropertyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectDotPropertyExpression(JavaScriptParser.ObjectDotPropertyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpression(JavaScriptParser.StringLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpression(JavaScriptParser.StringLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(JavaScriptParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(JavaScriptParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(JavaScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(JavaScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessOrEqualComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessOrEqualComparisonExpression(JavaScriptParser.LessOrEqualComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessOrEqualComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessOrEqualComparisonExpression(JavaScriptParser.LessOrEqualComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(JavaScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(JavaScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralExpression(JavaScriptParser.BooleanLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralExpression(JavaScriptParser.BooleanLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaScriptParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaScriptParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteralExpression(JavaScriptParser.NullLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteralExpression(JavaScriptParser.NullLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteralExpression(JavaScriptParser.NumberLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteralExpression(JavaScriptParser.NumberLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(JavaScriptParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(JavaScriptParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreOrEqualComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMoreOrEqualComparisonExpression(JavaScriptParser.MoreOrEqualComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreOrEqualComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMoreOrEqualComparisonExpression(JavaScriptParser.MoreOrEqualComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModulusExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulusExpression(JavaScriptParser.ModulusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModulusExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulusExpression(JavaScriptParser.ModulusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMoreComparisonExpression(JavaScriptParser.MoreComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMoreComparisonExpression(JavaScriptParser.MoreComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(JavaScriptParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(JavaScriptParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(JavaScriptParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(JavaScriptParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(JavaScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(JavaScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonFunctionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnonFunctionExpression(JavaScriptParser.AnonFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonFunctionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnonFunctionExpression(JavaScriptParser.AnonFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(JavaScriptParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(JavaScriptParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpression(JavaScriptParser.SubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpression(JavaScriptParser.SubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectDotFunctionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectDotFunctionCallExpression(JavaScriptParser.ObjectDotFunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectDotFunctionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectDotFunctionCallExpression(JavaScriptParser.ObjectDotFunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(JavaScriptParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(JavaScriptParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonEqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNonEqualityExpression(JavaScriptParser.NonEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonEqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNonEqualityExpression(JavaScriptParser.NonEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAssignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAssignmentExpression(JavaScriptParser.MemberAssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAssignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAssignmentExpression(JavaScriptParser.MemberAssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessComparisonExpression(JavaScriptParser.LessComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessComparisonExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessComparisonExpression(JavaScriptParser.LessComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxElementExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterJsxElementExpression(JavaScriptParser.JsxElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxElementExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitJsxElementExpression(JavaScriptParser.JsxElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FragmentHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterFragmentHTMLElement(JavaScriptParser.FragmentHTMLElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FragmentHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitFragmentHTMLElement(JavaScriptParser.FragmentHTMLElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalHTMLElement(JavaScriptParser.NormalHTMLElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalHTMLElement(JavaScriptParser.NormalHTMLElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingHTMLElement(JavaScriptParser.SelfClosingHTMLElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingHTMLElement}
	 * labeled alternative in {@link JavaScriptParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingHTMLElement(JavaScriptParser.SelfClosingHTMLElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharDataContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 */
	void enterCharDataContentNode(JavaScriptParser.CharDataContentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharDataContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 */
	void exitCharDataContentNode(JavaScriptParser.CharDataContentNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HTMLElementContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 */
	void enterHTMLElementContentNode(JavaScriptParser.HTMLElementContentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HTMLElementContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 */
	void exitHTMLElementContentNode(JavaScriptParser.HTMLElementContentNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxExpressionContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 */
	void enterJsxExpressionContentNode(JavaScriptParser.JsxExpressionContentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxExpressionContentNode}
	 * labeled alternative in {@link JavaScriptParser#jsxContentNode}.
	 * @param ctx the parse tree
	 */
	void exitJsxExpressionContentNode(JavaScriptParser.JsxExpressionContentNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralAttributeValue}
	 * labeled alternative in {@link JavaScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralAttributeValue(JavaScriptParser.StringLiteralAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralAttributeValue}
	 * labeled alternative in {@link JavaScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralAttributeValue(JavaScriptParser.StringLiteralAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JsxAttributeValue}
	 * labeled alternative in {@link JavaScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributeValue(JavaScriptParser.JsxAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JsxAttributeValue}
	 * labeled alternative in {@link JavaScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributeValue(JavaScriptParser.JsxAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(JavaScriptParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(JavaScriptParser.EosContext ctx);
}