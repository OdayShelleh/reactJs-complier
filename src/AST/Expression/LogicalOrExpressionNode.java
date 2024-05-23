package AST.Expression;

public class LogicalOrExpressionNode extends ExpressionNode {
    private final ExpressionNode leftOperand;
    private final ExpressionNode rightOperand;

    public LogicalOrExpressionNode(ExpressionNode leftOperand, ExpressionNode rightOperand) {
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
        return "LogicalOrExpressionNode{" +
                leftOperand + " || " + rightOperand +
                '}';
    }
}
