grammar analiseSintaticaSemanticaG2;
options {
    language=Java;
}


	
aritmetic_expression
	:  CONST OPERADOR_ARITMETICO  aritmetic_expression  
	|  VAR OPERADOR_ARITMETICO aritmetic_expression
	|  aritmetic_expression OPERADOR_ARITMETICO aritmetic_expression
	|  ABRE_PARENTESE aritmetic_expression FECHA_PARENTESE
	|  CONST
	|  VAR
	;
	
 
atribuicao
	: VAR ':=' aritmetic_expression
	;
	
relational_expression
	:aritmetic_expression OPERADOR_RELACIONAL aritmetic_expression
	;
	
teste
	: IF relational_expression THEN (comando PONTOEVIRGULA)+ 
	| IF relational_expression THEN (comando PONTOEVIRGULA)+ ELSE (comando PONTOEVIRGULA)+
	;

	
comando
	: atribuicao
	| teste
	| iteracao
	;
	
iteracao
	: WHILE relational_expression DO (comando PONTOEVIRGULA)+ 
	;
	

	

/*(a) “if” seguido de expressão relacional, seguida de “then”, seguido de lista de um
ou mais comandos comandos separados por ";" ou
(b) “if” seguido de expressão relacional, seguida de “then”, seguido de lista de um
ou mais comandos separados por ";" finalizada por “else” que é seguido por uma nova lista
de um ou mais comandos separados por ";".*/


DO: 'do';
ELSE: 'else';
IF: 'if';
RETURN: 'return';
WHILE: 'while';
THEN	: 'then';


OPERADOR_RELACIONAL:	 '<' | '>' | '>=' | '<=' | '<>' | '=';
OPERADOR_ARITMETICO:	 '+'|'-'|'*'|'/';
PONTOEVIRGULA: ';';
ATRIBUI	:	':=';

CONST :	('0'..'9')+ ;
VAR  :	('a'..'z') ;

//WS  :	(' '|'\n'|'\r')+ {skip();} ;

ABRE_PARENTESE : '(';
FECHA_PARENTESE : ')';





