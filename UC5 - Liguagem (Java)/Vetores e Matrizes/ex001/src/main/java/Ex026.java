import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Definindo os preços dos produtos
        double precoProduto1 = 10.50; // Preço do produto 1
        double precoProduto2 = 15.30; // Preço do produto 2
        double precoProduto3 = 20.70; // Preço do produto 3

        // Solicita o código do produto e a quantidade comprada
        System.out.print("Digite o código do produto (1, 2 ou 3): ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        // Inicializa o valor total
        double valorTotal = 0;

        // Calcula o valor total dependendo do código do produto
        if (codigoProduto == 1) {
            valorTotal = precoProduto1 * quantidade;
        } else if (codigoProduto == 2) {
            valorTotal = precoProduto2 * quantidade;
        } else if (codigoProduto == 3) {
            valorTotal = precoProduto3 * quantidade;
        } else {
            System.out.println("Código de produto inválido!");
            scanner.close();
            return; // Encerra o programa se o código for inválido
        }

        // Exibe o valor total a ser pago
        System.out.printf("O valor total a ser pago é: R$ %.2f\n", valorTotal);

        // Fechando o scanner
        scanner.close();
    }
}
