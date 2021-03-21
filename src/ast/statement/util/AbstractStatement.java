package ast.statement.util;

import ast.AbstractNodeAST;
import ast.statement.Statement;
import ast.visitor.Visitor;

public abstract class AbstractStatement extends AbstractNodeAST implements Statement {

    public AbstractStatement(int line, int column) {
        super(line, column);
    }

}
