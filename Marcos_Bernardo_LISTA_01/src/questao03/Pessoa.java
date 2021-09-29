package questao03;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String cpf;
    private String nome;
    private LocalDate datadeNascimento;

    public Pessoa(){
        cpf="";
        nome="";
        datadeNascimento=LocalDate.of(1970,1,1);
    }
    public Pessoa(String cpfc, String nomec, LocalDate datadeNascimentoc){
        cpf=cpfc;
        nome=nomec;
        datadeNascimento=datadeNascimentoc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String grupo) {
        this.nome = grupo;
    }

    public LocalDate getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(LocalDate datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public int calcularIdade(){
        return Period.between(datadeNascimento, LocalDate.now()).getYears();
    }
}
