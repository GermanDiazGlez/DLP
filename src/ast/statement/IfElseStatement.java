package ast.statement;

import ast.expression.Expression;
import ast.statement.util.AbstractStatement;
import ast.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class IfElseStatement extends AbstractStatement implements Statement{

    private List<Statement> ifStatementList;
    private List<Statement> elseStatementList;
    private Expression expression;

    public IfElseStatement(int line, int column, Expression expression, List<Statement> ifStatementList, List<Statement> elseStatementList) {
        super(line, column);
        this.expression = expression;
        this.ifStatementList = ifStatementList;
        this.elseStatementList = elseStatementList;
    }

    public IfElseStatement(int line, int column, Expression expression, List<Statement> ifStatementList) {
        super(line, column);
        this.expression = expression;
        this.ifStatementList = ifStatementList;
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

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }
}
