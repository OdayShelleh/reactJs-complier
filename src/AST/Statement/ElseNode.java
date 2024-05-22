package AST.Statement;

import java.util.List;

public class ElseNode extends StatementNode {
    private final List<StatementNode> thenBranch;

    public ElseNode(List<StatementNode> thenBranch) {
        this.thenBranch = thenBranch;
    }

    // Getters and setters
    public List<StatementNode> getThenBranch() {
        return thenBranch;
    }

    @Override
    public String toString() {
        return "ElseNode{" +
                "thenBranch=" + thenBranch +
                '}';
    }
}
