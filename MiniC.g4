grammar MiniC;

start:
	((line SEMICOLON) | block)*
;

line:
	def | assign| func 
;
def:
	type_ID=(TYPE_INT | TYPE_DOUBLE | TYPE_STRING) ID ('=' expr)?
;

expr:
	MINUS expr                       	   #minusExpr
 	| NOT expr                             #notExpr
	| expr op=(MUL | DIV | MOD) expr       #mulExpr
	| expr op=(PLUS | MINUS) expr          #addExpr
	| expr op=(LIEQ | RIEQ | LI | RI) expr #relationExpr
	| expr op=(EQ | NEQ) expr              #equalExpr
	| expr AND expr                        #andExpr
	| expr OR expr                         #orExpr
	| atom								   #atomExpr
;

atom:
	'(' expr ')'     #exprAtom
	| INT            #intAtom
	| DOUBLE         #doubleAtom
	| ID             #idAtom
	| STRING         #stringAtom
;


assign:
	ID ('=' expr)?
;


func:
	printf | printf2 | scanf
;

printf:
	'출력' '(' expr ')'
;
scanf:
	'입력' '(' STRING ',' '&' ID')'
;

printf2:
;


block:
	'if' condition_contents ('else if' condition_contents)* ('else' condition_block)?
;

condition_contents:
	'(' condition ')' condition_block
;

condition_block:
	line SEMICOLON | '{' start '}'
;

condition:
	assign | expr
;

NEWLINE:	[\r\n]+	{skip();};
SPACE : (' ' | '\t' | '﻿')+	{skip();};

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
LI : '>';
RI : '<';
LIEQ : '>=';
RIEQ : '<=';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
MOD : '%';
NOT : '!';

TRUE : 'true';
FALSE : 'false';
SEMICOLON:	';';

TYPE_INT:	'정수';
TYPE_DOUBLE:	'실수';
TYPE_STRING:	'문자';

INT:	([1-9][0-9]* | '0');
DOUBLE : ([1-9][0-9]* | '0')('.'[0-9]*)?;
STRING : '"'(~["]*)'"' ;
ID:	[a-zA-Z가-힣_][a-zA-Z_가-힣0-9]*;

PARAMETER: (','[a-zA-Z가-힣_]+)(','[a-zA-Z가-힣_]+)*;



