import java.util.Scanner;

public class Ex093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0; // Contador para os números no intervalo de 10 a 50

        // Lê 10 números inteiros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();

            // Verifica se o número está no intervalo de 10 a 50
            if (numero >= 10 && numero <= 50) {
                count++;
            }
        }

        // Exibe o resultado
        System.out.println("Quantidade de números no intervalo de 10 a 50: " + count);

        scanner.close();
    }
}

