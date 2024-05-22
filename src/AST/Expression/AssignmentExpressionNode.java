package AST.Expression;

public class AssignmentExpressionNode extends ExpressionNode {
    private final String variable;
    private final ExpressionNode expression;

    public AssignmentExpressionNode(String variable, ExpressionNode expression) {
        this.variable = variable;
        this.expression = expression;
    }

    public String getVariable() {
        return variable;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Assignment: " + variable + " = " + expression.toString();
    }
}
