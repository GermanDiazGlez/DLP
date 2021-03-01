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
	 * Enter a parse tree produced by {@link PmmParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(PmmParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(PmmParser.FuncBodyContext ctx);
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
	 * Enter a parse tree produced by {@link PmmParser#arrayDef}.
	 * @param ctx the parse tree
	 */
	void enterArrayDef(PmmParser.ArrayDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#arrayDef}.
	 * @param ctx the parse tree
	 */
	void exitArrayDef(PmmParser.ArrayDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PmmParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PmmParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(PmmParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(PmmParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(PmmParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(PmmParser.StructContext ctx);
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
	 * Enter a parse tree produced by {@link PmmParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(PmmParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(PmmParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(PmmParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(PmmParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#expList}.
	 * @param ctx the parse tree
	 */
	void enterExpList(PmmParser.ExpListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#expList}.
	 * @param ctx the parse tree
	 */
	void exitExpList(PmmParser.ExpListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(PmmParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(PmmParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#andOr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(PmmParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#andOr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(PmmParser.AndOrContext ctx);
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
	 * Enter a parse tree produced by {@link PmmParser#bucleW}.
	 * @param ctx the parse tree
	 */
	void enterBucleW(PmmParser.BucleWContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#bucleW}.
	 * @param ctx the parse tree
	 */
	void exitBucleW(PmmParser.BucleWContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(PmmParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(PmmParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmmParser#printInput}.
	 * @param ctx the parse tree
	 */
	void enterPrintInput(PmmParser.PrintInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmmParser#printInput}.
	 * @param ctx the parse tree
	 */
	void exitPrintInput(PmmParser.PrintInputContext ctx);
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
}