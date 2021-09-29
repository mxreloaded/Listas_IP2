package questao01;

public class Produto {
    private String nome;
    private int codigo;

    public Produto(){
        nome=this.nome;
        codigo=this.codigo;
    }

    public Produto(String nomec, int codigoc){
        nome=nomec;
        codigo=codigoc;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "\n"+nome + " | " + codigo + " | ";
    }
}
