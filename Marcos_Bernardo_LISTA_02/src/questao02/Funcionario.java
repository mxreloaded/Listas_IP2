package questao02;

import java.time.LocalDate;

public class Funcionario extends  Pessoa {

    protected static final double SALARIO_TETO_IMPOSTO = 5000;
    private double salario;

    public Funcionario(String nome, LocalDate dataNascimento, double salario) {
        super(nome, dataNascimento);
        this.salario=salario;
    }
    public double calcularImpostoDevido(){
        double imposto=0.0;
        if(salario<=SALARIO_TETO_IMPOSTO){
            imposto=salario*(5.0/100);
        }
        else{ imposto=salario*(7.5/100);}

        return imposto;
    }

    @Override
    public String toString() {
        return super.toString() + "|" + salario + "|" + calcularImpostoDevido();//imposto não está sendo descontado do salário. Questão não pediu.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(that.getSalario(), getSalario()) == 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
