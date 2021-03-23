package ast.expression.util;

import ast.AbstractNodeAST;
import ast.expression.Expression;
import ast.program.type.Type;
import ast.visitor.Visitor;

public abstract class AbstractExpression extends AbstractNodeAST implements Expression {
    public boolean lValue;
    private Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }
}
