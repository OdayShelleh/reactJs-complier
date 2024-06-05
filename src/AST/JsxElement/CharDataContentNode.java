package AST.JsxElement;

import java.util.List;

public class CharDataContentNode extends JSXContentNode {
    private final String data;

    public CharDataContentNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "CharDataContentNode{" +
                "data='" + data + '\'' +
                '}';
    }
}
