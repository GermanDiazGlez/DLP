package ast.program.type;

import ast.AbstractNodeAST;
import ast.expression.Expression;
import ast.program.definition.VarDefinition;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType implements Type{

    private Type returnType;
    private List<VarDefinition> parameters;

    public FunctionType(int line, int column, Type returnType, List<VarDefinition> parameters){
        super(line, column);
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public Type getReturnType(){
        return returnType;
    }

    public List<VarDefinition> getParameters() {
        return parameters;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public Type parenthesis(List<Expression> params) {
        if(params.size() != parameters.size()) {
            return null;
        }
        for(int i=0; i<params.size(); i++) {
            Type pType = params.get(i).getType();
            if(!pType.isBuiltInType()) {
                return null;
            }
            Type thisParamType = parameters.get(i).getType();
            if(pType.promotesTo(thisParamType) == null) {
                return null;
            }
        }
        return returnType;
    }
}
