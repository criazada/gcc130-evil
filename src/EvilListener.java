// Generated from Evil.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link EvilParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(EvilParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(EvilParser.ParamContext ctx);
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
	 * Enter a parse tree produced by {@link EvilParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(EvilParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(EvilParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#iexpr}.
	 * @param ctx the parse tree
	 */
	void enterIexpr(EvilParser.IexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#iexpr}.
	 * @param ctx the parse tree
	 */
	void exitIexpr(EvilParser.IexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EvilParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EvilParser.ExprContext ctx);
}