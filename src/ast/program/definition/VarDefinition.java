package ast.program.definition;

import ast.program.type.Type;
import ast.statement.Statement;

public class VarDefinition implements Definition, Statement {

    private int offset;
    private Type type;
    private String name;
    private int line;
    private int column;

    public VarDefinition(Type type, String name, int line, int column){
        this.type = type;
        this.name = name;
        this.line = line;
        this.column = column;
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
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
