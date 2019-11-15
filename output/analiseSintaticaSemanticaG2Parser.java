// $ANTLR 3.5.1 C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g 2019-11-15 15:04:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class analiseSintaticaSemanticaG2Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABRE_PARENTESE", "ATRIBUI", "CONST", 
		"DO", "ELSE", "FECHA_PARENTESE", "IF", "OPERADOR_ARITMETICO", "OPERADOR_RELACIONAL", 
		"PONTOEVIRGULA", "RETURN", "THEN", "VAR", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ABRE_PARENTESE=4;
	public static final int ATRIBUI=5;
	public static final int CONST=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int FECHA_PARENTESE=9;
	public static final int IF=10;
	public static final int OPERADOR_ARITMETICO=11;
	public static final int OPERADOR_RELACIONAL=12;
	public static final int PONTOEVIRGULA=13;
	public static final int RETURN=14;
	public static final int THEN=15;
	public static final int VAR=16;
	public static final int WHILE=17;
	public static final int WS=18;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "teste", "aritmetic_expression", "atribuicao"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public analiseSintaticaSemanticaG2Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public analiseSintaticaSemanticaG2Parser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public analiseSintaticaSemanticaG2Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return analiseSintaticaSemanticaG2Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g"; }



	// $ANTLR start "atribuicao"
	// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:7:1: atribuicao : VAR ATRIBUI aritmetic_expression ;
	public final void atribuicao() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:7:11: ( VAR ATRIBUI aritmetic_expression )
			dbg.enterAlt(1);

			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:7:13: VAR ATRIBUI aritmetic_expression
			{
			dbg.location(7,13);
			match(input,VAR,FOLLOW_VAR_in_atribuicao24); dbg.location(7,17);
			match(input,ATRIBUI,FOLLOW_ATRIBUI_in_atribuicao26); dbg.location(7,25);
			pushFollow(FOLLOW_aritmetic_expression_in_atribuicao28);
			aritmetic_expression();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(7, 44);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "aritmetic_expression"
	// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:8:1: aritmetic_expression : ( CONST OPERADOR_ARITMETICO aritmetic_expression | VAR OPERADOR_ARITMETICO aritmetic_expression | ABRE_PARENTESE aritmetic_expression FECHA_PARENTESE | CONST | VAR );
	public final void aritmetic_expression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "aritmetic_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(8, 0);

		try {
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:9:2: ( CONST OPERADOR_ARITMETICO aritmetic_expression | VAR OPERADOR_ARITMETICO aritmetic_expression | ABRE_PARENTESE aritmetic_expression FECHA_PARENTESE | CONST | VAR )
			int alt1=5;
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			switch ( input.LA(1) ) {
			case CONST:
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1==OPERADOR_ARITMETICO) ) {
					alt1=1;
				}
				else if ( (LA1_1==EOF||LA1_1==FECHA_PARENTESE) ) {
					alt1=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VAR:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==OPERADOR_ARITMETICO) ) {
					alt1=2;
				}
				else if ( (LA1_2==EOF||LA1_2==FECHA_PARENTESE) ) {
					alt1=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ABRE_PARENTESE:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:9:5: CONST OPERADOR_ARITMETICO aritmetic_expression
					{
					dbg.location(9,5);
					match(input,CONST,FOLLOW_CONST_in_aritmetic_expression37); dbg.location(9,11);
					match(input,OPERADOR_ARITMETICO,FOLLOW_OPERADOR_ARITMETICO_in_aritmetic_expression39); dbg.location(9,32);
					pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression42);
					aritmetic_expression();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:10:5: VAR OPERADOR_ARITMETICO aritmetic_expression
					{
					dbg.location(10,5);
					match(input,VAR,FOLLOW_VAR_in_aritmetic_expression50); dbg.location(10,9);
					match(input,OPERADOR_ARITMETICO,FOLLOW_OPERADOR_ARITMETICO_in_aritmetic_expression52); dbg.location(10,29);
					pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression54);
					aritmetic_expression();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:11:5: ABRE_PARENTESE aritmetic_expression FECHA_PARENTESE
					{
					dbg.location(11,5);
					match(input,ABRE_PARENTESE,FOLLOW_ABRE_PARENTESE_in_aritmetic_expression60); dbg.location(11,20);
					pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression62);
					aritmetic_expression();
					state._fsp--;
					dbg.location(11,41);
					match(input,FECHA_PARENTESE,FOLLOW_FECHA_PARENTESE_in_aritmetic_expression64); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:12:5: CONST
					{
					dbg.location(12,5);
					match(input,CONST,FOLLOW_CONST_in_aritmetic_expression70); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:13:5: VAR
					{
					dbg.location(13,5);
					match(input,VAR,FOLLOW_VAR_in_aritmetic_expression76); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "aritmetic_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "aritmetic_expression"



	// $ANTLR start "teste"
	// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:16:1: teste : IF OPERADOR_RELACIONAL THEN ;
	public final void teste() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "teste");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:16:6: ( IF OPERADOR_RELACIONAL THEN )
			dbg.enterAlt(1);

			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:17:2: IF OPERADOR_RELACIONAL THEN
			{
			dbg.location(17,2);
			match(input,IF,FOLLOW_IF_in_teste88); dbg.location(17,5);
			match(input,OPERADOR_RELACIONAL,FOLLOW_OPERADOR_RELACIONAL_in_teste90); dbg.location(17,25);
			match(input,THEN,FOLLOW_THEN_in_teste92); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(18, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "teste");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "teste"

	// Delegated rules



	public static final BitSet FOLLOW_VAR_in_atribuicao24 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ATRIBUI_in_atribuicao26 = new BitSet(new long[]{0x0000000000010050L});
	public static final BitSet FOLLOW_aritmetic_expression_in_atribuicao28 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_aritmetic_expression37 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_OPERADOR_ARITMETICO_in_aritmetic_expression39 = new BitSet(new long[]{0x0000000000010050L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_aritmetic_expression50 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_OPERADOR_ARITMETICO_in_aritmetic_expression52 = new BitSet(new long[]{0x0000000000010050L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABRE_PARENTESE_in_aritmetic_expression60 = new BitSet(new long[]{0x0000000000010050L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression62 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_FECHA_PARENTESE_in_aritmetic_expression64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_aritmetic_expression70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_aritmetic_expression76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_teste88 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_OPERADOR_RELACIONAL_in_teste90 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_THEN_in_teste92 = new BitSet(new long[]{0x0000000000000002L});
}
