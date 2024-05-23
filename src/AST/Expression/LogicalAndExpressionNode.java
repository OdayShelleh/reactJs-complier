package AST.Expression;

public class LogicalAndExpressionNode extends ExpressionNode {
    private final ExpressionNode leftOperand;
    private final ExpressionNode rightOperand;

    public LogicalAndExpressionNode(ExpressionNode leftOperand, ExpressionNode rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public ExpressionNode getLeft() {
        return leftOperand;
    }

    public ExpressionNode getRight() {
        return rightOperand;
    }

    @Override
    public String toString() {
        return "LogicalAndExpressionNode{" +
                leftOperand + "&&" + rightOperand +
                '}';
    }
}
