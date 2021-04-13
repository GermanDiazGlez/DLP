package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;
import errorhandler.EH;

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

    //Implementar todos los metodos de Type y que retornen this.
}
