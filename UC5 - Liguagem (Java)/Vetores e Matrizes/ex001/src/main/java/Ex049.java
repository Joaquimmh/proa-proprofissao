import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        while (numero > 1) {
            fatorial *= numero;
            numero--;
        }

        System.out.println("O fatorial é: " + fatorial);

        scanner.close();
    }
}
