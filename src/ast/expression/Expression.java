package ast.expression;

import ast.ASTNode;

/**
 * Interfaz que define el tipo expresion
 */
public interface Expression extends ASTNode{

    public boolean getLValue();
    public void setLValue(boolean lValue);
}
