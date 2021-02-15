package ast.expression;

import ast.expression.util.AbstractExpression;

public class DoubleLiteral extends AbstractExpression {

    public double value;

    public DoubleLiteral(int line, int column) {
        super(line, column);
    }
}
