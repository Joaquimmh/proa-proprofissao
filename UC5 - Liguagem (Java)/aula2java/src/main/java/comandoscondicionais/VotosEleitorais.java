package comandoscondicionais;
import java.util.Scanner;

public class VotosEleitorais {

    public static void main(String[] args) {

        int idade;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18 && idade <= 69){
            System.out.println("Seu voto é obrigatório");
        }else if(idade >=16 || idade >69){
            System.out.println("Seu voto é opcional");
        }else{
            System.out.println("Você não pode votar");
        }

    }
}
