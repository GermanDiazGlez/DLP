package ast;

import ast.program.definition.Definition;
import ast.program.definition.FuncDefinition;

import java.util.List;

public class Program extends AbstractNodeAST{

    private List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions, FuncDefinition main) {
        super(line, column);
        this.definitions = definitions;
        this.definitions.add(main);
    }

}