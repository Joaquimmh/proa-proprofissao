import java.util.Scanner;

public class Ex107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int produto = 1;

        // Leitura da matriz 3x3
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando o produto dos elementos da diagonal secundária
        for (int i = 0; i < 3; i++) {
            produto *= matriz[i][2 - i]; // Elementos da diagonal secundária
        }

        // Exibindo o produto dos elementos da diagonal secundária
        System.out.println("O produto dos elementos da diagonal secundária é: " + produto);

        scanner.close();
    }
}

