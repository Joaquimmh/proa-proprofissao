import java.util.Scanner;

public class Ex076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 2; i <= numero; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);

        scanner.close();
    }
}
