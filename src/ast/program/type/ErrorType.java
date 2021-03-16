package ast.program.type;

import ast.AbstractNodeAST;
import ast.visitor.Visitor;
import errorhandler.EH;

public class ErrorType extends AbstractNodeAST implements Type{

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
}
