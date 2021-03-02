package ast.expression;

import ast.expression.util.AbstractExpression;

public class IntLiteral extends AbstractExpression {

    public int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
