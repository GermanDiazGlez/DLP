package ast.program.definition;

import ast.program.definition.util.AbstractDefinition;
import ast.program.type.Type;
import ast.statement.Statement;
import ast.visitor.Visitor;

public class VarDefinition extends AbstractDefinition implements Definition, Statement {

    private int offset;

    public VarDefinition(int line, int column, Type type, String name){
        super(line, column, type, name);
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }
}
