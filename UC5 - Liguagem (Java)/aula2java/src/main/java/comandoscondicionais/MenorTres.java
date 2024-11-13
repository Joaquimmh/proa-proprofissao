package comandoscondicionais;

import java.util.Scanner;

public class MenorTres {
    public static void main(String[] args) {

        int menor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n1 = entrada.nextInt();

        System.out.println("Digite o segundo número");
        int n2 = entrada.nextInt();

        System.out.println("Digite o terceiro número");
        int n3 = entrada.nextInt();

        if (n1 < n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.println("O menor número é:" + menor);

    }
}


