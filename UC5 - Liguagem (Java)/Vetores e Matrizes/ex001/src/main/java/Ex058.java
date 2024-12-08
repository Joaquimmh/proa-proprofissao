public class Ex058 {
    public static void main(String[] args) {
        int num, a = 0, b = 1, c;

        System.out.print("Digite um número inteiro: ");
        num = new java.util.Scanner(System.in).nextInt();

        System.out.print("Sequência de Fibonacci até " + num + ": ");

        if (num >= 0) {
            do {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            } while (a <= num);
        }
    }
}

