package ast;

public interface ASTNode {

    /**
     * @return la linea en la que se encuentre el nodo.
     */
    public int getLine();

    /**
     * @return la columna en la que se encuentre el nodo.
     */
    public int getColumn();
}
