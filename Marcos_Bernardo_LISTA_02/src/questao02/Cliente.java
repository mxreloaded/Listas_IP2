package questao02;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private long codigo;

    public Cliente(String nome, LocalDate dataNascimento, long codigo) {
        super(nome, dataNascimento);
        this.codigo=codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return getCodigo() == cliente.getCodigo();
    }

    @Override
    public String toString() {
        return super.toString() +"|"+ codigo;
    }
}
