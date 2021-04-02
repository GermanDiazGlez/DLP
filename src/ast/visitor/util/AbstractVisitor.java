package ast.visitor.util;

import ast.Program;
import ast.expression.*;
import ast.program.definition.FuncDefinition;
import ast.program.definition.VarDefinition;
import ast.program.type.*;
import ast.statement.*;
import ast.visitor.Visitor;

public class AbstractVisitor implements Visitor {

    @Override
    public Object visit(Arithmetic arithmetic, Object o) {
        arithmetic.getLeftExpression().accept(this, o);
        arithmetic.getRightExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object o) {
        return null;
    }

    @Override
    public Object visit(Cast cast, Object o) {
        cast.getExpression().accept(this, o);
        cast.getType().accept(this, o);
        return null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object o) {
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object o) {
        comparison.getLeftExpression().accept(this, o);
        comparison.getRightExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object o) {
        return null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object o) {
        return null;
    }

    @Override
    public Object visit(Function function, Object o) {
        function.getVariable().accept(this, o);
        function.getExpressions().stream().forEach((e)-> {e.accept(this, o);});
        return null;
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object o) {
        return null;
    }

    @Override
    public Object visit(Logical logical, Object o) {
        logical.getLeftExpression().accept(this, o);
        logical.getRightExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(Not not, Object o) {
        not.getExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object o) {
        unaryMinus.getExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(Variable variable, Object o) {
        return null;
    }

    @Override
    public Object visit(AssignmentStatement assignmentStatement, Object o) {
        return null;
    }

    @Override
    public Object visit(IfElseStatement ifElseStatement, Object o) {
        ifElseStatement.getExpression().accept(this, o);
        ifElseStatement.getIfStatementList().stream().forEach((e)-> {e.accept(this, o);});
        ifElseStatement.getElseStatementList().stream().forEach((e)-> {e.accept(this, o);});
        return null;
    }

    @Override
    public Object visit(InputStatement inputStatement, Object o) {
        inputStatement.getExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(PrintStatement printStatement, Object o) {
        printStatement.getExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(ReturnStatement returnStatement, Object o) {
        returnStatement.getExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(WhileStatement whileStatement, Object o) {
        whileStatement.getExpression().accept(this, o);
        whileStatement.getWhileStatementList().stream().forEach((e)-> {e.accept(this, o);});
        return null;
    }

    @Override
    public Object visit(ArrayType arrayType, Object o) {
        arrayType.getType().accept(this, o);
        return null;
    }

    @Override
    public Object visit(CharType charType, Object o) {
        return null;
    }

    @Override
    public Object visit(DoubleType doubleType, Object o) {
        return null;
    }

    @Override
    public Object visit(ErrorType errorType, Object o) {
        return null;
    }

    @Override
    public Object visit(FunctionType functionType, Object o) {
        functionType.getReturnType().accept(this, o);
        functionType.getParameters().stream().forEach((e) -> {e.accept(this, o);});
        return null;
    }

    @Override
    public Object visit(IntType intType, Object o) {
        return null;
    }

    @Override
    public Object visit(RecordField recordField, Object o) {
        recordField.getType().accept(this, o);
        return null;
    }

    @Override
    public Object visit(StructType structType, Object o) {
        structType.getRecordFieldList().stream().forEach((e) -> {e.accept(this, o);});
        return null;
    }

    @Override
    public Object visit(VoidType voidType, Object o) {
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object o) {
        funcDefinition.getType().accept(this, o);
        funcDefinition.getStatementList().stream().forEach((e) -> {e.accept(this, o);});
        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object o) {
        varDefinition.getType().accept(this, o);
        return null;
    }

    @Override
    public Object visit(Program p, Object o) {
        p.getDefinitions().stream().forEach((d) -> {d.accept(this, o);});
        return null;
    }
}
