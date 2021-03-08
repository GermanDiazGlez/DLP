package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.definition.VarDefinition;
import ast.program.type.util.AbstractType;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractType implements Type{

    private List<RecordField> recordFieldList;

    public StructType(int line, int column, List<RecordField> recordFieldList){
        super(line, column);
        this.recordFieldList = recordFieldList;
    }
}
