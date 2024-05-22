package AST.Expression;

import java.util.List;

public class ObjectLiteralExpressionNode extends ExpressionNode {
    
    private final List<String> keys;
    private final List<ExpressionNode> values;

    public ObjectLiteralExpressionNode(List<String> keys, List<ExpressionNode> values) {
        this.keys = keys;
        this.values = values;
    }

    public List<String> getKeys() {
        return keys;
    }

    public List<ExpressionNode> getValues() {
        return values;
    }
}
