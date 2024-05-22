package AST.Expression;

public class TernaryExpressionNode extends ExpressionNode {
    private final ExpressionNode condition;
    private final ExpressionNode trueExpr;
    private final ExpressionNode falseExpr;

    public TernaryExpressionNode(ExpressionNode condition, ExpressionNode trueExpr, ExpressionNode falseExpr) {
        this.condition = condition;
        this.trueExpr = trueExpr;
        this.falseExpr = falseExpr;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public ExpressionNode getTrueExpr() {
        return trueExpr;
    }

    public ExpressionNode getFalseExpr() {
        return falseExpr;
    }

}
