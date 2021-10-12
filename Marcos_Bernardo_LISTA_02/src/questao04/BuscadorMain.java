package questao04;

import questao04.Comuns.*;
import questao04.Enums.Categoria;
import questao04.Repos.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class BuscadorMain {
    public static void main(String [] args){
        ArrayList<Object> novoRepoL = new ArrayList<>();
        RepoLojaC repositorioLojas = new RepoLojaC(novoRepoL);
        ArrayList<Object> novoRepoP = new ArrayList<>();
        RepoProdutoC repositorioProdutos = new RepoProdutoC(novoRepoP);
        ArrayList<Object> novoRepoU = new ArrayList<>();
        RepoUsuarioC repositorioUsuarios = new RepoUsuarioC(novoRepoU);
        ArrayList<Object> novoRepoAP = new ArrayList<>();
        RepoAlertaPrecoC repositorioAlertaPrecos = new RepoAlertaPrecoC(novoRepoAP);
        ArrayList<Object> novoRepoOP = new ArrayList<>();
        RepoOfertaProdutoC repositorioOfertaProdutos = new RepoOfertaProdutoC(novoRepoOP);
        Controlador control = new Controlador(repositorioLojas, repositorioProdutos, repositorioUsuarios, repositorioAlertaPrecos, repositorioOfertaProdutos);

        control.repositorioUsuarios.inserir(new Usuario("Marcos", LocalDate.of(2001,3,18),"mxr@mxr.mxr" ));

        control.repositorioProdutos.inserir(new Produto("00001", "BlueYou 8", "Celular da marca OiVoce", Categoria.CELULARES_E_TELEFONES));
        control.repositorioProdutos.inserir(new Produto("00002", "YCrate Once", "Video-Game", Categoria.GAMES));

        control.repositorioAlertaPrecos.inserir(new AlertaPreco(repositorioUsuarios.listarU().get(0),repositorioProdutos.listarP().get(0), 1000.0));
        control.repositorioAlertaPrecos.inserir(new AlertaPreco(repositorioUsuarios.listarU().get(0),repositorioProdutos.listarP().get(1), 1721.0));

        control.repositorioLojas.inserir(new Loja("1337-1", "Maximus", "maximus@mxr.mxr"));
        control.repositorioLojas.inserir(new Loja("1337-2", "Minimus", "minimus@mxr.mxr"));
        control.repositorioLojas.inserir(new Loja("1337-3", "Medius", "medius@mxr.mxr"));

        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(0), repositorioLojas.listarL().get(0), 1500, LocalDate.of(2021, 10, 1)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(0), repositorioLojas.listarL().get(0), 900, LocalDate.of(2021, 10, 10)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(1), repositorioLojas.listarL().get(0), 2000, LocalDate.of(2021, 10, 1)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(1), repositorioLojas.listarL().get(0), 1700, LocalDate.of(2021, 10, 10)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(0), repositorioLojas.listarL().get(1), 1400, LocalDate.of(2021, 10, 2)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(0), repositorioLojas.listarL().get(1), 800, LocalDate.of(2021, 10, 9)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(1), repositorioLojas.listarL().get(1), 1900, LocalDate.of(2021, 10, 2)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(1), repositorioLojas.listarL().get(1), 1600, LocalDate.of(2021, 10, 9)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(0), repositorioLojas.listarL().get(2), 1450, LocalDate.of(2021, 10, 3)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(0), repositorioLojas.listarL().get(2), 850, LocalDate.of(2021, 10, 8)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(1), repositorioLojas.listarL().get(2), 1950, LocalDate.of(2021, 10, 3)));
        control.repositorioOfertasProduto.inserir(new OfertaProduto(repositorioProdutos.listarP().get(1), repositorioLojas.listarL().get(2), 1650, LocalDate.of(2021, 10, 8)));

        System.out.println(control.listarOfertasOrdenadasPorPrecosNaData(repositorioProdutos.listarP().get(0), LocalDate.of(2021,10,1)));
        System.out.println(control.verificarAlertasDePrecoAtingido(repositorioUsuarios.listarU().get(0)));



    }
}
