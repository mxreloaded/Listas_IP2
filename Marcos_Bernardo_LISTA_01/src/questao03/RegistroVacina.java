package questao03;

import java.time.LocalDate;

enum Locais{DRIVE_THRU_UFRPE_UNIVERSIDADE_RURAL, DRIVE_THRU_GERALDAO, CENTRO_DE_VACINACAO_PARQUE_DE_EXPOSICAO,
    CENTRO_DE_VACINACAO_COMPAZ_ARIANO_SUASSUNA, DRIVE_THRU_PARQUE_DE_EXPOSICAO, DRIVE_THRU_ARRUDA;}
enum Grupos{IDOSOS, TRABALHADORES_DA_SAUDE, OUTROS_GRUPOS;}

public class RegistroVacina {
    private String id;
    private Locais local;
    private Grupos grupos;
    private LocalDate dataVacinacao;
    private String atendente;
    private Doses dose;
    private Vacina vacina;
    private Pessoa vacinado;

    public RegistroVacina(){

    }
    public RegistroVacina(String idc, Locais localc, Grupos gruposc, LocalDate dataVacinacaoc, String atendentec,
                          Doses dosec, Vacina vacinac, Pessoa vacinadoc){
        id=idc;
        local=localc;
        grupos=gruposc;
        dataVacinacao=dataVacinacaoc;
        atendente=atendentec;
        dose=dosec;
        vacina=vacinac;
        vacinado=vacinadoc;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Locais getLocal() {
        return local;
    }

    public void setLocal(Locais local) {
        this.local = local;
    }

    public Grupos getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupos grupos) {
        this.grupos = grupos;
    }

    public LocalDate getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(LocalDate dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public Doses getDose() {
        return dose;
    }

    public void setDose(Doses dose) {
        this.dose = dose;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public Pessoa getVacinado() {
        return vacinado;
    }

    public void setVacinado(Pessoa vacinado) {
        this.vacinado = vacinado;
    }
}
