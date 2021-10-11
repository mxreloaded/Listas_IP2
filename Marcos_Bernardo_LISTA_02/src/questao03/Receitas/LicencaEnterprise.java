package questao03.Receitas;

import java.time.LocalDateTime;

public class LicencaEnterprise extends Receita{
    private int totalContas;
    public LicencaEnterprise(LocalDateTime data, String descricao, int qntdContas) {
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
        if (!(o instanceof LicencaEnterprise)) return false;
        if (!super.equals(o)) return false;
        LicencaEnterprise that = (LicencaEnterprise) o;
        return getTotalContas() == that.getTotalContas();
    }

    @Override
    public double calcularTotal() {
        double resultado=totalContas*150;
        return resultado;
    }
}
