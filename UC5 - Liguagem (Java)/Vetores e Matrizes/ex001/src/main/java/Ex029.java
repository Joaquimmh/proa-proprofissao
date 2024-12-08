import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome e a nota do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        // Exibe a situação do aluno com base na nota
        if (nota >= 7) {
            System.out.println(nome + " está aprovado.");
        } else {
            System.out.println(nome + " está em recuperação.");
        }

        // Fechando o scanner
        scanner.close();
    }
}

