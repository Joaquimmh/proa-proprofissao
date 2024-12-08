import java.util.Scanner;

public class Ex039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int contador = 1;

        while (contador <= 5) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = sc.nextInt();
            soma += numero;
            contador++;
        }

        double media = soma / 5.0;
        System.out.println("A média aritmética dos valores lidos é: " + media);
    }
}

