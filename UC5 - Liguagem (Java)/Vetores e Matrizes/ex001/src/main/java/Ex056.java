public class Ex056 {
    public static void main(String[] args) {
        int num, i = 1;

        System.out.print("Digite um número inteiro positivo: ");
        num = new java.util.Scanner(System.in).nextInt();

        System.out.println("Divisores de " + num + ":");
        do {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);
    }
}

