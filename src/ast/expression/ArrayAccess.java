package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class ArrayAccess extends AbstractExpression implements Expression{

    private Expression leftExpression;
    private Expression rightExpression;

    public ArrayAccess(int line, int column, Expression lExpr, Expression rExpr) {
        super(line, column);
        this.leftExpression = lExpr;
        this.rightExpression = rExpr;
    }

    /**
     * @return the expression on the left
     */
    public Expression getLeftExpression(){
        return leftExpression;
    }

    /**
     * @return the expression on the right
     */
    public Expression getRightExpression(){
        return rightExpression;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }
}
