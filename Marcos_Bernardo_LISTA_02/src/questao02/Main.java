package questao02;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){
        RepositorioPessoas repessoas = new RepositorioPessoas(10);
        Cliente cli1 = new Cliente("Carlos", LocalDate.of(1997, 5, 13), 1);
        Cliente cli2 = new Cliente("Roger", LocalDate.of(2007,8, 22), 2);
        Cliente cli3 = new Cliente("Lidiane", LocalDate.of(1985, 4, 2), 3);
        Cliente cli4 = new Cliente("Noemia", LocalDate.of(1940, 3, 30), 4);
        Cliente cli5 = new Cliente("Maya", LocalDate.of(2015, 7, 18), 5);
        Cliente cli6 = new Cliente("Carlos", LocalDate.of(1997, 5, 13), 1);
        repessoas.cadastrarPessoa(cli1);
        repessoas.cadastrarPessoa(cli2);
        repessoas.cadastrarPessoa(cli3);
        repessoas.cadastrarPessoa(cli4);
        repessoas.cadastrarPessoa(cli5);
        repessoas.cadastrarPessoa(cli6);
        Funcionario fun1 = new Funcionario("Victor", LocalDate.of(1985, 9, 25), 2500);
        Funcionario fun2 = new Funcionario("Luna", LocalDate.of(1992, 4, 20), 2800);
        Funcionario fun3 = new Funcionario("Ricardo", LocalDate.of(2000, 1, 25), 2500);
        Funcionario fun4 = new Funcionario("Jose", LocalDate.of(1984, 2, 14), 2800);
        Funcionario fun5 = new Funcionario("Maria", LocalDate.of(1964, 10, 31), 3000);
        Funcionario fun6 = new Funcionario("Victor", LocalDate.of(1985, 9, 25), 2500);
        repessoas.cadastrarPessoa(fun1);
        repessoas.cadastrarPessoa(fun2);
        repessoas.cadastrarPessoa(fun3);
        repessoas.cadastrarPessoa(fun4);
        repessoas.cadastrarPessoa(fun5);
        repessoas.cadastrarPessoa(fun6);
        Gerente ger1 = new Gerente("Marcos", LocalDate.of(2001, 3, 18), 6000, "CEO");
        Gerente ger2 = new Gerente("Lucas", LocalDate.of(2002, 6, 20), 5200, "Manager");
        Gerente ger3 = new Gerente("Laura", LocalDate.of(2001, 6, 14), 5500, "Manager");
        Gerente ger4 = new Gerente("Kildson", LocalDate.of(2002, 7, 15), 5200, "Manager");
        Gerente ger5 = new Gerente("Thiago", LocalDate.of(2000, 9, 30), 5200, "Manager");
        Gerente ger6 = new Gerente("Marcos", LocalDate.of(2001, 3, 18), 5200, "Manager");
        repessoas.cadastrarPessoa(ger1);
        repessoas.cadastrarPessoa(ger2);
        repessoas.cadastrarPessoa(ger3);
        repessoas.cadastrarPessoa(ger4);
        repessoas.cadastrarPessoa(ger5);
        repessoas.cadastrarPessoa(ger6);
        System.out.print(repessoas.listarPessoasMaioresIdade());
        System.out.print(repessoas.listarClientesMaioresIdade());
        System.out.print(repessoas.listarFuncionariosComSalarioMaiorQue(2500));
        System.out.print(repessoas.listarGerentesDaArea("Manager"));
    }
}
