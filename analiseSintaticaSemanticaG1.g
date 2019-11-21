grammar analiseSintaticaSemanticaG1;

options {
	language=Java;
}

@parser::members {
  @Override
  public void reportError(RecognitionException e) {
    System.out.println("\nEXCECAO SINTATICA/SEMANTICA: " + e + "\n");
  }
  	int x = 0;
	int y = 0;
	int comandonumero = 1;
	String sentidoantes = "";
	String operacaoaritmeticaantes = "";
	int valorantes = 0;
	String sentidodepois = "";
	String operacaoaritmeticadepois = "";
	int valordepois = 0;
	String simbolomais = "+";
	String simbolomenos = "-";
	String simbolox = "x";
	String simboloy = "y";
}

parse 	: 
	prog EOF
 	;
 	
prog  	: 
   	verificacomando* 
   	;

verificacomando :
    	determinacomandoantes verificacomandointermediariowhitespace
    	;
    	
determinacomandoantes :
	FRENTE WHITESPACE INT {sentidoantes = simbolox; operacaoaritmeticaantes = simbolomais; valorantes = Integer.parseInt( $INT.text); System.out.println("TOKEN ANTES DETECTADO: " + sentidoantes + " " + operacaoaritmeticaantes + "= " + valorantes);}
	| TRAS WHITESPACE INT {sentidoantes = simbolox; operacaoaritmeticaantes = simbolomenos; valorantes = Integer.parseInt( $INT.text); System.out.println("TOKEN ANTES DETECTADO: " + sentidoantes + " " + operacaoaritmeticaantes + "= " + valorantes);}
	| ESQUERDA WHITESPACE INT {sentidoantes = simboloy; operacaoaritmeticaantes = simbolomenos; valorantes = Integer.parseInt( $INT.text); System.out.println("TOKEN ANTES DETECTADO: " + sentidoantes + " " + operacaoaritmeticaantes + "= " + valorantes);}
	| DIREITA WHITESPACE INT {sentidoantes = simboloy; operacaoaritmeticaantes = simbolomais; valorantes = Integer.parseInt( $INT.text); System.out.println("TOKEN ANTES DETECTADO: " + sentidoantes + " " + operacaoaritmeticaantes + "= " + valorantes);}
	;

verificacomandointermediariowhitespace :	
	WHITESPACE verificacomandointermediario
	| verificacomandointermediario
	;

verificacomandointermediario :	
	APOS WHITESPACE {System.out.println("TOKEN INTERMEDIARIO DETECTADO: APOS");} determinacomandodepois aplicacomando[sentidodepois,operacaoaritmeticadepois,valordepois] aplicacomando[sentidoantes,operacaoaritmeticaantes,valorantes]
	| ENTAO WHITESPACE {System.out.println("TOKEN INTERMEDIARIO DETECTADO: ENTAO");} determinacomandodepois aplicacomando[sentidoantes,operacaoaritmeticaantes,valorantes] aplicacomando[sentidodepois,operacaoaritmeticadepois,valordepois]
	| NEWLINE {System.out.println("TOKEN FINAL DETECTADO: NEWLINE");} aplicacomando[sentidoantes,operacaoaritmeticaantes,valorantes]
	;

determinacomandodepois :
	FRENTE WHITESPACE INT NEWLINE {sentidodepois = simbolox; operacaoaritmeticadepois = simbolomais; valordepois = Integer.parseInt( $INT.text); System.out.println("TOKEN DEPOIS DETECTADO: " + sentidodepois + " " + operacaoaritmeticadepois + "= " + valordepois);}
	| TRAS WHITESPACE INT NEWLINE {sentidodepois = simbolox; operacaoaritmeticadepois = simbolomenos; valordepois = Integer.parseInt( $INT.text); System.out.println("TOKEN DEPOIS DETECTADO: " + sentidodepois + " " + operacaoaritmeticadepois + "= " + valordepois);}
	| ESQUERDA WHITESPACE INT NEWLINE {sentidodepois = simboloy; operacaoaritmeticadepois = simbolomenos; valordepois = Integer.parseInt( $INT.text); System.out.println("TOKEN DEPOIS DETECTADO: " + sentidodepois + " " + operacaoaritmeticadepois + "= " + valordepois);}
	| DIREITA WHITESPACE INT NEWLINE {sentidodepois = simboloy; operacaoaritmeticadepois = simbolomais; valordepois = Integer.parseInt( $INT.text); System.out.println("TOKEN DEPOIS DETECTADO: " + sentidodepois + " " + operacaoaritmeticadepois + "= " + valordepois);}
	;

aplicacomando[String sentido, String operacaoaritmetica, int valor]:	
	{System.out.println("\nCOMANDO APLICADO: " + sentido + " " + operacaoaritmetica + "= " + valor);
	if(sentido.equalsIgnoreCase(simbolox)){
		if(operacaoaritmetica.equals(simbolomais)){
			System.out.println("COMANDO: Andou para frente " + x + " passos");
			x += valor;
		}else if(operacaoaritmetica.equals(simbolomenos)){
			System.out.println("COMANDO: Virou 180 graus e andou " + x + " passos" );
			x -= valor;
		}
	}else if(sentido.equalsIgnoreCase(simboloy)){
		if(operacaoaritmetica.equals(simbolomais)){
			System.out.println("COMANDO: Virou 90 graus para direita e andou " + y + " passos" );
			y += valor;
		} else if(operacaoaritmetica.equals(simbolomenos)){
			System.out.println("COMANDO: Virou 90 graus para esquerda e andou " + y + " passos" );
			y -= valor;
		}
	}
	}
	imprimeresultado
	;


imprimeresultado :
	{System.out.println("\nFINAL | COMANDO NUMERO: " + comandonumero + " | Distância percorrida TOTAL  x: " + x + "  y: " + y + "\n"); comandonumero++;}
	;	

FRENTE 	:	'FRENTE';
TRAS 	:	'TRAS';
ESQUERDA:	'ESQUERDA';
DIREITA :	'DIREITA';
ENTAO	:	'ENTAO';
APOS	:	'APOS';
INT	: 	('0'..'9')+ ;
WHITESPACE:     (' ' | '\t') ;
NEWLINE: 	('\r' '\n' | '\r')+ ;

FallThrough
@after{
  throw new RuntimeException(String.format(
      "ENCONTRADO UM CARACTERE ILEGAL NA LINHA [\%d] COLUNA [\%d]: ['\%s']", 
      getLine(), getCharPositionInLine(), getText()
    )
  );
}
  :  .
  ;