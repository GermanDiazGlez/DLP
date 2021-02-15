package ast.program.definition;

import ast.program.type.Type;
import ast.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition implements Definition{
    private List<Statement> statementList = new ArrayList<>();
    private Type type;
    private String name;

    public FuncDefinition(Type type, String name, List<Statement> statementList){
        this.type = type;
        this.name = name;
        for(Statement st : statementList){
            this.statementList.add(st);
        }
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

}
