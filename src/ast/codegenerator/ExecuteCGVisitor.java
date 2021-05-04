package ast.codegenerator;

import ast.Program;
import ast.codegenerator.util.AbstractCGVisitor;
import ast.expression.Expression;
import ast.expression.Function;
import ast.program.definition.Definition;
import ast.program.definition.FuncDefinition;
import ast.program.definition.VarDefinition;
import ast.program.type.FunctionType;
import ast.program.type.VoidType;
import ast.statement.*;

import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor {

    private CodeGenerator codeGenerator;
    private ValueCGVisitor value;
    private AddressCGVisitor address;

    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
        this.value = new ValueCGVisitor();
        this.address = new AddressCGVisitor(this.value);

        this.value.setAddressVisitor(this.address);
        this.address.setValueVisitor(this.value);
    }


    @Override
    public Object visit(Program program, Object o) {
        /**
         execute [[ Program : program -> definition* ]]() =
                for (Definition definition : definition*)
                    if (definition instanceof VariableDefinition)
                        execute [[definition]]()
                <call main>
                <halt>
                for (Definition definition : definition*)
                    if (definition instanceof FunctionDefinition)
                       execute [[definition]]()
         */
        for(Definition definition : program.getDefinitions()) {
            if(definition instanceof VarDefinition) {
                definition.accept(this, o);
            }
        }
        codeGenerator.callMain();
        for(Definition definition : program.getDefinitions()) {
            if(definition instanceof FuncDefinition) {
                definition.accept(this, o);
            }
        }
        return null;
    }

    @Override
    public Object visit(AssignmentStatement assignmentStatement, Object o) {
        /**
         execute([Assignment: assignment -> variable:Expression value:Expression])
         address([variable])
         value([value])
         <store>variable.type.suffix()
         */

        codeGenerator.line(assignmentStatement.getLine());

        assignmentStatement.getLeftExpression().accept(address, o);
        assignmentStatement.getRightExpression().accept(value, o);

        codeGenerator.store(assignmentStatement.getLeftExpression().getType());
        return null;
    }

    @Override
    public Object visit(PrintStatement printStatement, Object o) {
        /**
         execute [[Print : statement -> expression ]]() =
                value[[expression]]()
                <out>expression.type.suffix()
         */
        printStatement.getExpression().accept(this.value, null);
        codeGenerator.out(printStatement.getExpression().getType());
        return null;
    }

    @Override
    public Object visit(InputStatement inputStatement, Object o) {
        /**
         execute [[Input : statement -> expression]]() =
                address[[expression]]()
                <in>expression.type.suffix()
                <store>expression.type.suffix()
         */
        inputStatement.getExpression().accept(this.address, null);
        codeGenerator.in(inputStatement.getExpression().getType());
        codeGenerator.store(inputStatement.getExpression().getType());
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object o) {
        /**
         execute [[FunctionDefinition:Definition -> (type->parameter*, name, variables, statements)]]() =
              <name>
              execute[parameter(i)]
              enter <locals_size>
              execute[variables]
              execute[statements]
              if(type.returnType instance VoidType)
                ret <return_size>, <locals_size>, <params_size>
         */
        codeGenerator.line(funcDefinition.getLine());
        codeGenerator.func(funcDefinition.getName());

        int localVariablesSize = 0;
        for(Statement varDefinition: funcDefinition.getStatementList()) {
            if(varDefinition instanceof VarDefinition){
                varDefinition.accept(this, o);
                localVariablesSize += ((VarDefinition) varDefinition).getType().numberOfBytes();
            }
        }
        codeGenerator.enter(localVariablesSize);

        for(Statement statement: funcDefinition.getStatementList()) {
            statement.accept(this, o);
        }

        codeGenerator.ret((FunctionType) funcDefinition.getType(), localVariablesSize);
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object o) {
        return null;
    }

    @Override
    public Object visit(Function function, Object o) {
        /**
         value[[Invocation: expression1 -> expression2 expression*]]() =
            for(Espression arg : expression*)
                value[[arg]]()
            <call> expression2.name

         execute[[Invocation: statement -> expression expression*]]() =
            value[[(Expression)statement]]()
            if(!((Expression)statement).type instanceof VoidType))
                <pop> ((Expression)statement).type.suffix()
         */
        codeGenerator.line(function.getLine());
        for(Expression expression: function.getExpressions()) {
            expression.accept(this.value, o);
        }
        codeGenerator.callFunction(function.getVariable().getName());

        function.accept(this.value, o);
        if(!(function.getType().equals(VoidType.getInstance()))){
            codeGenerator.pop(function.getType().suffix());
        }
        return null;
    }

    @Override
    public Object visit(ReturnStatement returnStatement, Object o) {
        /**
         execute [[Return:statement -> expression]](funcDefinition)=
              value[[expression]]()
              <ret> expression.type.numberOfBytes() <,>
                      funcDefinition.bytesLocalSum <,>
                      funcDefinition.type.bytesParamSum
         */
        codeGenerator.line(returnStatement.getLine());
        returnStatement.accept(value, o);

        FuncDefinition funcDefinition = (FuncDefinition) o;
        FunctionType functionType = (FunctionType) funcDefinition.getType();
        int localVariableSize = funcDefinition.getVariablesSize();

        codeGenerator.ret(functionType, localVariableSize);
        return null;
    }

    @Override
    public Object visit(IfElseStatement ifElseStatement, Object o) {
        /**
         execute [[IfElseStatement : statement -> expression statement*]]() =
         int elseCondition = cg.getLabel()
         int end = cg.getLabel()

         value[[expression]]()
         <jz label> elseCondition
         for(Statement statement: statement1*)
            execute[[statement]]()
         <jmp label> end
         <label> elseCondition <:>
         for(Statement statement: statement2*)
               execute[[statement]]()
         <label> end <:>
         */
        codeGenerator.line(ifElseStatement.getLine());
        int elseCondition = codeGenerator.getLabel();
        int end = codeGenerator.getLabel();

        ifElseStatement.getExpression().accept(this, o);
        codeGenerator.jz(elseCondition);
        for (Statement statement: ifElseStatement.getIfStatementList()) {
            statement.accept(this, o);
        }
        codeGenerator.jmp(end);

        codeGenerator.label(elseCondition);
        for (Statement statement: ifElseStatement.getElseStatementList()) {
            statement.accept(this, o);
        }

        codeGenerator.label(end);
        return null;
    }

    @Override
    public Object visit(WhileStatement whileStatement, Object o) {
        /**
         execute [[WhileStatement : statement -> expression statement*]]() =
         int condition = cg.getLabel()
         int end = cg.getLabel()

         <label> condition <:>
         value[[expression]]()
         <jz label> end
         for(Statement statement: statement*)
            execute[[statement]]()
         <jmp label> condition
         <label> end <:>
         */
        codeGenerator.line(whileStatement.getLine());
        int condition = codeGenerator.getLabel();
        int end = codeGenerator.getLabel();

        codeGenerator.label(condition);
        whileStatement.getExpression().accept(value, o);
        codeGenerator.jz(end);
        for (Statement statement: whileStatement.getWhileStatementList()) {
            statement.accept(this, o);
        }
        codeGenerator.jmp(condition);

        codeGenerator.label(end);
        return null;
    }
}
