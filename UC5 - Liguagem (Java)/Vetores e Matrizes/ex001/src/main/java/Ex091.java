import java.util.Scanner;

public class Ex091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPositivos = 0;
        int somaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }

        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);

        scanner.close();
    }
}

