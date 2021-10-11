package questao04.Repos;

import questao04.Comuns.Loja;
import questao04.Interface.IRepoGen;

import java.util.ArrayList;

public class RepoLoja  implements IRepoGen {
    ArrayList<Loja> repo;

    public RepoLoja(ArrayList<Loja> repo) {
        this.repo = repo;
    }

    @Override
    public String toString() {
        String resultado="";
        for(Loja shop:this.repo){
            resultado=resultado + shop +"\n"+shop.getCnpj() + " | " +shop.getNome() + " | " +shop.getSite();
        }
        return resultado;
    }

    @Override
    public void inserir(Object o) {
        if(o instanceof Loja){
            if(this.repo.contains(o)){
                System.out.println("Esta loja ja possui cadastro.");
            }
            else{
                this.repo.add((Loja) o);
            }
        }
    }

    @Override
    public void remover(Object o) {
        if(o instanceof Loja){
            if(this.repo.contains(o)){
                this.repo.remove(o);
            }
            else{
                System.out.println("Erro! Loja nao encontrada");
            }
        }
    }

    @Override
    public void atualizar(Object o) {
        int index;
        if(o instanceof Loja){
            if(this.repo.contains(o)){
                index=this.repo.indexOf(o);
                repo.set(index, (Loja) o);
            }
        }
    }

    @Override
    public ArrayList<Object> listar() {
        ArrayList<Object> lista = new ArrayList<>();
        for(Loja shop: this.repo){
            lista.add(shop);
        }
        return lista;
    }
}

