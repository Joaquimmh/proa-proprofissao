import java.util.Scanner;

public class Ex050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        int somaIdades = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            idade = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            somaIdades += idade;
            contador++;
        }

        if (contador > 0) {
            double mediaIdades = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }

        scanner.close();
    }
}

