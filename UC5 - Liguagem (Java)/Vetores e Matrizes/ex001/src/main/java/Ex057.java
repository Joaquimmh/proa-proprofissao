public class Ex057 {
    public static void main(String[] args) {
        int num, i = 2;
        boolean isPrime = true;

        System.out.print("Digite um número inteiro: ");
        num = new java.util.Scanner(System.in).nextInt();

        if (num <= 1) {
            isPrime = false;
        } else {
            do {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i <= num / 2);
        }

        if (isPrime) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }
}
