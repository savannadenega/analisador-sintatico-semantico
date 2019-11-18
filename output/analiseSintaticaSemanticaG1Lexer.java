// $ANTLR 3.5.1 /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g 2019-11-14 22:15:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class analiseSintaticaSemanticaG1Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public analiseSintaticaSemanticaG1Lexer() {} 
	public analiseSintaticaSemanticaG1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public analiseSintaticaSemanticaG1Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g"; }

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:7:6: ( '(' )
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:7:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:8:6: ( ')' )
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:8:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:9:6: ( '*' )
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:9:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:10:6: ( '+' )
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:10:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:11:7: ( '-' )
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:11:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:12:7: ( '/' )
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:12:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:41:5: ( ( '0' .. '9' )+ )
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:41:9: ( '0' .. '9' )+
			{
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:41:9: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:42:8: ( ( '\\r' '\\n' | '\\r' )+ )
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:42:12: ( '\\r' '\\n' | '\\r' )+
			{
			// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:42:12: ( '\\r' '\\n' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\r') ) {
					int LA2_2 = input.LA(2);
					if ( (LA2_2=='\n') ) {
						alt2=1;
					}
					else {
						alt2=2;
					}

				}

				switch (alt2) {
				case 1 :
					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:42:13: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 2 :
					// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:42:25: '\\r'
					{
					match('\r'); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | INT | NEWLINE )
		int alt3=8;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt3=1;
			}
			break;
		case ')':
			{
			alt3=2;
			}
			break;
		case '*':
			{
			alt3=3;
			}
			break;
		case '+':
			{
			alt3=4;
			}
			break;
		case '-':
			{
			alt3=5;
			}
			break;
		case '/':
			{
			alt3=6;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt3=7;
			}
			break;
		case '\r':
			{
			alt3=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:20: T__8
				{
				mT__8(); 

				}
				break;
			case 4 :
				// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:25: T__9
				{
				mT__9(); 

				}
				break;
			case 5 :
				// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:30: T__10
				{
				mT__10(); 

				}
				break;
			case 6 :
				// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:36: T__11
				{
				mT__11(); 

				}
				break;
			case 7 :
				// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:42: INT
				{
				mINT(); 

				}
				break;
			case 8 :
				// /Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/analiseSintaticaSemanticaG1.g:1:46: NEWLINE
				{
				mNEWLINE(); 

				}
				break;

		}
	}



}
