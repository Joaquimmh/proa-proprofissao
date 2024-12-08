import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário base do funcionário
        System.out.print("Digite o salário base do funcionário: R$ ");
        double salarioBase = scanner.nextDouble();

        // Calcula a comissão (5% do salário base)
        double comissao = salarioBase * 0.05;

        // Calcula o salário líquido (salário base + comissão)
        double salarioLiquido = salarioBase + comissao;

        // Exibe o salário líquido
        System.out.printf("O salário líquido do funcionário é: R$ %.2f\n", salarioLiquido);

        // Fechando o scanner
        scanner.close();
    }
}

