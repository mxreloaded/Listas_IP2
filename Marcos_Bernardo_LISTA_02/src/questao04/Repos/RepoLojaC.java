package questao04.Repos;

import questao04.Comuns.Loja;

import java.util.ArrayList;

public class RepoLojaC extends RepoGen{

    public RepoLojaC(ArrayList<Object> repo) {
        super(repo);
    }

    public void inserir(Loja o) {
        super.inserir((Loja) o);
    }

    public void remover(Loja o) {
        super.remover((Loja) o);
    }

    public void atualizar(Loja o) {
        super.atualizar((Loja) o);
    }

    public ArrayList<Loja> listarL() {
        ArrayList<Loja> resultado = new ArrayList<>();
        for(Object o : repo){
            if(o instanceof Loja) {
                resultado.add((Loja) o);
            }
        }
        return resultado;
    }
}
