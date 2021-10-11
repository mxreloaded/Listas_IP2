package questao04.Interface;

import java.util.ArrayList;

public interface IRepoGen {

    void inserir(Object o);

    void remover(Object o);

    void atualizar(Object o);

    ArrayList<Object> listar();

}
