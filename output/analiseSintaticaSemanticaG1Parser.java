// $ANTLR 3.5.1 /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g 2019-11-14 22:15:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class analiseSintaticaSemanticaG1Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "NEWLINE", "'('", "')'", 
		"'*'", "'+'", "'-'", "'/'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int INT=4;
	public static final int NEWLINE=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expr", "prog"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public analiseSintaticaSemanticaG1Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public analiseSintaticaSemanticaG1Parser(TokenStream input, int port, RecognizerSharedState state) {
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

	public analiseSintaticaSemanticaG1Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return analiseSintaticaSemanticaG1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g"; }



	// $ANTLR start "prog"
	// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:20:1: prog returns [ double v ] : (e= expr ( NEWLINE )* )+ ;
	public final double prog() throws RecognitionException {
		double v = 0.0;


		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:20:26: ( (e= expr ( NEWLINE )* )+ )
			dbg.enterAlt(1);

			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:22:2: (e= expr ( NEWLINE )* )+
			{
			dbg.location(22,2);
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:22:2: (e= expr ( NEWLINE )* )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==INT||LA2_0==6) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:22:3: e= expr ( NEWLINE )*
					{
					dbg.location(22,5);
					pushFollow(FOLLOW_expr_in_prog37);
					e=expr();
					state._fsp--;
					dbg.location(22,12);
					v = e;dbg.location(22,25);
					System.out.println("Resultado: " + v);dbg.location(22,68);
					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:22:68: ( NEWLINE )*
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==NEWLINE) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:22:68: NEWLINE
							{
							dbg.location(22,68);
							match(input,NEWLINE,FOLLOW_NEWLINE_in_prog44); 
							}
							break;

						default :
							break loop1;
						}
					}
					} finally {dbg.exitSubRule(1);}

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "prog"



	// $ANTLR start "expr"
	// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:25:1: expr returns [ double v ] : ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr ) | INT | '(' e= expr ')' );
	public final double expr() throws RecognitionException {
		double v = 0.0;


		Token INT1=null;
		Token INT2=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:25:26: ( INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr ) | INT | '(' e= expr ')' )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==INT) ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= 8 && LA4_1 <= 11)) ) {
					alt4=1;
				}
				else if ( (LA4_1==EOF||(LA4_1 >= INT && LA4_1 <= 7)) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA4_0==6) ) {
				alt4=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:26:2: INT ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr )
					{
					dbg.location(26,2);
					INT1=(Token)match(input,INT,FOLLOW_INT_in_expr61); dbg.location(26,6);
					v = Double.parseDouble( (INT1!=null?INT1.getText():null));dbg.location(26,45);
					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:26:45: ( '+' e= expr | '-' e= expr | '*' e= expr | '/' e= expr )
					int alt3=4;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					switch ( input.LA(1) ) {
					case 9:
						{
						alt3=1;
						}
						break;
					case 10:
						{
						alt3=2;
						}
						break;
					case 8:
						{
						alt3=3;
						}
						break;
					case 11:
						{
						alt3=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(3);}

					switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:26:46: '+' e= expr
							{
							dbg.location(26,46);
							match(input,9,FOLLOW_9_in_expr66); dbg.location(26,52);
							pushFollow(FOLLOW_expr_in_expr72);
							e=expr();
							state._fsp--;
							dbg.location(26,59);
							v += e;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:26:75: '-' e= expr
							{
							dbg.location(26,75);
							match(input,10,FOLLOW_10_in_expr78); dbg.location(26,81);
							pushFollow(FOLLOW_expr_in_expr84);
							e=expr();
							state._fsp--;
							dbg.location(26,88);
							v -= e;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:26:104: '*' e= expr
							{
							dbg.location(26,104);
							match(input,8,FOLLOW_8_in_expr90); dbg.location(26,110);
							pushFollow(FOLLOW_expr_in_expr96);
							e=expr();
							state._fsp--;
							dbg.location(26,117);
							v *= e;
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:26:133: '/' e= expr
							{
							dbg.location(26,133);
							match(input,11,FOLLOW_11_in_expr102); dbg.location(26,139);
							pushFollow(FOLLOW_expr_in_expr108);
							e=expr();
							state._fsp--;
							dbg.location(26,146);
							v /= e;
							}
							break;

					}
					} finally {dbg.exitSubRule(3);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:27:7: INT
					{
					dbg.location(27,7);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_expr119); dbg.location(27,11);
					v = Double.parseDouble( (INT2!=null?INT2.getText():null));
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:30:7: '(' e= expr ')'
					{
					dbg.location(30,7);
					match(input,6,FOLLOW_6_in_expr131); dbg.location(30,13);
					pushFollow(FOLLOW_expr_in_expr137);
					e=expr();
					state._fsp--;
					dbg.location(30,20);
					v = e;dbg.location(30,33);
					match(input,7,FOLLOW_7_in_expr141); 
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
		dbg.location(31, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_prog37 = new BitSet(new long[]{0x0000000000000072L});
	public static final BitSet FOLLOW_NEWLINE_in_prog44 = new BitSet(new long[]{0x0000000000000072L});
	public static final BitSet FOLLOW_INT_in_expr61 = new BitSet(new long[]{0x0000000000000F00L});
	public static final BitSet FOLLOW_9_in_expr66 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_expr_in_expr72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_expr78 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_expr_in_expr84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_expr90 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_expr102 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_expr_in_expr108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_expr131 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_expr_in_expr137 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_expr141 = new BitSet(new long[]{0x0000000000000002L});
}
