package Visitors;

import AST.Expression.ExpressionNode;
import AST.Statement.*;
import ErrorHandling.SemanticError;
import Symbol.SymbolInfo;
import Symbol.SymbolTable;
import antlr.JavaScriptParser.*;
import antlr.JavaScriptParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends JavaScriptParserBaseVisitor<StatementNode> {
    private final SymbolTable symbolTable;

    public StatementVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    @Override
    public StatementNode visitVariableDeclarationStatement(VariableDeclarationStatementContext ctx) {
        String identifier = ctx.Identifier().getText();
        if (symbolTable.lookup(identifier) != null) {
            throw new SemanticError("Variable '" + identifier + "' already declared.");
        }
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(symbolTable);
        ExpressionNode expression = expressionVisitor.visit(ctx.expression());

        
        symbolTable.addSymbol(identifier, new SymbolInfo("variable", expression));

        return new VariableDeclarationStatementNode(identifier, expression);
    }


    @Override
    public StatementNode visitFunctionDectarationStatement(FunctionDectarationStatementContext ctx) {
        String functionName = ctx.Identifier(0).getText();

        symbolTable.enterScope();
        List<String> parameters = new ArrayList<>();
        if (ctx.Identifier() != null) {
            for (TerminalNode parameter : ctx.Identifier()) {
                String paramName = parameter.getText();
                parameters.add(paramName);
                symbolTable.addSymbol(paramName, new SymbolInfo("parameter", null));
            }
        }
        List<StatementNode> statements = new ArrayList<>();
        for (StatementContext stmtCtx : ctx.statement()) {
            statements.add(visit(stmtCtx));
        }
        symbolTable.exitScope();
        return new FunctionDeclarationStatementNode(functionName, parameters, statements);
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
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(symbolTable);
        ExpressionNode condition = expressionVisitor.visit(ctx.if_().expression());
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
    public StatementNode visitElseif(ElseifContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(symbolTable);
        ExpressionNode condition = expressionVisitor.visit(ctx.expression());
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
    public StatementNode visitLoopStatement(LoopStatementContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(symbolTable);
        ExpressionNode condition = expressionVisitor.visit(ctx.expression());
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
    public StatementNode visitReturnStatement(ReturnStatementContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(symbolTable);
        ExpressionNode expression = null;
        if (ctx.expression().getText() != null) {
            expression = expressionVisitor.visit(ctx.expression());
        }
        return new ReturnStatementNode(expression);
    }


    @Override
    public StatementNode visitExpressionStatement(ExpressionStatementContext ctx) {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(symbolTable);
        ExpressionNode expression = expressionVisitor.visit(ctx.expression());
        return new ExpressionStatementNode(expression);

    }

}
