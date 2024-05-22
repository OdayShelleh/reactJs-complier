package AST.Expression;

import java.util.List;

public class ObjectDotFunctionCallExpressionNode extends ExpressionNode {
    private final String object;
    private final String methodName;
    private final List<ExpressionNode> arguments;

    public ObjectDotFunctionCallExpressionNode(String object, String methodName, List<ExpressionNode> arguments) {
        this.object = object;
        this.methodName = methodName;
        this.arguments = arguments;
    }

    public String getObject() {
        return object;
    }

    public String getMethodName() {
        return methodName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "ObjectDotFunctionCallExpressionNode{" +
                "object='" + object + '\'' +
                ", methodName='" + methodName + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
