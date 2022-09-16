import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class AnalisadorSemantico {
    public static void main(String[] args) {
        EvilLexer lexer = null;
        try {
            lexer = new EvilLexer(CharStreams.fromStream(System.in));
        } catch (IOException e) {
            e.printStackTrace();
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EvilParser parser = new EvilParser(tokens);

        ParseTree ast = parser.prog();

        Listener listener = new Listener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, ast);

        for (String err : listener.getErros()) {
            System.out.println(err);
        }
    }
}
