package AST.Expression;

public class AssignmentExpressionNode extends ExpressionNode {
    private final String identifier;
    private final ExpressionNode expression;

    public AssignmentExpressionNode(String identifier, ExpressionNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Assignment: " + identifier + " = " + expression;
    }
}
