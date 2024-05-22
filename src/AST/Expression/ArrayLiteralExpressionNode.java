package AST.Expression;

import java.util.List;

public class ArrayLiteralExpressionNode extends ExpressionNode {
    private final List<ExpressionNode> elements;

    public ArrayLiteralExpressionNode(List<ExpressionNode> elements) {
        this.elements = elements;
    }

    public List<ExpressionNode> getElements() {
        return elements;
    }
}
