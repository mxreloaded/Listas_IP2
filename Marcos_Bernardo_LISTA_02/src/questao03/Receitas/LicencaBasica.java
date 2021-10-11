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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LicencaBasica)) return false;
        if (!super.equals(o)) return false;
        LicencaBasica that = (LicencaBasica) o;
        return getTotalContas() == that.getTotalContas();
    }

    @Override
    public double calcularTotal() {
        double resultado=totalContas*20;
        return resultado;
    }
}
