package ast.statement;

import ast.expression.Expression;
import ast.statement.util.AbstractStatement;
import ast.visitor.Visitor;

public class PrintStatement extends AbstractStatement implements Statement{

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

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }
}
