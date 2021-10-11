package questao04.Comuns;

import questao04.Enums.Categoria;

public class Produto {
    private String ref;
    private String nome;
    private String descricao;
    private Categoria cat;

    public Produto(String ref, String nome, String descricao, Categoria cat){
        this.ref=ref;
        this.nome=nome;
        this.descricao=descricao;
        this.cat=cat;
    }

    public boolean equals(Produto o) {
        return getRef().equals(o.getRef());
    }

    @Override
    public String toString() {
        return ref + " | " + nome + " | " + descricao + " | " + ref;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
}
