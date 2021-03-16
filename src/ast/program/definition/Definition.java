package ast.program.definition;

import ast.ASTNode;
import ast.program.Program;
import ast.program.type.Type;

public interface Definition extends ASTNode {

    public Type getType();
    public String getName();

}
