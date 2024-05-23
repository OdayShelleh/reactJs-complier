package Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private final List<Map<String, SymbolInfo>> scopes;
    private List<Map<String, SymbolInfo>> copy;


    public SymbolTable() {
        this.scopes = new ArrayList<>();
        this.scopes.add(new HashMap<>());// Global scope
        copy = this.scopes;
    }


    public void enterScope() {
        this.scopes.add(new HashMap<>());
        this.copy.add(new HashMap<>());

    }

    public void exitScope() {
        if (this.scopes.size() > 1) {
            this.scopes.remove(this.scopes.size() - 1);

        }
    }

    public void addSymbol(String name, SymbolInfo info) {
        this.scopes.get(this.scopes.size() - 1).put(name, info);
        this.copy = this.scopes;
    }

    public SymbolInfo lookup(String name) {
        for (int i = this.scopes.size() - 1; i >= 0; i--) {
            if (this.scopes.get(i).containsKey(name)) {
                return this.scopes.get(i).get(name);
            }
        }
        return null;  // Symbol not found
    }

    public void printSymbolTable() {
        System.out.println("Symbol Table:");
        for (int i = 0; i < scopes.size(); i++) {
            System.out.println("Scope " + i + ":");
            Map<String, SymbolInfo> currentScope = scopes.get(i);
            for (Map.Entry<String, SymbolInfo> entry : currentScope.entrySet()) {
                System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    public void printAllScopes() {
        System.out.println("Symbol Table:");
        for (int i = 0; i < scopes.size(); i++) {
            System.out.println("Scope " + i + ":");
            for (Map.Entry<String, SymbolInfo> entry : scopes.get(i).entrySet()) {
                System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

