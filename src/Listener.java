import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
        String tipo = ctx.ID(1).getText();

        Map<String, Identificador> escopo = pushEscopo();
        if (funcoes.containsKey(nome)) {
            erro(nome + " já foi declarado como função anteriormente");
        } else {
            List<Identificador> args = new ArrayList<>();

            for (EvilParser.ArgumentoContext actx : ctx.argumentos().argumento()) {
                String anome = actx.ID(0).getText();
                String atipo = actx.ID(1).getText();
                Identificador id = new Identificador(anome, atipo);
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
    public void enterDeclaracao(EvilParser.DeclaracaoContext ctx) {
        String nome = ctx.ID(0).getText();
        String tipo;
        if (ctx.ID(1) != null) {
            tipo = ctx.ID(1).getText();
        } else {
            tipo = "desconhecido";
        }
        if (escopoContem(nome)) {
            erro(nome + " já foi declarado neste escopo");
        } else {
            escopos.get(escopos.size() - 1).put(nome, new Identificador(nome, tipo));
        }
    }

    private boolean escopoContem(String nome) {
        boolean contem = false;
        for (Map<String, Identificador> escopo : escopos) {
            if (escopo.containsKey(nome)) {
                contem = true;
                break;
            }
        }
        return contem;
    }

    @Override
    public void enterChamada(EvilParser.ChamadaContext ctx) {
        String nome = ctx.ID().getText();
        List<EvilParser.ExprContext> params = ctx.params().expr();

        if (!funcoes.containsKey(nome)) {
            erro(nome + " não é uma função existente");
        }

        Funcao fn = funcoes.get(nome);
        if (params.size() != fn.args.size()) {
            erro("número incorreto de argumentos passado para " + nome + ": recebe " + fn.args.size() + ", recebeu " + params.size());
        } else {

        }
    }

    @Override
    public void enterNExpRef(EvilParser.NExpRefContext ctx) {
        String nome = ctx.ID().getText();

        if (!escopoContem(nome)) {
            erro(nome + " não foi declarado neste escopo");
        } else {

        }
    }

    @Override
    public void enterAtribuicao(EvilParser.AtribuicaoContext ctx) {
        String nome = ctx.ID().getText();

        if (!escopoContem(nome)) {
            erro(nome + " não foi declarado neste escopo");
        } else {
            
        }
    }

    @Override
    public void enterRetorno(EvilParser.RetornoContext ctx) {
        if (ctx.expr() != null && funcaoAtual.fn.tipo.equals("nada")) {
            erro("função de tipo nada tem retorno com valor");
        }
    }
}

class Identificador {
    String nome;
    String tipo;

    Identificador(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

class Funcao {
    Identificador fn;
    List<Identificador> args;

    Funcao(String nome, String tipo, List<Identificador> args) {
        fn = new Identificador(nome, tipo);
        this.args = args;
    }
}