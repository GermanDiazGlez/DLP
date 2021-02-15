package ast.statement.util;

import ast.statement.Statement;

public class AbstractStatement implements Statement {

    protected int line;
    protected int column;

    public AbstractStatement(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
