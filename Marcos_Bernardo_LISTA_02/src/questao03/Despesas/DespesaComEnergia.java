package questao03.Despesas;

import java.time.LocalDateTime;

public class DespesaComEnergia extends Despesa{
    private double kwh;
    public DespesaComEnergia(LocalDateTime data, String descricao, double energia) {
        super(data, descricao);
        this.kwh=energia;
    }

    public double getKwh() {
        return kwh;
    }

    public void setkwh(double kwh) {
        this.kwh = kwh;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + kwh;
    }

    public boolean equals(DespesaComEnergia o) {
        if (super.equals(o) && this.getKwh()==o.getKwh()){
            return true;
        }
        return false;
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
