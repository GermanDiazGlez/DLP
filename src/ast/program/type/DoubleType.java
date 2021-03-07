package ast.program.type;

import ast.AbstractNodeAST;

public class DoubleType extends AbstractNodeAST implements Type{
    private static DoubleType doubleType = null;

    private DoubleType(int line, int column) {
        super(line, column);
    }

    public static DoubleType getInstance() {
        if (doubleType == null) {
            doubleType = new DoubleType(0,0);
        }
        return doubleType;
    }

}
