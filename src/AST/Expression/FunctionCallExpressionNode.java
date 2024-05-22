package AST.Expression;

import AST.Statement.StatementNode;

import java.util.List;

public class FunctionCallExpressionNode extends ExpressionNode {

    private final String functionName;
    private final List<StatementNode> arguments;

    public FunctionCallExpressionNode(String functionName, List<StatementNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "FunctionCallExpressionNode{" +
                "functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
