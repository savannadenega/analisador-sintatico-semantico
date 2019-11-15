// $ANTLR 3.5.1 C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g 2019-11-15 15:04:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class analiseSintaticaSemanticaG2Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public analiseSintaticaSemanticaG2Lexer() {} 
	public analiseSintaticaSemanticaG2Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public analiseSintaticaSemanticaG2Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g"; }

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:29:3: ( 'do' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:29:5: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:30:5: ( 'else' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:30:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:31:3: ( 'if' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:31:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:32:7: ( 'return' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:32:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:33:6: ( 'while' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:33:8: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:34:6: ( 'then' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:34:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "OPERADOR_RELACIONAL"
	public final void mOPERADOR_RELACIONAL() throws RecognitionException {
		try {
			int _type = OPERADOR_RELACIONAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:37:20: ( '<' | '>' | '>=' | '<=' | '<>' | '=' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case '<':
				{
				switch ( input.LA(2) ) {
				case '=':
					{
					alt1=4;
					}
					break;
				case '>':
					{
					alt1=5;
					}
					break;
				default:
					alt1=1;
				}
				}
				break;
			case '>':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='=') ) {
					alt1=3;
				}

				else {
					alt1=2;
				}

				}
				break;
			case '=':
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:37:23: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:37:29: '>'
					{
					match('>'); 
					}
					break;
				case 3 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:37:35: '>='
					{
					match(">="); 

					}
					break;
				case 4 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:37:42: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:37:49: '<>'
					{
					match("<>"); 

					}
					break;
				case 6 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:37:56: '='
					{
					match('='); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERADOR_RELACIONAL"

	// $ANTLR start "OPERADOR_ARITMETICO"
	public final void mOPERADOR_ARITMETICO() throws RecognitionException {
		try {
			int _type = OPERADOR_ARITMETICO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:38:20: ( '+' | '-' | '*' | '/' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:
			{
			if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERADOR_ARITMETICO"

	// $ANTLR start "PONTOEVIRGULA"
	public final void mPONTOEVIRGULA() throws RecognitionException {
		try {
			int _type = PONTOEVIRGULA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:39:14: ( ';' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:39:16: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PONTOEVIRGULA"

	// $ANTLR start "ATRIBUI"
	public final void mATRIBUI() throws RecognitionException {
		try {
			int _type = ATRIBUI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:40:9: ( ':=' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:40:11: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATRIBUI"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:42:7: ( ( '0' .. '9' )+ )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:42:9: ( '0' .. '9' )+
			{
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:42:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:
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
	// $ANTLR end "CONST"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:43:6: ( ( 'a' .. 'z' )+ )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:43:8: ( 'a' .. 'z' )+
			{
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:43:8: ( 'a' .. 'z' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:45:5: ( ( ' ' | '\\n' | '\\r' )+ )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:45:7: ( ' ' | '\\n' | '\\r' )+
			{
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:45:7: ( ' ' | '\\n' | '\\r' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\n'||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:
					{
					if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ABRE_PARENTESE"
	public final void mABRE_PARENTESE() throws RecognitionException {
		try {
			int _type = ABRE_PARENTESE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:47:16: ( '(' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:47:18: '('
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
	// $ANTLR end "ABRE_PARENTESE"

	// $ANTLR start "FECHA_PARENTESE"
	public final void mFECHA_PARENTESE() throws RecognitionException {
		try {
			int _type = FECHA_PARENTESE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:48:17: ( ')' )
			// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:48:19: ')'
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
	// $ANTLR end "FECHA_PARENTESE"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:8: ( DO | ELSE | IF | RETURN | WHILE | THEN | OPERADOR_RELACIONAL | OPERADOR_ARITMETICO | PONTOEVIRGULA | ATRIBUI | CONST | VAR | WS | ABRE_PARENTESE | FECHA_PARENTESE )
		int alt5=15;
		switch ( input.LA(1) ) {
		case 'd':
			{
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='o') ) {
				int LA5_16 = input.LA(3);
				if ( ((LA5_16 >= 'a' && LA5_16 <= 'z')) ) {
					alt5=12;
				}

				else {
					alt5=1;
				}

			}

			else {
				alt5=12;
			}

			}
			break;
		case 'e':
			{
			int LA5_2 = input.LA(2);
			if ( (LA5_2=='l') ) {
				int LA5_17 = input.LA(3);
				if ( (LA5_17=='s') ) {
					int LA5_23 = input.LA(4);
					if ( (LA5_23=='e') ) {
						int LA5_28 = input.LA(5);
						if ( ((LA5_28 >= 'a' && LA5_28 <= 'z')) ) {
							alt5=12;
						}

						else {
							alt5=2;
						}

					}

					else {
						alt5=12;
					}

				}

				else {
					alt5=12;
				}

			}

			else {
				alt5=12;
			}

			}
			break;
		case 'i':
			{
			int LA5_3 = input.LA(2);
			if ( (LA5_3=='f') ) {
				int LA5_18 = input.LA(3);
				if ( ((LA5_18 >= 'a' && LA5_18 <= 'z')) ) {
					alt5=12;
				}

				else {
					alt5=3;
				}

			}

			else {
				alt5=12;
			}

			}
			break;
		case 'r':
			{
			int LA5_4 = input.LA(2);
			if ( (LA5_4=='e') ) {
				int LA5_19 = input.LA(3);
				if ( (LA5_19=='t') ) {
					int LA5_25 = input.LA(4);
					if ( (LA5_25=='u') ) {
						int LA5_29 = input.LA(5);
						if ( (LA5_29=='r') ) {
							int LA5_33 = input.LA(6);
							if ( (LA5_33=='n') ) {
								int LA5_36 = input.LA(7);
								if ( ((LA5_36 >= 'a' && LA5_36 <= 'z')) ) {
									alt5=12;
								}

								else {
									alt5=4;
								}

							}

							else {
								alt5=12;
							}

						}

						else {
							alt5=12;
						}

					}

					else {
						alt5=12;
					}

				}

				else {
					alt5=12;
				}

			}

			else {
				alt5=12;
			}

			}
			break;
		case 'w':
			{
			int LA5_5 = input.LA(2);
			if ( (LA5_5=='h') ) {
				int LA5_20 = input.LA(3);
				if ( (LA5_20=='i') ) {
					int LA5_26 = input.LA(4);
					if ( (LA5_26=='l') ) {
						int LA5_30 = input.LA(5);
						if ( (LA5_30=='e') ) {
							int LA5_34 = input.LA(6);
							if ( ((LA5_34 >= 'a' && LA5_34 <= 'z')) ) {
								alt5=12;
							}

							else {
								alt5=5;
							}

						}

						else {
							alt5=12;
						}

					}

					else {
						alt5=12;
					}

				}

				else {
					alt5=12;
				}

			}

			else {
				alt5=12;
			}

			}
			break;
		case 't':
			{
			int LA5_6 = input.LA(2);
			if ( (LA5_6=='h') ) {
				int LA5_21 = input.LA(3);
				if ( (LA5_21=='e') ) {
					int LA5_27 = input.LA(4);
					if ( (LA5_27=='n') ) {
						int LA5_31 = input.LA(5);
						if ( ((LA5_31 >= 'a' && LA5_31 <= 'z')) ) {
							alt5=12;
						}

						else {
							alt5=6;
						}

					}

					else {
						alt5=12;
					}

				}

				else {
					alt5=12;
				}

			}

			else {
				alt5=12;
			}

			}
			break;
		case '<':
		case '=':
		case '>':
			{
			alt5=7;
			}
			break;
		case '*':
		case '+':
		case '-':
		case '/':
			{
			alt5=8;
			}
			break;
		case ';':
			{
			alt5=9;
			}
			break;
		case ':':
			{
			alt5=10;
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
			alt5=11;
			}
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=12;
			}
			break;
		case '\n':
		case '\r':
		case ' ':
			{
			alt5=13;
			}
			break;
		case '(':
			{
			alt5=14;
			}
			break;
		case ')':
			{
			alt5=15;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:10: DO
				{
				mDO(); 

				}
				break;
			case 2 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:13: ELSE
				{
				mELSE(); 

				}
				break;
			case 3 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:18: IF
				{
				mIF(); 

				}
				break;
			case 4 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:21: RETURN
				{
				mRETURN(); 

				}
				break;
			case 5 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:28: WHILE
				{
				mWHILE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:34: THEN
				{
				mTHEN(); 

				}
				break;
			case 7 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:39: OPERADOR_RELACIONAL
				{
				mOPERADOR_RELACIONAL(); 

				}
				break;
			case 8 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:59: OPERADOR_ARITMETICO
				{
				mOPERADOR_ARITMETICO(); 

				}
				break;
			case 9 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:79: PONTOEVIRGULA
				{
				mPONTOEVIRGULA(); 

				}
				break;
			case 10 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:93: ATRIBUI
				{
				mATRIBUI(); 

				}
				break;
			case 11 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:101: CONST
				{
				mCONST(); 

				}
				break;
			case 12 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:107: VAR
				{
				mVAR(); 

				}
				break;
			case 13 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:111: WS
				{
				mWS(); 

				}
				break;
			case 14 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:114: ABRE_PARENTESE
				{
				mABRE_PARENTESE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\analiseSintaticaSemanticaG2.g:1:129: FECHA_PARENTESE
				{
				mFECHA_PARENTESE(); 

				}
				break;

		}
	}



}
