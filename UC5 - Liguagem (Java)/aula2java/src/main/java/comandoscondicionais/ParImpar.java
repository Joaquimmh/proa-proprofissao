package comandoscondicionais;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0 ) {
            System.out.println("O número " + numero + "é par.");
        } else {
            System.out.println("O número " + numero + "é impar.");
        }
    }
}
