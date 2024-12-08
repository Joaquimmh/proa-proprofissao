import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Verifica se a média é maior ou igual a 7 para aprovação
        if (media >= 7) {
            System.out.println("Você foi aprovado! Sua média foi: " + media);
        } else {
            System.out.println("Você foi reprovado. Sua média foi: " + media);
        }

        // Fechando o scanner
        scanner.close();
    }
}

