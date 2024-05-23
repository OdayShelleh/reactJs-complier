package AST.Expression;

public class NumberLiteralExpressionNode extends ExpressionNode {
    private final double text;

    public NumberLiteralExpressionNode(double value) {
        this.text = value;
    }

    public double getValue() {
        return text;
    }

    @Override
    public String toString() {
        return "NumberLiteralExpressionNode{" +
                "text=" + text +
                '}';
    }
}
