package questao03.Receitas;

import java.time.LocalDateTime;

public class LicencaPlus extends Receita{
    private int totalContas;
    public LicencaPlus(LocalDateTime data, String descricao, int qntdContas) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LicencaPlus)) return false;
        if (!super.equals(o)) return false;
        LicencaPlus that = (LicencaPlus) o;
        return getTotalContas() == that.getTotalContas();
    }

    @Override
    public double calcularTotal() {
        double resultado=totalContas*35;
        return resultado;
    }
}
