grammar analiseSintaticaSemanticaG2;

options {
    language=Java;
}



parse
 	: prog EOF
 	;

 
prog: 
   stat* ;

stat	
	:atribuicao 
	|teste
	|relational_expression
	|aritmetic_expression
	|OTHER {System.err.println("Caractere não reconhecido: " + $OTHER.text);}
	|iteracao
	;
	

atribuicao
	: VAR '=' aritmetic_expression SEMI
	;	
	

	
teste
	:(IF relational_expression THEN comando+)(SEMI)* (ELSE comando+ (SEMI)*)*
	;
	
iteracao
	: WHILE relational_expression DO comando+ SEMI
	;	


comando
	: atribuicao
	| teste
	| iteracao
	;
	
relational_expression
	: VAR OPERADOR_RELACIONAL aritmetic_expression 
            	        
	;
	

aritmetic_expression
	: CONST ('*'|'/') aritmetic_expression 
    	| CONST ('+'|'-') aritmetic_expression
    	| VAR ('*'|'/') aritmetic_expression
    	| VAR ('+'|'-') aritmetic_expression
    	| VAR                    
    	| CONST                    
    	| '(' aritmetic_expression ')'         
    	;
 		


DO: 'do';
ELSE: 'else';
IF: 'if';
RETURN: 'return';
WHILE: 'while';
THEN	: 'then';


OPERADOR_RELACIONAL:	 '<' | '>' | '>=' | '<=' | '<>' | '==';
SEMI: ';';


CONST :	('0'..'9')+ ;
VAR  :	('a'..'z')+ ;

WS  :	(' '|'\n'|'\r')+ {skip();} ;
OTHER
 : . 
 ;
 
 
 
 
