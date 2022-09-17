import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends EvilBaseListener {
    private List<Map<String, Identificador>> escopos = new LinkedList<>();
    private Map<String, Funcao> funcoes = new HashMap<>();
    private List<String> erros = new ArrayList<>();
    private Funcao funcaoAtual = null;

    private void erro(String err) {
        if (funcaoAtual != null) {
            err = funcaoAtual.fn.nome + ": " + err;
        }
        erros.add(err);
    }

    public List<String> getErros() {
        return erros;
    }

    @Override
    public void enterFuncao(EvilParser.FuncaoContext ctx) {
        String nome = ctx.ID(0).getText();
        Tipo tipo = Tipo.parse(ctx.ID(1));

        Map<String, Identificador> escopo = pushEscopo();
        if (funcoes.containsKey(nome)) {
            erro(nome + " já foi declarado como função anteriormente");
        } else {
            List<Identificador> args = new ArrayList<>();

            for (EvilParser.ParamContext actx : ctx.params().param()) {
                String anome = actx.ID(0).getText();
                Identificador id = new Identificador(anome, Tipo.parse(actx.ID(1)));
                args.add(id);
                escopo.put(anome, id);
            }
            Funcao fn = new Funcao(nome, tipo, args);
            funcoes.put(nome, new Funcao(nome, tipo, args));
            funcaoAtual = fn;
        }
    }

    private Map<String, Identificador> pushEscopo() {
        Map<String, Identificador> escopo = new HashMap<>();
        escopos.add(escopo);
        return escopo;
    }

    private void popEscopo() {
        escopos.remove(escopos.size() - 1);
    }

    @Override
    public void exitFuncao(EvilParser.FuncaoContext ctx) {
        popEscopo();
        funcaoAtual = null;
    }

    @Override
    public void enterBloco(EvilParser.BlocoContext ctx) {
        pushEscopo();
    }
    
    @Override
    public void exitBloco(EvilParser.BlocoContext ctx) {
        popEscopo();
    }

    @Override
    public void exitDeclaracao(EvilParser.DeclaracaoContext ctx) {
        String nome = ctx.ID(0).getText();
        Tipo tipoExpr = resolverTipo(ctx.iexpr());
        Tipo tipo;

        if (ctx.ID(1) != null) {
            tipo = Tipo.parse(ctx.ID(1));
            if (tipo != tipoExpr) {
                erro("tipo declarado para " + nome + " é diferente do da expressão: esperava " + tipo + ", é " + tipoExpr);
            }
        } else {
            tipo = tipoExpr;
        }

        if (escopoContem(nome)) {
            erro(nome + " já foi declarado neste escopo");
        } else {
            escopos.get(escopos.size() - 1).put(nome, new Identificador(nome, tipo));
        }
    }

    private boolean escopoContem(String nome) {
        return getVar(nome) != null;
    }

    private Identificador getVar(String nome) {
        for (Map<String, Identificador> escopo : escopos) {
            Identificador id = escopo.get(nome);
            if (id != null) {
                return id;
            }
        }
        return null;
    }

    private Funcao getFuncao(String nome) {
        return funcoes.get(nome);
    }

    @Override
    public void enterChamada(EvilParser.ChamadaContext ctx) {
        String nome = ctx.ID().getText();
        List<Tipo> tipos = resolverTipos(ctx.args().iexpr());
        Funcao fn = getFuncao(nome);

        if (fn == null) {
            erro(nome + " não é uma função existente");
        } else {
            if (tipos.size() != fn.params.size()) {
                erro("número incorreto de argumentos passado para " + nome + ": esperava " + fn.params.size() + ", recebeu " + tipos.size());
            }

            for (int i = 0; i < fn.params.size(); i++) {
                Tipo a = fn.params.get(i).tipo;
                Tipo b = tipos.get(i);
                if (a != b) {
                    erro("tipo incorreto para argumento " + i + " de " + nome + ": esperava " + a + ", recebeu " + b);
                }
            }
        }
    }

    @Override
    public void enterAtribuicao(EvilParser.AtribuicaoContext ctx) {
        String nome = ctx.ID().getText();
        Identificador id = getVar(nome);
        if (id == null) {
            erro(nome + " não foi declarado neste escopo");
        } else {
            Tipo a = id.tipo;
            Tipo b = resolverTipo(ctx.iexpr());
            if (a != b || (a == Tipo.REAL && !b.numerico())) {
                erro("atribuição entre tipos inválidos: " + a + " e " + b);
            }
        }
    }

    @Override
    public void enterRetorno(EvilParser.RetornoContext ctx) {
        Tipo a = funcaoAtual.fn.tipo;
        Tipo b = resolverTipo(ctx.iexpr());
        if (a != b) {
            erro("retorno de tipo inválido: esperava " + a + ", retornou " + b);
        }
    }

    @Override
    public void enterCondicional(EvilParser.CondicionalContext ctx) {
        if (resolverTipo(ctx.iexpr()) != Tipo.BOOL) {
            erro("condicional de se não é booleana");
        }
    }

    @Override
    public void enterEnquanto(EvilParser.EnquantoContext ctx) {
        if (resolverTipo(ctx.iexpr()) != Tipo.BOOL) {
            erro("guarda de enquanto não é booleano");
        }
    }

    private List<Tipo> resolverTipos(List<EvilParser.IexprContext> exprs) {
        List<Tipo> tipos = new ArrayList<>();

        for (EvilParser.IexprContext expr : exprs) {
            tipos.add(resolverTipo(expr));
        }

        return tipos;
    }

    private Tipo resolverTipo(EvilParser.IexprContext expr) {
        if (expr == null) return Tipo.NADA;
        return resolverTipo(expr.expr());
    }

    private Tipo resolverTipo(EvilParser.ExprContext expr) {
        if (expr == null) {
            return Tipo.NADA;
        }

        Tipo a = resolverTipo(expr.expr(0));
        Tipo b = resolverTipo(expr.expr(1));

        if (expr.NUM() != null) {
            String num = expr.NUM().getText();
            if (num.contains(".")) {
                return Tipo.REAL;
            } else {
                return Tipo.INTEIRO;
            }
        } else if (expr.chamada() != null) {
            return funcoes.get(expr.chamada().ID().getText()).fn.tipo;
        } else if (expr.STRING() != null) {
            return Tipo.TEXTO;
        } else if (expr.BOOL() != null) {
            return Tipo.BOOL;
        } else if (expr.ID() != null) {
            return getVar(expr.ID().getText()).tipo;
        } else if (expr.NOT() != null) {
            if (a != Tipo.BOOL) {
                erro("operação booleana sobre " + a);
                return Tipo.DESCONHECIDO;
            }
            return Tipo.BOOL;
        } else if (expr.NEG() != null) {
            if (!a.numerico()) {
                erro("operação numérica sobre " + a);
                return Tipo.DESCONHECIDO;
            } else {
                return a;
            }
        } else if (expr.AP() != null) {
            return a;
        } else if (expr.EXP() != null || expr.MULMODDIV() != null || expr.ADDSUB() != null) {
            if (!a.numerico() || !b.numerico()) {
                erro("operação aritmética sobre " + a + " e " + b);
                return Tipo.DESCONHECIDO;
            } else if (expr.MULMODDIV() != null) {
                String op = expr.MULMODDIV().getText();
                if (op.equals("/")) {
                    return Tipo.REAL;
                } else if (op.equals("//")) {
                    if (b == Tipo.REAL) {
                        erro("divisão inteira com divisor real");
                    }
                    return Tipo.INTEIRO;
                } else if (op.equals("*")) {
                    if (a != b) {
                        return Tipo.REAL;
                    } else {
                        return Tipo.INTEIRO;
                    }
                } else if (op.equals("%")) {
                    if (b == Tipo.REAL) {
                        erro("resto com divisor real");
                    }
                    return Tipo.INTEIRO;
                }
                return Tipo.DESCONHECIDO;
            } else if (expr.EXP() != null || expr.ADDSUB() != null) {
                return a != b ? Tipo.REAL : Tipo.INTEIRO;
            } else {
                return Tipo.DESCONHECIDO;
            }
        } else if (expr.OPBIN() != null) {
            if (a != Tipo.INTEIRO || b != Tipo.INTEIRO) {
                erro("operação binária sobre " + a + " e " + b);
                return Tipo.DESCONHECIDO;
            } else {
                return Tipo.REAL;
            }
        } else if (expr.OPEQ() != null) {
            if (a != b) {
                erro("operação de igualdade sobre " + a + " e " + b);
                return Tipo.DESCONHECIDO;
            } else {
                return Tipo.BOOL;
            }
        } else if (expr.OPREL() != null) {
            if (a.numerico() && b.numerico()) {
                return Tipo.BOOL;
            } else {
                erro("operação relacional entre " + a + " e " + b);
                return Tipo.DESCONHECIDO;
            }
        } else if (expr.LOGAND() != null || expr.LOGOR() != null || expr.LOGIMPL() != null) {
            if (a == Tipo.BOOL && b == Tipo.BOOL) {
                return Tipo.BOOL;
            } else {
                erro("operação lógica sobre " + a + " e " + b);
                return Tipo.DESCONHECIDO;
            }
        }

        return Tipo.DESCONHECIDO;
    }
}

enum Tipo {
    REAL("real"),
    INTEIRO("inteiro"),
    TEXTO("texto"),
    BOOL("booleano"),
    NADA("nada"),
    DESCONHECIDO("");

    private String txt;

    private Tipo(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return txt;
    }

    public static Tipo parse(String s) {
        if (s.equals("real")) {
            return REAL;
        } else if (s.equals("inteiro")) {
            return INTEIRO;
        } else if (s.equals("texto")) {
            return TEXTO;
        } else if (s.equals("booleano")) {
            return BOOL;
        } else if (s.equals("nada")) {
            return NADA;
        }
        return DESCONHECIDO;
    }

    public static Tipo parse(TerminalNode t) {
        return parse(t.getText());
    }

    public boolean numerico() {
        return this == REAL || this == INTEIRO;
    }
}

class Identificador {
    String nome;
    Tipo tipo;

    Identificador(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

class Funcao {
    Identificador fn;
    List<Identificador> params;

    Funcao(String nome, Tipo tipo, List<Identificador> params) {
        fn = new Identificador(nome, tipo);
        this.params = params;
    }
}
