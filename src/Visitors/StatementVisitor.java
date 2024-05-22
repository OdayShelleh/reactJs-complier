package Visitors;

import AST.Expression.ExpressionNode;
import AST.Expression.IdentifierExpressionNode;
import AST.Statement.*;
import Symbol.SymbolInfo;
import Symbol.SymbolTable;
import antlr.JavaScriptParser.*;
import antlr.JavaScriptParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends JavaScriptParserBaseVisitor<StatementNode> {
    private final SymbolTable symbolTable = new SymbolTable();


    @Override
    public StatementNode visitVariableDeclarationStatement(VariableDeclarationStatementContext ctx) {
        String name = ctx.Identifier().getText();
        // let x = 4;
        ExpressionNode expression = (ExpressionNode) visit(ctx.expression());

        symbolTable.addSymbol(name, new SymbolInfo("variable", ctx.expression().getText()));
        return new VariableDeclarationStatementNode(name, expression);
    }

    @Override
    public StatementNode visitArrayDeclarationStatement(ArrayDeclarationStatementContext ctx) {
        List<String> identifiers = new ArrayList<>();
        for (TerminalNode identifierContext : ctx.Identifier()) {
            String identifier = identifierContext.getText();
            identifiers.add(identifier);
            symbolTable.addSymbol(identifier, new SymbolInfo("array", null)); // Add identifier to symbol table
        }
        StatementNode expression = visit(ctx.expression());
        return new ArrayDeclarationStatementNode(identifiers, expression);

    }

    @Override
    public StatementNode visitConditionalStatement(ConditionalStatementContext ctx) {

        String condition = ctx.if_().expression().getText();
        List<StatementNode> thenBranch = new ArrayList<>();
        for (StatementContext stmtCtx : ctx.if_().statement()) {
            thenBranch.add(visit(stmtCtx));
        }

        List<ElseIfNode> elseIfBranches = new ArrayList<>();
        for (ElseifContext elseifCtx : ctx.elseif()) {
            elseIfBranches.add((ElseIfNode) visit(elseifCtx));
        }
        ElseNode elseBranch = ctx.else_() != null ? (ElseNode) visit(ctx.else_()) : null;

        return new ConditionalStatementNode(condition, thenBranch, elseIfBranches, elseBranch);

    }

    @Override
    public StatementNode visitLoopStatement(LoopStatementContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        List<StatementNode> statements = new ArrayList<>();
        for (StatementContext stmtCtx : ctx.statement()) {
            statements.add(visit(stmtCtx));
        }
        return new LoopStatementNode(condition, statements);
    }

    @Override
    public StatementNode visitBreakStatement(BreakStatementContext ctx) {
        return new BreakStatementNode();
    }

    @Override
    public StatementNode visitContinueStatement(ContinueStatementContext ctx) {
        return new ContinueStatementNode();
    }

    @Override
    public StatementNode visitFunctionDectarationStatement(FunctionDectarationStatementContext ctx) {
        String functionName = ctx.Identifier(0).toString();
        List<String> parameters = new ArrayList<>();
        if (ctx.Identifier() != null) {
            for (int i = 1; i < ctx.Identifier().size(); i++) {
                String parameter = ctx.Identifier().get(i).getText();
                parameters.add(parameter);
                symbolTable.addSymbol(parameter, new SymbolInfo("parameter", null));
            }
        }
        List<StatementNode> statements = new ArrayList<>();
        for (StatementContext stmtCtx : ctx.statement()) {
            statements.add(visit(stmtCtx));
        }
        symbolTable.addSymbol(functionName, new SymbolInfo("function", null)); // Add function name to symbol table
        return new FunctionDeclarationStatementNode(functionName, parameters, statements);
    }

    @Override
    public StatementNode visitReturnStatement(ReturnStatementContext ctx) {
        ExpressionNode expression = null;
        if (ctx.expression() != null) {
            expression = (ExpressionNode) visit(ctx.expression());
        }
        return new ReturnStatementNode(expression);
    }


    @Override
    public StatementNode visitElseif(ElseifContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        List<StatementNode> thenBranch = new ArrayList<>();
        for (StatementContext stmtCtx : ctx.statement()) {
            thenBranch.add(visit(stmtCtx));
        }
        return new ElseIfNode(condition, thenBranch);
    }

    @Override
    public StatementNode visitElse(ElseContext ctx) {
        List<StatementNode> thenBranch = new ArrayList<>();
        for (StatementContext stmtCtx : ctx.statement()) {
            thenBranch.add(visit(stmtCtx));
        }
        return new ElseNode(thenBranch);
    }


    @Override
    public StatementNode visitExpressionStatement(ExpressionStatementContext ctx) {
        ExpressionNode expression = (ExpressionNode) visit(ctx.expression());
        System.out.println(ctx.expression().children.get(1).getText());
        return new ExpressionStatementNode(expression);

    }

    @Override
    public StatementNode visitIdentifierExpression(IdentifierExpressionContext ctx) {
        ExpressionNode identifier = (ExpressionNode) visit(ctx.Identifier());
        symbolTable.addSymbol(ctx.Identifier().getText(), new SymbolInfo("variable", identifier)); // Add identifier to symbol table
        return new IdentifierExpressionNode(identifier);
    }
}
