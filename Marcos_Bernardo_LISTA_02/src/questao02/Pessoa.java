package questao02;

import java.time.LocalDate;
import java.util.Objects;

abstract class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome=nome;
        this.dataNascimento=dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " +  nome + " | " + "Data de Nasc: " + dataNascimento;
    }

    public boolean equals(Pessoa o) {
        if (this.getNome().equals(o.getNome()) && this.getDataNascimento().equals(o.getDataNascimento())) {
            return true;
        }
        return false;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
