package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;

public class CharType extends AbstractType implements Type{
    private static CharType charType = null;

    private CharType(int line, int column) {
        super(line, column);
    }

    public static CharType getInstance() {
        if (charType == null) {
            charType = new CharType(0,0);
        }
        return charType;
    }
}
