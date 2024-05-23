package AST.Expression;

public class NonEqualityExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;

    public NonEqualityExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        return "NonEqualityExpressionNode{" +
                left + "!==" + right +
                '}';
    }
}
