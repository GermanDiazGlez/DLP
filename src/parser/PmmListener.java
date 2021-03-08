// Generated from C:/Users/germa/Documents/DLP/src/parser\Pmm.g4 by ANTLR 4.9.1
package parser;

import ast.*;
import ast.expression.*;
import ast.program.type.*;
import ast.program.definition.*;
import ast.statement.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PmmParser}.
 */
public interface PmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(PmmParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(PmmParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(PmmParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(PmmParser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(PmmParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(PmmParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#builtinType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinType(PmmParser.BuiltinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#builtinType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinType(PmmParser.BuiltinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#varDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinitions(PmmParser.VarDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#varDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinitions(PmmParser.VarDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(PmmParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(PmmParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PmmParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PmmParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#funParam}.
	 * @param ctx the parse tree
	 */
	void enterFunParam(PmmParser.FunParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funParam}.
	 * @param ctx the parse tree
	 */
	void exitFunParam(PmmParser.FunParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#giveParams}.
	 * @param ctx the parse tree
	 */
	void enterGiveParams(PmmParser.GiveParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#giveParams}.
	 * @param ctx the parse tree
	 */
	void exitGiveParams(PmmParser.GiveParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PmmParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PmmParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#funDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunDefinition(PmmParser.FunDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunDefinition(PmmParser.FunDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PmmParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PmmParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PmmParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PmmParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PmmParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PmmParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#give_params}.
	 * @param ctx the parse tree
	 */
	void enterGive_params(PmmParser.Give_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#give_params}.
	 * @param ctx the parse tree
	 */
	void exitGive_params(PmmParser.Give_paramsContext ctx);
}