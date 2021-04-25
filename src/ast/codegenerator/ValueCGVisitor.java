package ast.codegenerator;

import ast.codegenerator.util.AbstractCGVisitor;
import ast.expression.*;
import ast.program.type.DoubleType;
import ast.program.type.IntType;
import ast.program.type.Type;

public class ValueCGVisitor extends AbstractCGVisitor {

    private CodeGenerator codeGenerator;
    private AddressCGVisitor address;

    public ValueCGVisitor() {
        this.codeGenerator = CodeGenerator.getInstance();
    }

    public void setAddressVisitor(AddressCGVisitor address) {
        this.address = address;
    }

    @Override
    public Object visit(Variable variable, Object o) {
        /**
         value[[ variable:Expression -> name ]]() =
                  address[[variable]]()
                  <load>expression.type.suffix()
         */
        variable.accept(this.address, o);
        codeGenerator.load(variable.getType());
        return null;
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object o) {
        /**
         * value [[arithmetic:Expression -> expression1: Expression, expression2: Expression, type:Type, operator:String]]() =
              value [[ expression1 ]] ()
              <convert>arithmetic.expression1.type, arithmetic.type
              value [[ expression2 ]] ()
              <convert>arithmetic.expression2.type, arithmetic.type
              <arithmetic>arithmetic.type, arithmetic.operator
         */
        arithmetic.getLeftExpression().accept(this, o);
        codeGenerator.convert(arithmetic.getLeftExpression().getType(), arithmetic.getType());
        arithmetic.getRightExpression().accept(this, o);
        codeGenerator.convert(arithmetic.getRightExpression().getType(), arithmetic.getType());

        codeGenerator.arithmetic(arithmetic.getOperator(), arithmetic.getType());
        return null;
    }

    @Override
    public Object visit(ArrayAccess arrayAccess, Object o) {
        /**
         * value [[arrayAccess:Expression ->  expression1:Expression, expression2:Expression]] () =
              address [[ arrayAccess ]] ()
              <load>arrayAccess.type.suffix
         */
        arrayAccess.accept(address, o);
        codeGenerator.load(arrayAccess.getType());
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object o) {
        /**
         value [[ comparison:Expression -> expression1: Expression, expression2: Expression, type:Type, operator:String]] () =
              value [[ expression1 ]] ()
              <convert>comparison.expression1.type, comparison.type
              value [[ expression2 ]] ()
              <convert>comparison.expression2.type, comparison.type
              <comparison>comparison.type, comparison.operator
         */
        comparison.getLeftExpression().accept(this, o);
        codeGenerator.convert(comparison.getLeftExpression().getType(), comparison.getType());
        comparison.getRightExpression().accept(this, o);
        codeGenerator.convert(comparison.getRightExpression().getType(), comparison.getType());

        codeGenerator.comparison(comparison.getType(), comparison.getOperator());
        return null;
    }

    @Override
    public Object visit(CharLiteral charLiteral, Object o) {
        /**
         value [[CharLiteral : expression ->  value: char]] () =
         pushb <value>
         */
        codeGenerator.push(charLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object o) {
        /**
         value [[DoubleLiteral : expression ->  value: Double]]() =
              pushf <value>
         */
        codeGenerator.push(doubleLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object o) {
        /**
         value [[IntLiteral : expression ->  value: int]]() =
         pusha <value>
         */
        codeGenerator.push(intLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object o) {
        /**
         value [[fieldAccess:Expression ->  expression:Expression]]() =
              address [[ fieldAccess ]] ()
              <load>fieldAccess.type.suffix
         */
        fieldAccess.accept(address, o);
        codeGenerator.load(fieldAccess.getType());
        return null;
    }

    @Override
    public Object visit(Logical logical, Object o) {
        /**
         value [[logical:Expression ->  expression1:Expression, expression2:Expression, operator:String]]() =
              value [[ expression1 ]] ()
              value [[ expression2 ]] ()
              <logical>logical.operator
         */
        logical.getLeftExpression().accept(this, o);
        logical.getRightExpression().accept(this, o);
        codeGenerator.logical(logical.getOperator());
        return null;
    }

    @Override
    public Object visit(Not not, Object o) {
        /**
         value [[Not:Expression -> expression: Expression]]() =
              value [[ expression ]] ()
              <not>
         */
        not.getExpression().accept(this, o);
        codeGenerator.not();
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object o) {
        /**
         value[[ unaryMinus:Expression -> expression:Expression ]]() =
              push -1
              value[[variable]]()
              mul
         */
        Type expressionType = unaryMinus.getType();
        if(expressionType == DoubleType.getInstance()) {
            codeGenerator.push(-1.0);
        } else if(expressionType == IntType.getInstance()) {
            codeGenerator.push(-1);
        }
        unaryMinus.getExpression().accept(this, o);
        codeGenerator.mul(unaryMinus.getExpression().getType());
        return null;
    }

    @Override
    public Object visit(Cast cast, Object o) {
        /**
         * value [[cast:Expression -> expression: Expression, castType:Type]] () =
         value [[ expression ]] ()
         <convert>cast.expression.type, cast.type
         */
        cast.getExpression().accept(this, o);
        codeGenerator.convert(cast.getExpression().getType(), cast.getType());
        return null;
    }

    @Override
    public Object visit(Function function, Object o) {
        return null;
    }
}
