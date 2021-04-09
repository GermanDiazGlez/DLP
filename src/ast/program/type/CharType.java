package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;

public class CharType extends AbstractType implements Type{
    private static CharType charType = null;

    private CharType(int line, int column) {
        super(line, column);
    }

    public static CharType getInstance() {
        if (charType == null) {
            charType = new CharType(0,0);
        }
        return charType;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public Type arithmetic(Type other){
        if(other.equals(CharType.getInstance()) || other instanceof ErrorType)
            return other;
        return null;
    }
}
