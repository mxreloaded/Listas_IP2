package Repositorios;

import Comum.Comparator;
import Comum.Evento;
import Enums.CidadeEnum;

import java.time.LocalDateTime;
import java.util.*;

public class RepositorioEventos {
    Map<String, Evento> eventos = new HashMap<>();

    public RepositorioEventos(Evento[] eve){
        if(this.eventos != null){
            for (Evento evento : eve) {
                if (evento != null) {
                    this.eventos.put(evento.getNome(), evento);
                }
            }
        }
    }

    public RepositorioEventos(Map<String, Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        String resultado = "";
        for(Evento event : eventos.values()){
           resultado= resultado + event.toString();
        }
        return resultado;
    }
    public boolean contemEvento(String nomeEvento){
        return eventos.containsKey(nomeEvento);
    }

    public List<Evento> ordenarPorData(){
        List<Evento> resultado = new ArrayList<>();
        resultado.addAll(eventos.values());
        Collections.sort(resultado);
        return resultado;
    }
    public List<Evento> ordenarPorLocal(){
        List<Evento> resultado = new ArrayList<>();
        resultado.addAll(eventos.values());
        Collections.sort(resultado, new Comparator());
        return resultado;
    }

    public static void main(String[] args) {
        Evento[] arraye = new Evento[5];
        Evento e = new Evento("Show de rap", CidadeEnum.BRASILIA, LocalDateTime.of(2021,9, 15, 20, 0));
        Evento e1 = new Evento("Show de forro", CidadeEnum.SALVADOR, LocalDateTime.of(2021,10, 10, 22, 0));
        Evento e2 = new Evento("Show de funk", CidadeEnum.RIO_DE_JANEIRO, LocalDateTime.of(2021,8, 22, 0, 0));
        Evento e3 = new Evento("Show de mpb", CidadeEnum.SAO_PAULO, LocalDateTime.of(2021,12, 25, 19, 30));
        Evento e4 = new Evento("Show de kpop", CidadeEnum.RECIFE, LocalDateTime.of(2022,6, 14, 14, 15));
        arraye[0]=e;
        arraye[1]=e4;
        arraye[2]=e1;
        arraye[3]=e2;
        arraye[4]=e3;
        RepositorioEventos repoEventos = new RepositorioEventos(arraye);
        System.out.println(repoEventos.ordenarPorData());
        System.out.println(repoEventos.ordenarPorLocal());
        Evento e5 = new Evento("Show de kpop", CidadeEnum.RECIFE, LocalDateTime.of(2022,6, 14, 14, 15));
        System.out.println(repoEventos.contemEvento(e5.getNome()));
        System.out.println(repoEventos);

    }
}
