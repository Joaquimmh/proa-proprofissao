import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Os dígitos do número são:");

        while (numero != 0) {
            int digito = numero % 10;  // Pega o último dígito
            System.out.println(digito);
            numero /= 10;  // Remove o último dígito do número
        }

        scanner.close();
    }
}

