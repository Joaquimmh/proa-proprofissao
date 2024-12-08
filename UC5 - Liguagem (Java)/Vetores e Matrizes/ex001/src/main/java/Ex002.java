import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Calculando a área e o perímetro
        double area = Math.PI * Math.pow(raio, 2); // Fórmula da área: A = π * r²
        double perimetro = 2 * Math.PI * raio; // Fórmula do perímetro: P = 2 * π * r

        // Exibindo os resultados
        System.out.printf("A área do círculo é: %.2f\n", area);
        System.out.printf("O perímetro do círculo é: %.2f\n", perimetro);

        // Fechando o scanner
        scanner.close();
    }
}
