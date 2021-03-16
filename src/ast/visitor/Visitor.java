package ast.visitor;

import ast.expression.*;
import ast.program.definition.FuncDefinition;
import ast.program.definition.VarDefinition;
import ast.program.type.*;
import ast.statement.*;

public interface Visitor {

    Object visit(Arithmetic arithmetic, Object o);

    Object visit(ArrayAccess arrayAccess, Object o);

    Object visit(Cast cast, Object o);

    Object visit(CharLiteral charLiteral, Object o);

    Object visit(Comparison comparison, Object o);

    Object visit(DoubleLiteral doubleLiteral, Object o);

    Object visit(FieldAccess fieldAccess, Object o);

    Object visit(Function function, Object o);

    Object visit(IntLiteral intLiteral, Object o);

    Object visit(Logical logical, Object o);

    Object visit(Not not, Object o);

    Object visit(UnaryMinus unaryMinus, Object o);

    Object visit(Variable variable, Object o);

    Object visit(AssignmentStatement assignmentStatement, Object o);

    Object visit(IfElseStatement ifElseStatement, Object o);

    Object visit(InputStatement inputStatement, Object o);

    Object visit(PrintStatement printStatement, Object o);

    Object visit(ReturnStatement returnStatement, Object o);

    Object visit(WhileStatement whileStatement, Object o);

    Object visit(ArrayType arrayType, Object o);

    Object visit(CharType charType, Object o);

    Object visit(DoubleType doubleType, Object o);

    Object visit(ErrorType errorType, Object o);

    Object visit(FunctionType functionType, Object o);

    Object visit(IntType intType, Object o);

    Object visit(RecordField recordField, Object o);

    Object visit(StructType structType, Object o);

    Object visit(VoidType voidType, Object o);

    Object visit(FuncDefinition funcDefinition, Object o);

    Object visit(VarDefinition varDefinition, Object o);

}
