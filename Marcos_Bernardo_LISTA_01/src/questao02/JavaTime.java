package questao02;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Formatter;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class JavaTime {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int year, month, day;
        System.out.print("Digite um ano: ");
        year=ler.nextInt();
        System.out.print("\nDigite um mes: ");
        month=ler.nextInt();
        System.out.print("\nDigite um dia: ");
        day=ler.nextInt();
        LocalDate data = LocalDate.of(year, month, day);
        Period diferencaHoje= Period.between(data, LocalDate.now());
        System.out.println(diferencaHoje);
        LocalDate data110 = data.plusDays(110);
        System.out.println(data110);
        LocalDate dataAgosto = LocalDate.of(year, 8, day);
        DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(br.format(data110));
        int year2, month2, day2;
        System.out.print("Agora, insira outro ano: ");
        year2=ler.nextInt();
        System.out.print("Agora, insira outro mes: ");
        month2=ler.nextInt();
        System.out.print("Agora, insira outro dia: ");
        day2=ler.nextInt();
        LocalDate data2 = LocalDate.of(year2, month2, day2);
        diasUteis(data, data2);
    }

    public static void diasUteis(LocalDate d1, LocalDate d2){
        int cont=0;
        DayOfWeek dom, sab;
        dom=DayOfWeek.SUNDAY;
        sab=DayOfWeek.SATURDAY;
        if(d1.isBefore(d2)){
            while(!d1.isEqual(d2)){
                cont++;
                if(d1.getDayOfWeek()==dom || d1.getDayOfWeek()==sab){
                    cont--;
                }
                d1=d1.plusDays(1);
            }
        }
        LocalDate dpivo;
        if (d1.isAfter(d2)) {
            dpivo=d2;
            d2=d1;
            d1=dpivo;
            while(!d1.isEqual(d2)){
                cont++;
                if(d1.getDayOfWeek()==dom || d1.getDayOfWeek()==sab){
                    cont--;
                }
                d1=d1.plusDays(1);
            }
        }
        System.out.print(cont+" dias uteis");
    }
}
