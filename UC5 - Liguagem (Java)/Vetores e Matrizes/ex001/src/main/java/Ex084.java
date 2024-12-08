import java.util.Scanner;

public class Ex084 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int contadorPares = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contadorPares);
    }
}

