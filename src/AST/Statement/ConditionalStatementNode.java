package AST.Statement;

import AST.Expression.ExpressionNode;

import java.util.List;

public class ConditionalStatementNode extends StatementNode {
    private final ExpressionNode ifCondition;
    private final List<StatementNode> thenBranch;
    private final List<ElseIfNode> elseIfBranches;
    private final ElseNode elseBranch;

    public ConditionalStatementNode(ExpressionNode condition, List<StatementNode> thenBranch, List<ElseIfNode> elseIfBranches, ElseNode elseBranch) {
        this.ifCondition = condition;
        this.thenBranch = thenBranch;
        this.elseIfBranches = elseIfBranches;
        this.elseBranch = elseBranch;
    }

    // Getters and setters
    public ExpressionNode getIfCondition() {
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
        return "\nConditionalStatementNode: " +
                "\n\tif(" + ifCondition + ") { \n" +
                thenBranch +
                "\n }" +
                elseIfBranches +
                "\n\t" + elseBranch;
    }
}
