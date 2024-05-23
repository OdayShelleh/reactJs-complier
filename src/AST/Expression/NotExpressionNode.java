package AST.Expression;

import AST.Statement.StatementNode;


public class NotExpressionNode extends ExpressionNode {
    private final ExpressionNode expression;

    public NotExpressionNode(ExpressionNode expression) {
        this.expression = expression;
    }



    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "NotExpressionNode{" +
                "!" + expression +
                '}';
    }
}
