import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso e a altura da pessoa
        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o IMC
        System.out.printf("O seu IMC é: %.2f\n", imc);

        // Classifica o IMC
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação: Obesidade grau 2");
        } else {
            System.out.println("Classificação: Obesidade grau 3");
        }

        // Fechando o scanner
        scanner.close();
    }
}

