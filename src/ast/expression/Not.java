package ast.expression;

import ast.expression.util.AbstractExpression;

public class Not extends AbstractExpression {

    private Expression expression;

    public Not(int line, int column, Expression expression) {
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
