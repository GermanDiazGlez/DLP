package ast.expression;

import ast.expression.util.AbstractExpression;

public class UnaryMinus extends AbstractExpression {

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
}
