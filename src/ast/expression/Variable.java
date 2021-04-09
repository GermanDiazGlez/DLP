package ast.expression;

import ast.expression.util.AbstractExpression;
import ast.program.definition.Definition;
import ast.visitor.Visitor;

public class Variable extends AbstractExpression implements Expression{

    public String name;
    private Definition definition;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
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

    public String getName(){
        return this.name;
    }

    public void setDefinition(Definition definition){
        this.definition = definition;
    }

    public Definition getDefinition(){
        return definition;
    }
}
