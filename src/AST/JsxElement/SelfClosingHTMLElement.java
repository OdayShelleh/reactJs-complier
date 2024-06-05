package AST.JsxElement;

import java.util.List;

public class SelfClosingHTMLElement extends JSXElementNode {
    private final String tagName;
    private final List<HTMLAttribute> attributes;

    public SelfClosingHTMLElement(String tagName, List<HTMLAttribute> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public List<HTMLAttribute> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "SelfClosingHTMLElement{" +
                "tagName='" + tagName + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
