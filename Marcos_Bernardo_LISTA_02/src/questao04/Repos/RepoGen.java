package questao04.Repos;

import questao04.Comuns.Loja;
import questao04.Interface.IRepoGen;

import java.util.ArrayList;

public abstract class RepoGen implements IRepoGen {
    ArrayList<Object> repo;

    public RepoGen(ArrayList<Object> repo) {
        this.repo = repo;
    }

    @Override
    public void inserir(Object o) {
        if(this.repo.contains(o)){
            System.out.println("Estx xxxx ja possui cadastro.");
        }
        else{
            this.repo.add(o);
        }
    }

    @Override
    public void remover(Object o) {
        if(this.repo.contains(o)){
            this.repo.remove(o);
        }
        else{
            System.out.println("Erro! xxxx nao encontradx");
        }
    }

    @Override
    public void atualizar(Object o) {
        int index;
        if(this.repo.contains(o)){
            index=this.repo.indexOf(o);
            repo.set(index, o);
        }
    }

    @Override
    public ArrayList<Object> listar() {
        return null;
    }


}

