import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        analiseSintaticaSemanticaG2 lex = new analiseSintaticaSemanticaG2(new ANTLRFileStream("C:\\Users\\Franciele\\code\\analisador-sintatico-semantico\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

 g = new (tokens, 49100, null);
        try {
            g.DO();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}