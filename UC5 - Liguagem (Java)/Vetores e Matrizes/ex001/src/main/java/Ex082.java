import java.util.Scanner;

public class Ex082 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
