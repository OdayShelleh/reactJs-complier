package AST.Expression;


import AST.Statement.StatementNode;

public class ModulusExpressionNode extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;

    public ModulusExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        return "ModulusExpressionNode{" +
                left + "%" + right +
                '}';
    }
}
