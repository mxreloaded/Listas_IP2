package questao02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class RepositorioPessoas {
    ArrayList<Pessoa> pessoas;

    public RepositorioPessoas(int capacidade_Inicial) {
        this.pessoas = new ArrayList<Pessoa>(capacidade_Inicial);
    }

    @Override
    public String toString() {
        String resultado="";
        for(Pessoa pessoa:this.pessoas){
            resultado= resultado + pessoa.getNome()+ "|" +pessoa.getDataNascimento() + "\n";
        }
        return resultado;
    }

    public void cadastrarPessoa(Pessoa novo){
        if(novo != null){
            String name = novo.getNome();
            LocalDate date = novo.getDataNascimento();
            boolean existePessoaIgual = false;
            for(Pessoa interna : pessoas){
                if(interna.getNome().equals(name)){
                    if(interna.getDataNascimento().equals(date)){
                        System.out.print("\nNão foi possível realizar o cadastro.");
                        existePessoaIgual = true;
                    }
                }
                if(!existePessoaIgual){
                    this.pessoas.add(novo);
                    System.out.print("\nCadastro realizado com sucesso.");
                }
            }
        }
    }
    public ArrayList<Pessoa> listarPessoasMaioresIdade(){
        ArrayList<Pessoa> resultado = new ArrayList<>();
        for(Pessoa idade : this.pessoas){
            if(ChronoUnit.YEARS.between(idade.getDataNascimento(), LocalDate.now())>=18){
                resultado.add(idade);
            }
        }
        return resultado;
    }

    public ArrayList<Cliente> listarClientesMaioresIdade(){
        ArrayList<Cliente> resultado = new ArrayList<>();
        for(Pessoa idade : this.pessoas){
            if(ChronoUnit.YEARS.between(idade.getDataNascimento(), LocalDate.now())>=18){
                if(idade instanceof Cliente){
                    resultado.add((Cliente) idade);
                }
            }
        }
        return resultado;
    }

    public ArrayList<Funcionario> listarFuncionariosComSalarioMaiorQue(double sal){
        ArrayList<Funcionario> resultado = new ArrayList<>();
        for(Pessoa salario : this.pessoas){
            if(salario instanceof Funcionario && ((Funcionario) salario).getSalario()>=sal){
                resultado.add((Funcionario) salario);
            }
        }
        return resultado;
    }
    public ArrayList<Gerente> listarGerentesDaArea(String tipo){
        ArrayList<Gerente> resultado = new ArrayList<>();
        for(Pessoa area : this.pessoas){
            if(area instanceof Gerente && ((Gerente) area).getArea().equals(tipo)){
                resultado.add((Gerente)area);
            }
        }
        return resultado;
    }

}
