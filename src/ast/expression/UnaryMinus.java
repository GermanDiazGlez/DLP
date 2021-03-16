package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class UnaryMinus extends AbstractExpression implements Expression{

    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    /**
     * @return the expression
     */
    public Expression getExpression(){
        return expression;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }
}
