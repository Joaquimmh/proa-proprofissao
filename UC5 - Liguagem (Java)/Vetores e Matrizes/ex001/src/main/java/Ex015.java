import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário atual do funcionário
        System.out.print("Digite o salário do funcionário: R$ ");
        double salarioAtual = scanner.nextDouble();

        // Calcula o aumento de 15%
        double aumento = salarioAtual * 0.15;
        double novoSalario = salarioAtual + aumento;

        // Exibe o novo salário
        System.out.println("O novo salário com o aumento de 15% é: R$ " + novoSalario);

        // Fechando o scanner
        scanner.close();
    }
}
