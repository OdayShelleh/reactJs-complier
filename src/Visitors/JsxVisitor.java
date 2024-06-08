package Visitors;

import AST.Expression.ExpressionNode;
import AST.JsxElement.*;
import AST.Statement.StatementNode;
import ErrorHandling.SemanticError;
import ErrorHandling.SyntaxError;
import Symbol.SymbolInfo;
import Symbol.SymbolTable;
import antlr.JavaScriptParser.*;
import antlr.JavaScriptParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JsxVisitor extends JavaScriptParserBaseVisitor<StatementNode> {
    private final SymbolTable symbolTable;


    public JsxVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }


    @Override
    public StatementNode visitCharDataContentNode(CharDataContentNodeContext ctx) {
        return new CharDataContentNode(ctx.getText());
    }

    @Override
    public StatementNode visitFragmentHTMLElement(FragmentHTMLElementContext ctx) {
        List<JSXContentNode> children = new ArrayList<>();
        for (JsxContentNodeContext childCtx : ctx.jsxContentNode()) {
            children.add((JSXContentNode) visit(childCtx));
        }
        return new FragmentHTMLElementNode(children);
    }


    @Override
    public StatementNode visitHtmlAttribute(HtmlAttributeContext ctx) {
        String name = ctx.Identifier().getText();
        HTMLAttributeValue value = (HTMLAttributeValue) visit(ctx.htmlAttributeValue());
        return new HTMLAttribute(name, value);
    }


    @Override
    public StatementNode visitHTMLElementContentNode(HTMLElementContentNodeContext ctx) {
        JSXElementNode element = (JSXElementNode) visit(ctx.jsxElement());
        return new HTMLElementContentNode(element);
    }

    @Override
    public StatementNode visitJsxAttributeValue(JsxAttributeValueContext ctx) {
        return new JsxAttributeValue((ExpressionNode) visit(ctx.expression()));
    }

    @Override
    public StatementNode visitJsxExpressionContentNode(JsxExpressionContentNodeContext ctx) {
        ExpressionNode expression = (ExpressionNode) visit(ctx.expression());
        return new JsxExpressionContentNode(expression);
    }


    @Override
    public StatementNode visitNormalHTMLElement(NormalHTMLElementContext ctx) {
        if (!Objects.equals(ctx.Identifier(0).getText(), ctx.Identifier(1).getText())){
            throw new SyntaxError('<'+ctx.Identifier(1).getText()+"> " + "cannot appear as a child of " + "<"+ctx.Identifier(0).getText()+'>');

        }
        String tagName = ctx.Identifier(0).getText();
        List<HTMLAttribute> attributes = new ArrayList<>();
        for (HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
            attributes.add((HTMLAttribute) visit(attrCtx));
        }
        List<JSXContentNode> children = new ArrayList<>();
        for (JsxContentNodeContext childCtx : ctx.jsxContentNode()) {
            children.add((JSXContentNode) visit(childCtx));
        }
        return new NormalHTMLElementNode(tagName, attributes, children);
    }

    @Override
    public StatementNode visitSelfClosingHTMLElement(SelfClosingHTMLElementContext ctx) {


        String tagName = ctx.Identifier().getText();

        if(Character.isUpperCase(ctx.Identifier().getText().charAt(0))){
            SymbolInfo symbolInfo = symbolTable.lookup(tagName);
            if (symbolInfo == null) {
                throw new SemanticError("Variable '" + tagName + "' is not declared.");
            }
        }
        List<HTMLAttribute> attributes = new ArrayList<>();
        for (HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
            attributes.add((HTMLAttribute) visit(attrCtx));
        }
        return new SelfClosingHTMLElement(tagName, attributes);
    }

    @Override
    public StatementNode visitStringLiteralAttributeValue(StringLiteralAttributeValueContext ctx) {
        return new StringLiteralAttributeValue(ctx.getText());
    }

}
