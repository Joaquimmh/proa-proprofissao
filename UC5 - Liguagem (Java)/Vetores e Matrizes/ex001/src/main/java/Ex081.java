import java.util.Scanner;

public class Ex081 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

