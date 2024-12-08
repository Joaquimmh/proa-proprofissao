public class Ex054 {
    public static void main(String[] args) {
        int i = 1, soma = 0, num;
        double media;

        do {
            System.out.print("Digite o " + i + "º número: ");
            num = new java.util.Scanner(System.in).nextInt();
            soma += num;
            i++;
        } while (i <= 5);

        media = soma / 5.0;
        System.out.println("A média aritmética é: " + media);
    }
}
