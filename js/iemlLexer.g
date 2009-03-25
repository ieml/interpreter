lexer grammar iemlLexer;

STAR	:	'*' ;
WS  :   (' '|'\t')+ {skip();} ;
PRIMITIVE : 'A' | 'U' | 'S' | 'B' | 'T' | 'O' | 'M' | 'E' ;
EVENT : 'wo' | 'wa' | 'y' | 'o' | 'e' | 'wu' | 'we' | 'u' | 'a' | 'i' | 'j' | 'g' | 's' | 'b' | 't' | 'h' | 'c' | 'k' | 'm' | 'n' | 'p' | 'x' | 'd' | 'f' | 'l' ;
L0LM : ':' ;
L1LM : '.' ;
L2LM : '-' ;
L3LM : '\'' ;
L4LM : ',' ;
L5LM : '_' ;
LPAREN	:	'(' ;
RPAREN	:	')' ;
POR	:	'|' ;
PRINT : 'print' ;
XML : 'xml' ;
