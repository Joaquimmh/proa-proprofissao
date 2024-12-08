import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário do funcionário
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        // Declaração da variável para o valor do bônus
        double bonus;

        // Verifica o valor do salário e calcula o bônus
        if (salario > 2000) {
            bonus = salario * 0.10; // 10% de bônus
        } else {
            bonus = salario * 0.05; // 5% de bônus
        }

        // Exibe o valor do bônus
        System.out.printf("O valor do bônus é: R$ %.2f%n", bonus);

        // Fechando o scanner
        scanner.close();
    }
}
