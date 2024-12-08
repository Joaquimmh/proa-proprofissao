import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int menorValor;

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Inicializa o menor valor com o primeiro elemento da matriz
        menorValor = matriz[0][0];

        // Encontra o menor valor na matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
            }
        }

        // Exibindo o menor valor encontrado
        System.out.println("O menor valor da matriz é: " + menorValor);

        scanner.close();
    }
}
