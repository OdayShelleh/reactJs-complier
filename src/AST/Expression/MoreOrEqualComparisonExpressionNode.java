package AST.Expression;

public class MoreOrEqualComparisonExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;

    public MoreOrEqualComparisonExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        return "MoreOrEqualComparisonExpressionNode{" +
                left + ">=" + right +
                '}';
    }
}
