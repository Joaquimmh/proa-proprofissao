public class Ex055 {
    public static void main(String[] args) {
        int num, i = 1;

        System.out.print("Digite um número para ver a tabuada: ");
        num = new java.util.Scanner(System.in).nextInt();

        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }
}
