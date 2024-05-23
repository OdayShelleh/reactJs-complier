package AST.Expression;


import AST.Statement.StatementNode;

public class ParenthesizedExpressionNode extends ExpressionNode {
    private final ExpressionNode expression;

    public ParenthesizedExpressionNode(ExpressionNode expression) {
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ParenthesizedExpressionNode{" +
                "expression=" + expression +
                '}';
    }
}
