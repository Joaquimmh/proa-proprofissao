import java.util.Scanner;

public class Ex061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int soma = 0;
        int i = 2;

        do {
            soma += i;
            i += 2;
        } while (i <= num);

        System.out.println("A soma dos números pares entre 1 e " + num + " é: " + soma);
    }
}

