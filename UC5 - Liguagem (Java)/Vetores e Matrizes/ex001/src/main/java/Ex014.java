import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade em anos
        System.out.print("Digite a sua idade em anos: ");
        int anos = scanner.nextInt();

        // Solicita a idade em meses
        System.out.print("Digite a sua idade em meses: ");
        int meses = scanner.nextInt();

        // Solicita a idade em dias
        System.out.print("Digite a sua idade em dias: ");
        int dias = scanner.nextInt();

        // Calcula o total de dias de vida
        int totalDias = (anos * 365) + (meses * 30) + dias;

        // Exibe o total de dias de vida
        System.out.println("Você viveu aproximadamente " + totalDias + " dias.");

        // Fechando o scanner
        scanner.close();
    }
}
