package AST.Statement;
import AST.Expression.ExpressionNode;

import java.util.List;

public class LoopStatementNode extends StatementNode {
    private ExpressionNode condition;
    private List<StatementNode> loopStatements;

    public LoopStatementNode(ExpressionNode condition, List<StatementNode> loopStatements) {
        this.condition = condition;
        this.loopStatements = loopStatements;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public List<StatementNode> getLoopStatements() {
        return loopStatements;
    }

    @Override
    public String toString() {
        return "LoopStatementNode{" +
                "condition=" + condition +
                ", loopStatements=" + loopStatements +
                '}';
    }
}



