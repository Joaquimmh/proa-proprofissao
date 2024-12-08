import java.util.Scanner;

public class Ex085 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}

