import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de pessoas no grupo
        System.out.print("Digite o número de pessoas no grupo: ");
        int numPessoas = scanner.nextInt();

        // Inicializa contadores para menores e maiores de idade
        int menoresDeIdade = 0;
        int maioresDeIdade = 0;

        // Laço para ler a idade de cada pessoa
        for (int i = 1; i <= numPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            // Verifica se a pessoa é maior ou menor de idade
            if (idade < 18) {
                menoresDeIdade++;
            } else {
                maioresDeIdade++;
            }
        }

        // Exibe o número de menores e maiores de idade
        System.out.println("Número de menores de idade: " + menoresDeIdade);
        System.out.println("Número de maiores de idade: " + maioresDeIdade);

        // Fechando o scanner
        scanner.close();
    }
}
