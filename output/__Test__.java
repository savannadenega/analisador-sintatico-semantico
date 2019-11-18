import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        analiseSintaticaSemanticaG1Lexer lex = new analiseSintaticaSemanticaG1Lexer(new ANTLRFileStream("/Users/savannadenega/projects/Unisinos 2019-2/analisador-sintatico-semantico/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        analiseSintaticaSemanticaG1Parser g = new analiseSintaticaSemanticaG1Parser(tokens, 49100, null);
        try {
            g.aplicacomando();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}