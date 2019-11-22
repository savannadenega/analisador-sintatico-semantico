grammar analiseSintaticaSemanticaG2;

options {
    language=Java;
}

@parser::members {
  @Override
  public void reportError(RecognitionException e) {
    //System.out.println("\nEXCECAO SINTATICA/SEMANTICA: " + e + "\n");
   
  }
int valor = 0;
String simb= " ";
String operador= " ";
String semi= " ";
String comando = " ";
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
|iteracao
;


atribuicao
: VAR {simb = $VAR.text; System.out.println("Variavel " + simb + " detectada");}'='{System.out.println("Operador de atribuicao = detectado");} aritmetic_expression SEMI{semi = $SEMI.text; System.out.println("Ponto e virgula " + semi + " detectado");}
;

teste
:(IF{comando = $IF.text; System.out.println("Comando " + comando + " detectado");} relational_expression THEN{comando = $THEN.text; System.out.println("Comando " + comando + " detectado");} comando+)(SEMI)* (ELSE{comando = $ELSE.text; System.out.println("Comando " + comando + " detectado");} comando+ (SEMI))
;



iteracao
: WHILE {comando = $WHILE.text; System.out.println("Comando " + comando + " detectado");}relational_expression DO{comando = $DO.text; System.out.println("Comando " + comando + " detectado");} comando+ SEMI
;


comando
: atribuicao
| teste
| iteracao
;

relational_expression
: VAR{simb = $VAR.text; System.out.println("Variavel " + simb + " detectada");} OPERADOR_RELACIONAL {operador = $OPERADOR_RELACIONAL.text; System.out.println("Operador relacional " + operador + " detectado");} aritmetic_expression
   
;


aritmetic_expression
: CONST {valor = Integer.parseInt( $CONST.text);System.out.println("Constante " + valor + " detectada");} ('*'{System.out.println("Operador * detectado");}|'/'{System.out.println("Operador / detectado");}) aritmetic_expression
    | CONST {valor = Integer.parseInt( $CONST.text);System.out.println("Constante " + valor + " detectada");} ('+'{System.out.println("Operador + detectado");}|'-'{System.out.println("Operador - detectado");}) aritmetic_expression
    | VAR {simb = $VAR.text; System.out.println("Variavel " + simb + " detectada");} ('*'{System.out.println("Operador * detectado");}|'/'{System.out.println("Operador / detectado");}) aritmetic_expression
    | VAR {simb = $VAR.text; System.out.println("Variavel " + simb + " detectada");} ('+'{System.out.println("Operador + detectado");}|'-'{System.out.println("Operador - detectado");}) aritmetic_expression
    | VAR {simb = $VAR.text; System.out.println("Variavel " + simb + " detectada");}                  
    | CONST {valor = Integer.parseInt( $CONST.text);System.out.println("Constante " + valor + " detectada");}                  
    | '(' {System.out.println("Símbolo ( detectado");}aritmetic_expression ')'{System.out.println("Símbolo ) detectado");}
         
    ;

DO: 'do';
ELSE: 'else';
IF: 'if';
RETURN: 'return';
WHILE: 'while';
THEN : 'then';


OPERADOR_RELACIONAL: '<' | '>' | '>=' | '<=' | '<>' | '==';
SEMI: ';';


CONST : ('0'..'9')+ ;
VAR  : ('a'..'z')+ ;

WS  : (' '|'\n'|'\r')+ {skip();} ;


FallThrough
@after{
  throw new RuntimeException(String.format(
      "Caractere ilegal reconhecido na linha \%d, coluna \%d: '\%s'",
      getLine(), getCharPositionInLine(), getText()
)
  );
}
  :  .
  ;