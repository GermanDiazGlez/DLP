package ast.expression;

import ast.expression.util.AbstractExpression;

public class CharLiteral extends AbstractExpression implements Expression{

    public char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    public char getValue(){
        return value;
    }
}
