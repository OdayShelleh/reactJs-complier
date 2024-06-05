parser grammar JavaScriptParser;


options {
    tokenVocab = JavaScriptLexer;
}

program
    : statement* EOF
    ;

    statement
    : Let Identifier Assign expression eos #VariableDeclarationStatement
    | Let OpenBracket Identifier Comma Identifier (Comma Identifier)* CloseBracket Assign expression eos #ArrayDeclarationStatement
    | if elseif* else? # ConditionalStatement
    | While OpenParen expression CloseParen OpenBrace statement* CloseBrace #LoopStatement
    | Break eos #BreakStatement
    | Continue eos #ContinueStatement
    | Function Identifier OpenParen (Identifier (Comma Identifier)*)? CloseParen OpenBrace statement* CloseBrace #FunctionDectarationStatement
    | Return expression? eos # ReturnStatement
    | expression eos # ExpressionStatement
    ;


if: If OpenParen expression CloseParen OpenBrace statement* CloseBrace;

elseif: Else If OpenParen expression CloseParen OpenBrace statement* CloseBrace;

else: Else OpenBrace statement* CloseBrace;

expression
    : Identifier OpenBracket expression CloseBracket # MemberIndexExpression
    | Identifier Dot Identifier # ObjectDotPropertyExpression
    | Identifier Dot Identifier Assign expression # MemberAssignmentExpression
    | Identifier Dot Identifier OpenParen (expression (Comma expression)*)? CloseParen # ObjectDotFunctionCallExpression

    | New Identifier OpenParen (expression (Comma expression)*)? CloseParen # NewExpression
    | Identifier OpenParen (expression (Comma expression)*)? CloseParen # FunctionCallExpression
    | Function OpenParen (Identifier (Comma Identifier)*)? CloseParen OpenBrace statement* CloseBrace # AnonFunctionExpression
    | Not expression # NotExpressionStatement
    | OpenParen expression CloseParen # ParenthesizedExpression
    | expression Modules expression # ModulusExpression

    | expression Multiply expression # MultiplyExpression
    | expression Divide expression # DivideExpression

    | expression Plus expression # AdditionExpression
    | expression Minus expression # SubtractionExpression

    | expression LessThan expression # LessComparisonExpression
    | expression MoreThan expression # MoreComparisonExpression
    | expression LessThanEquals expression # LessOrEqualComparisonExpression
    | expression GreaterThanEquals expression # MoreOrEqualComparisonExpression
    | expression Equals expression # EqualityExpression
    | expression NotEquals expression # NonEqualityExpression

    | expression And expression # LogicalAndExpression
    | expression Or expression # LogicalOrExpression
    | expression QuestionMark expression Colon expression # TernaryExpression

    | Identifier # IdentifierExpression
    | NullLiteral # NullLiteralExpression
    | BooleanLiteral # BooleanLiteralExpression
    | StringLiteral # StringLiteralExpression
    | NumberLiteral # NumberLiteralExpression
    | OpenBracket (expression (Comma expression)*)? CloseBracket # ArrayLiteralExpression
    | OpenBrace (Identifier Colon expression (Comma Identifier Colon expression)* Comma?)? CloseBrace # ObjectLiteralExpression
    | Identifier Assign expression # AssignmentExpression
    | jsxElement # JsxElementExpression
    ;


jsxElement
    : LessThan MoreThan jsxContentNode* LessThan Divide MoreThan # FragmentHTMLElement
    | LessThan Identifier htmlAttribute* MoreThan jsxContentNode* LessThan Divide Identifier MoreThan # NormalHTMLElement
    | LessThan Identifier htmlAttribute* Divide MoreThan # SelfClosingHTMLElement
    ;



jsxContentNode
    : ~(OpenBrace|LessThan)+ # CharDataContentNode 
    | jsxElement # HTMLElementContentNode
    | OpenBrace expression CloseBrace # JsxExpressionContentNode
    ;

htmlAttribute: Identifier Assign htmlAttributeValue;

htmlAttributeValue
    : StringLiteral # StringLiteralAttributeValue
    | OpenBrace expression CloseBrace # JsxAttributeValue
    ;

eos
    : SemiColon
    ;