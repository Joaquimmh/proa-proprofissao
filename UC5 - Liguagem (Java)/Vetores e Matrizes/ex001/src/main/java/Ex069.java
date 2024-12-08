import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = soma / 5.0;
        System.out.println("A média aritmética dos valores lidos é: " + media);

        scanner.close();
    }
}

