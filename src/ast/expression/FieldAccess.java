package ast.expression;

import ast.expression.util.AbstractExpression;

public class FieldAccess extends AbstractExpression {

    public String name;
    private Expression expression;

    public FieldAccess(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    /**
     * @return the expression
     */
    public Expression getExpression(){
        return expression;
    }
}
