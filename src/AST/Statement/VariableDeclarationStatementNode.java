package AST.Statement;

import AST.Expression.ExpressionNode;

public class VariableDeclarationStatementNode extends StatementNode {
    private final String identifier;
    private final ExpressionNode expression;


    public VariableDeclarationStatementNode(String identifier, ExpressionNode expression) {
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
        return "VariableDeclarationStatement{" +
                "let " + identifier + " = " + expression + '}';
    }

}
