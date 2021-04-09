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
    public Type arithmetic(Type other){
        if(other.equals(IntType.getInstance()) || other instanceof ErrorType)
            return other;
        return null;
    }
}
