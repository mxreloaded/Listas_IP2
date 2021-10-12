package questao03.Despesas;

import java.time.LocalDateTime;

public class DespesaComAgua extends Despesa{
    private double totalM3;
    public DespesaComAgua(LocalDateTime data, String descricao, double m3) {
        super(data, descricao);
        this.totalM3=m3;
    }

    public double getTotalM3() {
        return totalM3;
    }

    public void setTotalM3(double totalM3) {
        this.totalM3 = totalM3;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + totalM3;
    }

    public boolean equals(DespesaComAgua o) {
        if (super.equals(o) && this.getTotalM3()==o.getTotalM3()){
            return true;
        }
        return false;
    }

    @Override
    public double calcularTotal() {
        double resultado=0;
        double taxa=0;
        if(totalM3<=10){
            taxa=45;
            resultado=taxa;
        }
        else if(totalM3>10 && totalM3<=20){
            taxa=totalM3-10;
            resultado=45 + taxa*5;
        }
        else{
            taxa=totalM3-20;
            resultado=95+taxa*6;
        }
        return resultado;
    }
}

