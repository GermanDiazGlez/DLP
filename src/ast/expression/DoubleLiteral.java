package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class DoubleLiteral extends AbstractExpression implements Expression{

    public double value;

    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue(){
        return value;
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
