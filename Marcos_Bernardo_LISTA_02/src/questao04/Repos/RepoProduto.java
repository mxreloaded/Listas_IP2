package questao04.Repos;

import questao04.Comuns.Produto;
import questao04.Interface.IRepoGen;

import java.util.ArrayList;

public class RepoProduto implements IRepoGen {
    ArrayList<Produto> repo;

    public RepoProduto(ArrayList<Produto> repo) {
        this.repo = repo;
    }

    @Override
    public String toString() {
        String resultado="";
        for(Produto prod:this.repo){
            resultado= resultado + prod +"\n"+prod.getRef() + " | " +prod.getNome() + " | " +prod.getDescricao() + " | " +prod.getCat();
        }
        return resultado;
    }

    @Override
    public void inserir(Object o) {
        if(o instanceof Produto){
            if(this.repo.contains(o)){
                System.out.println("Este produto ja possui cadastro.");
            }
            else{
                this.repo.add((Produto) o);
            }
        }
    }

    @Override
    public void remover(Object o) {
        if(o instanceof Produto){
            if(this.repo.contains(o)){
                this.repo.remove(o);
            }
            else{
                System.out.println("Erro! Produto nao encontrado");
            }
        }
    }

    @Override
    public void atualizar(Object o) {
        int index;
        if(o instanceof Produto){
            if(this.repo.contains(o)){
                index=this.repo.indexOf(o);
                repo.set(index, (Produto) o);
            }
        }
    }

    @Override
    public ArrayList<Object> listar() {
        ArrayList<Object> lista = new ArrayList<>();
        for(Produto prod: this.repo){
            lista.add(prod);
        }
        return lista;
    }
}

