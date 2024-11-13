package primeiraaulabasico;
import java.util.Scanner;

public class Atividade2Java {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre o com o primeiro número");
        int numero = entrada.nextInt();

        System.out.println("Entre o com o segundo número");
        int numero2 = entrada.nextInt();

        System.out.println("Entre o com o terceiro número");
        int numero3 = entrada.nextInt();

        System.out.println("Entre o com o terceiro número");
        int numero4 = entrada.nextInt();


        int soma = numero + numero2 + numero3 + numero4;
        int media = soma / 4;

        System.out.println("O valor do primeiro número é: " + numero);
        System.out.println("O valor do segundo número é: " + numero2);
        System.out.println("O valor do terceiro número é: " + numero3);
        System.out.println("O valor do quarto número é: " + numero4);
        System.out.println("A soma dos quatro números é: " + soma);
        System.out.println("A média dos quatro números é: " + media);
    }
}