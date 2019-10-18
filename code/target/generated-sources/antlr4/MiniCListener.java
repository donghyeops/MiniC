// Generated from MiniC.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniCParser}.
 */
public interface MiniCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniCParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MiniCParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MiniCParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MiniCParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MiniCParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(MiniCParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(MiniCParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MiniCParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MiniCParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(MiniCParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(MiniCParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(MiniCParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(MiniCParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MiniCParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MiniCParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MiniCParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MiniCParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusplusExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusplusExpr(MiniCParser.PlusplusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusplusExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusplusExpr(MiniCParser.PlusplusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(MiniCParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(MiniCParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minminExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinminExpr(MiniCParser.MinminExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minminExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinminExpr(MiniCParser.MinminExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(MiniCParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(MiniCParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(MiniCParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(MiniCParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MiniCParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MiniCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MiniCParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(MiniCParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(MiniCParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(MiniCParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(MiniCParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDoubleAtom(MiniCParser.DoubleAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDoubleAtom(MiniCParser.DoubleAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(MiniCParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(MiniCParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(MiniCParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MiniCParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(MiniCParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MiniCParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MiniCParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(MiniCParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(MiniCParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterPrintf}
	 * labeled alternative in {@link MiniCParser#printf}.
	 * @param ctx the parse tree
	 */
	void enterParameterPrintf(MiniCParser.ParameterPrintfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterPrintf}
	 * labeled alternative in {@link MiniCParser#printf}.
	 * @param ctx the parse tree
	 */
	void exitParameterPrintf(MiniCParser.ParameterPrintfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commonPrintf}
	 * labeled alternative in {@link MiniCParser#printf}.
	 * @param ctx the parse tree
	 */
	void enterCommonPrintf(MiniCParser.CommonPrintfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commonPrintf}
	 * labeled alternative in {@link MiniCParser#printf}.
	 * @param ctx the parse tree
	 */
	void exitCommonPrintf(MiniCParser.CommonPrintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#scanf}.
	 * @param ctx the parse tree
	 */
	void enterScanf(MiniCParser.ScanfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#scanf}.
	 * @param ctx the parse tree
	 */
	void exitScanf(MiniCParser.ScanfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(MiniCParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(MiniCParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileBlock}
	 * labeled alternative in {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(MiniCParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileBlock}
	 * labeled alternative in {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(MiniCParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(MiniCParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forBlock}
	 * labeled alternative in {@link MiniCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(MiniCParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#if_contents}.
	 * @param ctx the parse tree
	 */
	void enterIf_contents(MiniCParser.If_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#if_contents}.
	 * @param ctx the parse tree
	 */
	void exitIf_contents(MiniCParser.If_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#while_contents}.
	 * @param ctx the parse tree
	 */
	void enterWhile_contents(MiniCParser.While_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#while_contents}.
	 * @param ctx the parse tree
	 */
	void exitWhile_contents(MiniCParser.While_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#for_contents}.
	 * @param ctx the parse tree
	 */
	void enterFor_contents(MiniCParser.For_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#for_contents}.
	 * @param ctx the parse tree
	 */
	void exitFor_contents(MiniCParser.For_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MiniCParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MiniCParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(MiniCParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(MiniCParser.Condition_blockContext ctx);
}