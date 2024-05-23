package AST.Expression;

public class ObjectDotPropertyExpressionNode extends ExpressionNode {
    private final String identifier;
    private final String property;

    public ObjectDotPropertyExpressionNode(String identifier, String property) {
        this.identifier = identifier;
        this.property = property;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "ObjectDotPropertyExpressionNode{" +
                "identifier='" + identifier + '\'' +
                ", property='" + property + '\'' +
                '}';
    }
}
