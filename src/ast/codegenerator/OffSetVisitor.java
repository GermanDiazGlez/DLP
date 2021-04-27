package ast.codegenerator;

import ast.program.definition.FuncDefinition;
import ast.program.definition.VarDefinition;
import ast.program.type.FunctionType;
import ast.program.type.RecordField;
import ast.program.type.StructType;
import ast.statement.Statement;
import ast.visitor.util.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor {
    private static final int GLOBAL = 0;
    private static final int LOCAL = 1;
    private int offsetLocal;
    private int offsetGlobal;
    private int offsetStruct;

    @Override
    public Object visit(VarDefinition varDefinition, Object o){
        if(varDefinition.getScope() == LOCAL){
            offsetLocal -= varDefinition.getType().numberOfBytes();
            varDefinition.setOffset(offsetLocal);
        } else if(varDefinition.getScope() == GLOBAL){
            varDefinition.setOffset(offsetGlobal);
            offsetGlobal += varDefinition.getType().numberOfBytes();
        }
        varDefinition.getType().accept(this, o);
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object o) {
        offsetLocal = 0;
        funcDefinition.getType().accept(this, o);

        int variablesSize = 0;
        for (Statement statement: funcDefinition.getStatementList()) {
            if(statement instanceof VarDefinition)
                variablesSize += ((VarDefinition) statement).getType().numberOfBytes();
        }
        funcDefinition.setVariablesSize(variablesSize);

        super.visit(funcDefinition, o);
        return null;
    }

    @Override
    public Object visit(FunctionType functionType, Object o) {
        int offsetParameters = 4;
        for(int i = functionType.getParameters().size() - 1; i <= 0; i--){
            VarDefinition parameter = functionType.getParameters().get(i);
            parameter.setOffset(offsetParameters);
            offsetParameters += parameter.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Object visit(StructType structType, Object o) {
        offsetStruct = 0;
        super.visit(structType, o);
        return null;
    }

    @Override
    public Object visit(RecordField recordField, Object o) {
        recordField.setOffset(offsetStruct);
        offsetStruct += recordField.getType().numberOfBytes();
        recordField.getType().accept(this, o);
        return null;
    }
}
