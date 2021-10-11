package questao03.Receitas;

import questao03.Interface.Transacao;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Receita implements Transacao {
    LocalDateTime data;
    String descricao;

    public Receita(LocalDateTime data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    @Override
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return data + "|" + descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Receita)) return false;
        Receita receita = (Receita) o;
        return Objects.equals(getData(), receita.getData()) && Objects.equals(getDescricao(), receita.getDescricao());
    }

    @Override
    public String getTipo() {
        return "RECEITA";
    }

}
