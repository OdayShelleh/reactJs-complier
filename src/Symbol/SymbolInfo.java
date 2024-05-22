package Symbol;

public class SymbolInfo {
    private String type;
    private Object value;

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
}