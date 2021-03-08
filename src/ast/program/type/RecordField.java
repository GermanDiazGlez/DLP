package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;

public class RecordField extends AbstractType implements Type{

    private String name;
    private Type type;

    public RecordField(int line, int column, String name, Type type){
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public Type getType(){
        return type;
    }

    public String getName(){
        return name;
    }

}
