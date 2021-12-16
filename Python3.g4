grammar Python3;

arithmetic_exp: arithmetic_exp OPERATOR arithmetic_exp
    | arithmetic_exp OPERATOR (INTEGER | FLOAT)
    | (INTEGER | FLOAT) OPERATOR arithmetic_exp
    | num_arithmetic;

num_arithmetic: (INTEGER | FLOAT) OPERATOR (INTEGER | FLOAT);
string_addition: STRING ADD_OPERATOR STRING;

atom: (INTEGER | FLOAT | STRING | VAR_NAME | NONE | TRUE | FALSE);
comp_op: ('<' | '>' | '==' | '>=' | '<=' | '<>' | '!=' | AND_OPERATOR | OR_OPERATOR | NOT_OPERATOR | OR | NOT | AND);
test: atom comp_op atom;
definition: VAR_NAME ASSIGN atom;
while_exp: WHILE ' ' test COLON NEWLINE TAB
    | WHILE ' ' test (COMPOUND_EXP ' ' test)* COLON NEWLINE TAB;

stmt
    : test
    | definition
    | arithmetic_exp
    | while_exp
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

fragment SPACES
 : [ \t]+
 ;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f' )
 ;

NEWLINE: '\r'? '\n';
TAB: '\t';

OPERATOR: MULTIPLY_OPERATOR
    | SUBTRACT_OPERATOR
    | ADD_OPERATOR
    | EXP_OPERATOR
    | DIV_OPERATOR
    | INTDIV_OPERATOR
    | MOD_OPERATOR;

fragment NZ_DIGIT: [1-9];

fragment DIGIT: [0-9];

fragment ZERO: '0';

fragment LETTER: [A-Za-z];

fragment DECIMAL: DOT DIGIT+;

fragment EXPONENT: [+-]? DIGIT+;

fragment START_CHAR: ('_' | [A-Za-z]);

fragment COMMENT: '#' ~[\r\n\f]*;

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
COMPOUND_EXP: OR | AND | NOT;

//Booleans
NONE : 'None';
TRUE : 'True';
FALSE : 'False';

