package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class IntLiteral extends AbstractExpression implements Expression{

    public int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    public int getValue(){
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
