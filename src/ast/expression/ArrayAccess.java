package ast.expression;

import ast.expression.util.AbstractExpression;

public class ArrayAccess extends AbstractExpression {

    private Expression left;
    private Expression right;

    public ArrayAccess(int line, int column, Expression lExpr, Expression rExpr) {
        super(line, column);
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
