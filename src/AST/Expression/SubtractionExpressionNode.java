package AST.Expression;

public class SubtractionExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;
    private final String operator;

    public SubtractionExpressionNode(ExpressionNode left, ExpressionNode right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }
}
