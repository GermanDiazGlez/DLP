package ast.expression.util;

import ast.AbstractNodeAST;
import ast.expression.Expression;
import ast.visitor.Visitor;

public abstract class AbstractExpression extends AbstractNodeAST implements Expression {
    public boolean lValue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }


}
