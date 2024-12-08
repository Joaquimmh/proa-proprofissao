public class Ex075 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        System.out.print("Sequência de Fibonacci: ");

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 3; i <= 20; i++) {
            int proximo = n1 + n2;
            System.out.print(proximo + " ");

            n1 = n2;
            n2 = proximo;
        }
    }
}
