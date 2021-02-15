package ast.statement;

import ast.expression.Expression;
import ast.statement.util.AbstractStatement;

public class PrintStatement extends AbstractStatement {

    private Expression expression;

    public PrintStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    /**
     * @return the expression of the statement
     */
    public Expression getExpression(){
        return expression;
    }
}
