grammar python3;

//Primitive Data Type Tokens
INTEGER: NZ_DIGIT DIGIT* //CASE 1: Ints can be any number 1-9 followed by 0 or more numbers 0-9
    | ZERO; //CASE 2: it can be just 0
FLOAT: DIGIT* DECIMAL //CASE 1: 0 or more digits ([0-9]) followed by a decimal & 1 more more digits [0-9))
    | DIGIT+ DOT; //CASE 2: 1 or more digits ([0-9]) followed by a decimal
STRING: ;

VAR_NAME: ('_' | [A-Za-Z) ([A-Za-z] | INTEGER | '_')*; //variables can start with an underscore or a letter and be followed by an sequence
                                                        //of 0 or more letters, integers, or underscores
WHITE_SPACE: [ \t]+ -> skip;

fragment NZ_DIGIT: [1-9];

fragment DIGIT: [0-9];

fragment ZERO: '0';

fragment DECIMAL: DOT DIGIT+;

fragment EXPONENT: [+-]? DIGIT+;

fragment COMMENT: '#' ~[\r\n\f]*;

//NON-CFG Work

//Python Arithmetic Operators and Characters
ADD_OPERATOR : '+';
MINUS_OPERATOR : '-';
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

