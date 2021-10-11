package questao03;

import questao03.Despesas.DespesaComAgua;
import questao03.Despesas.DespesaComEnergia;
import questao03.Despesas.DespesaComInternet;
import questao03.Interface.Transacao;
import questao03.Receitas.LicencaBasica;
import questao03.Receitas.LicencaEnterprise;
import questao03.Receitas.LicencaPlus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Transacao> registro = new ArrayList<>();
        FluxoCaixa caixa=new FluxoCaixa("Santos", "02136077", registro);
        DespesaComAgua conta = new DespesaComAgua(LocalDateTime.of(2021, 10, 1, 15, 33), "agua", 320);
        DespesaComEnergia conta2 = new DespesaComEnergia(LocalDateTime.of(2021, 10, 3, 13, 0), "energia", 500);
        DespesaComInternet conta3 = new DespesaComInternet(LocalDateTime.of(2021, 10, 5, 9, 17), "internet", 450);
        LicencaBasica lucro = new LicencaBasica(LocalDateTime.of(2021, 10, 1, 21, 49), "basica", 5);
        LicencaPlus lucro2 = new LicencaPlus(LocalDateTime.of(2021, 10, 6, 20, 50), "plus", 15);
        LicencaEnterprise lucro3 = new LicencaEnterprise(LocalDateTime.of(2021, 10, 4, 14, 10), "enterprise", 200);
        caixa.adicionarTransacao(conta);
        caixa.adicionarTransacao(conta2);
        caixa.adicionarTransacao(conta3);
        caixa.adicionarTransacao(lucro);
        caixa.adicionarTransacao(lucro2);
        caixa.adicionarTransacao(lucro3);
        System.out.println(caixa.calcularDespesas(LocalDate.of(2021,10,1), LocalDate.of(2021,10,10)));
        System.out.println(caixa.calcularReceitas(LocalDate.of(2021,10,1), LocalDate.of(2021,10,10)));
        System.out.println(caixa.saldoAtual());
        System.out.println(caixa.listarTransacoesNoMes(10,2021));
        System.out.println(caixa.percentualDespesasNoMes(10,2021));
        System.out.println(caixa.percentualReceitasNoMes(10,2021));


    }
}
