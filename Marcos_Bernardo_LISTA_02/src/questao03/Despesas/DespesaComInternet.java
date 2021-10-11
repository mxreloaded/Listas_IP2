package questao03.Despesas;

import java.time.LocalDateTime;

public class DespesaComInternet extends Despesa {
    private double dadosTrafegados;
    public DespesaComInternet(LocalDateTime data, String descricao, double dados) {
        super(data, descricao);
        this.dadosTrafegados=dados;
    }

    public double getDadosTrafegados() {
        return dadosTrafegados;
    }

    public void setDadosTrafegados(double dadosTrafegados) {
        this.dadosTrafegados = dadosTrafegados;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + dadosTrafegados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DespesaComInternet)) return false;
        if (!super.equals(o)) return false;
        DespesaComInternet that = (DespesaComInternet) o;
        return Double.compare(that.getDadosTrafegados(), getDadosTrafegados()) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public double calcularTotal() {
        double resultado=0;
        double taxa=0;
        if(dadosTrafegados<100){
            taxa=dadosTrafegados-20;
            resultado=90.90+(taxa*3.90);
        }
        else if(dadosTrafegados>=100 && dadosTrafegados<500){
            taxa=dadosTrafegados-100;
            resultado=240.90+(taxa*4.40);
        }
        else{
            taxa=dadosTrafegados-500;
            resultado=590.90+(taxa*5.10);
        }
        return resultado;
    }
}
