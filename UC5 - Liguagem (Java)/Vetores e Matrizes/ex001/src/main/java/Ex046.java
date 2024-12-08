public class Ex046 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int soma = 0;
        int i = 2; // Inicia a contagem com o primeiro número par

        while (i <= numero) {
            soma += i;
            i += 2; // Incrementa 2 para pegar o próximo número par
        }

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);
    }
}

