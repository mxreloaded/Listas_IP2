package questao02;

import java.time.LocalDate;

public class Funcionario extends  Pessoa {

    protected static final double SALARIO_TETO_IMPOSTO = 0;
    private double salario;

    public Funcionario(String nome, LocalDate dataNascimento, double salario) {
        super(nome, dataNascimento);
        this.salario=salario;
    }
    public double calcularImpostoDevido(){
        if(salario<=SALARIO_TETO_IMPOSTO)
        return ;
    }
}
