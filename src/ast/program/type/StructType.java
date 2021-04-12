package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.definition.VarDefinition;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractType implements Type{

    private List<RecordField> recordFieldList;

    public StructType(int line, int column, List<RecordField> recordFieldList){
        super(line, column);
        this.recordFieldList = recordFieldList;
    }

    public List<RecordField> getRecordFieldList(){
        return recordFieldList;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    @Override
    public Type dot(String fieldName) {
        for (RecordField r :recordFieldList) {
            if(r.getName().equals(fieldName)){
                return r.getType();
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return "Struct";
    }

}
