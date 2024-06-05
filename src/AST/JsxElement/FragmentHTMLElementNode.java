package AST.JsxElement;

import java.util.List;

public class FragmentHTMLElementNode extends JSXElementNode {
    private final List<JSXContentNode> children;

    public FragmentHTMLElementNode(List<JSXContentNode> children) {
        this.children = children;
    }

    public List<JSXContentNode> getChildren() {
        return children;
    }


    @Override
    public String toString() {
        return "FragmentHTMLElementNode{" +
                "children=" + children +
                '}';
    }
}
