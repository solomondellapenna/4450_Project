grammar Python3;

arithmetic_exp: arithmetic_comp 
    | arithmetic_exp OPERATOR arithmetic_exp
    | arithmetic_exp OPERATOR (INTEGER | FLOAT)
    | (INTEGER | FLOAT) OPERATOR arithmetic_exp;

arithmetic_comp: num_addition
    | num_substraction 
    | num_multiplication
    | num_reg_division
    | num_int_division
    | num_exp
    | num_mod;
num_addition: (INTEGER | FLOAT) ADD_OPERATOR (INTEGER | FLOAT) WHITE_SPACE;
num_substraction: (INTEGER | FLOAT) SUBTRACT_OPERATOR (INTEGER | FLOAT) WHITE_SPACE;
num_multiplication: (INTEGER | FLOAT) MULTIPLY_OPERATOR (INTEGER | FLOAT) WHITE_SPACE;
num_reg_division: (INTEGER | FLOAT) DIV_OPERATOR (INTEGER | FLOAT) WHITE_SPACE;
num_int_division: (INTEGER | FLOAT) INTDIV_OPERATOR(INTEGER | FLOAT) WHITE_SPACE;
num_exp: (INTEGER | FLOAT) EXP_OPERATOR (INTEGER | FLOAT) WHITE_SPACE;
num_mod: (INTEGER | FLOAT) MOD_OPERATOR (INTEGER | FLOAT) WHITE_SPACE;

string_addition: STRING ADD_OPERATOR STRING;

//Primitive Data Type Tokens
INTEGER: NZ_DIGIT DIGIT* //CASE 1: Ints can be any number 1-9 followed by 0 or more numbers 0-9
    | ZERO; //CASE 2: it can be just 0
FLOAT: DIGIT* DECIMAL //CASE 1: 0 or more digits ([0-9]) followed by a decimal & 1 more more digits [0-9))
    | DIGIT+ DOT; //CASE 2: 1 or more digits ([0-9]) followed by a decimal
STRING: ["] (~["]|'\\"')* ["] //CASE 1: start with " we cannot have another " in the string, unless we escape with \\"
    | ['] (~[']|'\\\'')* [']; //CASE 2: same as case 1 however we start and end with ', escaping with \\\'

VAR_NAME: START_CHAR (LETTER | INTEGER | '_')*; //variables can start with an underscore or a letter and be followed by an sequence
                                                        //of 0 or more letters, integers, or underscores
WHITE_SPACE: [ \t\n]+ -> skip;

NEWLINE: '\r'? '\n';

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

//Booleans
TRUE : 'True';
FALSE : 'False';

