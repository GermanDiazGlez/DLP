package ast.semantic;

import ast.expression.*;
import ast.program.type.ErrorType;
import ast.statement.*;
import ast.visitor.Visitor;
import ast.visitor.util.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor {

    @Override
    public Object visit(Variable variable, Object o) {
        variable.setLValue(true);
        variable.setType(variable.getDefinition().getType());
        return  null;
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object o) {
        intLiteral.setLValue(false);
        return  null;
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object o) {
        doubleLiteral.setLValue(false);
        return  null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object o) {
        charLiteral.setLValue(false);
        return  null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object o) {
        fieldAccess.setLValue(true);
        fieldAccess.getExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object o) {
        arrayAccess.setLValue(true);
        arrayAccess.getLeftExpression().accept(this, o);
        arrayAccess.getRightExpression().accept(this, o);
        return null;
    }

    @Override
    public Object visit(AssignmentStatement a, Object o){
        a.getLeftExpression().accept(this, o);
        a.getRightExpression().accept(this, o);
        if(!a.getLeftExpression().getLValue()){
            new ErrorType(a.getLine(), a.getColumn(), "Se esperaba un LValue");
        }

        a.getLeftExpression().setType(a.getRightExpression().getType().promotesTo(a.getLeftExpression().getType()));
        if( a.getLeftExpression().getType() == null)
            a.getLeftExpression().setType(new ErrorType(a.getLeftExpression().getLine(), a.getLeftExpression().getColumn(),
                    "No es posible asignar el tipo " +
                            a.getRightExpression().getType() + " al tipo " +
                            a.getLeftExpression().getType()));

        return null;
    }

    @Override
    public Object visit(InputStatement i, Object o){
        i.getExpression().accept(this, o);
        if(!i.getExpression().getLValue()){
            new ErrorType(i.getLine(), i.getColumn(), "Se esperaba un LValue en input");
        }
        return null;
    }


    @Override
    public Object visit(WhileStatement whileStatement, Object o) {
        whileStatement.getExpression().accept(this, o);

        if( !whileStatement.getExpression().getType().isLogical())
            whileStatement.getExpression().setType(new ErrorType(whileStatement.getExpression().getLine(), whileStatement.getExpression().getColumn(),
                    "La condición no es una expresión lógica"));

        whileStatement.getWhileStatementList().stream().forEach((e)-> {e.accept(this, o);});
        return null;
    }

    @Override
    public Object visit(IfElseStatement ifElseStatement, Object o) {
        ifElseStatement.getExpression().accept(this, o);

        if( !ifElseStatement.getExpression().getType().isLogical())
            ifElseStatement.getExpression().setType(new ErrorType(ifElseStatement.getExpression().getLine(), ifElseStatement.getExpression().getColumn(),
                    "La condición no es una expresión lógica"));

        ifElseStatement.getIfStatementList().stream().forEach((e)-> {e.accept(this, o);});
        ifElseStatement.getElseStatementList().stream().forEach((e)-> {e.accept(this, o);});
        return null;
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object o) {
        arithmetic.getLeftExpression().accept(this, o);
        arithmetic.getRightExpression().accept(this, o);

        arithmetic.setType(arithmetic.getLeftExpression().getType().arithmetic(arithmetic.getRightExpression().getType()));

        if( arithmetic.getType() == null)
            arithmetic.setType(new ErrorType(arithmetic.getLine(), arithmetic.getColumn(),
                    "No se puede hacer la operacion '" + arithmetic.getOperator() + "' con los tipos " +
                    arithmetic.getLeftExpression().getType() + " y " +
                    arithmetic.getRightExpression().getType()));

        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object o) {
        comparison.getLeftExpression().accept(this, o);
        comparison.getRightExpression().accept(this, o);

        comparison.setType(comparison.getLeftExpression().getType().comparison(comparison.getRightExpression().getType()));

        if( comparison.getType() == null)
            comparison.setType(new ErrorType(comparison.getLine(), comparison.getColumn(),
                    "No se puede hacer la comparación '" + comparison.getOperator() + "' con los tipos " +
                            comparison.getLeftExpression().getType() + " y " +
                            comparison.getRightExpression().getType()));

        return null;
    }

    @Override
    public Object visit(Logical logical, Object o) {
        logical.getLeftExpression().accept(this, o);
        logical.getRightExpression().accept(this, o);

        logical.setType(logical.getLeftExpression().getType().logic(logical.getRightExpression().getType()));

        if( logical.getType() == null)
            logical.setType(new ErrorType(logical.getLine(), logical.getColumn(),
                    "No se puede hacer la operación lógica '" + logical.getOperator() + "' con los tipos " +
                            logical.getLeftExpression().getType() + " y " +
                            logical.getRightExpression().getType()));

        return null;
    }

    @Override
    public Object visit(Not not, Object o) {
        not.getExpression().accept(this, o);

        not.setType(not.getExpression().getType().logic());

        if( not.getType() == null)
            not.setType(new ErrorType(not.getLine(), not.getColumn(),
                    "No se puede realizar la negación de la expresión con tipo: " +
                            not.getExpression().getType()));

        return null;
    }


}
