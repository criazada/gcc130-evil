// Generated from Evil.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EvilParser}.
 */
public interface EvilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EvilParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EvilParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EvilParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(EvilParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(EvilParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(EvilParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(EvilParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(EvilParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(EvilParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(EvilParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(EvilParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(EvilParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(EvilParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(EvilParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(EvilParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EvilParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EvilParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(EvilParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(EvilParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(EvilParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(EvilParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(EvilParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(EvilParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#pcada}.
	 * @param ctx the parse tree
	 */
	void enterPcada(EvilParser.PcadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#pcada}.
	 * @param ctx the parse tree
	 */
	void exitPcada(EvilParser.PcadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(EvilParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(EvilParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(EvilParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(EvilParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(EvilParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(EvilParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(EvilParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(EvilParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpBool}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpBool(EvilParser.NExpBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpBool}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpBool(EvilParser.NExpBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpPar}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpPar(EvilParser.NExpParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpPar}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpPar(EvilParser.NExpParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpNum}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpNum(EvilParser.NExpNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpNum}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpNum(EvilParser.NExpNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpBin}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpBin(EvilParser.NExpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpBin}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpBin(EvilParser.NExpBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpOr}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpOr(EvilParser.NExpOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpOr}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpOr(EvilParser.NExpOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpStr}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpStr(EvilParser.NExpStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpStr}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpStr(EvilParser.NExpStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpNeg}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpNeg(EvilParser.NExpNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpNeg}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpNeg(EvilParser.NExpNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpImpl}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpImpl(EvilParser.NExpImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpImpl}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpImpl(EvilParser.NExpImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpCall}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpCall(EvilParser.NExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpCall}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpCall(EvilParser.NExpCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpRef}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpRef(EvilParser.NExpRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpRef}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpRef(EvilParser.NExpRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpNot}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpNot(EvilParser.NExpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpNot}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpNot(EvilParser.NExpNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpRel}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpRel(EvilParser.NExpRelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpRel}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpRel(EvilParser.NExpRelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpAddSub}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpAddSub(EvilParser.NExpAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpAddSub}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpAddSub(EvilParser.NExpAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpAnd}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpAnd(EvilParser.NExpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpAnd}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpAnd(EvilParser.NExpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpExp}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpExp(EvilParser.NExpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpExp}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpExp(EvilParser.NExpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpMulDiv}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNExpMulDiv(EvilParser.NExpMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpMulDiv}
	 * labeled alternative in {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNExpMulDiv(EvilParser.NExpMulDivContext ctx);
}