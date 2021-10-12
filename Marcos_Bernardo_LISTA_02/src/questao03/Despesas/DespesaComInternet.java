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

    public boolean equals(DespesaComInternet o) {
        if (super.equals(o) && this.getDadosTrafegados()==o.getDadosTrafegados()){
            return true;
        }
        return false;
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
