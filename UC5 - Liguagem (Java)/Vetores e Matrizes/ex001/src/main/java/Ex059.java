import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade, somaIdades = 0, contador = 0;

        do {
            System.out.print("Digite o nome da pessoa: ");
            nome = sc.nextLine();
            System.out.print("Digite a idade de " + nome + ": ");
            idade = sc.nextInt();
            sc.nextLine();  // Limpar o buffer do Scanner
            somaIdades += idade;
            contador++;
        } while (contador < 5);

        double media = somaIdades / 5.0;
        System.out.println("A média das idades é: " + media);

        sc.close();
    }
}
