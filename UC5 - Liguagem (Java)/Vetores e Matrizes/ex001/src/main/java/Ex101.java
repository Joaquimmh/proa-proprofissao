import java.util.Scanner;

public class Ex101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;
        int totalElementos = 0;

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];  // Soma dos elementos
                totalElementos++;  // Contagem dos elementos
            }
        }

        // Cálculo da média aritmética
        double media = (double) soma / totalElementos;

        // Exibindo a média
        System.out.println("A média aritmética dos elementos da matriz é: " + media);

        scanner.close();
    }
}

