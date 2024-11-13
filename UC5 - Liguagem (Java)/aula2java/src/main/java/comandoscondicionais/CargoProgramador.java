package comandoscondicionais;

import java.util.*;

public class CargoProgramador {
    public static void main(String[] args) {
        int cargo;
        String informacao;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número do cargo: " + " 1 - Programador estagiário, 2 - Programador junior, 3 - Programador pleno, 4 - Programador senior, 5 - Programador master.");

        cargo = entrada.nextInt();

        switch(cargo) {
            case 1: informacao = "Programador estagiário: Sálario de R$1.540(aumento de 10%).";
            break;
            case 2: informacao = "Programador junior: Sálario de R$3.360(aumento de 12%).";
            break;
            case 3: informacao = "Programador pleno: Sálario de R$6.215(aumento de 13%).";
            break;
            case 4: informacao = "Programador senior: Sálario de R$9.200(aumento de 15%).";
            break;
            case 5: informacao = "Programador master: Sálario de R$14.160(aumento de 18%).";
            break;
            default: informacao = "Cargo não encontrado,digite outro número";
            break;
        }
        System.out.println(informacao);
    }
}
