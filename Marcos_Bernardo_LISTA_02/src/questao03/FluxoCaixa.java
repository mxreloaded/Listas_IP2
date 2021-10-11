package questao03;

import questao03.Despesas.Despesa;
import questao03.Interface.Transacao;
import questao03.Receitas.Receita;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class FluxoCaixa{
    String nomeEmpresa;
    String cnpj;
    ArrayList<Transacao> historico;

    public FluxoCaixa(String nomeEmpresa, String cnpj, ArrayList<Transacao> historico) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.historico=historico;
    }
    public void adicionarTransacao(Transacao transacao){
        historico.add(transacao);
    }

    public double calcularDespesas(LocalDate inicio, LocalDate fim){
        double resultado=0;
        LocalDateTime inicioTime= LocalDateTime.of(inicio.getYear(), inicio.getMonth(), inicio.getDayOfMonth(), 0, 0);
        LocalDateTime fimTime= LocalDateTime.of(fim.getYear(), fim.getMonth(), fim.getDayOfMonth(), 23, 59);
        inicioTime=inicioTime.minusDays(1);
        fimTime=fimTime.plusDays(1);
        for(Transacao trans: this.historico){
            if(trans instanceof Despesa){
                if(trans.getData().isAfter(inicioTime) && trans.getData().isBefore(fimTime)){
                    resultado=resultado+trans.calcularTotal();
                }
            }
        }

        return resultado;
    }
    public double calcularReceitas(LocalDate inicio, LocalDate fim){
        double resultado=0;
        LocalDateTime inicioTime= LocalDateTime.of(inicio.getYear(), inicio.getMonth(), inicio.getDayOfMonth(), 0, 0);
        LocalDateTime fimTime= LocalDateTime.of(fim.getYear(), fim.getMonth(), fim.getDayOfMonth(), 23, 59);
        inicioTime=inicioTime.minusDays(1);
        fimTime=fimTime.plusDays(1);
        for(Transacao trans: this.historico){
            if(trans instanceof Receita){
                if(trans.getData().isAfter(inicioTime) && trans.getData().isBefore(fimTime)){
                    resultado=resultado+trans.calcularTotal();
                }
            }
        }

        return resultado;
    }

    public double percentualReceitasNoMes(int mes, int ano){
        double resultado;
        double despesas=0;
        double receitas=0;

        for(Transacao trans: this.historico){
            if(trans instanceof Despesa){
                if(trans.getData().getMonth().getValue()==mes && trans.getData().getYear()==ano){
                    despesas=despesas+trans.calcularTotal();
                }
            }
            if(trans instanceof Receita){
                if(trans.getData().getMonth().getValue()==mes && trans.getData().getYear()==ano){
                    receitas=receitas+trans.calcularTotal();
                }
            }
        }
        double total=receitas+despesas;
        resultado=receitas/total*100;
        return resultado;
    }

    public double percentualDespesasNoMes(int mes, int ano){
        double resultado;
        double despesas=0;
        double receitas=0;
        for(Transacao trans: this.historico){
            if(trans instanceof Despesa){
                if(trans.getData().getMonth().getValue()==mes && trans.getData().getYear()==ano){
                    despesas=despesas+trans.calcularTotal();
                }
            }
            if(trans instanceof Receita){
                if(trans.getData().getMonth().getValue()==mes && trans.getData().getYear()==ano){
                    receitas=receitas+trans.calcularTotal();
                }
            }
        }
        double total=receitas+despesas;
        resultado=despesas/total*100;
        return resultado;
    }

    public double saldoAtual(){
        double resultado=0;
        for(Transacao trans: this.historico){
            if(trans instanceof Despesa){
                resultado=resultado-trans.calcularTotal();
            }
            if(trans instanceof Receita){
                resultado=resultado+trans.calcularTotal();
            }
        }
        return resultado;
    }

    public List<Transacao> listarTransacoesNoMes(int mes, int ano){
        ArrayList<Transacao> resultado = new ArrayList<>();
        for(Transacao trans: this.historico){
            if(trans.getData().getMonth().getValue()==mes && trans.getData().getYear()==ano){
                resultado.add(trans);
            }
        }
        return resultado;
    }
}
