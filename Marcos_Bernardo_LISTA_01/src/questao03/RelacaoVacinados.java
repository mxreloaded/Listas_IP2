package questao03;

import java.util.ArrayList;
import java.util.List;

public class RelacaoVacinados {
    private List<RegistroVacina> vacinados = new ArrayList<>();

    public RelacaoVacinados(){ }
    public void adicionar(RegistroVacina registro){
        this.vacinados.add(registro);
    }

    public void setVacinados(List<RegistroVacina> vacinados) {
        this.vacinados = vacinados;
    }

    public List<RegistroVacina> getVacinados() {
        return vacinados;
    }


    public int calcularTotalVacinadosAcimaDe(int idade){
        int cont=0;
        for(RegistroVacina registro : vacinados){
            if(registro.getVacinado().calcularIdade() > idade){
                if(registro.getDose().numeroDoses == 1){
                    cont=cont+1;
                }
            }
        }
        return cont;
    }

    public int totalDeIdososQueTomaram2aDose(){
        int cont = 0;
        for(RegistroVacina registro : vacinados){
            if(registro.getVacinado().calcularIdade() > 65){
                if(registro.getDose().numeroDoses == 2){
                    cont=cont+1;
                }
            }
        }
        return cont;
    }

    public void listarPessoasQueNaoTomaram2aDose(){
        List<RegistroVacina> vacinados2 = new ArrayList<>(vacinados);
        String cpf="";
        System.out.printf("%30s %25s %10s %25s %10s %25s %10s", "CPF", "|", "Nome", "|", "Idade", "|", "Data Indicada p. 2a Dose");
        System.out.printf("\n%s%n", "---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(RegistroVacina registro : vacinados){
            if(registro.getDose().numeroDoses == 2){
                cpf = registro.getVacinado().getCpf();
            }
            for(RegistroVacina registro2 : vacinados){
                if(registro2.getVacinado().getCpf().equals(cpf)){
                    vacinados2.remove(registro2);
                }
            }
        }
        for(RegistroVacina registro : vacinados2){
            System.out.printf("\n%30s %25s %10s %25s %10s %25s %10s", registro.getVacinado().getCpf(), "|",
                    registro.getVacinado().getNome(), "|",
                    registro.getVacinado().calcularIdade(), "|",registro.getDataVacinacao().plusDays(21));
            System.out.printf("\n%s%n", "---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.printf("\nTotal de vacinados acima de 65 anos: " + calcularTotalVacinadosAcimaDe(65));
        System.out.printf("\nTotal de vacinados que não tomaram a 2a. Dose: " + vacinados2.size());
        System.out.printf("\nTotal de vacinados que tomaram a 2a. dose: " + totalDeIdososQueTomaram2aDose());

    }
}


