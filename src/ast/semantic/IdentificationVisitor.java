package ast.semantic;

import ast.expression.Variable;
import ast.program.definition.Definition;
import ast.program.definition.FuncDefinition;
import ast.program.definition.VarDefinition;
import ast.program.type.ErrorType;
import ast.visitor.util.AbstractVisitor;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor {


    private SymbolTable table = new SymbolTable();

    @Override
    public Object visit(Variable variable, Object o) {
        Definition definition = table.find(variable.getName());

        if(definition == null){
            variable.setDefinition(new VarDefinition(
                    variable.getLine(), variable.getColumn(),
                    new ErrorType(variable.getLine(), variable.getColumn(), "Identificador " + variable.getName() + " no definido"),
                    variable.getName()
                    )
            );
        } else {
            variable.setDefinition(definition);
        }
        return null;
    }

    @Override
    public Object visit(FuncDefinition functionDefinition, Object o) {
        insertDefinition(functionDefinition);
        table.set();
        super.visit(functionDefinition, o);
        table.reset();
        return null;
    }

    @Override
    public Object visit(VarDefinition variableDefinition, Object o) {
        insertDefinition(variableDefinition);
        return null;
    }

    void insertDefinition(Definition definition) {
        boolean inserted = table.insert(definition);

        if(!inserted) {
            new ErrorType(definition.getLine(), definition.getColumn(),
                    "Identificador '" + definition.getName() + "' ya declarado");
        }
    }
}
