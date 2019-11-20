grammar analiseSintaticaSemanticaG1;

options {
	language=Java;
}

@members{
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

verificacomando :
    	determinacomandoantes verificacomandointermediariowhitespace verificacomandointermediario
    	;
    	
determinacomandoantes :
	FRENTE WHITESPACE INT {sentidoantes = simbolox; operacaoaritmeticaantes = simbolomais; valorantes = Integer.parseInt( $INT.text); System.out.println(sentidoantes + " " + operacaoaritmeticaantes + " " + valorantes);}
	;

verificacomandointermediariowhitespace :	
	WHITESPACE 
	;

verificacomandointermediario :	
	APOS WHITESPACE determinacomandodepois aplicacomando[sentidodepois,operacaoaritmeticadepois,valordepois] aplicacomando[sentidoantes,operacaoaritmeticaantes,valorantes]
	| ENTAO WHITESPACE determinacomandodepois aplicacomando[sentidoantes,operacaoaritmeticaantes,valorantes] aplicacomando[sentidodepois,operacaoaritmeticadepois,valordepois]
	| NEWLINE aplicacomando[sentidoantes,operacaoaritmeticaantes,valorantes] 
	;

determinacomandodepois :
	FRENTE WHITESPACE INT NEWLINE {sentidodepois = simbolox; operacaoaritmeticadepois = simbolomais; valordepois = Integer.parseInt( $INT.text);}
	;

aplicacomando[String sentido, String operacaoaritmetica, int valor]:	
	{ System.out.println(sentidoantes + " " + operacaoaritmeticaantes + " " + valorantes);
	System.out.println(sentido + " " + operacaoaritmetica + " " + valor);
	if(sentido.equalsIgnoreCase(simbolox)){
		System.out.println("Passou pelo x");
		if(operacaoaritmetica.equals(simbolomais)){
			System.out.println("Passou pelo +");
			x += valor;
		}
	}
	}
	imprimeresultado
	;


imprimeresultado :
	{System.out.println("Comando número: " + comandonumero + " | x: " + x + " | y: " + y); comandonumero++;}
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
