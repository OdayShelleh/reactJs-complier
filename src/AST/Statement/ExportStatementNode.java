package AST.Statement;

public class ExportStatementNode extends  StatementNode{
    private final String identifier;


    public ExportStatementNode(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }


    @Override
    public String toString() {
        return "ExportStatement{" +
                "export " + identifier +'}';
    }

}
