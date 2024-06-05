package AST.JsxElement;

import AST.Statement.StatementNode;

public class HTMLAttribute extends StatementNode {
    private final String name;
    private final HTMLAttributeValue value;

    public HTMLAttribute(String name, HTMLAttributeValue value) {
        this.name = name;
        this.value = value;
    }

    public HTMLAttributeValue getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "HTMLAttribute{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
