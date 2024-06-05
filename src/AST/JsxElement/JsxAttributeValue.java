package AST.JsxElement;

import AST.Expression.ExpressionNode;

public class JsxAttributeValue extends HTMLAttributeValue {
    private final ExpressionNode expression;

    public JsxAttributeValue(ExpressionNode expression) {
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "JsxAttributeValue{" +
                "expression=" + expression +
                '}';
    }
}
