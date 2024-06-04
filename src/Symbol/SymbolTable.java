package Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private final List<Map<String, SymbolInfo>> scopes;
    private List<Map<String, SymbolInfo>> copyScopes;


    public SymbolTable() {
        this.scopes = new ArrayList<>();
        this.scopes.add(new HashMap<>());// Global scope
    }


    public void enterScope() {
        this.scopes.add(new HashMap<>());
        System.out.println(this.scopes.size() - 1);


    }

    public void exitScope() {
        if (this.scopes.size() > 1) {
            this.copyScopes = new ArrayList<>(this.scopes);
            this.scopes.remove(this.scopes.size() - 1);

        }
    }

    public void addSymbol(String name, SymbolInfo info) {
        this.scopes.get(this.scopes.size() - 1).put(name, info);

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
        for (int i = 0; i < this.copyScopes.size(); i++) {
            System.out.println("Scope " + i + ":");
            Map<String, SymbolInfo> currentScope = this.copyScopes.get(i);
            for (Map.Entry<String, SymbolInfo> entry : currentScope.entrySet()) {
                System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    public void printAllScopes() {
        System.out.println("Symbol Table:");
        for (int i = 0; i < copyScopes.size(); i++) {
            System.out.println("Scope " + i + ":");
            for (Map.Entry<String, SymbolInfo> entry : copyScopes.get(i).entrySet()) {
                System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

