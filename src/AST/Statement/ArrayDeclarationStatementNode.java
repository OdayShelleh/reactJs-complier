package AST.Statement;

import AST.Expression.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public class ArrayDeclarationStatementNode extends StatementNode {
    private final List<String> identifiers;
    private final StatementNode expression;

    public ArrayDeclarationStatementNode(List<String> identifiers, StatementNode expression) {
        this.identifiers = identifiers;
        this.expression = expression;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public StatementNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "\nArrayDeclarationStatementNode{" +
                "\n\tidentifiers=" + identifiers +
                ", expression=" + expression +
                '}';
    }
}
