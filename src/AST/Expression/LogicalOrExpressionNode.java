package AST.Expression;

public class LogicalOrExpressionNode extends ExpressionNode {
    private final ExpressionNode leftOperand;
    private final ExpressionNode rightOperand;

    public LogicalOrExpressionNode(ExpressionNode leftOperand, ExpressionNode rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public ExpressionNode getLeftOperand() {
        return leftOperand;
    }

    public ExpressionNode getRightOperand() {
        return rightOperand;
    }

}
