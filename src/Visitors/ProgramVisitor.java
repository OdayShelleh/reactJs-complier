package Visitors;

import AST.ProgramNode;

import AST.Statement.StatementNode;
import Symbol.SymbolTable;
import antlr.JavaScriptParser.*;
import antlr.JavaScriptParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;


public class ProgramVisitor extends JavaScriptParserBaseVisitor<StatementNode> {

    private final SymbolTable symbolTable;

    public ProgramVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public StatementNode visitProgram(ProgramContext ctx) {
        ProgramNode program = new ProgramNode();
        StatementVisitor sv = new StatementVisitor(symbolTable);

        for (ParseTree child : ctx.children) {
            if (child instanceof StatementContext) {
                program.addChild(sv.visit(child));
            }

        }

        return program;
    }
}
