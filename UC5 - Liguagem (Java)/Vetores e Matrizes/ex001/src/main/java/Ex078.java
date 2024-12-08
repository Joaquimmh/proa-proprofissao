import java.util.Scanner;

public class Ex078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Converte o número para uma string para acessar cada dígito
        String numeroStr = String.valueOf(numero);

        System.out.println("Os dígitos do número são:");

        // Exibe cada dígito separadamente
        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.println(numeroStr.charAt(i));
        }
    }
}
