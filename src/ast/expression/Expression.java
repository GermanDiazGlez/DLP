package ast.expression;

import ast.ASTNode;
import ast.program.type.Type;

/**
 * Interfaz que define el tipo expresion
 */
public interface Expression extends ASTNode {

    boolean getLValue();
    void setLValue(boolean lValue);
    Type getType();
    void setType(Type type);
}
