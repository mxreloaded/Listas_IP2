package questao04.Repos;

import questao04.Comuns.AlertaPreco;

import java.util.ArrayList;

public class RepoAlertaPrecoC extends RepoGen{
    public RepoAlertaPrecoC(ArrayList<Object> repo) {
        super(repo);
    }
    public void inserir(AlertaPreco o) {
        super.inserir((AlertaPreco) o);
    }

    public void remover(AlertaPreco o) {
        super.remover((AlertaPreco) o);
    }

    public void atualizar(AlertaPreco o) {
        super.atualizar((AlertaPreco) o);
    }

    public ArrayList<AlertaPreco> listarAP() {
        ArrayList<AlertaPreco> resultado = new ArrayList<>();
        for(Object o : repo){
            if(o instanceof AlertaPreco) {
                resultado.add((AlertaPreco) o);
            }
        }
        return resultado;
    }
}

