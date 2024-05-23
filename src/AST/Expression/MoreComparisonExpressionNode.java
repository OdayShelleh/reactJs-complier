package AST.Expression;

public class MoreComparisonExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;

    public MoreComparisonExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        return "MoreComparisonExpressionNode{" +
                left + ">" + right +
                '}';
    }
}
