package questao04.Comuns;

public class Loja {
    private String cnpj;
    private String nome;
    private String site;

    public Loja(String cnpj, String nome, String site) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.site = site;
    }

    public boolean equals(Loja o) {
        return getCnpj().equals(o.getCnpj());
    }

    @Override
    public String toString() {
        return cnpj + " | " + nome + " | " + site;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
