import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Run_MiniC {
	public static void main(String[] args) throws Exception {
        MiniCLexer lexer = new MiniCLexer(new ANTLRFileStream("input.txt", "UTF-8"));
        MiniCParser parser = new MiniCParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }
}
