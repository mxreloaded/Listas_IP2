package questao04.Repos;

import questao04.Comuns.Usuario;

import java.util.ArrayList;

public class RepoUsuarioC extends RepoGen{
    public RepoUsuarioC(ArrayList<Object> repo) {
        super(repo);
    }

    public void inserir(Usuario o) {
        super.inserir((Usuario) o);
    }

    public void remover(Usuario o) {
        super.remover((Usuario) o);
    }

    public void atualizar(Usuario o) {
        super.atualizar((Usuario) o);
    }


    public ArrayList<Usuario> listarU() {
        ArrayList<Usuario> resultado = new ArrayList<>();
        for(Object o : repo){
            if(o instanceof Usuario) {
                resultado.add((Usuario) o);
            }
        }
        return resultado;
    }
}
