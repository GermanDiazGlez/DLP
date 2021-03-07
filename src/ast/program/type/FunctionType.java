package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.definition.VarDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractNodeAST implements Type{

    private Type returnType;
    private List<VarDefinition> parameters = new ArrayList<>();

    public FunctionType(int line, int column, Type returnType, List<VarDefinition> parameters){
        super(line, column);
        this.returnType = returnType;
        this.parameters = parameters;
    }
}
