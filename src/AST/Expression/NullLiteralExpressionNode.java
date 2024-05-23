package AST.Expression;

public class NullLiteralExpressionNode extends ExpressionNode {
    private final String text;

    public NullLiteralExpressionNode(String value) {
        this.text = value;
    }

    public String getValue() {
        return text;
    }

    @Override
    public String toString() {
        return "\nNullLiteralExpressionNode{" +
                "\n\tvalue='" + text + '\'' +
                '}';
    }
}
