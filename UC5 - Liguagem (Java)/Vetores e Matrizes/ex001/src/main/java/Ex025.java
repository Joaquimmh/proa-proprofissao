import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de faltas
        System.out.print("Digite o número de faltas do aluno: ");
        int faltas = scanner.nextInt();

        // Verifica a situação do aluno
        if (faltas > 15) {
            System.out.println("Reprovado por falta.");
        } else {
            System.out.println("Situação regular.");
        }

        // Fechando o scanner
        scanner.close();
    }
}

