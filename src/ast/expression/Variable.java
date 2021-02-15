package ast.expression;

import ast.expression.util.AbstractExpression;

public class Variable extends AbstractExpression {

    public String name;

    public Variable(int line, int column) {
        super(line, column);
    }
}
