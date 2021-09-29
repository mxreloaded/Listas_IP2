package questao03;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class TesteVacinaMain {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("03337873873","José Maria", LocalDate.of(1954, 5, 10));
        Pessoa pessoa2 = new Pessoa("38303337837", "Maria José", LocalDate.of(1952, 3, 9));
        Pessoa pessoa3 = new Pessoa("78703333877", "José Silva", LocalDate.of(1950, 4, 9));
        Pessoa pessoa4 = new Pessoa("37873033837", "Maria Silva", LocalDate.of(1955, 5, 9));
        Pessoa pessoa5 = new Pessoa("78338773838", "Maria Santos", LocalDate.of(1946, 5, 9));
        Pessoa pessoa6 = new Pessoa("12914459604", "Marcos Junior", LocalDate.of(2001, 3, 18));

        Vacina vacina1 = new Vacina();
        vacina1.setCodigo(1);
        vacina1.setVacina(Vacina.TipoVacina.OXFORD);

        Vacina vacina2 = new Vacina();
        vacina1.setCodigo(2);
        vacina1.setVacina(Vacina.TipoVacina.CORONAVAC);

        //id,local
        RegistroVacina registroVacina = new RegistroVacina("7", Locais.DRIVE_THRU_UFRPE_UNIVERSIDADE_RURAL, Grupos.IDOSOS, LocalDate.of(2021,05,16).minusDays(21), "Marcos", Doses.PRIMEIRA, vacina1, pessoa1);
        RegistroVacina registroVacina1 = new RegistroVacina("17", Locais.CENTRO_DE_VACINACAO_COMPAZ_ARIANO_SUASSUNA, Grupos.IDOSOS, LocalDate.of(2021,05,13).minusDays(21), "Marcos", Doses.PRIMEIRA, vacina2, pessoa2);
        RegistroVacina registroVacina2 = new RegistroVacina("9", Locais.CENTRO_DE_VACINACAO_COMPAZ_ARIANO_SUASSUNA, Grupos.IDOSOS, LocalDate.of(2021,05,15).minusDays(21), "Marcos", Doses.PRIMEIRA, vacina2, pessoa3);
        RegistroVacina registroVacina3 = new RegistroVacina("24", Locais.DRIVE_THRU_ARRUDA, Grupos.IDOSOS, LocalDate.of(2021,05,21).minusDays(21), "Marcos", Doses.PRIMEIRA, vacina1, pessoa4);
        RegistroVacina registroVacina4 = new RegistroVacina("15", Locais.DRIVE_THRU_GERALDAO, Grupos.IDOSOS, LocalDate.of(2021,05,16).minusDays(21), "Marcos", Doses.PRIMEIRA, vacina2, pessoa5);
        RegistroVacina registroVacina5 = new RegistroVacina("7", Locais.DRIVE_THRU_UFRPE_UNIVERSIDADE_RURAL, Grupos.IDOSOS, LocalDate.of(2021,05,16), "Marcos", Doses.SEGUNDA, vacina1, pessoa1);
        RegistroVacina registroVacina6 = new RegistroVacina("21", Locais.DRIVE_THRU_UFRPE_UNIVERSIDADE_RURAL, Grupos.OUTROS_GRUPOS, LocalDate.of(2021,07,20), "Marcos", Doses.PRIMEIRA, vacina2, pessoa6);
        RegistroVacina registroVacina7 = new RegistroVacina("21", Locais.DRIVE_THRU_UFRPE_UNIVERSIDADE_RURAL, Grupos.OUTROS_GRUPOS, LocalDate.of(2021,07,10), "Marcos", Doses.SEGUNDA, vacina2, pessoa6);

        RelacaoVacinados lista= new RelacaoVacinados();
        lista.adicionar(registroVacina);
        lista.adicionar(registroVacina1);
        lista.adicionar(registroVacina2);
        lista.adicionar(registroVacina3);
        lista.adicionar(registroVacina4);
        lista.adicionar(registroVacina5);
        lista.adicionar(registroVacina6);
        lista.adicionar(registroVacina7);
        printaTudo(lista);
    }
    public static void printaTudo(RelacaoVacinados lista){
        if(lista != null){
            System.out.printf("\n" + lista.calcularTotalVacinadosAcimaDe(0));
            System.out.printf("\n" + lista.totalDeIdososQueTomaram2aDose());
            System.out.printf("\n");
            lista.listarPessoasQueNaoTomaram2aDose();
        }
    }
}
