package AST.Expression;


import AST.Statement.StatementNode;

public class MemberIndexExpressionNode extends ExpressionNode {
    String name;
    StatementNode expression;

    public MemberIndexExpressionNode(String name, StatementNode expr) {
        this.name = name;
        this.expression = expr;
    }

    @Override
    public String toString() {
        return "MemberIndexExpressionNode{" +
                "name='" + name + '\'' +
                ", expression=" + expression +
                '}';
    }
}
