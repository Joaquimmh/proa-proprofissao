import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de maçãs compradas
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        // Verifica o preço das maçãs com base na quantidade
        double precoUnitario;
        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        // Calcula o valor total
        double total = precoUnitario * quantidade;

        // Exibe o valor total a ser pago
        System.out.printf("O valor total a ser pago é R$ %.2f\n", total);

        // Fechando o scanner
        scanner.close();
    }
}

