// Generated from C:/Users/germa/Documents/DLP/src/parser\Pmm.g4 by ANTLR 4.9.1
package parser;
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
	 * Enter a parse tree produced by {@link PmmParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(PmmParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(PmmParser.CastContext ctx);
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
	 * Enter a parse tree produced by {@link PmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PmmParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PmmParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link PmmParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(PmmParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(PmmParser.DefinitionContext ctx);
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
	 * Enter a parse tree produced by {@link PmmParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(PmmParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(PmmParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(PmmParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(PmmParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PmmParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PmmParser.FunctionContext ctx);
}