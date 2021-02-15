package ast.program.type;

public class DoubleType implements Type{
    public DoubleType doubleType;

    public DoubleType getType(){
        if(doubleType==null){
            doubleType = new DoubleType();
        }
        return doubleType;
    }
}
