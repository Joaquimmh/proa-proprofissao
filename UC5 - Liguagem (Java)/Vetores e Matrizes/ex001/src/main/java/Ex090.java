import java.util.Scanner;

public class Ex090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean zeroEncontrado = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                zeroEncontrado = true;
                break;
            }
        }

        if (zeroEncontrado) {
            System.out.println("Um dos números é igual a zero.");
        } else {
            System.out.println("Nenhum dos números é igual a zero.");
        }

        scanner.close();
    }
}
