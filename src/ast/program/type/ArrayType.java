package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;

public class ArrayType extends AbstractType implements Type{

    public int size;
    public Type of;

    public ArrayType(int line, int column, Type type, int size){
        super(line, column);
        this.of = type;
        this.size = size;
    }

    public Type getType(){
        return of;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public Type squareBrackets(Type type){
        if(type instanceof IntType)
            return of;
        else if(type instanceof ErrorType)
            return type;

        return null;
    }

}
