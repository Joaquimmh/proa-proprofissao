import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita as três notas do aluno
        System.out.print("Digite a primeira nota (0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (0 a 10): ");
        double nota3 = scanner.nextDouble();

        // Definindo os pesos das notas
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        // Calculando a média ponderada
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // Exibindo a média ponderada
        System.out.printf("A média ponderada das notas é: %.2f\n", mediaPonderada);

        // Fechando o scanner
        scanner.close();
    }
}
