package ast.program.type.util;

import ast.AbstractNodeAST;
import ast.program.type.ErrorType;
import ast.program.type.IntType;
import ast.program.type.Type;
import ast.visitor.Visitor;

public abstract class AbstractType extends AbstractNodeAST implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public abstract Object accept(Visitor v, Object o);


    @Override
    public boolean isLogical(){
        return false;
    }

    @Override
    Type arithmetic(Type other){
        if(other.equals(IntType.getInstance()) || other instanceof ErrorType)
            return other;
        return null;
    }
}
