import java.util.Scanner;

public class Ex083 {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = soma / 7.0;
        System.out.println("A média aritmética é: " + media);
    }
}
