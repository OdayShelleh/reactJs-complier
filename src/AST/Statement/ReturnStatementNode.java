package AST.Statement;


import AST.Expression.ExpressionNode;

import java.util.List;


public class ReturnStatementNode extends StatementNode {
    private final ExpressionNode expression;

    public ReturnStatementNode(ExpressionNode expression) {
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "expression=" + expression +
                '}';
    }
}
