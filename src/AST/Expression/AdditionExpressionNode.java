package AST.Expression;

public class AdditionExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;
    private final String operator;

    public AdditionExpressionNode(ExpressionNode left, ExpressionNode right, String operator) {
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

    @Override
    public String toString() {
        return "SubtractionExpressionNode{" +
                left + operator + right +
                '}';
    }
}
