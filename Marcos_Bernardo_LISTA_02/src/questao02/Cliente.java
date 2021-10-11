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

    public boolean equals(Cliente o) {
        if (super.equals(o) && this.getCodigo()==o.getCodigo()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +" | "+ "Codigo: " + codigo;
    }
}
