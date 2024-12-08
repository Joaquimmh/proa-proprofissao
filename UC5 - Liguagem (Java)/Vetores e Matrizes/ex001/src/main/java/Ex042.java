import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int divisor = 2;
        boolean primo = true;

        while (divisor <= numero / 2) {
            if (numero % divisor == 0) {
                primo = false;
                break;
            }
            divisor++;
        }

        if (primo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
