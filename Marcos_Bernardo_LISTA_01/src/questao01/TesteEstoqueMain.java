package questao01;
import java.util.Formatter;
public class TesteEstoqueMain {
    public static void main(String[] args){
        Produto teclado = new Produto("teclado",1);//produto01
        Produto mouse = new Produto("mouse",1);//produto02
        Estoque tecladoEst = new Estoque(20, 15, teclado);//estoque01
        Estoque mouseEst = new Estoque(30, 10, mouse);//estoque02

        tecladoEst.darBaixa(10);
        mouseEst.reporEstoque(19);
        tecladoEst.relatorio();
        mouseEst.relatorio();
        teclado.mudarNome("Teclado Virtual");
        tecladoEst.relatorio();

    }
}
