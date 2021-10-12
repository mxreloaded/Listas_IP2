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

    public boolean equals(Despesa o) {
        if (this.getDescricao().equals(o.getDescricao())&&this.getData().equals(o.getData())){
            return true;
        }
        return false;
    }

    @Override
    public String getTipo() {

        return "DESPESA";
    }
}
