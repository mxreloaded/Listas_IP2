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
        return super.toString() + " | " + "Salario: " + salario + " | " + "Imposto: " + calcularImpostoDevido();//imposto não está sendo descontado do salário. Questão não pediu.
    }

    public boolean equals(Funcionario o) {
        if(super.equals(o) && this.getSalario()==o.getSalario()){
            return true;
        }
        return false;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
