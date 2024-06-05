package AST.JsxElement;

import AST.Expression.ExpressionNode;

import java.util.List;

public class JsxExpressionContentNode extends JSXContentNode {
    private final ExpressionNode expression;

    public JsxExpressionContentNode(ExpressionNode expression) {
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "JsxExpressionContentNode{" +
                "expression=" + expression +
                '}';
    }
}
