package ast.program.type;

import ast.ASTNode;
import ast.expression.Expression;

import java.util.List;

public interface Type extends ASTNode {
    boolean isBuiltInType();
    boolean isLogical();
    Type arithmetic(Type other);
    Type arithmetic();
    Type logic(Type other);
    Type logic();
    Type promotesTo(Type other);
    Type canBeCastTo(Type other);
    Type comparison(Type other);
    Type squareBrackets(Type other);
    Type dot(String field);
    Type parenthesis(List<Expression> parameters);
    int numberOfBytes();
    char suffix();
}
