import java.util.Scanner;

public class Ex094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7]; // Vetor para armazenar os 7 números

        // Lê 7 números inteiros e os armazena no vetor
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Exibe apenas os números pares
        System.out.println("Números pares digitados:");
        for (int i = 0; i < 7; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}

