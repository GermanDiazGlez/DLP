package ast;

import ast.visitor.Visitor;

public interface ASTNode {

    /**
     * @return la linea en la que se encuentre el nodo.
     */
    public int getLine();

    /**
     * @return la columna en la que se encuentre el nodo.
     */
    public int getColumn();

    /**
     * Acept del visitor
     */
    public Object accept(Visitor v, Object o);
}
