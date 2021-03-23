package ast.program.definition.util;

import ast.AbstractNodeAST;
import ast.program.definition.Definition;
import ast.program.type.Type;

public abstract class AbstractDefinition extends AbstractNodeAST implements Definition {

    private Type type;
    private String name;
    private int scope;

    public AbstractDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }
}
