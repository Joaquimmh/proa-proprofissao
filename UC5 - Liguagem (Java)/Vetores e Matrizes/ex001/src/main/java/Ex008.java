import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números inteiros
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Exibe os valores antes da troca
        System.out.println("Antes da troca:");
        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);

        // Realiza a troca utilizando uma variável temporária
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Exibe os valores após a troca
        System.out.println("Depois da troca:");
        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);

        // Fechando o scanner
        scanner.close();
    }
}

