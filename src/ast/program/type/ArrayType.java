package ast.program.type;

public class ArrayType implements Type{

    public int size;
    public Type type;

    public ArrayType(int size, Type type){
        this.size = size;
        this.type = type;
    }
}
