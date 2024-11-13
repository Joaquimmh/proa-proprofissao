package comandoscondicionais;
import java.util.Scanner;

public class MaiorDois {

    public static void main(String[] args) {

        int n1, n2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo número");
        n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior");
        } else if (n2 > n1) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("Os números são iguais");
        }
        


    }
}
