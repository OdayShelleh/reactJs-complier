package Visitors;

import antlr.JavaScriptParser;
import antlr.JavaScriptParserBaseVisitor;

public class JsxVisitor extends JavaScriptParserBaseVisitor {
    @Override
    public Object visitJsxAttributeValue(JavaScriptParser.JsxAttributeValueContext ctx) {
        return super.visitJsxAttributeValue(ctx);
    }

    @Override
    public Object visitStringLiteralAttributeValue(JavaScriptParser.StringLiteralAttributeValueContext ctx) {
        return super.visitStringLiteralAttributeValue(ctx);
    }

    @Override
    public Object visitHtmlAttribute(JavaScriptParser.HtmlAttributeContext ctx) {
        return super.visitHtmlAttribute(ctx);
    }

    @Override
    public Object visitJsxExpressionContentNode(JavaScriptParser.JsxExpressionContentNodeContext ctx) {
        return super.visitJsxExpressionContentNode(ctx);
    }

    @Override
    public Object visitHTMLElementContentNode(JavaScriptParser.HTMLElementContentNodeContext ctx) {
        return super.visitHTMLElementContentNode(ctx);
    }

    @Override
    public Object visitCharDataContentNode(JavaScriptParser.CharDataContentNodeContext ctx) {
        return super.visitCharDataContentNode(ctx);
    }

    @Override
    public Object visitSelfClosingHTMLElement(JavaScriptParser.SelfClosingHTMLElementContext ctx) {
        return super.visitSelfClosingHTMLElement(ctx);
    }

    @Override
    public Object visitNormalHTMLElement(JavaScriptParser.NormalHTMLElementContext ctx) {
        return super.visitNormalHTMLElement(ctx);
    }

    @Override
    public Object visitFragmentHTMLElement(JavaScriptParser.FragmentHTMLElementContext ctx) {
        return super.visitFragmentHTMLElement(ctx);
    }

    @Override
    public Object visitJsxElementExpression(JavaScriptParser.JsxElementExpressionContext ctx) {
        return super.visitJsxElementExpression(ctx);
    }
}
