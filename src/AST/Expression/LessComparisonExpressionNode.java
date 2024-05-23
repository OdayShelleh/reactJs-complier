package AST.Expression;

public class LessComparisonExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;

    public LessComparisonExpressionNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "LessComparisonExpressionNode{" +
                left + "<" + right +
                '}';
    }
}
