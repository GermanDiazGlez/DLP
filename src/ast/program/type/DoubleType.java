package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;

public class DoubleType extends AbstractType implements Type{
    private static DoubleType doubleType = null;

    private DoubleType(int line, int column) {
        super(line, column);
    }

    public static DoubleType getInstance() {
        if (doubleType == null) {
            doubleType = new DoubleType(0,0);
        }
        return doubleType;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public Type arithmetic(Type other) {
        if(other.equals(DoubleType.getInstance())  || other instanceof ErrorType) {
            return other;
        }
        return null;
    }

    @Override
    public Type arithmetic(){
        return this;
    }

    @Override
    public Type comparison(Type type) {
        if(type.equals(DoubleType.getInstance()) || type instanceof ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type promotesTo(Type type) {
        if(type instanceof DoubleType || type instanceof ErrorType) {
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
        return 4;
    }

    @Override
    public char suffix(){
        return 'f';
    }

    @Override
    public String toString(){
        return "Double";
    }
}
