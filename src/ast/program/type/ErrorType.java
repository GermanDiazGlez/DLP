package ast.program.type;

import ast.AbstractNodeAST;
import ast.expression.Expression;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;
import errorhandler.EH;

import java.util.List;

public class ErrorType extends AbstractType implements Type{

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;

        EH.getEH().addError(this);
    }

    public String toString(){
        return "Error en la linea: " + getLine() + " , columna: " + getColumn() + " mensaje:" + message;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public Type arithmetic(Type type) {
        return this;
    }

    @Override
    public boolean isBuiltInType() {
        return true;
    }

    @Override
    public Type promotesTo(Type type) {
        return this;
    }

    @Override
    public Type logic(Type other){
        return this;
    }

    @Override
    public Type canBeCastTo(Type other){
        return this;
    }

    @Override
    public Type comparison(Type other){
        return this;
    }

    @Override
    public Type squareBrackets(Type other){
        return this;
    }

    @Override
    public Type dot(String field){
        return this;
    }

    @Override
    public Type parenthesis(List<Expression> parameters){
        return this;
    }
}
