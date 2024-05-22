package AST.Expression;


import AST.Statement.StatementNode;

public class ModulusExpressionNode extends ExpressionNode {
    private final StatementNode left;
    private final StatementNode right;

    public ModulusExpressionNode(StatementNode left, StatementNode right) {
        this.left = left;
        this.right = right;
    }

    public StatementNode getLeft() {
        return left;

    }

    public StatementNode getRight() {
        return right;

    }

}
