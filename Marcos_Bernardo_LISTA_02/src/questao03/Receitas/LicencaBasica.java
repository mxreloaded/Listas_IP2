package questao03.Receitas;

import java.time.LocalDateTime;

public class LicencaBasica extends Receita{
    private int totalContas;
    public LicencaBasica(LocalDateTime data, String descricao, int qntdContas) {
        super(data, descricao);
        this.totalContas=qntdContas;
    }

    public int getTotalContas() {
        return totalContas;
    }

    public void setTotalContas(int totalContas) {
        this.totalContas = totalContas;
    }

    @Override
    public String toString(){
        return super.toString() + "|" + totalContas;
    }

    public boolean equals(LicencaBasica o) {
        if (super.equals(o) && this.getTotalContas()==o.getTotalContas()){
            return true;
        }
        return false;
    }

    @Override
    public double calcularTotal() {
        double resultado=totalContas*20;
        return resultado;
    }
}
