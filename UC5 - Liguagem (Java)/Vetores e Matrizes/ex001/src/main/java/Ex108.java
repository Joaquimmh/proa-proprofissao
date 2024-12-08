import java.util.Scanner;

public class Ex108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        // Leitura da matriz 4x4
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo o maior valor de cada linha
        System.out.println("Maior valor em cada linha:");
        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];  // Assume-se que o primeiro elemento da linha é o maior
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];  // Atualiza o maior valor
                }
            }
            System.out.println("Linha " + i + ": " + maior);
        }

        scanner.close();
    }
}
