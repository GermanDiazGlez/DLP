package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class Comparison extends AbstractExpression implements Expression{

    public String operator;
    private Expression leftExpression;
    private Expression rightExpression;

    public Comparison(int line, int column, Expression lExpr, String operator , Expression rExpr) {
        super(line, column);
        this.operator = operator;
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
