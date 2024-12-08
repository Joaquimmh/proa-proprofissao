import java.util.Scanner;

public class Ex098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;

        // Leitura dos elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j]; // Soma dos elementos da diagonal principal
                }
            }
        }

        // Exibe a soma dos elementos da diagonal principal
        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);

        scanner.close();
    }
}

