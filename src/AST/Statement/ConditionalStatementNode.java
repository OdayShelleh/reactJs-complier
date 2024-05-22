package AST.Statement;

import java.util.List;

public class ConditionalStatementNode extends StatementNode {
    private final String ifCondition;
    private final List<StatementNode> thenBranch;
    private final List<ElseIfNode> elseIfBranches;
    private final ElseNode elseBranch;

    public ConditionalStatementNode(String condition, List<StatementNode> thenBranch, List<ElseIfNode> elseIfBranches, ElseNode elseBranch) {
        this.ifCondition = condition;
        this.thenBranch = thenBranch;
        this.elseIfBranches = elseIfBranches;
        this.elseBranch = elseBranch;
    }

    // Getters and setters
    public String getIfCondition() {
        return ifCondition;
    }

    public List<StatementNode> getThenBranch() {
        return thenBranch;
    }

    public List<ElseIfNode> getElseIfBranches() {
        return elseIfBranches;
    }

    public ElseNode getElseBranch() {
        return elseBranch;
    }


    @Override
    public String toString() {
        return "ConditionalStatementNode{" +
                "ifCondition='" + ifCondition + '\'' +
                ", thenBranch=" + thenBranch +
                ", elseIfBranches=" + elseIfBranches +
                ", elseBranch=" + elseBranch +
                '}';
    }
}
