import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe a base e a altura do triângulo
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        // Calculando a área do triângulo
        double area = (base * altura) / 2; // Fórmula da área do triângulo: A = (base * altura) / 2

        // Exibindo o resultado
        System.out.printf("A área do triângulo é: %.2f\n", area);

        // Fechando o scanner
        scanner.close();
    }
}
