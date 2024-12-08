import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso da pessoa
        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        // Solicita a altura da pessoa
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o resultado
        System.out.println("O seu Índice de Massa Corporal (IMC) é: " + imc);

        // Fechando o scanner
        scanner.close();
    }
}
