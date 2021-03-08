package ast.program.type.util;

import ast.AbstractNodeAST;
import ast.program.type.Type;

public class AbstractType extends AbstractNodeAST implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }
}
