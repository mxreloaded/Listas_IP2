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


    public boolean equals(Gerente o) {
        if(super.equals(o) && this.getArea().equals(o.getArea())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + "Area: " + area;
    }
}
