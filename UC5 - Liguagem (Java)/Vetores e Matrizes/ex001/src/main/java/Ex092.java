import java.util.Scanner;

public class Ex092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        // Lê os 5 números inteiros
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Ordena os números em ordem decrescente
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // Exibe os números em ordem decrescente
        System.out.println("Números em ordem decrescente:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}

