import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a idade
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        // Verifica a faixa etária e exibe a mensagem correspondente
        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Você é um adulto.");
        } else if (idade >= 65) {
            System.out.println("Você é um idoso.");
        } else {
            System.out.println("Idade inválida.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
