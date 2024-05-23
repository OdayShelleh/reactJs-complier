package AST.Statement;

import AST.Expression.ExpressionNode;


import java.util.List;

public class ElseIfNode extends StatementNode {
    private final ExpressionNode condition;
    private final List<StatementNode> thenBranch;

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
        return "else if(" + condition + ") {\n\t" + thenBranch + "\n}";
    }
}
