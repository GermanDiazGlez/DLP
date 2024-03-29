import ast.codegenerator.CodeGenerator;
import ast.codegenerator.ExecuteCGVisitor;
import ast.codegenerator.OffSetVisitor;
import ast.semantic.IdentificationVisitor;
import ast.semantic.TypeCheckingVisitor;
import ast.visitor.Visitor;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import errorhandler.EH;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;

public class Main {

	public static void main(String... args) throws Exception {
		if (args.length<1) {
			System.err.println("Please, pass me the input file.");
			return;
		}

		// create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PmmParser parser = new PmmParser(tokens);
		Program ast = parser.program().ast;

		IdentificationVisitor identificationVisitor = new IdentificationVisitor();
		ast.accept(identificationVisitor, null);

		Visitor lValueVisitor = new TypeCheckingVisitor();
		ast.accept(lValueVisitor, null);

		// * Check errors
		if(EH.getEH().hasErrors()){
			// * Show errors
			EH.getEH().showErrors(System.err);
		}
		else{
			ast.accept(new OffSetVisitor(), null);
			// * The AST is shown
			ast.accept(new ExecuteCGVisitor(new CodeGenerator(args[1], args[0])), null);

			//IntrospectorModel model=new IntrospectorModel("Program", ast);
			//new IntrospectorTree("Introspector", model);
		}
	}
}
