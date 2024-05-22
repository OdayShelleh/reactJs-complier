package AST.Expression;

public class BooleanLiteralExpressionNode extends ExpressionNode {

    private final boolean BooleanValue;

    public BooleanLiteralExpressionNode(boolean BooleanValue) {
        this.BooleanValue = BooleanValue;
    }

    // getter and setter
    public boolean getBooleanValue() {
        return BooleanValue;

    }


}
