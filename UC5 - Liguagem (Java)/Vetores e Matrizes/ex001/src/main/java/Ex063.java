import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Dígitos do número:");

        do {
            System.out.println(numero % 10);
            numero /= 10;
        } while (numero > 0);

        scanner.close();
    }
}

