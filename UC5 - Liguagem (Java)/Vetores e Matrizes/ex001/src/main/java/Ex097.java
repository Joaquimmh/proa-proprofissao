import java.util.Scanner;

public class Ex097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int soma = 0;

        // Leitura dos elementos da matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j]; // Soma dos elementos
            }
        }

        // Exibe a soma dos elementos
        System.out.println("Soma de todos os elementos: " + soma);

        scanner.close();
    }
}

