package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.visitor.Visitor;

public class Logical extends AbstractExpression implements Expression{

    public String operator;
    private Expression leftExpression;
    private Expression rightExpression;

    public Logical(int line, int column, Expression lExpr, String operator , Expression rExpr) {
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

    public String getOperator(){
        return this.operator;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }
}
