package primeiraaulabasico; // pacote (pasta de organização das classes)
import java.util.Scanner; // referência

public class PrimeiraAula {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in); // entrada de dados pelo teclado

        System.out.println("Entre o com o primeiro número"); //permite a exibição em tela
        int numero = entrada.nextInt(); // instância da classe Scanner na variável

        System.out.println("Entre o com o segundo número");
        int numero2 = entrada.nextInt();


        int soma = numero + numero; // instância que atribui valor á soma

        System.out.println("O valor do primeiro número é: " + numero); //saída dos dados (
        System.out.println("O valor do segundo número é: " + numero2);
        System.out.println("A soma dos dois números é: " + soma);
    }
}
