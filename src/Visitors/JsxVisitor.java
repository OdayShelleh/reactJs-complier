package Visitors;

import AST.Expression.ExpressionNode;
import AST.JsxElement.*;
import AST.Statement.StatementNode;
import antlr.JavaScriptParser.*;
import antlr.JavaScriptParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class JsxVisitor extends JavaScriptParserBaseVisitor<StatementNode> {


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
