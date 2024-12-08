import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o preço do produto
        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        // Solicita a quantidade de unidades compradas
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        // Calcula o valor total sem desconto
        double valorTotal = preco * quantidade;

        // Se a quantidade for maior que 10, aplica 10% de desconto
        if (quantidade > 10) {
            valorTotal = valorTotal * 0.90; // Desconto de 10%
        }

        // Exibe o valor total a ser pago
        System.out.printf("O valor total a ser pago é: R$ %.2f\n", valorTotal);

        // Fechando o scanner
        scanner.close();
    }
}
