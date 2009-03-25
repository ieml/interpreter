grammar ieml;

options {
	language=JavaScript;
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	EXPRESSION;
	SCRIPT;
	PRINTSTAT; XMLSTAT;
	FUNCTION;
	CAT0;CAT1;CAT2;CAT3;CAT4;CAT5;
	PRIM;
}

@members {
}

script	:	starexpr EOF;

functionEval
  : fn=NAME LPAREN (exp=starexpr | otherfn=functionEval) RPAREN -> ^(FUNCTION $fn $exp? $otherfn?);

starexpr:	STAR category=expr STAR STAR -> ^(EXPRESSION $category);

expr	:	cat0 | cat1 | cat2 | cat3 | cat4 | cat5;

cat0	:	PRIMITIVE L0LM -> ^(CAT0 PRIMITIVE);
cat1	:	((first=cat0 (second=cat0 third=cat0?)?) | EVENT) L1LM -> ^(CAT1 $first? $second? $third? EVENT?);
cat2	:	first=cat1 (second=cat1 third=cat1?)? L2LM -> ^(CAT2 $first $second? $third?);
cat3	:	first=cat2 (second=cat2 third=cat2?)? L3LM -> ^(CAT3 $first $second? $third?);
cat4	:	first=cat3 (second=cat3 third=cat3?)? L4LM -> ^(CAT4 $first $second? $third?);
cat5	:	first=cat4 (second=cat4 third=cat4?)? L5LM -> ^(CAT5 $first $second? $third?);

pop	:	POR;

STAR	:'*' ;
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
NAME: LETTER (LETTER | DIGIT | '_')*;
fragment LETTER: LOWER | UPPER;
fragment LOWER: 'a'..'z';
fragment UPPER: 'A'..'Z';
fragment DIGIT: '0'..'9';


