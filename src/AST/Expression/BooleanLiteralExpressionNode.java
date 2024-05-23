package AST.Expression;

public class BooleanLiteralExpressionNode extends ExpressionNode {

    private final boolean BooleanValue;

    public BooleanLiteralExpressionNode(boolean BooleanValue) {
        this.BooleanValue = BooleanValue;
    }

    // getter and setter
    public boolean getValue() {
        return BooleanValue;

    }

    @Override
    public String toString() {
        return "BooleanLiteralExpressionNode{" +
                "BooleanValue=" + BooleanValue +
                '}';
    }
}
