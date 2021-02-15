package ast.program.type;

public class CharType implements Type{
    public CharType charType;

    public CharType getType(){
        if(charType==null){
            charType = new CharType();
        }
        return charType;
    }
}
