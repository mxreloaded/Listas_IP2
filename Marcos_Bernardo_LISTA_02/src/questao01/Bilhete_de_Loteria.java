package questao01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bilhete_de_Loteria {
    private int[] bilheteLoto;

    public Bilhete_de_Loteria(int tam){
        this.bilheteLoto = new int[tam];
        ArrayList<Integer> num = IntStream.range(1, 60).boxed().collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(num);
        for(int i : bilheteLoto){
            bilheteLoto[i]= num.get(i);
        }
        Arrays.sort(bilheteLoto);
    }

    public int[] getBilheteLoto() {
        return bilheteLoto;
    }

    public void setBilheteLoto(int[] bilheteLoto) {
        this.bilheteLoto = bilheteLoto;
    }

    @Override
    public String toString() {
        return "[" + Arrays.toString(bilheteLoto) + "]";
    }

    public int qtdNumerosContidos(Bilhete_de_Loteria param){
        int i=0;
        for(int j : param.bilheteLoto){
            for(int z=0; z<this.bilheteLoto.length; z++){
                if (param.bilheteLoto[j]==this.bilheteLoto[z]){
                    i+=1;
                }
            }
        }
        return i;
    }

}
