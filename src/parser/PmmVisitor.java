// Generated from C:/Users/germa/Documents/DLP/src/parser\Pmm.g4 by ANTLR 4.9.1
package parser;

import ast.*;
import ast.expression.*;
import ast.program.type.*;
import ast.program.definition.*;
import ast.statement.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(PmmParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(PmmParser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(PmmParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#builtinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinType(PmmParser.BuiltinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#varDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinitions(PmmParser.VarDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(PmmParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(PmmParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunParam(PmmParser.FunParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#giveParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiveParams(PmmParser.GiveParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PmmParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefinition(PmmParser.FunDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PmmParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PmmParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PmmParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#give_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGive_params(PmmParser.Give_paramsContext ctx);
}