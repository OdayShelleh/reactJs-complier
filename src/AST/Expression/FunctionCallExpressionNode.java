package AST.Expression;

import AST.Statement.ExpressionStatementNode;
import AST.Statement.StatementNode;

import java.util.List;

public class FunctionCallExpressionNode extends ExpressionNode {

    private final String functionName;
    private final List<ExpressionNode> arguments;

    public FunctionCallExpressionNode(String functionName, List<ExpressionNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public String getFunctionName() {
        return functionName;
    }


    @Override
    public String toString() {
        return "FunctionCallExpressionNode{" +
                "functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
