package ast.program.type;

import ast.ASTNode;

public interface Type extends ASTNode {
    boolean isLogical();
    Type arithmetic(Type other);
}
