import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String conceito;

        if (nota >= 9 && nota <= 10) {
            conceito = "A";
        } else if (nota >= 7.5 && nota < 9) {
            conceito = "B";
        } else if (nota >= 6 && nota < 7.5) {
            conceito = "C";
        } else if (nota >= 4 && nota < 6) {
            conceito = "D";
        } else if (nota >= 0 && nota < 4) {
            conceito = "E";
        } else {
            conceito = "Nota inválida";
        }

        System.out.println("Conceito: " + conceito);

        scanner.close();
    }
}

