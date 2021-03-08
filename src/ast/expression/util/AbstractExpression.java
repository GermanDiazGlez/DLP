package ast.expression.util;

import ast.AbstractNodeAST;
import ast.expression.Expression;

public abstract class AbstractExpression extends AbstractNodeAST implements Expression {

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

}
