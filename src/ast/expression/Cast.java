package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.program.type.Type;
import ast.visitor.Visitor;

public class Cast extends AbstractExpression implements Expression{

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

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

}
