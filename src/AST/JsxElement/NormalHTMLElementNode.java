package AST.JsxElement;

import AST.Expression.ExpressionNode;

import java.util.List;

public class NormalHTMLElementNode extends JSXElementNode {
    private final String tagName;
    private final List<HTMLAttribute> attributes;
    private final List<JSXContentNode> children;

    public NormalHTMLElementNode(String tagName, List<HTMLAttribute> attributes, List<JSXContentNode> children) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    public String getTagName() {
        return tagName;
    }

    public List<HTMLAttribute> getAttributes() {
        return attributes;
    }

    public List<JSXContentNode> getChildren() {
        return children;
    }


    @Override
    public String toString() {
        return "NormalHTMLElementNode{" +
                "tagName='" + tagName + '\'' +
                ", attributes=" + attributes +
                ", children=" + children +
                '}';
    }
}
