package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.definition.VarDefinition;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractNodeAST implements Type{

    private List<RecordField> recordFieldList = new ArrayList<>();

    public StructType(int line, int column, List<RecordField> recordFieldList){
        super(line, column);
        for (RecordField record : recordFieldList) {
            this.recordFieldList.add(record);
        }
    }
}
