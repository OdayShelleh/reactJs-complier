package AST;

import AST.Expression.*;
import AST.Statement.*;

import java.util.List;
import java.util.stream.Collectors;

public class ASTPrinter {

    public static String printAST(StatementNode node) {
        StringBuilder sb = new StringBuilder();
        printNode(node, sb, 0);
        return sb.toString();
    }

    private static void printNode(StatementNode node, StringBuilder sb, int indent) {
        if (node instanceof ProgramNode) {
            ProgramNode program = (ProgramNode) node;
            sb.append(indent(indent)).append("Program:\n");
            for (StatementNode stmt : program.getStatements()) {
                printNode(stmt, sb, indent + 2);
            }
        } else if (node instanceof VariableDeclarationStatementNode) {
            VariableDeclarationStatementNode stmt = (VariableDeclarationStatementNode) node;
            sb.append(indent(indent)).append("let ").append(stmt.getIdentifier())
                    .append(" = ").append(printExpression(stmt.getExpression(), indent + 2)).append(";\n");
        } else if (node instanceof ConditionalStatementNode) {
            ConditionalStatementNode stmt = (ConditionalStatementNode) node;
            sb.append(indent(indent)).append("if (").append(printExpression(stmt.getIfCondition(), 0)).append(") {\n");
            for (StatementNode s : stmt.getThenBranch()) {
                printNode(s, sb, indent + 2);
            }
            sb.append(indent(indent)).append("}");
            if (stmt.getElseBranch().getThenBranch() != null && !stmt.getElseBranch().getThenBranch().isEmpty()) {
                sb.append(" else {\n");
                for (StatementNode s : stmt.getElseBranch().getThenBranch()) {
                    printNode(s, sb, indent + 2);
                }
                sb.append(indent(indent)).append("}");
            }
            sb.append("\n");
        } else if (node instanceof FunctionDeclarationStatementNode) {
            FunctionDeclarationStatementNode stmt = (FunctionDeclarationStatementNode) node;
            sb.append(indent(indent)).append("function ").append(stmt.getFunctionName()).append("(");
            List<String> parameters = stmt.getParameters();
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(parameters.get(i));
                if (i < parameters.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(") {\n");
            for (StatementNode s : stmt.getStatements()) {
                printNode(s, sb, indent + 2);
            }
            sb.append(indent(indent)).append("}\n");
        } else if (node instanceof LoopStatementNode) {
            LoopStatementNode stmt = (LoopStatementNode) node;
            sb.append(indent(indent)).append("while (").append(printExpression(stmt.getCondition(), 0)).append(") {\n");
            for (StatementNode s : stmt.getLoopStatements()) {
                printNode(s, sb, indent + 2);
            }
            sb.append(indent(indent)).append("}\n");
        } else if (node instanceof BreakStatementNode) {
            sb.append(indent(indent)).append("break;\n");
        } else if (node instanceof ContinueStatementNode) {
            sb.append(indent(indent)).append("continue;\n");
        } else if (node instanceof ExpressionStatementNode) {
            ExpressionStatementNode stmt = (ExpressionStatementNode) node;
            sb.append(indent(indent)).append(printExpression(stmt.getExpression(), 0)).append(";\n");
        } else {
            sb.append(indent(indent)).append("Unknown node type\n");
        }
    }

    private static String printExpression(ExpressionNode expr, int indent) {
        if (expr instanceof IdentifierExpressionNode) {
            return ((IdentifierExpressionNode) expr).getIdentifier();
        } else if (expr instanceof AssignmentExpressionNode) {
            AssignmentExpressionNode assignment = (AssignmentExpressionNode) expr;
            return assignment.getIdentifier() + " = " + printExpression(assignment.getExpression(), 0);
        } else if (expr instanceof FunctionCallExpressionNode) {
            FunctionCallExpressionNode call = (FunctionCallExpressionNode) expr;
            StringBuilder sb = new StringBuilder();
            sb.append(call.getFunctionName()).append("(");
            List<String> args = call.getArguments().stream()
                    .map(arg -> printExpression(arg, 0))
                    .collect(Collectors.toList());
            sb.append(String.join(", ", args)).append(")");
            return sb.toString();
        } else if (expr instanceof MoreComparisonExpressionNode) {
            MoreComparisonExpressionNode binary = (MoreComparisonExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " > " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof MoreOrEqualComparisonExpressionNode) {
            MoreOrEqualComparisonExpressionNode binary = (MoreOrEqualComparisonExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " >= " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof LessComparisonExpressionNode) {
            LessComparisonExpressionNode binary = (LessComparisonExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " < " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof LessOrEqualComparisonExpressionNode) {
            LessOrEqualComparisonExpressionNode binary = (LessOrEqualComparisonExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " <= " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof AdditionExpressionNode) {
            AdditionExpressionNode binary = (AdditionExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " + " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof SubtractionExpressionNode) {
            SubtractionExpressionNode binary = (SubtractionExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " - " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof MultiplyExpressionNode) {
            MultiplyExpressionNode binary = (MultiplyExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " * " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof DivideExpressionNode) {
            DivideExpressionNode binary = (DivideExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " / " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof NonEqualityExpressionNode) {
            NonEqualityExpressionNode binary = (NonEqualityExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " != " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof EqualityExpressionNode) {
            EqualityExpressionNode binary = (EqualityExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " == " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof NotExpressionNode) {
            NotExpressionNode binary = (NotExpressionNode) expr;
            return "!" + printExpression(binary.getExpression(), 0);
        } else if (expr instanceof ModulusExpressionNode) {
            ModulusExpressionNode binary = (ModulusExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " % " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof LogicalAndExpressionNode) {
            LogicalAndExpressionNode binary = (LogicalAndExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " && " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof LogicalOrExpressionNode) {
            LogicalOrExpressionNode binary = (LogicalOrExpressionNode) expr;
            return printExpression(binary.getLeft(), 0) + " || " + printExpression(binary.getRight(), 0);
        } else if (expr instanceof TernaryExpressionNode) {
            TernaryExpressionNode binary = (TernaryExpressionNode) expr;
            return printExpression(binary.getCondition(), 0)
                    + " ? " + printExpression(binary.getTrueExpr(), 0)
                    + " : " + printExpression(binary.getFalseExpr(), 0);
        } else if (expr instanceof NumberLiteralExpressionNode) {
            return ((NumberLiteralExpressionNode) expr).getValue() + "";
        } else if (expr instanceof StringLiteralExpressionNode) {
            return ((StringLiteralExpressionNode) expr).getValue();
        } else if (expr instanceof BooleanLiteralExpressionNode) {
            return ((BooleanLiteralExpressionNode) expr).getValue() + "";
        } else if (expr instanceof NullLiteralExpressionNode) {
            return ((NullLiteralExpressionNode) expr).getValue();
        } else if (expr instanceof NumberLiteralExpressionNode) {
            return ((NumberLiteralExpressionNode) expr).getValue() + "";
        } else {
            return "Unknown expression type";
        }
    }

//     else if (expr instanceof JsxElementExpression) {
//        return printJsxElement(((JsxElementExpression) expr).getJsxElement(), indent);
//    }


//    private static String printJsxElement(JsxElement jsxElement, int indent) {
//        StringBuilder sb = new StringBuilder();
//        if (jsxElement instanceof FragmentHTMLElement) {
//            sb.append("<>...</>");
//        } else if (jsxElement instanceof NormalHTMLElement) {
//            NormalHTMLElement element = (NormalHTMLElement) jsxElement;
//            sb.append("<").append(element.getIdentifier());
//            for (HtmlAttribute attribute : element.getHtmlAttributes()) {
//                sb.append(" ").append(attribute.getIdentifier())
//                        .append("=").append(attribute.getValue().accept(new ASTPrinter()));
//            }
//            sb.append(">");
//            for (JsxContentNode contentNode : element.getContentNodes()) {
//                sb.append(contentNode.accept(new ASTPrinter()));
//            }
//            sb.append("</").append(element.getIdentifier()).append(">");
//        } else if (jsxElement instanceof SelfClosingHTMLElement) {
//            SelfClosingHTMLElement element = (SelfClosingHTMLElement) jsxElement;
//            sb.append("<").append(element.getIdentifier());
//            for (HtmlAttribute attribute : element.getHtmlAttributes()) {
//                sb.append(" ").append(attribute.getIdentifier())
//                        .append("=").append(attribute.getValue().accept(new ASTPrinter()));
//            }
//            sb.append(" />");
//        }
//        return sb.toString();
//    }

    private static String indent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }


}