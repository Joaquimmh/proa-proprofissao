import java.util.Scanner;
import java.util.Arrays;

public class Ex086 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}

