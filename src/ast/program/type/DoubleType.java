package ast.program.type;

import ast.AbstractNodeAST;
import ast.program.type.util.AbstractType;
import ast.visitor.Visitor;

public class DoubleType extends AbstractType implements Type{
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

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

}
