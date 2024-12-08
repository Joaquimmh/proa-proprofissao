public class Ex045 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, contador = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");

        while (contador <= 20) {
            System.out.print(n1 + " ");
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
            contador++;
        }
    }
}

