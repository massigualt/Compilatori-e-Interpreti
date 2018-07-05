// Generated from D:/Coding/Intellij/Compilatori-e-Interpreti/grammar\FOOL.g4 by ANTLR 4.7
package parser;

    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FOOLParser}.
 */
public interface FOOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSingleExp(FOOLParser.SingleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSingleExp(FOOLParser.SingleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letInExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterLetInExp(FOOLParser.LetInExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letInExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitLetInExp(FOOLParser.LetInExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterClassExp(FOOLParser.ClassExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classExp}
	 * labeled alternative in {@link FOOLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitClassExp(FOOLParser.ClassExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#classdec}.
	 * @param ctx the parse tree
	 */
	void enterClassdec(FOOLParser.ClassdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#classdec}.
	 * @param ctx the parse tree
	 */
	void exitClassdec(FOOLParser.ClassdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(FOOLParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(FOOLParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#letnest}.
	 * @param ctx the parse tree
	 */
	void enterLetnest(FOOLParser.LetnestContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#letnest}.
	 * @param ctx the parse tree
	 */
	void exitLetnest(FOOLParser.LetnestContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#vardec}.
	 * @param ctx the parse tree
	 */
	void enterVardec(FOOLParser.VardecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#vardec}.
	 * @param ctx the parse tree
	 */
	void exitVardec(FOOLParser.VardecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#varasm}.
	 * @param ctx the parse tree
	 */
	void enterVarasm(FOOLParser.VarasmContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#varasm}.
	 * @param ctx the parse tree
	 */
	void exitVarasm(FOOLParser.VarasmContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(FOOLParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(FOOLParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(FOOLParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(FOOLParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FOOLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FOOLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(FOOLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(FOOLParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FOOLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FOOLParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FOOLParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FOOLParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#funcall}.
	 * @param ctx the parse tree
	 */
	void enterFuncall(FOOLParser.FuncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#funcall}.
	 * @param ctx the parse tree
	 */
	void exitFuncall(FOOLParser.FuncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#newexp}.
	 * @param ctx the parse tree
	 */
	void enterNewexp(FOOLParser.NewexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#newexp}.
	 * @param ctx the parse tree
	 */
	void exitNewexp(FOOLParser.NewexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(FOOLParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(FOOLParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(FOOLParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(FOOLParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBaseExp(FOOLParser.BaseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBaseExp(FOOLParser.BaseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(FOOLParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(FOOLParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(FOOLParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(FOOLParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFunExp(FOOLParser.FunExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFunExp(FOOLParser.FunExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMethodExp(FOOLParser.MethodExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMethodExp(FOOLParser.MethodExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newMethod}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNewMethod(FOOLParser.NewMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newMethod}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNewMethod(FOOLParser.NewMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullExp(FOOLParser.NullExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExp}
	 * labeled alternative in {@link FOOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullExp(FOOLParser.NullExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#stms}.
	 * @param ctx the parse tree
	 */
	void enterStms(FOOLParser.StmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#stms}.
	 * @param ctx the parse tree
	 */
	void exitStms(FOOLParser.StmsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmAssignment}
	 * labeled alternative in {@link FOOLParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStmAssignment(FOOLParser.StmAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmAssignment}
	 * labeled alternative in {@link FOOLParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStmAssignment(FOOLParser.StmAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmIfExp}
	 * labeled alternative in {@link FOOLParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStmIfExp(FOOLParser.StmIfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmIfExp}
	 * labeled alternative in {@link FOOLParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStmIfExp(FOOLParser.StmIfExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(FOOLParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(FOOLParser.MethodContext ctx);
}