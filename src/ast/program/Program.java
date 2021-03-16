package ast.program;

import ast.ASTNode;
import ast.program.definition.Definition;

import java.util.ArrayList;
import java.util.List;

public interface Program extends ASTNode {

    List<Definition> definitionsList = new ArrayList<>();

    /**
     * @return la linea en la que se encuentre el nodo.
     */
    public int getLine();

    /**
     * @return la columna en la que se encuentre el nodo.
     */
    public int getColumn();

}
