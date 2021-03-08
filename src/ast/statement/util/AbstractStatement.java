package ast.statement.util;

import ast.AbstractNodeAST;
import ast.statement.Statement;

public class AbstractStatement extends AbstractNodeAST implements Statement {

    public AbstractStatement(int line, int column) {
        super(line, column);
    }

}
