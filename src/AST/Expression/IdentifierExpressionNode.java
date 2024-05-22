package AST.Expression;


public class IdentifierExpressionNode extends ExpressionNode {
    private ExpressionNode identifier;

    public IdentifierExpressionNode(ExpressionNode identifier) {
        this.identifier = identifier;

    }

    public ExpressionNode getIdentifier() {
        return identifier;

    }

    public void setIdentifier(ExpressionNode identifier) {
        this.identifier = identifier;

    }

}

