package AST.Statement;

import AST.Expression.ExpressionNode;


import java.util.List;

public class ElseIfNode extends StatementNode {
    private ExpressionNode condition;
    private List<StatementNode> thenBranch;

    public ElseIfNode(ExpressionNode condition, List<StatementNode> thenBranch) {
        this.condition = condition;
        this.thenBranch = thenBranch;
    }

    // Getters and setters
    public ExpressionNode getCondition() {
        return condition;
    }

    public List<StatementNode> getThenBranch() {
        return thenBranch;
    }

    @Override
    public String toString() {
        return "ElseIfNode{" +
                "condition=" + condition +
                ", thenBranch=" + thenBranch +
                '}';
    }
}
