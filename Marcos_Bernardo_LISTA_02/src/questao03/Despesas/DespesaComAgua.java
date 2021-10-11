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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DespesaComAgua)) return false;
        if (!super.equals(o)) return false;
        DespesaComAgua that = (DespesaComAgua) o;
        return Double.compare(that.getTotalM3(), getTotalM3()) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
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

