package AST.Expression;

import java.util.List;

public class JSXElementExpressionNode extends ExpressionNode {
    private final List<JSXContentNode> content;

    public JSXElementExpressionNode(List<JSXContentNode> content) {
        this.content = content;
    }

    public List<JSXContentNode> getContent() {
        return content;
    }

}
