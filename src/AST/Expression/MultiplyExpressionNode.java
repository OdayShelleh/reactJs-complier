package AST.Expression;


import AST.Statement.StatementNode;

public class MultiplyExpressionNode extends ExpressionNode {
    private final StatementNode left;
    private final StatementNode right;

    public MultiplyExpressionNode(StatementNode left, StatementNode right) {
        this.left = left;
        this.right = right;
    }

    public StatementNode getLeft() {
        return left;
    }

    public StatementNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "MultiplyExpressionNode{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
