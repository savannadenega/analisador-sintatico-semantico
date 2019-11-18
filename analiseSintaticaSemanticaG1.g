grammar analiseSintaticaSemanticaG1;

options {
	language=Java;
}

@members{
	int x;
	int y;
}

/*
Parser rules - Em minúsculo

There is a name, a colon, the definition of the rule and a terminating semicolon
name :	 
;

*/


aplicacomando :
    	( frente { y += $INT; }) ( (entao | apos) aplicacomando)
    	| ( esquerda { x -= $INT; }) ( (entao | apos) aplicacomando)
    	| ( direita { x += $INT; }) ( (entao | apos) aplicacomando)
    	| ( tras { Y -= $INT; }) ( (entao | apos) aplicacomando)
    	;

/*
Lexer rules - Em maiúsculo
Lexer rules are analyzed in the order that they appear
*/

entao	:	 	'ENTAO';
apos	:	 	'APOS';
INT	: 		('0'..'9')+ ;
whitespace:      	(' ' | '\t') ;
newline: 		('\r' '\n' | '\r')+ ;
frente:	 	'FRENTE' whitespace INT newline ;
esquerda:	'ESQUERDA' whitespace INT newline ;
direita:	'DIREITA' whitespace INT newline ;
tras:		'TRAS' whitespace INT newline ;

/*
Testes
*/

/* EXEMPLO DE ENTRADA (Input) no ANTLRWorks 1.5.2:
	3+2*(4+1-11)
	2+1-7
	2/(1+3)

  GERA COMO SA�DA (Output) no ANTLRWorks 1.5.2:
	Resultado: -9.0
	Resultado: -4.0
	Resultado: 0.5
*/