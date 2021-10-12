package questao04.Repos;

import questao04.Comuns.OfertaProduto;

import java.util.ArrayList;

public class RepoOfertaProdutoC extends RepoGen{
    public RepoOfertaProdutoC(ArrayList<Object> repo) {
        super(repo);
    }
    public void inserir(OfertaProduto o) {
        super.inserir((OfertaProduto) o);
    }

    public void remover(OfertaProduto o) {
        super.remover((OfertaProduto) o);
    }

    public void atualizar(OfertaProduto o) {
        super.atualizar((OfertaProduto) o);
    }

    public ArrayList<OfertaProduto> listarOP() {
        ArrayList<OfertaProduto> resultado = new ArrayList<>();
        for(Object o : repo){
            if(o instanceof OfertaProduto) {
                resultado.add((OfertaProduto) o);
            }
        }
        return resultado;
    }
}

