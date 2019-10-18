// Generated from MiniC.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniCParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MiniCParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(MiniCParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(MiniCParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MiniCParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(MiniCParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(MiniCParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(MiniCParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MiniCParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(MiniCParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(MiniCParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(MiniCParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MiniCParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(MiniCParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(MiniCParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleAtom(MiniCParser.DoubleAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(MiniCParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(MiniCParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MiniCParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(MiniCParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#printf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintf(MiniCParser.PrintfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#scanf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanf(MiniCParser.ScanfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#printf2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintf2(MiniCParser.Printf2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#condition_contents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_contents(MiniCParser.Condition_contentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(MiniCParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniCParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MiniCParser.ConditionContext ctx);
}