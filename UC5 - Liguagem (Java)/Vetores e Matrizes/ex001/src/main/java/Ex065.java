import java.util.Scanner;

public class Ex065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade, somaIdades = 0, contagem = 0;

        do {
            System.out.print("Digite o nome da pessoa (ou 'fim' para terminar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                idade = scanner.nextInt();
                scanner.nextLine(); // Consumir o \n após a idade

                somaIdades += idade;
                contagem++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (contagem > 0) {
            double mediaIdades = (double) somaIdades / contagem;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi registrada.");
        }

        scanner.close();
    }
}
