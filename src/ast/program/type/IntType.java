package ast.program.type;

import ast.AbstractNodeAST;

public class IntType extends AbstractNodeAST implements Type{
    private static IntType intType = null;

    private IntType(int line, int column) {
        super(line, column);
    }

    public static IntType getInstance() {
        if (intType == null) {
            intType = new IntType(0,0);
        }
        return intType;
    }
}
