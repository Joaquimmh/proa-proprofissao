import java.util.Arrays;
import java.util.Scanner;

public class Ex095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5]; // Vetor para armazenar os 5 nomes

        // Lê os 5 nomes e os armazena no vetor
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Ordena os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibe os nomes em ordem alfabética
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

