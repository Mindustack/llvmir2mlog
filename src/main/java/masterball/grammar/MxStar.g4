grammar MxStar;

// Add Package Automatically
@header {
    package masterball.compiler.frontend.parser;
}

// Parser

// 0 Code

mxStarCode
    :   (classDef | funcDef | varDefStmt)* EOF
    ;

// 8 Class

classDef
    :   ClassKw Identifier LeftBrace
        (classConstructorDef | varDefStmt | funcDef)*
        RightBrace SemiColon
    ;

classConstructorDef
    :   Identifier LeftParen RightParen suite
    ;

// 9 Function

funcDef
    :   varDefType Identifier LeftParen funcDefArgs? RightParen suite
    ;

funcDefArgs
    :   varDefType Identifier (Comma varDefType Identifier)*
    ;

funcCallArgs
    :   LeftParen (expression (Comma expression)*)? RightParen
    ;

// 7 Variable

// 7.1 BuiltinType

builtinType: IntType | StringType | BoolType | VoidType;

// 7.2 ArrayType

varDefType
    :   builtinType
    |   Identifier
    |   (builtinType | Identifier) (LeftBracket RightBracket)+
    ;

newExpSizeDeclaration: LeftBracket expression? RightBracket;

varDefBody: varDefType varDefSingle (Comma varDefSingle)*;

varDefSingle: Identifier (AssignOp expression)?;

// 11 Statement

suite
    : LeftBrace statement* RightBrace
    ;

varDefStmt
    : varDefBody SemiColon
    ;

ifStmt: IfKw LeftParen expression RightParen statement (ElseKw statement)?;

whileStmt: WhileKw LeftParen expression RightParen statement;

forInit: (varDefBody | expression);
forStmt: ForKw LeftParen forInit? SemiColon
         forCondition = expression? SemiColon
         forIncr = expression?
         RightParen statement;

returnStmt: ReturnKw expression? SemiColon;
controlStmt: (BreakKw | ContinueKw) SemiColon;
pureStmt: expression? SemiColon;
suiteStmt: suite;

statement
    :   suiteStmt
    |   ifStmt
    |   whileStmt
    |   forStmt
    |   controlStmt
    |   returnStmt
    |   varDefStmt
    |   pureStmt
    ;

// 10 Expression
// Warning: Avoid Mutual Left Recursion!!!

// 10.1 Op Set

prefixOps: (IncrementOp | DecrementOp);
postfixOps: (IncrementOp | DecrementOp);
unaryOps: (BitNotOp | LogicNotOp | AddOp | SubOp);
shiftOps: (ArithShiftLeftOp | ArithShiftRightOp);
mulLevelOps: (MulOp | DivOp | ModOp);
addLevelOps: (AddOp | SubOp);
compareOps: (GreaterOp | GreaterEqualOp | LessOp | LessEqualOp);
equalOps: (EqualOp | NotEqualOp);

// reference: https://en.cppreference.com/w/c/language/operator_precedence

expression
    :   atom                                                                            #atomExp       // 0
    |   LeftParen expression RightParen                                                 #parenExp      // 1
    |   NewKw (builtinType | Identifier) newExpSizeDeclaration* (LeftParen RightParen)? #newExp        // 1

    |   expression LeftBracket expression RightBracket                                  #indexExp      // 1
    |   expression MemberOp Identifier                                                  #memberExp     // 1
    |   expression funcCallArgs                                                         #funcCallExp   // 1
    |   LambdaStartSymbol (LeftParen funcDefArgs? RightParen)?
        LambdaArrowSymbol suite funcCallArgs                                            #lambdaExp     // 1

    |   expression postfixOps                                                           #postfixExp    // 2

    |   <assoc=right> prefixOps expression                                               #prefixExp     // 2
    |   <assoc=right> unaryOps expression                                                #unaryExp      // 2

    |   expression mulLevelOps expression                                               #binaryExp     // 3
    |   expression addLevelOps expression                                               #binaryExp     // 4

    |   expression shiftOps expression                                                  #binaryExp     // 5

    |   expression compareOps expression                                                #binaryExp     // 6
    |   expression equalOps expression                                                  #binaryExp     // 7
    |   expression BitAndOp expression                                                  #binaryExp     // 8
    |   expression BitXorOp expression                                                  #binaryExp     // 9
    |   expression BitOrOp expression                                                   #binaryExp     // 10
    |   expression LogicAndOp expression                                                #binaryExp     // 11
    |   expression LogicOrOp expression                                                 #binaryExp     // 12
    // ? expr                                                                                          // 13
    |   <assoc=right> expression AssignOp expression                                    #assignExp     // 14
    //|   expression Comma expression                                                   #commaExpL     // 15
    ;

