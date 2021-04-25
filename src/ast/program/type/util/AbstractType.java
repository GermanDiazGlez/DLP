package ast.program.type.util;

import ast.AbstractNodeAST;
import ast.expression.Expression;
import ast.program.type.ErrorType;
import ast.program.type.IntType;
import ast.program.type.Type;
import ast.visitor.Visitor;

import java.util.List;

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
    public Type arithmetic(Type type) {
        if(type instanceof ErrorType){
            return type;
        }
        return null;
    }

    @Override
    public Type arithmetic(){
        return null;
    }
    @Override
    public Type comparison(Type other){
        if(other instanceof ErrorType) {
            return other;
        }
        return null;
    }

    @Override
    public Type logic(Type type){
        if(type instanceof ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type logic(){
        return null;
    }

    @Override
    public Type promotesTo(Type type) {
        if(type instanceof ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public boolean isBuiltInType() {
        return false;
    }

    @Override
    public Type canBeCastTo(Type type) {
        if(type instanceof ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type squareBrackets(Type type) {
        if(type instanceof ErrorType) {
            return type;
        }
        return null;
    }

    @Override
    public Type dot(String field) {
        return null;
    }

    @Override
    public Type parenthesis(List<Expression> parameters) {
        return null;
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public char suffix() {
        throw new IllegalStateException("No es posible obtener el sufijo");
    }

}
