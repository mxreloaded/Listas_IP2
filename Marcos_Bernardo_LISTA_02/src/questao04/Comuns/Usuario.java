package questao04.Comuns;

import java.time.LocalDate;

public class Usuario {
    private String nome;
    private LocalDate datanasc;
    private String email;

    public Usuario(String nome, LocalDate datanasc, String email) {
        this.nome = nome;
        this.datanasc = datanasc;
        this.email = email;
    }

    public boolean equals(Usuario o) {
        return getEmail().equals(o.getEmail());
    }

    @Override
    public String toString() {
        return nome + " | " + datanasc + " | " + email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
