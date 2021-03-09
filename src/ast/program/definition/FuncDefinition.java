package ast.program.definition;

import ast.expression.Variable;
import ast.program.definition.util.AbstractDefinition;
import ast.program.type.FunctionType;
import ast.program.type.Type;
import ast.program.type.VoidType;
import ast.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition implements Definition{
    private List<Statement> statementList;

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



}
