package Symbol;

public class SymbolInfo {
    private final String type;
    private final Object value;

    public SymbolInfo(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Value: " + value;
    }
}