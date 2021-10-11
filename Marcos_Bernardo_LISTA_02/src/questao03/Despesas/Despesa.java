package questao03.Despesas;

import questao03.Interface.Transacao;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Despesa implements Transacao {
    LocalDateTime data;
    String descricao;

    public Despesa(LocalDateTime data, String descricao){
        this.descricao=descricao;
        this.data=data;
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
        return data + "|" +  descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Despesa)) return false;
        Despesa despesa = (Despesa) o;
        return Objects.equals(getData(), despesa.getData()) && Objects.equals(getDescricao(), despesa.getDescricao());
    }

    @Override
    public String getTipo() {

        return "DESPESA";
    }
}
