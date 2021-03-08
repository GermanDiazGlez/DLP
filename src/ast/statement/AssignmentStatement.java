package ast.statement;

import ast.expression.Expression;
import ast.statement.util.AbstractStatement;

public class AssignmentStatement extends AbstractStatement implements  Statement{

    private Expression leftExpression;
    private Expression rightExpression;

    public AssignmentStatement(int line, int column, Expression leftExpression, Expression rightExpression) {
        super(line, column);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * @return the left expression of the statement
     */
    public Expression getLeftExpression(){
        return leftExpression;
    }

    /**
     * @return the right expression of the statement
     */
    public Expression getRightExpression(){
        return rightExpression;
    }
}
