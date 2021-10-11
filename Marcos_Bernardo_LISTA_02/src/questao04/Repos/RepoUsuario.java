package questao04.Repos;

import questao04.Comuns.Usuario;
import questao04.Interface.IRepoGen;

import java.util.ArrayList;

public class RepoUsuario implements IRepoGen {
    ArrayList<Usuario> repo;

    public RepoUsuario(ArrayList<Usuario> repo) {
        this.repo = repo;
    }

    @Override
    public String toString() {
        String resultado="";
        for(Usuario user:this.repo){
            resultado= resultado + user +"\n"+user.getNome() + " | " +user.getDatanasc() + " | " +user.getEmail();
        }
        return resultado;
    }

    @Override
    public void inserir(Object o) {
        if(o instanceof Usuario){
            for(Usuario user : this.repo){
                if(((Usuario) o).equals(user)){
                    System.out.println("Este usuario ja possui cadastro.");
                    return;
                }
            }
            this.repo.add((Usuario) (o));
        }
    }

    @Override
    public void remover(Object o) {
        if(o instanceof Usuario){
            if(this.repo.contains(o)){
                this.repo.remove(o);
            }
            else{
                System.out.println("Erro! Usuario nao encontrado");
            }
        }
    }

    @Override
    public void atualizar(Object o) {
        int index;
        if(o instanceof Usuario){
            if(this.repo.contains(o)){
                index=this.repo.indexOf(o);
                repo.set(index, (Usuario) o);
            }
        }
    }

    @Override
    public ArrayList<Object> listar() {
        ArrayList<Object> lista = new ArrayList<>();
        for(Usuario user: this.repo){
            lista.add(user);
        }
        return lista;
    }
}
