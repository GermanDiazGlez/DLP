package ast.program.type;

import ast.program.definition.VarDefinition;

import java.util.ArrayList;
import java.util.List;

public class FunctionType implements Type{

    private Type type;
    private List<VarDefinition> varDefinitionList = new ArrayList<>();

    public FunctionType(Type type, List<VarDefinition> varDefinitionList){
        this.type = type;
        for (VarDefinition varDef : varDefinitionList) {
            this.varDefinitionList.add(varDef);
        }
    }
}
