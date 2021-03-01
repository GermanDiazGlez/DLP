// Generated from C:/Users/germa/Documents/DLP/src/parser\Pmm.g4 by ANTLR 4.9.1
package parser;
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
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunParam(PmmParser.FunParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(PmmParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(PmmParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(PmmParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefinition(PmmParser.FunDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#structDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDef(PmmParser.StructDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#arrayDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDef(PmmParser.ArrayDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PmmParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#arrayAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign(PmmParser.ArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(PmmParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(PmmParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(PmmParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(PmmParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpList(PmmParser.ExpListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(PmmParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PmmParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#andOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(PmmParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PmmParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#bucleW}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleW(PmmParser.BucleWContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(PmmParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#printInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInput(PmmParser.PrintInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
}