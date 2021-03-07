package ast.program.type;

import ast.AbstractNodeAST;

public class VoidType extends AbstractNodeAST implements Type{
    private static VoidType voidType = null;

    private VoidType(int line, int column) {
        super(line, column);
    }

    public static VoidType getInstance() {
        if (voidType == null) {
            voidType = new VoidType(0,0);
        }
        return voidType;
    }
}
