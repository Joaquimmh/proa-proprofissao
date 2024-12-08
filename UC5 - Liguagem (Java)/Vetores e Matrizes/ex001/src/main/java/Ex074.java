import java.util.Scanner;

public class Ex074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int numeroPessoas = 5;

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / numeroPessoas;
        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}

