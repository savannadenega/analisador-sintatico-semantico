grammar analiseSintaticaSemanticaG1;

options {
	language=Java;
}

prog returns [ double v ]:

	(e = expr {$v = $e.v;} {System.out.println("Resultado: " + $v);}  NEWLINE*)+
	;

expr returns [ double v ]:
	INT {$v = Double.parseDouble( $INT.text);} ('+' e = expr {$v += $e.v;} | '-' e = expr {$v -= $e.v;} | '*' e = expr {$v *= $e.v;} | '/' e = expr {$v /= $e.v;})
    |	INT {$v = Double.parseDouble( $INT.text);}


    |	'(' e = expr {$v = $e.v;} ')'
    ;
NEWLINE : ('\r' | '\n')+ ;
INT     : ('0'..'9')+ ;

/* EXEMPLO DE ENTRADA (Input) no ANTLRWorks 1.5.2:
	3+2*(4+1-11)
	2+1-7
	2/(1+3)

  GERA COMO SA�DA (Output) no ANTLRWorks 1.5.2:
	Resultado: -9.0
	Resultado: -4.0
	Resultado: 0.5
*/
