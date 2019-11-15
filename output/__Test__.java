import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        analiseSintaticaSemanticaG2Lexer lex = new analiseSintaticaSemanticaG2Lexer(new ANTLRFileStream("C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        analiseSintaticaSemanticaG2Parser g = new analiseSintaticaSemanticaG2Parser(tokens, 49100, null);
        try {
            g.atribuicao();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}