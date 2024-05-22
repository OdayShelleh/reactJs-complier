package AST.Expression;

import java.util.List;

public class NewExpressionNode extends ExpressionNode {
    private final String className;
    private final List<ExpressionNode> arguments;

    public NewExpressionNode(String className, List<ExpressionNode> arguments) {
        this.className = className;
        this.arguments = arguments;
    }

    public String getClassName() {
        return className;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "NewExpressionNode{" +
                "className='" + className + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
