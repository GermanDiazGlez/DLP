package ast.expression;

import ast.expression.util.AbstractExpression;

public class Variable extends AbstractExpression {

    public String text;

    public Variable(int line, int column, String text) {
        super(line, column);
    }

    public String getText(){
        return text;
    }
}
