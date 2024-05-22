package AST.Expression;


import AST.Statement.StatementNode;

import java.beans.Expression;

public class DivideExpressionNode extends ExpressionNode {
    private Expression left;
    private Expression right;

    public DivideExpressionNode(StatementNode left, StatementNode right) {
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;

    }

    @Override
    public String toString() {
        return "DivideExpressionNode{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

