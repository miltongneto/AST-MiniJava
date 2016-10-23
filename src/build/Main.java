package build;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.Program;
import sources.mvgnLexer;
import sources.mvgnParser;
import visitor.PrettyPrintVisitor;

public class Main {

	public static void main(String[] args) throws IOException {
		/*System.out.println("ok");
		InputStream is = (args.length == 0)
	            ?  System.in
	            : new FileInputStream(args[0]);
	    */
		FileInputStream is = new FileInputStream("prog.txt");
		ANTLRInputStream input = new ANTLRInputStream(is);
		mvgnLexer lexer = new mvgnLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		mvgnParser parser = new mvgnParser(tokens);
		
		BuilderAST build = new BuilderAST();
		
		Program prog = build.returnGoal(parser.goal());
	
		PrettyPrintVisitor print = new PrettyPrintVisitor();
		
		prog.accept(print);
		

	}

}
