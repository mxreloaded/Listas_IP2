package Comum;

public class Comparator implements java.util.Comparator<Evento> {
    @Override
    public int compare(Evento o1, Evento o2) {
        return o1.getLocal().name().compareTo(o2.getLocal().name());
    }
}
