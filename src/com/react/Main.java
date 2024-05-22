package com.react;

import AST.Expression.BooleanLiteralExpressionNode;
import AST.ProgramNode;
import AST.Statement.*;
import Visitors.ProgramVisitor;
import antlr.JavaScriptLexer;
import antlr.JavaScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {
        String input = "files/test1.txt"; // Replace with your actual JavaScript code

        CharStream charStream = fromFileName(input);

        JavaScriptLexer lexer = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaScriptParser parser = new JavaScriptParser(tokens);
        ParseTree ast = parser.program();
        ProgramVisitor visitor = new ProgramVisitor();
        StatementNode result = visitor.visit(ast);


        System.out.printf(result.toString() + "\n");
//        printAST(result, 1);
    }

    private static void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }


}


