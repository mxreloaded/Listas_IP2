package questao03;

public class Vacina {
    enum TipoVacina{CORONAVAC, OXFORD;}
    private int codigo;
    private String lote;
    private TipoVacina vacina;

    public Vacina(){ }
    public Vacina(int codigoc, String lotec, TipoVacina vacinac){
        this.codigo=codigoc;
        this.lote=lotec;
        this.vacina=vacinac;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setVacina(TipoVacina vacina) {
        this.vacina = vacina;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getCodigo() {
        return codigo;
    }

    public TipoVacina getVacina() {
        return vacina;
    }

    public String getLote() {
        return lote;
    }
}
