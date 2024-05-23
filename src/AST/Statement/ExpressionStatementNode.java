package AST.Statement;


import AST.Expression.ExpressionNode;

public class ExpressionStatementNode extends ExpressionNode {
    private ExpressionNode expression;

    public ExpressionStatementNode(ExpressionNode expression) {
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;

    }

    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ExpressionStatementNode{"
                + expression +
                '}';
    }
}