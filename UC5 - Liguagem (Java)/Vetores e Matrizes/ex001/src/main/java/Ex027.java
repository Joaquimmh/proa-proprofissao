import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade e o sexo da pessoa
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        // Verifica se a pessoa pode se aposentar
        if ((sexo == 'M' || sexo == 'm') && idade >= 65) {
            System.out.println("Você pode se aposentar.");
        } else if ((sexo == 'F' || sexo == 'f') && idade >= 60) {
            System.out.println("Você pode se aposentar.");
        } else {
            System.out.println("Você não pode se aposentar.");
        }

        // Fechando o scanner
        scanner.close();
    }
}

