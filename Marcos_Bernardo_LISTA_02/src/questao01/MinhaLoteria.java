package questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class MinhaLoteria{

    public static void main(String[] args){
        Bilhete_de_Loteria bilhetePremiado = new Bilhete_de_Loteria(6);
        ArrayList<String> vencedores = new ArrayList<>(10);
        for(int x=6; x<=15; x++){
            ArrayList<Bilhete_de_Loteria> bilhetes = new ArrayList<>();
            int mega = 0, quina = 0, quadra = 0;
            int cont=0;
            while(mega==0){
                Bilhete_de_Loteria bilheteSorteado = new Bilhete_de_Loteria(x);
                bilhetes.add(bilheteSorteado);
                cont=cont+1;
                if(bilhetePremiado.qtdNumerosContidos(bilheteSorteado) ==4){
                    quadra=quadra+1;
                    System.out.print("\nSorteio de numero " + cont + " realizado. O bilhete sorteado " + bilheteSorteado +
                            " NÃO CONTÉM todos os números do bilhete premiado " + bilhetePremiado);
                }
                else if(bilhetePremiado.qtdNumerosContidos(bilheteSorteado) ==5){
                    quadra=quadra+1;
                    quina=quina+1;
                    System.out.print("\nSorteio de numero " + cont + " realizado. O bilhete sorteado " + bilheteSorteado +
                            " NÃO CONTÉM todos os números do bilhete premiado " + bilhetePremiado);
                }
                else if(bilhetePremiado.qtdNumerosContidos(bilheteSorteado) ==6){
                    quadra=quadra+1;
                    quina=quina+1;
                    mega=1;
                    System.out.print("\nPARABÉNS VOCÊ GANHOU NA MEGASENA DEPOIS DE " + cont + " TENTATIVAS DE JOGO\n" + bilheteSorteado);
                    vencedores.add("Jogos de " + x + " numeros: você apostou " + cont + " vezes para ganhar na mega-sena." +
                            " Dentre esses jogos, você acertou "+ quadra +" quadras e "+ quina +" quinas.");
                }
            }
        }
        System.out.print(String.valueOf(vencedores));
    }
}
