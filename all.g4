grammar all;

stmt
    : COMMENT
    | expr_stmt
    // | while
    // | if
    // | for
    ;

COMMENT
    : '#' ~[\r\n\f]*
    ;

expr_stmt
 : testlist_star_expr ( augassign testlist
                      | ( '=' testlist_star_expr )*
                      )
 ;           

 /// testlist_star_expr: (test|star_expr) (',' (test|star_expr))* [',']
testlist_star_expr
 : test  ( ',' test )* ','?
 ;

augassign
 : '+=' 
 | '-=' 
 | '*=' 
 | '@=' // PEP 465
 | '/=' 
 | '%=' 
 | '&=' 
 | '|=' 
 | '^=' 
 | '<<=' 
 | '>>=' 
 | '**=' 
 | '//='
 ;

testlist
 : test ( ',' test )* ','?
 ;

test
 : or_test ( IF or_test ELSE test )?
 ;

test_nocond
 : or_test 
 ;

/// or_test: and_test ('or' and_test)*
or_test
 : and_test ( OR and_test )*
 ;

/// and_test: not_test ('and' not_test)*
and_test
 : not_test ( AND not_test )*
 ;

/// not_test: 'not' not_test | comparison
not_test
 : NOT not_test
 | atom
 ;

/// # <> isn't actually a valid comparison operator in Python. It's here for the
/// # sake of a __future__ import described in PEP 401
/// comp_op: '<'|'>'|'=='|'>='|'<='|'<>'|'!='|'in'|'not' 'in'|'is'|'is' 'not'
comp_op
 : '<'
 | '>'
 | '=='
 | '>='
 | '<='
 | '<>'
 | '!='
 | IN
 | NOT IN
 | IS
 | IS NOT
 ;


PRINT: 'print';
DEF : 'def';
RETURN : 'return';
RAISE : 'raise';
FROM : 'from';
IMPORT : 'import';
AS : 'as';
GLOBAL : 'global';
NONLOCAL : 'nonlocal';
ASSERT : 'assert';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IN : 'in';
TRY : 'try';
FINALLY : 'finally';
WITH : 'with';
EXCEPT : 'except';
LAMBDA : 'lambda';
OR : 'or';
AND : 'and';
NOT : 'not';
IS : 'is';
NONE : 'None';
TRUE : 'True';
FALSE : 'False';
CLASS : 'class';
YIELD : 'yield';
DEL : 'del';
PASS : 'pass';
CONTINUE : 'continue';
BREAK : 'break';

atom
 : '(' testlist_comp? ')'
 | '[' testlist_comp? ']'  
 | '{' dictorsetmaker? '}' 
 | NAME
 | number 
 | str_+ 
 | '...' 
 | NONE
 | TRUE
 | FALSE
 ;

testlist_comp
 : test ( comp_for 
        | ( ',' test )* ','? 
        )
 ;
 
comp_for
 : FOR exprlist IN or_test comp_iter?
 ;

comp_iter
 : comp_for 
 | comp_if
 ;

comp_if
 : IF test_nocond comp_iter?
 ;

exprlist
 : atom ( ',' atom )* ','?
 ;

dictorsetmaker
 : test ':' test ( comp_for 
                 | ( ',' test ':' test )* ','? 
                 ) 
 | test ( comp_for 
        | ( ',' test )* ','? 
        )
 ;

NAME
 : [A-Za-z_]+[A-Za-z0-9]*
 ;

number
 : DECIMAL_INTEGER
 | POINT_FLOAT
 ;

DECIMAL_INTEGER
 : NON_ZERO_DIGIT DIGIT*
 | '0'+
 ;

fragment NON_ZERO_DIGIT
 : [1-9]
 ;

/// digit          ::=  "0"..."9"
fragment DIGIT
 : [0-9]
 ;

POINT_FLOAT
 : INT_PART? FRACTION
 | INT_PART '.'
 ;

fragment INT_PART
 : DIGIT+
 ;

 fragment FRACTION
 : '.' DIGIT+
 ;

str_
 : STRING
 ;

STRING
 : '\'' ~[\\\r\n\f']* '\''
 | '"'  ~[\\\r\n\f"]* '"'
 ;


SKIP_
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
 ;

fragment SPACES
 : [ \t]+
 ;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f' )
 ;

 
