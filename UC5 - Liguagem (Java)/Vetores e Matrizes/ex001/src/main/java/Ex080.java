import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade, somaIdades = 0, contador = 0;

        // Loop para ler o nome e a idade até que "fim" seja informado
        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            // Se o nome for "fim", o loop é interrompido
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            idade = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            somaIdades += idade;
            contador++;
        }

        // Exibe a média das idades
        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }
    }
}

