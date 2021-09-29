package questao01;
import java.util.Formatter;
public class Estoque {
    private int qtdMinima;
    private int qtdAtual;
    private Produto produto;

    public Estoque(){
        produto=new Produto();
        qtdAtual=0;
        qtdMinima=0;
    }

    public Estoque(int qtdAtualc, int qtdMinimac, Produto produtoc){
        produto=produtoc;
        qtdAtual=qtdAtualc;
        qtdMinima=qtdMinimac;
    }
    public void mudarQtdMinima(int qtdMinima){
        this.qtdMinima=qtdMinima;
    }
    public void reporEstoque(int qtd){
        qtdAtual=qtdAtual+qtd;
    }
    public void darBaixa(int qtd){
        if(qtdAtual>qtdMinima){
            qtdAtual=qtdAtual-qtd;
        }
        if(qtdAtual<qtdMinima){
            qtdAtual=qtdMinima;
        }
    }
    public void relatorio(){
        System.out.printf(produto + "QtdA: %d | QtdM: %d |", qtdAtual, qtdMinima);
    }
}
