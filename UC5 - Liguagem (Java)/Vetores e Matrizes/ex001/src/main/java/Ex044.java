import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalIdade = 0;
        int quantidadePessoas = 5;

        int i = 1;
        while (i <= quantidadePessoas) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();
            sc.nextLine();  // Limpar o buffer do teclado

            totalIdade += idade;
            i++;
        }

        double mediaIdade = (double) totalIdade / quantidadePessoas;
        System.out.println("A média das idades é: " + mediaIdade);
    }
}

