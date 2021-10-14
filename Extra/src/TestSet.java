import Comum.Evento;
import Enums.CidadeEnum;

import java.time.LocalDateTime;
import java.util.HashSet;

public class TestSet {

    public static void main(String[] args) {
        HashSet<Evento> eventos = new HashSet<>();
        Evento e = new Evento("Show de rap", CidadeEnum.BRASILIA, LocalDateTime.of(2021,9, 15, 20, 0));
        Evento e1 = new Evento("Show de forro", CidadeEnum.SALVADOR, LocalDateTime.of(2021,10, 10, 22, 0));
        Evento e2 = new Evento("Show de funk", CidadeEnum.RIO_DE_JANEIRO, LocalDateTime.of(2021,8, 22, 0, 0));
        Evento e3 = new Evento("Show de mpb", CidadeEnum.SAO_PAULO, LocalDateTime.of(2021,12, 25, 19, 30));
        Evento e4 = new Evento("Show de kpop", CidadeEnum.RECIFE, LocalDateTime.of(2022,6, 14, 14, 15));
        Evento e5 = new Evento("Show de kpop", CidadeEnum.RECIFE, LocalDateTime.of(2022,6, 14, 14, 15));
        eventos.add(e);
        eventos.add(e1);
        eventos.add(e2);
        eventos.add(e3);
        eventos.add(e4);
        eventos.add(e5);
        System.out.println(eventos);
    }
}
