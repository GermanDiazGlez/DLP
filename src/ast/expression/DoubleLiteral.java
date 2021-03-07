package ast.expression;

import ast.expression.util.AbstractExpression;

public class DoubleLiteral extends AbstractExpression implements Expression{

    public double value;

    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}
