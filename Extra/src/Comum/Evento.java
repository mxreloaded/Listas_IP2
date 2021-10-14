package Comum;

import Enums.CidadeEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Evento implements Comparable<Evento>{
    private String nome;
    private CidadeEnum local;
    private LocalDateTime dataHora;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
        Evento evento = (Evento) o;
        boolean resultado = Objects.equals(getNome(), evento.getNome()) && getLocal() == evento.getLocal() && Objects.equals(getDataHora(), evento.getDataHora());
        System.out.println("equals: " +resultado);
        return resultado;
    }

    @Override
    public int hashCode() {
        int resultado = Objects.hash(getNome(), getLocal(), getDataHora());
        System.out.println(this.getNome() + " / " + resultado);
        return resultado;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return '{'+"Nome do evento='" + nome + '\'' +
                ", Cidade do evento=" + local +
                ", Data=" + dataHora.format(formatter) +
                '}'+"\n";
    }
    public Evento(String nome, CidadeEnum local, LocalDateTime dataHora) {
        this.nome = nome;
        this.local = local;
        this.dataHora = dataHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CidadeEnum getLocal() {
        return local;
    }

    public void setLocal(CidadeEnum local) {
        this.local = local;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public int compareTo(Evento o) {
        return this.dataHora.compareTo(o.dataHora);
    }
}
