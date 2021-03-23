package ast.program.definition;

import ast.ASTNode;
import ast.program.Program;
import ast.program.type.Type;

public interface Definition extends ASTNode {

    Type getType();
    String getName();
    int getScope();
    void setScope(int scope);
}
