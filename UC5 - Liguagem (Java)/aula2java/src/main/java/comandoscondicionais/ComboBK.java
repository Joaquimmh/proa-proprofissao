package comandoscondicionais;
import java.util.*;

public class ComboBK {
    public static void main(String[] args) {
        int hamburguer;
        String combo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o número de um hamburguer, combos dísponiveis:" +
                " 1 - King Costela, 2 - Whopper® Bacon Catupiry®, 3 - Mega Stacker Cheddar 2.0, 4 - Mega Stacker Atômico 2.0,  5 - Mega Stacker Atômico 3.0. ");
        hamburguer = entrada.nextInt();

        switch (hamburguer) {
            case 1: combo = "Você escolheu o King Costela:  Sanduíche no pão de brioche com hambúrguer de carne bovina grelhada, 2 fatias de queijo sabor cheddar, carne de costela bovina desfiada, chutney de cebola roxa, cebola crispy, 3 anéis de onion rings e maionese de alho.";
            break;
            case 2: combo = "Você escolheu o Whopper® Bacon Catupiry®: com hambúrguer de carne 100% bovina grelhado no fogo como churrasco, bacon crocante, Catupiry, cebola crispy, tomate em fatias e maionese.";
            break;
            case 3: combo = "Você escolheu o Mega Stacker Cheddar 2.0: Duas deliciosas carnes grelhadas no fogo, bacon, muito molho sabor cheddar e molho Stacker.";
            break;
            case 4: combo = "Você escolheu o Mega Stacker Atômico 2.0: Cheddar fatiado e bacon nas duas camadas, e molho Stacker.";
            break;
            case 5: combo = "Você escolheu o Mega Stacker Atômico 3.0: Todo mundo sabe que o Mega Stacker 3.0 tem três carnes, mas agora ele também pode ter três camadas de queijo e bacon. E aí, você encara?";
            break;
            default: combo = "Escolha outro, ainda não temos essa opção.";
        }
        System.out.println(combo);
    }
}
