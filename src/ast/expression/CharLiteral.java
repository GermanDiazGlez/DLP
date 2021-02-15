package ast.expression;

import ast.expression.util.AbstractExpression;

public class CharLiteral extends AbstractExpression {

    public char value;

    public CharLiteral(int line, int column) {
        super(line, column);
    }
}
