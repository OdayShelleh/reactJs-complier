package AST.Statement;

public class ImportStatementNode extends StatementNode{
    private final String identifier;
    private final String path;


    public ImportStatementNode(String identifier, String path) {
        this.identifier = identifier;
        this.path = path;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "ImportStatement{" +
                "import " + identifier + " from " + path + '}';
    }

}
