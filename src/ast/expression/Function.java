package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.statement.Statement;
import ast.visitor.Visitor;

import java.util.List;

public class Function extends AbstractExpression implements Expression, Statement {

    private Variable variable;
    private List<Expression> expressions;

    public Function(int line, int column, Variable var, List<Expression> expressions) {
        super(line, column);
        this.variable = var;
        this.expressions = expressions;
    }

    /**
     * @return the variable of the function
     */
    public Variable getVariable(){
        return this.variable;
    }

    /**
     * @return the list of the expressions
     */
    public List<Expression> getExpressions(){
        return expressions;
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
