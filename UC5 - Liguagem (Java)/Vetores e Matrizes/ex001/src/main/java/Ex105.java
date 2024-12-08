import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Cálculo da soma dos elementos de cada coluna
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        // Exibindo a soma das colunas
        System.out.println("Soma dos elementos de cada coluna:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }

        scanner.close();
    }
}
