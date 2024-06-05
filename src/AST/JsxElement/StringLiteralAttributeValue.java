package AST.JsxElement;

public class StringLiteralAttributeValue extends HTMLAttributeValue {
    private final String value;

    public StringLiteralAttributeValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StringLiteralAttributeValue{" +
                "value='" + value + '\'' +
                '}';
    }
}
