package ast.semantic;

import ast.expression.*;
import ast.program.definition.VarDefinition;
import ast.program.type.*;
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
        intLiteral.setType(IntType.getInstance());
        return  null;
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object o) {
        doubleLiteral.setLValue(false);
        doubleLiteral.setType(DoubleType.getInstance());
        return  null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object o) {
        charLiteral.setLValue(false);
        charLiteral.setType(CharType.getInstance());
        return  null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object o) {
        fieldAccess.setLValue(true);
        fieldAccess.getExpression().accept(this, o);

        fieldAccess.setType(fieldAccess.getExpression().getType().dot(fieldAccess.getName()));

        if(fieldAccess.getType() == null) {
            fieldAccess.setType(new ErrorType(fieldAccess.getLine(), fieldAccess.getColumn(),
                            "No es posible acceder al campo '" + fieldAccess.getName() + "'"));
        }
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object o) {
        arrayAccess.setLValue(true);
        arrayAccess.getLeftExpression().accept(this, o);
        arrayAccess.getRightExpression().accept(this, o);

        arrayAccess.setType(arrayAccess.getLeftExpression().getType().squareBrackets(arrayAccess.getRightExpression().getType()));

        if(arrayAccess.getType() == null) {
            arrayAccess.setType(new ErrorType(arrayAccess.getLine(), arrayAccess.getColumn(),
                            "El acceso a array no es válido"));
        }
        return null;
    }

    @Override
    public Object visit(AssignmentStatement a, Object o){
        a.getLeftExpression().accept(this, o);
        a.getRightExpression().accept(this, o);

        Type tipoIzquierda = a.getLeftExpression().getType();
        Type tipoDerecha = a.getRightExpression().getType();

        if(!a.getLeftExpression().getLValue())
            new ErrorType(a.getLine(), a.getColumn(), "Se esperaba un LValue");

        a.getLeftExpression().setType(a.getRightExpression().getType().promotesTo(a.getLeftExpression().getType()));

        if( a.getLeftExpression().getType() == null)
            a.getLeftExpression().setType(new ErrorType(a.getLeftExpression().getLine(), a.getLeftExpression().getColumn(),
                    "No es posible asignar el tipo " +
                            tipoDerecha.toString() + " al tipo " +
                            tipoIzquierda.toString()));

        return null;
    }

    @Override
    public Object visit(InputStatement inputStatement , Object o) {
        inputStatement.getExpression().accept(this, o);

        if(!inputStatement.getExpression().getLValue()) {
            new ErrorType(inputStatement.getExpression().getLine(), inputStatement.getExpression().getColumn(),
                    "La expresión de tipo " + inputStatement.getExpression().getType() + " no es modificable");
        }

        if(!inputStatement.getExpression().getType().isBuiltInType()) {
            inputStatement.getExpression().setType(
                    new ErrorType(
                            inputStatement.getExpression().getLine(),
                            inputStatement.getExpression().getColumn(),
                            "Se esperaba un tipo primitivo y se ha recibido un " +
                                    inputStatement.getExpression().getType()));
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
        //El else puede ser null, asi que nos aseguramos
        if(ifElseStatement.getElseStatementList()!= null){
            ifElseStatement.getElseStatementList().stream().forEach((e)-> {e.accept(this, o);});
        }
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
                            comparison.getLeftExpression().getType().toString() + " y " +
                            comparison.getRightExpression().getType().toString()));

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
                    "No se puede negar la expresión con tipo: " +
                            not.getExpression().getType()));

        return null;
    }

    @Override
    public Object visit(Cast cast, Object o) {
        cast.getExpression().accept(this, o);
        cast.getType().accept(this, o);

        cast.setType(cast.getExpression().getType().canBeCastTo(cast.getType()));

        if(cast.getType() == null)
            cast.setType(new ErrorType(cast.getLine(), cast.getColumn(),
                            "No es posible hacer cast del tipo "
                                    + cast.getExpression().getType() + " al tipo "
                                    + cast.getType()));

        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object o) {
        unaryMinus.getExpression().accept(this, o);

        unaryMinus.setType(unaryMinus.getExpression().getType().arithmetic());

        if(unaryMinus.getType() == null)
            unaryMinus.setType(new ErrorType(unaryMinus.getLine(), unaryMinus.getColumn(),
                            "Imposible aplicar menos unario a la expresión con el tipo: " +
                                    unaryMinus.getExpression().getType()));

        return null;
    }

    @Override
    public Object visit(PrintStatement printStatement, Object o) {
        printStatement.getExpression().accept(this, o);

        if(!printStatement.getExpression().getType().isBuiltInType())
            printStatement.getExpression().setType(new ErrorType(printStatement.getExpression().getLine(),printStatement.getExpression().getColumn(),
                            "Se esperaba un tipo primitivo"));

        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object o) {
        varDefinition.getType().accept(this, o);
        return null;
    }

    @Override
    public Object visit(Function function, Object o) {
        function.getVariable().accept(this, o);
        function.getExpressions().stream().forEach((e)-> {e.accept(this, o);});

        function.setType(function.getVariable().getType().parenthesis(function.getExpressions()));

        if(function.getType() == null)
            function.setType(new ErrorType(function.getLine(), function.getColumn(),
                            "No se puede invocar la función"));

        return null;
    }
}
