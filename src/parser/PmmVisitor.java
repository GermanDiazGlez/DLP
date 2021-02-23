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
	 * Visit a parse tree produced by {@link PmmParser#structDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDef(PmmParser.StructDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(PmmParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#vectorAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorAssign(PmmParser.VectorAssignContext ctx);
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
	 * Visit a parse tree produced by {@link PmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDefinition(PmmParser.FunDefinitionContext ctx);
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
	 * Visit a parse tree produced by {@link PmmParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PmmParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#bucleW}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleW(PmmParser.BucleWContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
}