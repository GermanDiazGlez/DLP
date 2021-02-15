package ast.program.type;

import ast.program.definition.VarDefinition;

import java.util.ArrayList;
import java.util.List;

public class StructType implements Type{

    private List<RecordField> recordFieldList = new ArrayList<>();
    private Type type;

    public StructType(Type type, List<RecordField> recordFieldList){
        this.type = type;
        for (RecordField record : recordFieldList) {
            this.recordFieldList.add(record);
        }
    }
}
