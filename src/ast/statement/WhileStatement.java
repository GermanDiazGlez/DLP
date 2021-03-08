package ast.statement;

import ast.expression.Expression;
import ast.statement.util.AbstractStatement;

import java.util.ArrayList;
import java.util.List;

public class WhileStatement extends AbstractStatement implements Statement{

    private List<Statement> whileStatementList = new ArrayList<>();
    private Expression expression;

    public WhileStatement(int line, int column, Expression expression, List<Statement> whileStatementList) {
        super(line, column);
        this.whileStatementList = whileStatementList;
        this.expression = expression;
    }

    /**
     * @return the while`s statement list
     */
    public List<Statement> getWhileStatementList(){
        return whileStatementList;
    }

    /**
     * @return the expression of the statement
     */
    public Expression getExpression(){
        return expression;
    }
}
