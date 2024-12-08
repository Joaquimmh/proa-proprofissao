import java.util.Scanner;

public class Ex099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] somaMatrizes = new int[2][2];

        // Leitura dos elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        // Leitura dos elementos da segunda matriz
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Calculando a soma das duas matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Exibindo a soma das duas matrizes
        System.out.println("Soma das duas matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(somaMatrizes[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
