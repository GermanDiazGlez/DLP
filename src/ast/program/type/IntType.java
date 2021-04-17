package ast.program.type;

import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;

public class IntType extends AbstractType implements Type{
    private static IntType intType = null;

    private IntType(int line, int column) {
        super(line, column);
    }

    public static IntType getInstance() {
        if (intType == null) {
            intType = new IntType(0,0);
        }
        return intType;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public boolean isLogical(){
        return true;
    }

    @Override
    public Type arithmetic(Type type){
        if(type.equals(IntType.getInstance()) || type instanceof ErrorType)
            return type;
        return null;
    }

    @Override
    public Type arithmetic(){
        return this;
    }

    @Override
    public Type comparison(Type type) {
        if(type.equals(IntType.getInstance()) || type instanceof ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type logic(Type type) {
        if(type.equals(IntType.getInstance()) || type instanceof ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type logic() {
        return this;
    }

    @Override
    public Type promotesTo(Type type) {
        if(type.equals(IntType.getInstance()) || type instanceof ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public boolean isBuiltInType() {
        return true;
    }

    @Override
    public Type canBeCastTo(Type type) {
        if(type.isBuiltInType() || type instanceof ErrorType) {
            return type;
        }
        return null;
    }
    @Override
    public int numberOfBytes() {
        return 2;
    }


    @Override
    public String toString(){
        return "Int";
    }
}
