package AST.Expression;


public class IdentifierExpressionNode extends ExpressionNode {
    private final String identifier;

    public IdentifierExpressionNode(String identifier) {
        this.identifier = identifier;

    }

    public String getIdentifier() {
        return identifier;

    }

    @Override
    public String toString() {
        return "IdentifierExpressionNode{" +
                "identifier=" + identifier +
                '}';
    }
}

