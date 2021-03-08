package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;

public class ArrayType extends AbstractType implements Type{

    public int size;
    public Type type;

    public ArrayType(int line, int column, Type type, int size){
        super(line, column);
        this.type = type;
        this.size = size;
    }
}
