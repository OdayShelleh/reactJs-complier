package AST;

import AST.Statement.StatementNode;

import java.util.ArrayList;

public class ProgramNode extends StatementNode {
    public ArrayList<StatementNode> statements;

    public ProgramNode() {
        this.statements = new ArrayList<>();
    }


    public void addChild(StatementNode statement) {
        statements.add(statement);
    }

    @Override
    public String toString() {
        return "Program{" +
                "statements=" + statements +
                '}';
    }
}
