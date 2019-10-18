grammar MiniC;

start:
	((line SEMICOLON) | block)*
;

line:
	def | assign | expr | func 
;
def:
	type_ID=(KW_INT | KW_DOUBLE | KW_STRING) ID (ASSIGN expr)?
;

expr:
	ID PLUSPLUS                      	   #plusplusExpr
	| ID MINMIN                      	   #minminExpr
	| MINUS expr                       	   #minusExpr
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
	OP expr CP     #exprAtom
	| INT            #intAtom
	| DOUBLE         #doubleAtom
	| ID             #idAtom
	| STRING         #stringAtom
;


assign:
	ID ('=' expr)?
;


func:
	printf | scanf
;

printf:
	PW_PRINT OP STRING  PARAMETER CP #parameterPrintf
	| PW_PRINT OP STRING CP			 #commonPrintf
;

scanf:
	PW_SCAN OP STRING SCANPARAMETER CP
;

block:
	KW_IF if_contents (KW_ELSE KW_IF if_contents)* (KW_ELSE condition_block)? #ifBlock
	| KW_WHILE while_contents #whileBlock
	| KW_FOR for_contents #forBlock  
;

if_contents:
	OP condition CP condition_block
;

while_contents:
	OP condition CP condition_block
;

for_contents:
	OP (def|assign)? SEMICOLON condition? SEMICOLON line? CP condition_block 
;

condition:
	assign | expr
;

condition_block:
	line SEMICOLON | OB start CB
;


ANNOTATIONS: '/*'.*?'*/' {skip();};
ANNOTATION:	'//'(~[\r\n]*) {skip();};
NEWLINE:	[\r\n]+	{skip();};
SPACE : (' ' | '\t' | '﻿')+	{skip();};

OP:	'(';
CP:	')';
OB:	'{';
CB:	'}';
COMMA: ',';
REF:	'&';

PLUSPLUS :'++' ;
MINMIN : '--';
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
ASSIGN:	'=';
SEMICOLON:	';';

KW_INT:	'정수';
KW_DOUBLE:	'실수';
KW_STRING:	'문자';
KW_IF:	'만약';
KW_ELSE:	'아니면';
KW_WHILE:	'조건반복';
KW_FOR:	'반복';
PW_PRINT:	'출력';
PW_SCAN:	'입력';

INT:	([1-9][0-9]* | '0');
DOUBLE : ([1-9][0-9]* | '0')('.'[0-9]*)?;
STRING : '"'(~["]*)'"' ;
ID:	[a-zA-Z가-힣_][a-zA-Z_가-힣0-9]*;



PARAMETER: (','' '*ID)(','' '*ID)*;
SCANPARAMETER: (','' 'REF*ID)(','' 'REF*ID)*;


