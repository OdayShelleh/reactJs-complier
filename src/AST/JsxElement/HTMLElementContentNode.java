package AST.JsxElement;

import java.util.List;


public class HTMLElementContentNode extends JSXContentNode {
    private final JSXElementNode element;

    public HTMLElementContentNode(JSXElementNode element) {
        this.element = element;
    }

    public JSXElementNode getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "HTMLElementContentNode{" +
                "element=" + element +
                '}';
    }
}