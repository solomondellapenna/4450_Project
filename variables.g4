grammar variables;
NUMBER
    : INTEGER
    | FLOAT;
INTEGER
    : [-+]? [1-9] DIGIT+
    | [0];
FLOAT
    : INTEGER '.' DIGIT*;
CHAR
    : LOW_CHAR
    | HIGH_CHAR;
STRING
    : ["] (~["]|'\\"')* ["]
    | ['] (~[']|'\\\'')* ['];
BOOLEAN
    : TRUE
    | FALSE;

fragment DIGIT
    : [0-9];
fragment NEG_DIGIT
    : '-' DIGIT;
fragment POS_DIGIT
    : '+' DIGIT;
fragment LOW_CHAR
    : [a-z];
fragment HIGH_CHAR
    : [A-Z];
fragment TRUE
    : 'True'
    | '1';
fragment FALSE
    : 'False'
    | '0';

