package AST.Expression;


import AST.Statement.StatementNode;

public class MultiplyExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;

    public MultiplyExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        return "MultiplyExpressionNode{" +
                left + " * " + right +
                '}';
    }
}
