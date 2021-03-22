package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class Variable extends AbstractExpression implements Expression{

    public String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }
}
