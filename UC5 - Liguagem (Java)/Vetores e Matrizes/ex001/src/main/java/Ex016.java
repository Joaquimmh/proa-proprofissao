import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Verifica se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