atom
    :   Identifier
    |   IntegerConstant
    |   StringConstant
    |   FalseConstant
    |   TrueConstant
    |   NullConstant
    |   ThisPointer
    ;

// Lexer

// 1 Operator

// 1.1 Std Op
AddOp: '+' ;
SubOp: '-' ;
MulOp: '*' ;
DivOp: '/' ;
ModOp: '%' ;

// 1.2 Relation Op
GreaterOp: '>' ;
LessOp: '<' ;
GreaterEqualOp: '>=' ;
LessEqualOp: '<=' ;
NotEqualOp: '!=' ;
EqualOp: '==' ;

// 1.3 Logic Op
LogicAndOp: '&&' ;
LogicOrOp: '||' ;
LogicNotOp: '!' ;

// 1.4 Bit Op
ArithShiftLeftOp: '<<' ;
ArithShiftRightOp: '>>' ;
BitAndOp: '&' ;
BitOrOp: '|' ;
BitXorOp: '^' ;
BitNotOp: '~' ;

// 1.5 Assign Op
AssignOp: '=' ;

// 1.6 Increment & Decrement Op
IncrementOp: '++' ;
DecrementOp: '--' ;

// 1.7 Member Op
MemberOp: '.' ;

// 1.8 Index Op
LeftBracket: '[';
RightBracket: ']';

// 1.9 Priority Op
LeftParen: '(';
RightParen: ')';

// 1.10 Seperator Op
SemiColon: ';';
Comma: ',';
LeftBrace: '{';
RightBrace: '}';

// 1.11 String Op
QuoteOp: '"';

// 1.12 Lambda

LambdaStartSymbol: '[&]';
LambdaArrowSymbol: '->' ;

// 2.Keyword

// 2.1 Basic Type Keyword
IntType: 'int' ;
BoolType: 'bool' ;
StringType: 'string' ;
VoidType: 'void' ;

// 2.2 Constant Keyword
NullConstant: 'null' ;
TrueConstant: 'true' ;
FalseConstant: 'false' ;

// 2.3 Control Keyword
IfKw: 'if' ;
ElseKw: 'else' ;
ForKw: 'for' ;
WhileKw: 'while' ;
BreakKw: 'break' ;
ContinueKw: 'continue' ;
ReturnKw: 'return' ;

// 2.4 Class Related Keyword
NewKw: 'new' ;
ClassKw: 'class' ;
ThisPointer: 'this' ;

// 3 Blank
WhitespaceEater: [ \t]+ -> skip ;
NewlineEater: ('\r' '\n'?| '\n') -> skip ;

// 4 Comment
LineCommentEater: '//' ~[\r\n]* -> skip ;
BlockCommentEater: '/*' .*? '*/' -> skip ;

// 5 Identifier
Identifier: [a-zA-Z] [a-zA-Z_0-9]* ;

// 6 Constant

// 6.1 Integer Constant
IntegerConstant
    :   '0'
    |   [1-9][0-9]*
    ;

// 6.2 String Constant

EscapeEnter: '\\n';
EscapeBackslash: '\\\\';
EscapeQuote: '\\"';
StringContent: [ -~];

StringConstant
    :   QuoteOp (EscapeEnter | EscapeBackslash | EscapeQuote | StringContent)*? QuoteOp
    ;

// 6.3 Bool Constant -> Keyword
// 6.4 Null Constant -> Keyword