package ast.program.type;

public class IntType implements Type{
    public IntType intType;

    public IntType getType(){
        if(intType==null){
            intType = new IntType();
        }
        return intType;
    }
}
