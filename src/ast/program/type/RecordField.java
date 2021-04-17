package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;

public class RecordField extends AbstractNodeAST{

    private String name;
    private Type type;
    private int offset;

    public RecordField(int line, int column, String name, Type type){
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public Type getType(){
        return type;
    }

    public String getName(){
        return name;
    }


    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }


    @Override
    public String toString(){
        return "RecordField";
    }

}
