package ast;

import ast.program.definition.Definition;
import ast.program.definition.FuncDefinition;
import ast.visitor.Visitor;

import java.util.List;

public class Program extends AbstractNodeAST{

    private List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions, FuncDefinition main) {
        super(line, column);
        this.definitions = definitions;
        this.definitions.add(main);
    }

    public List<Definition> getDefinitions(){
        return definitions;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }
}