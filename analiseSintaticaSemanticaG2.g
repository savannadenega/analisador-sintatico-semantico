lexer grammar analiseSintaticaSemanticaG2;
options {
    language=Java;
}

DO: 'do';
ELSE: 'else';
IF: 'if';
RETURN: 'return';
WHILE: 'while';


OPERADOR_RELACIONAL:	 '<' | '>' | '>=' | '<=' | '<>' | '=';
OPERADOR_ARITMETICO:	 '+'|'-'|'*'|'/';
PONTOEVIRGULA: ';';

CONST :	('0'..'9')+ ;
VAR  :	('a'..'z')+ ;

WS  :	(' '|'\n'|'\r')+ {skip();} ;

ABRE_PARENTESE : '(';
FECHA_PARENTESE : ')';







