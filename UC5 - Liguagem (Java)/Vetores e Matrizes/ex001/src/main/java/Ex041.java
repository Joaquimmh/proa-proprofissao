import java.util.Scanner;

public class Ex041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        int divisor = 1;
        System.out.println("Divisores de " + numero + ":");
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}
