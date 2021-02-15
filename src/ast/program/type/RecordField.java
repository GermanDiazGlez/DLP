package ast.program.type;

public class RecordField implements Type{

    private String name;
    private Type type;

    public RecordField(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public Type getType(){
        return type;
    }

    public String getName(){
        return name;
    }

}
