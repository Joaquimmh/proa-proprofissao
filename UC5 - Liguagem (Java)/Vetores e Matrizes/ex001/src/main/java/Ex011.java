import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita três números reais
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        // Calcula a média aritmética
        double media = (num1 + num2 + num3) / 3;

        // Exibe o resultado
        System.out.println("A média aritmética entre os números é: " + media);

        // Fechando o scanner
        scanner.close();
    }
}
