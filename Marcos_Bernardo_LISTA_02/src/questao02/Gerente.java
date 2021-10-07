package questao02;

import java.time.LocalDate;
import java.util.Objects;

public class Gerente extends Funcionario{
    private String area;
    public Gerente(String nome, LocalDate dataNascimento, double salario, String area) {
        super(nome, dataNascimento, salario);
        this.area=area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gerente)) return false;
        if (!super.equals(o)) return false;
        Gerente gerente = (Gerente) o;
        return Objects.equals(getArea(), gerente.getArea());
    }

    @Override
    public String toString() {
        return super.toString() + "|" + area;
    }
}
