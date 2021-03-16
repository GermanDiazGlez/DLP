package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class FieldAccess extends AbstractExpression implements Expression{

    public String name;
    private Expression expression;

    public FieldAccess(int line, int column, Expression expression, String name) {
        super(line, column);
        this.expression = expression;
        this.name = name;
    }

    /**
     * @return the expression
     */
    public Expression getExpression(){
        return expression;
    }

    public String getName(){
        return name;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }
}
