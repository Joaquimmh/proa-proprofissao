import java.util.Scanner;

public class Ex087 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contadorPositivos = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contadorPositivos);
    }
}

