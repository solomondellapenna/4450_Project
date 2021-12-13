grammar variables;
NUMBER
    : INTEGER
    | FLOAT;
INTEGER
    : [-+]? DIGIT+
    | ZERO;
FLOAT
    : INTEGER '.' [ZERO | DIGIT]*
    | INTEGER '.'
    | ZERO '.' [ZERO | DIGIT]*;
CHAR
    : LOW_CHAR
    | HIGH_CHAR;
STRING
    : ["'] [NUMBER | CHAR]* ["'];

fragment DIGIT
    : [1-9];
fragment NEG_DIGIT
    : '-' DIGIT;
fragment POS_DIGIT
    : '+' DIGIT;






fragment ZERO
    : [0];
fragment LOW_CHAR
    : [a-z];
fragment HIGH_CHAR
    : [A-Z];
fragment CHAR
    : HIGH_CHAR
    | LOW_CHAR;
fragment STRING
    : CHAR*;
fragment INTEGER
    : DIGIT+
    | ZERO;
fragment FLOAT
    : ZERO? '.' DIGIT*
    | INTEGER;
fragment TRUE
    : 'True'
    | '1';
fragment FALSE
    : 'False'
    | '0';
fragment BOOLEAN
    : TRUE
    | FALSE;
