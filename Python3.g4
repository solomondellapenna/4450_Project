grammar Python3;

arithmetic_exp: arithmetic_exp OPERATOR arithmetic_exp
    | arithmetic_exp OPERATOR (INTEGER | FLOAT)
    | (INTEGER | FLOAT) OPERATOR arithmetic_exp
    | num_arithmetic;

num_arithmetic: (INTEGER | FLOAT) OPERATOR (INTEGER | FLOAT);
string_addition: STRING ADD_OPERATOR STRING;

atom: (INTEGER | FLOAT | STRING | VAR_NAME | NONE | TRUE | FALSE);
comp_op: (EQUALS_TO | GREATER_EQUALS | LESSER_EQUALS | GREATER_EQUALS | LESSER_EQUALS | NOT_EQUALS | AND_OPERATOR | OR_OPERATOR | NOT_OPERATOR | OR | NOT | AND);
test: atom comp_op atom; //conditional statements
definition: VAR_NAME ASSIGN atom; //variable declaration
while_stmt: WHILE test (NOT?(AND|OR) test)* COLON (NEWLINE TAB stmt)+; //while loop
if_stmt: IF test (NOT?(AND|OR) test)* COLON ((ELIF test COLON)?indent_block)+ (ELSE COLON indent_block+)?; //if-iterative
for_stmt: FOR VAR_NAME IN VAR_NAME COLON indent_block; //for-iterative
function_call: VAR_NAME O_PAR (atom',')* C_PAR; //calling function (no need for def here)
indent_block: (NEWLINE TAB stmt)+; //allows us to indent each appropriate stmt call

stmt //adding all different arguments
    : test
    | definition
    | augmentation
    | arithmetic_exp
    | if_stmt
    | while_stmt
    | for_stmt
    | COMMENT
    | function_call
    ;

augmentation: VAR_NAME augment (INTEGER|FLOAT);
augment
    : ADD_EQUALS
    | SUB_EQUALS
    | MULT_EQUALS
    | DIV_EQUALS
    | XOR_ASSIGN
    | MOD_ASSIGN
    ;


//Primitive Data Type Tokens
INTEGER: NZ_DIGIT DIGIT* //CASE 1: Ints can be any number 1-9 followed by 0 or more numbers 0-9
    | ZERO; //CASE 2: it can be just 0
FLOAT: DIGIT* DECIMAL //CASE 1: 0 or more digits ([0-9]) followed by a decimal & 1 more more digits [0-9))
    | DIGIT+ DOT; //CASE 2: 1 or more digits ([0-9]) followed by a decimal
STRING: ["] (~["]|'\\"')* ["] //CASE 1: start with " we cannot have another " in the string, unless we escape with \\"
    | ['] (~[']|'\\\'')* [']; //CASE 2: same as case 1 however we start and end with ', escaping with \\\'

VAR_NAME: START_CHAR (LETTER | INTEGER | '_')*; //variables can start with an underscore or a letter and be followed by an sequence
                                                        //of 0 or more letters, integers, or underscores
// WHITE_SPACE: [ \t\n]+ -> skip;
SKIP_WS
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
 ;

fragment SPACES //if we have a space or tab
 : [ \t]+
 ;

fragment LINE_JOINING //how we connect the lines together
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f' )
 ;

NEWLINE: '\r'? '\n';
TAB: '\t';

OPERATOR: MULTIPLY_OPERATOR //all arithmetic operators by fragment
    | SUBTRACT_OPERATOR
    | ADD_OPERATOR
    | EXP_OPERATOR
    | DIV_OPERATOR
    | INTDIV_OPERATOR
    | MOD_OPERATOR;

//fragments for readability
fragment NZ_DIGIT: [1-9];

fragment DIGIT: [0-9];

fragment ZERO: '0';

fragment LETTER: [A-Za-z];

fragment DECIMAL: DOT DIGIT+;

fragment EXPONENT: [+-]? DIGIT+;

fragment START_CHAR: ('_' | [A-Za-z]);

COMMENT: '#' ~[\r\n\f]*;

//NON-CFG Work
//Python Arithmetic Operators and Characters
MULTIPLY_OPERATOR: '*';
SUBTRACT_OPERATOR: '-';
ADD_OPERATOR : '+';
EXP_OPERATOR : '**';
DIV_OPERATOR : '/';
INTDIV_OPERATOR : '//';
MOD_OPERATOR : '%';
ASSIGN : '=';
LESS_THAN : '<';
GREATER_THAN : '>';
EQUALS_TO : '==';
GREATER_EQUALS : '>=';
LESSER_EQUALS : '<=';
NOT_EQUALS : '!=';
ADD_EQUALS: '+=';
SUB_EQUALS : '-=';
MULT_EQUALS : '*=';
DIV_EQUALS : '/=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
OR_OPERATOR : '|';
AND_OPERATOR : '&';
NOT_OPERATOR: '!';

//Python Key characters and statement control characters
DOT : '.';
COMMA : ',';
COLON : ':';
SEMI_COLON : ';';
O_PAR : '(';
C_PAR : ')';
O_BRACE : '{';
C_BRACE : '}';
O_BRACKET : '[';
C_BRACKET : ']';

//Python control statements
IF : 'if';
ELSE : 'else';
ELIF : 'elif';
FOR : 'for';
WHILE : 'while';
CONTINUE : 'continue';
BREAK : 'break';
OR : 'or';
AND : 'and';
NOT : 'not';
IN : 'in';

//Booleans
NONE : 'None';
TRUE : 'True';
FALSE : 'False';

