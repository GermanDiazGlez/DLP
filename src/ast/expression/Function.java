package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.statement.Statement;

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
}
