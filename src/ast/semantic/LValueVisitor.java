package ast.semantic;

import ast.expression.CharLiteral;
import ast.expression.DoubleLiteral;
import ast.expression.IntLiteral;
import ast.expression.Variable;
import ast.program.type.ErrorType;
import ast.statement.AssignmentStatement;
import ast.statement.InputStatement;
import ast.visitor.Visitor;
import ast.visitor.util.AbstractVisitor;

public class LValueVisitor extends AbstractVisitor {

    @Override
    public Object visit(Variable variable, Object o) {
        variable.setLValue(true);
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

    public Object visit(AssignmentStatement a, Object o){
        a.getLeftExpression().accept(this, o);
        a.getRightExpression().accept(this, o);
        if(!a.getLeftExpression().getLValue()){
            new ErrorType(a.getLine(), a.getColumn(), "Se esperaba un LValue");
        }
        return null;
    }

    public Object visit(InputStatement i, Object o){
        i.getExpression().accept(this, o);
        if(!i.getExpression().getLValue()){
            new ErrorType(i.getLine(), i.getColumn(), "Se esperaba un LValue en input");
        }
        return null;
    }
}
