package questao04;

import questao04.Comuns.*;
import questao04.Repos.*;

import java.time.LocalDate;
import java.util.*;

import static questao04.Enums.Categoria.*;

public class Controlador {
    RepoLojaC repositorioLojas;
    RepoProdutoC repositorioProdutos;
    RepoUsuarioC repositorioUsuarios;
    RepoAlertaPrecoC repositorioAlertaPrecos;
    RepoOfertaProdutoC repositorioOfertasProduto;

    public Controlador(RepoLojaC repositorioLojas, RepoProdutoC repositorioProdutos, RepoUsuarioC repositorioUsuarios,
                       RepoAlertaPrecoC repositorioAlertaPrecos, RepoOfertaProdutoC repositorioOfertasProduto) {
        this.repositorioLojas = repositorioLojas;
        this.repositorioProdutos = repositorioProdutos;
        this.repositorioUsuarios = repositorioUsuarios;
        this.repositorioAlertaPrecos = repositorioAlertaPrecos;
        this.repositorioOfertasProduto = repositorioOfertasProduto;
    }


    ArrayList<OfertaProduto> listarOfertasOrdenadasPorPrecosNaData(Produto param , LocalDate dataAtual){
        ArrayList<OfertaProduto> resultado = new ArrayList<>();
        ArrayList<OfertaProduto> sort = new ArrayList<>();
        OfertaProduto pivo = new OfertaProduto(new Produto("","","",OUTRAS_CATEGORIAS), new Loja("","",""), 0, LocalDate.now());
        int index=0;
        for(Object ofertas : repositorioOfertasProduto.listarOP()){
            if(ofertas instanceof OfertaProduto && ((OfertaProduto) ofertas).getProdOferta().equals(param)){
                if(((OfertaProduto) ofertas).getDataOferta().equals(dataAtual)){
                    sort.add((OfertaProduto) ofertas);
                }
            }
        }
        while(sort.size()!=0){
            for(int i=0; i< sort.size(); i++){
                if(sort.get(i).getPreco()>pivo.getPreco()){
                    pivo=sort.get(i);
                    index=i;
                }
            }
            resultado.add(pivo);
            sort.remove(index);
            index=0;
        }

        return resultado;
    }

    public Map<LocalDate, ArrayList<OfertaProduto>> montarHistoricoDeOfertasDoProdutoNoPeriodo(Produto param, LocalDate dataInicial, LocalDate dataFinal){

        Map<LocalDate, ArrayList<OfertaProduto>> resultado = new HashMap<LocalDate, ArrayList<OfertaProduto>>();

        return resultado;
    }

    ArrayList<AlertaPreco> verificarAlertasDePrecoAtingido(Usuario u){
        ArrayList<AlertaPreco> resultado = new ArrayList<>();
        for(Object alertas : repositorioAlertaPrecos.listar()){
            for(Object ofertas : repositorioOfertasProduto.listar()){
                if(alertas instanceof AlertaPreco && ofertas instanceof OfertaProduto){
                    if(((AlertaPreco) alertas).getUserAlerta().equals(u)){
                        if(((AlertaPreco) alertas).getProdAlerta().equals(((OfertaProduto) ofertas).getProdOferta())){
                            if(((AlertaPreco) alertas).getValorDesejado() >= (((OfertaProduto) ofertas).getPreco())){
                                resultado.add((AlertaPreco) alertas);
                            }
                        }
                    }
                }
            }
        }
        return resultado;
    }
    public void inserir(Loja o) {
        repositorioLojas.inserir(o);
    }

    public void remover(Loja o) {
        repositorioLojas.remover(o);
    }

    public void atualizar(Loja o) {
        repositorioLojas.atualizar(o);
    }

    public ArrayList<Loja> listarL() {
        return repositorioLojas.listarL();
    }

    public void inserir(Produto o) {
        repositorioProdutos.inserir(o);
    }

    public void remover(Produto o) {
        repositorioProdutos.remover(o);
    }

    public void atualizar(Produto o) {
        repositorioProdutos.atualizar(o);
    }

    public ArrayList<Produto> listarP() {
        return repositorioProdutos.listarP();
    }

    public void inserir(Usuario o) {
        repositorioUsuarios.inserir(o);
    }

    public void remover(Usuario o) {
        repositorioUsuarios.remover(o);
    }

    public void atualizar(Usuario o) {
        repositorioUsuarios.atualizar(o);
    }

    public ArrayList<Usuario> listarU() {
        return repositorioUsuarios.listarU();
    }

    public void inserir(AlertaPreco o) {
        repositorioAlertaPrecos.inserir(o);
    }

    public void remover(AlertaPreco o) {
        repositorioAlertaPrecos.remover(o);
    }

    public void atualizar(AlertaPreco o) {
        repositorioAlertaPrecos.atualizar(o);
    }

    public ArrayList<AlertaPreco> listarAP() {
        return repositorioAlertaPrecos.listarAP();
    }

    public void inserir(OfertaProduto o) {
        repositorioOfertasProduto.inserir(o);
    }

    public void remover(OfertaProduto o) {
        repositorioOfertasProduto.remover(o);
    }

    public void atualizar(OfertaProduto o) {
        repositorioOfertasProduto.atualizar(o);
    }

    public ArrayList<Object> listarOP() {
        return repositorioOfertasProduto.listar();
    }
}
