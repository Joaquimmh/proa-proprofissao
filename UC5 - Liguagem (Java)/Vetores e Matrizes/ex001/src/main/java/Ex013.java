import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Solicita o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Verifica se o primeiro número é múltiplo do segundo
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " é múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        }

        // Fechando o scanner
        scanner.close();
    }
}

