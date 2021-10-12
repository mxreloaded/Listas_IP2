package questao04.Comuns;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OfertaProduto {
    private Produto prodOferta;
    private Loja shopOferta;
    private double preco;
    private LocalDate dataOferta;

    public OfertaProduto(Produto prodid, Loja shopid, double preco, LocalDate dataOferta) {
        this.prodOferta = prodid;
        this.shopOferta = shopid;
        this.preco = preco;
        this.dataOferta = dataOferta;
    }

    public Produto getProdOferta() {
        return prodOferta;
    }

    public void setProdOferta(Produto prodOferta) {
        this.prodOferta = prodOferta;
    }

    public Loja getShopOferta() {
        return shopOferta;
    }

    public void setShopOferta(Loja shopOferta) {
        this.shopOferta = shopOferta;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataOferta() {
        return dataOferta;
    }

    public void setDataOferta(LocalDate dataOferta) {
        this.dataOferta = dataOferta;
    }

    @Override
    public String toString() {
        return prodOferta + " | " + shopOferta + " | " + preco + " | " + dataOferta;
    }
    public boolean equals(OfertaProduto o) {
        if(this.getProdOferta().equals(o.getProdOferta()) && this.getShopOferta().equals(o.getShopOferta())
                && this.getPreco() == o.getPreco() && this.getDataOferta().equals(o.getDataOferta())){
            return true;
        }
        return false;
    }
}
