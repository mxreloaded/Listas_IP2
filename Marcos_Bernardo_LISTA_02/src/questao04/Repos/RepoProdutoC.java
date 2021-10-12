package questao04.Repos;

import questao04.Comuns.Produto;

import java.util.ArrayList;

public class RepoProdutoC extends RepoGen{
    public RepoProdutoC(ArrayList<Object> repo) {
        super(repo);
    }

    public void inserir(Produto o) {
        super.inserir((Produto) o);
    }

    public void remover(Produto o) {
        super.remover((Produto) o);
    }

    public void atualizar(Produto o) {
        super.atualizar((Produto) o);
    }

    public ArrayList<Produto> listarP() {
        ArrayList<Produto> resultado = new ArrayList<>();
        for(Object o : repo){
            if(o instanceof Produto) {
                resultado.add((Produto) o);
            }
        }
        return resultado;
    }
}
