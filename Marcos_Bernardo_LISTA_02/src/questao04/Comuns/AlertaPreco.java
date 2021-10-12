package questao04.Comuns;

import java.math.BigDecimal;

public class AlertaPreco {
    private Usuario userAlerta;
    private Produto prodAlerta;
    private double valorDesejado;

    public AlertaPreco(Usuario userAlerta, Produto prodAlerta, double valorDesejado) {
        this.userAlerta = userAlerta;
        this.prodAlerta = prodAlerta;
        this.valorDesejado = valorDesejado;
    }

    public boolean equals(AlertaPreco o) {
        if(this.getUserAlerta().equals(o.getUserAlerta()) && this.getProdAlerta().equals(o.getProdAlerta())
                && this.getValorDesejado() == o.getValorDesejado()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return userAlerta + " | " + prodAlerta + " | " + valorDesejado;
    }
    public Usuario getUserAlerta() {
        return userAlerta;
    }

    public void setUserAlerta(Usuario userAlerta) {
        this.userAlerta = userAlerta;
    }

    public Produto getProdAlerta() {
        return prodAlerta;
    }

    public void setProdAlerta(Produto prodAlerta) {
        this.prodAlerta = prodAlerta;
    }

    public double getValorDesejado() {
        return valorDesejado;
    }

    public void setValorDesejado(double valorDesejado) {
        this.valorDesejado = valorDesejado;
    }
}
