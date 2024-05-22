package AST.Statement;


import java.util.List;

public class FunctionDeclarationStatementNode extends StatementNode {
    private final String functionName;
    private final List<String> parameters;
    private final List<StatementNode> statements;

    public FunctionDeclarationStatementNode(String functionName, List<String> parameters, List<StatementNode> statements) {
        this.functionName = functionName;
        this.parameters = parameters;
        this.statements = statements;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "FunctionDeclarationStatement{" +
                "functionName='" + functionName + '\'' +
                ", parameters=" + parameters +
                ", body=" + statements +
                '}';
    }
}