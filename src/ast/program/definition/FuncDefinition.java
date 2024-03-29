package ast.program.definition;

import ast.expression.Variable;
import ast.program.definition.util.AbstractDefinition;
import ast.program.type.FunctionType;
import ast.program.type.Type;
import ast.program.type.VoidType;
import ast.statement.Statement;
import ast.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition implements Definition{
    private List<Statement> statementList;

    private int variablesSize;

    public FuncDefinition(int line, int column, FunctionType type, String name,
                          List<Statement> statementList){
        super(line, column, type, name);
        this.statementList = statementList;
    }

    public FuncDefinition(int line, int column,
                              List<Statement> statementList) {
        super(line, column, new FunctionType(line, column, VoidType.getInstance(), new ArrayList<>()), "main");
        this.statementList = statementList;
    }


    public List<Statement> getStatementList(){
        return statementList;
    }

    @Override
    public Object accept(Visitor v, Object o) {
        v.visit(this, o);
        return null;
    }

    public void setVariablesSize(int size){
        this.variablesSize = size;
    }

    public int getVariablesSize(){
        return this.variablesSize;
    }

}
