import java.util.Scanner;

public class Ex088 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int somaPares = 0, somaImpares = 0;
        int contadorPares = 0, contadorImpares = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contadorPares++;
            } else {
                somaImpares += numeros[i];
                contadorImpares++;
            }
        }

        if (contadorPares > 0) {
            System.out.println("Média dos valores pares: " + (double) somaPares / contadorPares);
        } else {
            System.out.println("Não houve valores pares.");
        }

        if (contadorImpares > 0) {
            System.out.println("Média dos valores ímpares: " + (double) somaImpares / contadorImpares);
        } else {
            System.out.println("Não houve valores ímpares.");
        }
    }
}

