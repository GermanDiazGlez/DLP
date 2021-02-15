package ast.expression.util;

import ast.expression.Expression;

public abstract class AbstractExpression implements Expression {

    protected int line;
    protected int column;

    public AbstractExpression(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
