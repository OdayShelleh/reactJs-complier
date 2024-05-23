package AST.Expression;


import AST.Statement.StatementNode;

import java.util.List;

public class AnonFunctionExpressionNode extends ExpressionNode {
    private final List<String> parameters;
    private final List<StatementNode> statements;

    public AnonFunctionExpressionNode(List<String> parameters, List<StatementNode> statements) {
        this.parameters = parameters;
        this.statements = statements;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "AnonFunctionExpressionNode{" +
                "parameters=" + parameters +
                ", statements=" + statements +
                '}';
    }
}
