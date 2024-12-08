import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor do depósito mensal e a taxa de juros mensal
        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJurosMensal = scanner.nextDouble();

        // Inicializa o montante
        double montante = 0;

        // Calcula o montante após 12 meses
        for (int i = 1; i <= 12; i++) {
            // Aplica o depósito mensal
            montante += depositoMensal;

            // Aplica os juros sobre o montante atual
            montante += montante * (taxaJurosMensal / 100);
        }

        // Exibe o resultado
        System.out.printf("O montante após 12 meses é: R$ %.2f\n", montante);

        // Fechando o scanner
        scanner.close();
    }
}
