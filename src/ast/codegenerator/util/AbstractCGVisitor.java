package ast.codegenerator.util;

import ast.Program;
import ast.expression.*;
import ast.program.definition.FuncDefinition;
import ast.program.definition.VarDefinition;
import ast.program.type.*;
import ast.statement.*;
import ast.visitor.Visitor;

public class AbstractCGVisitor implements Visitor {
    @Override
    public Object visit(Arithmetic arithmetic, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(Cast cast, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(Comparison comparison, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(Function function, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(Logical logical, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(Not not, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(Variable variable, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(AssignmentStatement assignmentStatement, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(IfElseStatement ifElseStatement, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(InputStatement inputStatement, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(PrintStatement printStatement, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(ReturnStatement returnStatement, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(WhileStatement whileStatement, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(ArrayType arrayType, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(CharType charType, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(DoubleType doubleType, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(ErrorType errorType, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(FunctionType functionType, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(IntType intType, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(RecordField recordField, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(StructType structType, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(VoidType voidType, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }

    @Override
    public Object visit(Program p, Object o) {
        throw new IllegalStateException("No se puede visitar");
    }
}
