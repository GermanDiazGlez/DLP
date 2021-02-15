package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.program.type.Type;

public class Cast extends AbstractExpression {

    private Expression expression;
    private Type type;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }

    public Expression getExpression(){
        return expression;
    }

    public Type getType(){
        return type;
    }

}
