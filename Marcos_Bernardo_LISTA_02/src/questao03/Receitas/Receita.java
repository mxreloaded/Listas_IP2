package questao03.Receitas;

import questao03.Interface.Transacao;

import java.time.LocalDateTime;

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


    public boolean equals(Receita o) {
        if (this.getDescricao().equals(o.getDescricao())&&this.getData().equals(o.getData())){
            return true;
        }
        return false;
    }

    @Override
    public String getTipo() {
        return "RECEITA";
    }

}
