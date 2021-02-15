package ast.program.type;

public class VoidType implements Type{
    public VoidType voidType;

    public VoidType getType(){
        if(voidType==null){
            voidType = new VoidType();
        }
        return voidType;
    }
}
