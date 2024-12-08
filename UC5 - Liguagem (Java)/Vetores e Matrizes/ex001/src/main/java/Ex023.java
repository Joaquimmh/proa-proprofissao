import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do mês
        System.out.print("Digite o nome de um mês: ");
        String mes = scanner.nextLine().toLowerCase(); // Lê o mês e converte para minúsculas para facilitar a comparação

        // Variável para armazenar a quantidade de dias do mês
        int dias;

        // Verifica o mês e define a quantidade de dias
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;
            case "fevereiro":
                dias = 28; // Considerando um ano não bissexto
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            default:
                dias = -1; // Caso o mês não seja válido
        }

        // Exibe a quantidade de dias ou uma mensagem de erro caso o mês não seja válido
        if (dias == -1) {
            System.out.println("Mês inválido. Por favor, insira um mês válido.");
        } else {
            System.out.printf("O mês de %s possui %d dias.%n", mes, dias);
        }

        // Fechando o scanner
        scanner.close();
    }
}

