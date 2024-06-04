package Visitors;


import AST.Expression.*;
import AST.Statement.StatementNode;
import ErrorHandling.SemanticError;
import Symbol.SymbolInfo;
import Symbol.SymbolTable;
import antlr.JavaScriptParser.*;
import antlr.JavaScriptParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class ExpressionVisitor extends JavaScriptParserBaseVisitor<ExpressionNode> {
    //    private final SymbolTable symbolTable = SymbolTable.getInstance();
    private final SymbolTable symbolTable;

    public ExpressionVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    @Override
    public ExpressionNode visitMemberIndexExpression(MemberIndexExpressionContext ctx) {
        String identifier = ctx.Identifier().getText();
        ExpressionNode indexExpression = visit(ctx.expression());
        symbolTable.addSymbol(identifier, new SymbolInfo("variable", null)); // Add identifier to symbol table
        return new MemberIndexExpressionNode(identifier, indexExpression);
    }


    ///

    @Override
    public ExpressionNode visitAdditionExpression(AdditionExpressionContext ctx) {
        String operator = ctx.Plus().getText();
        ExpressionNode leftExpression = visit(ctx.expression(0));
        ExpressionNode rightExpression = visit(ctx.expression(1));
        return new AdditionExpressionNode(leftExpression, rightExpression, operator);
    }

    @Override
    public ExpressionNode visitSubtractionExpression(SubtractionExpressionContext ctx) {
        String operator = ctx.Minus().getText();
        ExpressionNode leftExpression = visit(ctx.expression(0));
        ExpressionNode rightExpression = visit(ctx.expression(1));
        return new SubtractionExpressionNode(leftExpression, rightExpression, operator);
    }


    @Override
    public ExpressionNode visitDivideExpression(DivideExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new DivideExpressionNode(left, right);
    }

    @Override
    public ExpressionNode visitMultiplyExpression(MultiplyExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new MultiplyExpressionNode(left, right);
    }


    /// logical operation

    @Override
    public ExpressionNode visitLogicalOrExpression(LogicalOrExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new LogicalOrExpressionNode(left, right);
    }


    @Override
    public ExpressionNode visitLogicalAndExpression(LogicalAndExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new LogicalAndExpressionNode(left, right);
    }


    /// comparison

    @Override
    public ExpressionNode visitEqualityExpression(EqualityExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new EqualityExpressionNode(left, right);
    }

    @Override
    public ExpressionNode visitNonEqualityExpression(NonEqualityExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new NonEqualityExpressionNode(left, right);
    }

    @Override
    public ExpressionNode visitMoreComparisonExpression(MoreComparisonExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new MoreComparisonExpressionNode(left, right);
    }

    @Override
    public ExpressionNode visitMoreOrEqualComparisonExpression(MoreOrEqualComparisonExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new MoreOrEqualComparisonExpressionNode(left, right);
    }

    @Override
    public ExpressionNode visitLessComparisonExpression(LessComparisonExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new LessComparisonExpressionNode(left, right);
    }

    @Override
    public ExpressionNode visitLessOrEqualComparisonExpression(LessOrEqualComparisonExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new LessOrEqualComparisonExpressionNode(left, right);
    }


    @Override
    public ExpressionNode visitIdentifierExpression(IdentifierExpressionContext ctx) {
        String identifier = ctx.Identifier().getText();
        SymbolInfo symbolInfo = symbolTable.lookup(identifier);
        if (symbolInfo == null) {
            throw new SemanticError("Variable '" + identifier + "' is not declared.");
        }
        return new IdentifierExpressionNode(identifier);
    }

    @Override
    public ExpressionNode visitAssignmentExpression(AssignmentExpressionContext ctx) {
        String identifier = ctx.Identifier().getText();
        ExpressionNode expression = visit(ctx.expression());
        return new AssignmentExpressionNode(identifier, expression);
    }


    //// Literal
    @Override
    public ExpressionNode visitObjectLiteralExpression(ObjectLiteralExpressionContext ctx) {
        List<String> keys = new ArrayList<>();
        List<ExpressionNode> values = new ArrayList<>();

        if (ctx.Identifier() != null) {
            for (int i = 0; i < ctx.Identifier().size(); i++) {
                keys.add(ctx.Identifier(i).getText());
                values.add(visit(ctx.expression(i)));
            }
        }

        return new ObjectLiteralExpressionNode(keys, values);
    }

    @Override
    public ExpressionNode visitStringLiteralExpression(StringLiteralExpressionContext ctx) {
        String value = ctx.StringLiteral().getText();
        return new StringLiteralExpressionNode(value);
    }

    @Override
    public ExpressionNode visitNullLiteralExpression(NullLiteralExpressionContext ctx) {
        String strNull = ctx.NullLiteral().getText();
        return new NullLiteralExpressionNode(strNull);
    }

    @Override
    public ExpressionNode visitBooleanLiteralExpression(BooleanLiteralExpressionContext ctx) {
        String text = ctx.BooleanLiteral().getText();
        boolean value = Boolean.parseBoolean(text);
        return new BooleanLiteralExpressionNode(value);
    }


    @Override
    public ExpressionNode visitNumberLiteralExpression(NumberLiteralExpressionContext ctx) {
        return new NumberLiteralExpressionNode(Double.parseDouble(ctx.NumberLiteral().getText()));
    }


    @Override
    public ExpressionNode visitArrayLiteralExpression(ArrayLiteralExpressionContext ctx) {
        List<ExpressionNode> elements = new ArrayList<>();
        for (ExpressionContext exprCtx : ctx.expression()) {
            elements.add(visit(exprCtx));
        }
        return new ArrayLiteralExpressionNode(elements);
    }

    //// Function
    @Override
    public ExpressionNode visitAnonFunctionExpression(AnonFunctionExpressionContext ctx) {
        List<String> parameters = new ArrayList<>();
        for (int i = 0; i < ctx.Identifier().size(); i++) {
            parameters.add(ctx.Identifier(i).getText());
        }
        List<StatementNode> body = new ArrayList<>();
        for (StatementContext stmtCtx : ctx.statement()) {
            body.add(visit(stmtCtx));
        }
        return new AnonFunctionExpressionNode(parameters, body);
    }

    @Override
    public ExpressionNode visitObjectDotFunctionCallExpression(ObjectDotFunctionCallExpressionContext ctx) {
        String object = ctx.Identifier(0).getText();
        String methodName = ctx.Identifier(1).getText();
        List<ExpressionNode> arguments = new ArrayList<>();
        for (ExpressionContext exprCtx : ctx.expression()) {
            arguments.add(visit(exprCtx));
        }
        return new ObjectDotFunctionCallExpressionNode(object, methodName, arguments);

    }

    @Override
    public ExpressionNode visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        String functionName = ctx.Identifier().getText();

        List<ExpressionNode> arguments = new ArrayList<>();
        if (!ctx.expression().isEmpty()) {
            for (ExpressionContext expr : ctx.expression()) {
                arguments.add(visit(expr));
            }
        }
//        symbolTable.addSymbol(functionName, new SymbolInfo("function call", null));
        return new FunctionCallExpressionNode(functionName, arguments);
    }


    @Override
    public ExpressionNode visitModulusExpression(ModulusExpressionContext ctx) {
        ExpressionNode left = visit(ctx.expression(0));
        ExpressionNode right = visit(ctx.expression(1));
        return new ModulusExpressionNode(left, right);
    }


    @Override
    public ExpressionNode visitNewExpression(NewExpressionContext ctx) {
        String className = ctx.Identifier().getText();
        List<ExpressionNode> arguments = new ArrayList<>();
        for (ExpressionContext exprCtx : ctx.expression()) {
            arguments.add(visit(exprCtx));
        }
        return new NewExpressionNode(className, arguments);
    }


    @Override
    public ExpressionNode visitParenthesizedExpression(ParenthesizedExpressionContext ctx) {
        ExpressionNode expression = visit(ctx.expression());
        return new ParenthesizedExpressionNode(expression);
    }


    @Override
    public ExpressionNode visitTernaryExpression(TernaryExpressionContext ctx) {
        ExpressionNode condition = visit(ctx.expression(0));
        ExpressionNode trueExpr = visit(ctx.expression(1));
        ExpressionNode falseExpr = visit(ctx.expression(2));
        return new TernaryExpressionNode(condition, trueExpr, falseExpr);
    }

    @Override
    public ExpressionNode visitObjectDotPropertyExpression(ObjectDotPropertyExpressionContext ctx) {
        String identifier = ctx.Identifier(0).getText();
        String property = ctx.Identifier(1).getText();
        symbolTable.addSymbol(identifier, new SymbolInfo("variable", null));
        return new ObjectDotPropertyExpressionNode(identifier, property);
    }

    @Override
    public ExpressionNode visitMemberAssignmentExpression(MemberAssignmentExpressionContext ctx) {
        String object = ctx.Identifier(0).getText();
        String property = ctx.Identifier(1).getText();
        ExpressionNode value = visit(ctx.expression());
        return new MemberAssignmentExpressionNode(object, property, value);
    }

    @Override
    public ExpressionNode visitNotExpressionStatement(NotExpressionStatementContext ctx) {
        ExpressionNode expression = visit(ctx.expression());
        return new NotExpressionNode(expression);
    }

    @Override
    public ExpressionNode visitEos(EosContext ctx) {
        return super.visitEos(ctx);
    }
}
