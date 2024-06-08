lexer grammar JavaScriptLexer;



OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{';
CloseBrace                 : '}';
SemiColon                  : ';';
Comma                      : ',';
Assign                     : '=';
QuestionMark               : '?';
Colon                      : ':';
Dot                        : '.';
Plus                       : '+';
Minus                      : '-';
Not                        : '!';
Multiply                   : '*';
Divide                     : '/';
LessThan                   : '<';
MoreThan                   : '>';
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals                     : '==';
NotEquals                  : '!=';
And                        : '&&';
Or                         : '||';
ARROW                      : '=>';
Modulus                    : '%';

Let : 'let';
If : 'if';
Else : 'else';
While : 'while';
Break :  'break';
Continue : 'continue';
Function : 'function';
Return : 'return';
New : 'new';
Import  : 'import';
From    : 'from';
Export  : 'export';
Default  : 'default';

NullLiteral: 'null';
BooleanLiteral: 'true' | 'false';
StringLiteral: '"' ('\\"' | ~[\r\n\u2028\u2029])*? '"' | '\'' ('\\\'' | ~[\r\n\u2028\u2029])*? '\'';
NumberLiteral: '-'? ('0' | [1-9] [0-9_]*) ('.' [0-9] [0-9_]*)?;


Identifier: [a-zA-Z$_]+ [0-9]?;

WhiteSpaces: [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);
LineTerminator: [\r\n\u2028\u2029] -> channel(HIDDEN);

JsxComment        : '{/*' .*? '*/}'           -> channel(HIDDEN);
MultiLineComment  : '/*' .*? '*/'             -> channel(HIDDEN);
SingleLineComment : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);

/// Keywords
Catch      : 'catch';
Finally    : 'finally';
This       : 'this';
Throw      : 'throw';
Try        : 'try';
UseState   : 'useState';
 /// Future Reserved Words
