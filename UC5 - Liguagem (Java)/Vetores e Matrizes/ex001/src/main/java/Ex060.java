public class Ex060 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, contador = 1;

        do {
            System.out.print(n1 + " ");
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
            contador++;
        } while (contador <= 20);
    }
}
