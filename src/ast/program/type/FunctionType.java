package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.definition.VarDefinition;
import ast.program.type.util.AbstractType;

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
}
