package AST.Expression;

public class StringLiteralExpressionNode extends ExpressionNode {
    private final ExpressionNode value;

    public StringLiteralExpressionNode(ExpressionNode value) {
        this.value = value;
    }

    public ExpressionNode getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StringLiteralExpressionNode{" +
                "text='" + value + '\'' +
                '}';
    }
}
