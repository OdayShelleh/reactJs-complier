package AST.Expression;


import AST.Statement.StatementNode;

import java.beans.Expression;

public class DivideExpressionNode extends ExpressionNode {
    private ExpressionNode left;
    private ExpressionNode right;

    public DivideExpressionNode(ExpressionNode left, ExpressionNode right) {
    }

    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;

    }

    @Override
    public String toString() {
        return "DivideExpressionNode{" +
                left + " / " + right +
                '}';
    }
}

