package ast.expression;

import ast.expression.util.AbstractExpression;

public class Comparison extends AbstractExpression {

    public String operator;
    private Expression left;
    private Expression right;

    public Comparison(int line, int column, Expression lExpr, String operator , Expression rExpr) {
        super(line, column);
        this.operator = operator;
        this.left = lExpr;
        this.right = rExpr;
    }

    /**
     * @return the expression on the left
     */
    public Expression getLeft(){
        return left;
    }

    /**
     * @return the expression on the right
     */
    public Expression getRight(){
        return right;
    }
}
