import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maiorValor = Integer.MIN_VALUE;

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Encontrando o maior valor na matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        // Exibindo o maior valor encontrado
        System.out.println("O maior valor na matriz é: " + maiorValor);

        scanner.close();
    }
}

