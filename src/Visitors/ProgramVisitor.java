package Visitors;

import AST.ProgramNode;

import AST.Statement.StatementNode;
import antlr.JavaScriptParser.*;
import antlr.JavaScriptParserBaseVisitor;


public class ProgramVisitor extends JavaScriptParserBaseVisitor<StatementNode> {
    @Override
    public StatementNode visitProgram(ProgramContext ctx) {
        ProgramNode program = new ProgramNode();
        StatementVisitor sv = new StatementVisitor();
        ExpressionVisitor ev = new ExpressionVisitor();
        for (StatementContext Statement : ctx.statement()) {
            program.addChild(sv.visit(Statement));
            for (int i = 0; i < Statement.children.size(); i++) {
                if (Statement.children.get(3) instanceof ExpressionContext) {
                    program.addChild(ev.visit(Statement.children.get(i)));
                }

            }
        }

        return program;
    }
}
