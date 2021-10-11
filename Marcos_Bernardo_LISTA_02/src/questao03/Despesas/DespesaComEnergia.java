package questao03.Despesas;

import java.time.LocalDateTime;

public class DespesaComEnergia extends Despesa{
    private double kwh;
    public DespesaComEnergia(LocalDateTime data, String descricao, double energia) {
        super(data, descricao);
        this.kwh=energia;
    }

    public double getkwh() {
        return kwh;
    }

    public void setkwh(double kwh) {
        this.kwh = kwh;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + kwh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DespesaComEnergia)) return false;
        if (!super.equals(o)) return false;
        DespesaComEnergia that = (DespesaComEnergia) o;
        return Double.compare(that.getkwh(), getkwh()) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public double calcularTotal() {
        double resultado=0;
        double taxa=0;
        double taxacem=0;
        if(kwh<=50){
            taxa=2;
            resultado=(kwh*0.50)+taxa;
        }
        else if(kwh>50 && kwh<=200){
            taxa=15;
            while(kwh%100>=1){
                kwh-=100;
                taxacem+=2;
            }
            resultado=(kwh*0.50)+taxa+taxacem;
        }
        else{
            taxa=35;
            while(kwh%100>=1){
                kwh-=100;
                taxacem+=2;
            }
            resultado=(kwh*0.50)+taxa+taxacem;
        }
        return resultado;
    }
}
