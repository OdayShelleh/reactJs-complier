package AST.Expression;

public class StringLiteralExpressionNode extends ExpressionNode {
    private final String value;

    public StringLiteralExpressionNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StringLiteralExpressionNode{" +
                "value = " + value +
                '}';
    }
}
