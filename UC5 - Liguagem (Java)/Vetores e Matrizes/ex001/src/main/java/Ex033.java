import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o turno (M para Matutino ou V para Vespertino): ");
        char turno = scanner.next().charAt(0);

        if (turno == 'M' || turno == 'm') {
            System.out.println("Bom dia, " + nome);
        } else if (turno == 'V' || turno == 'v') {
            System.out.println("Boa tarde, " + nome);
        } else {
            System.out.println("Turno inválido");
        }

        scanner.close();
    }
}
