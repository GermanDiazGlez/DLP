package ast.expression;

import ast.ASTNode;

/**
 * Interfaz que define el tipo expresion
 */
public interface Expression extends ASTNode {

    /**
     * @return la linea en la que se encuentre el nodo.
     */
    public int getLine();

    /**
     * @return la columna en la que se encuentre el nodo.
     */
    public int getColumn();
}
