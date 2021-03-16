package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class Variable extends AbstractExpression implements Expression{

    public String name;
    public boolean lValue;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean Lvalue) {
        this.lValue = Lvalue;
    }


    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }


}
