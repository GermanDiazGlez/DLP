package ast.statement;

import ast.expression.Expression;
import ast.statement.util.AbstractStatement;

import java.util.ArrayList;
import java.util.List;

public class IfElseStatement extends AbstractStatement {

    private List<Statement> ifStatementList = new ArrayList<>();
    private List<Statement> elseStatementList = new ArrayList<>();
    private Expression expression;

    public IfElseStatement(int line, int column, Expression expression, List<Statement> ifStatementList, List<Statement> elseStatementList) {
        super(line, column);
        this.expression = expression;
        this.ifStatementList = ifStatementList;
        this.elseStatementList = elseStatementList;
    }

    /**
     * @return the if`s statement list
     */
    public List<Statement> getIfStatementList(){
        return ifStatementList;
    }

    /**
     * @return the else`s statement list
     */
    public List<Statement> getElseStatementList(){
        return elseStatementList;
    }

    /**
     * @return the expression of the statement
     */
    public Expression getExpression(){
        return expression;
    }
}
