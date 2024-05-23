package AST.Expression;

public class MemberAssignmentExpressionNode extends ExpressionNode {
    private final String object;
    private final String property;
    private final ExpressionNode value;

    public MemberAssignmentExpressionNode(String object, String property, ExpressionNode value) {
        this.object = object;
        this.property = property;
        this.value = value;
    }

    public String getObject() {
        return object;
    }

    public String getProperty() {
        return property;
    }

    public ExpressionNode getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MemberAssignmentExpressionNode{" +
                "object='" + object + '\'' +
                ", property='" + property + '\'' +
                ", value=" + value +
                '}';
    }
}
