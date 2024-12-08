import java.util.Scanner;

public class Ex064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        do {
            fatorial *= numero;
            numero--;
        } while (numero > 0);

        System.out.println("O fatorial é: " + fatorial);

        scanner.close();
    }
}
