package comandoscondicionais;
import java.util.Scanner;

public class MediasNotas {

    public static void main(String[] args) {
        float n1, n2, n3, media;
        Scanner nota = new Scanner(System.in);

        System.out.print("Entre com a primeira nota: ");
        n1 = nota.nextFloat();

        System.out.print("Entre com a segunda nota: ");
        n2 = nota.nextFloat();

        System.out.print("Entre com a terceira nota: ");
        n3 = nota.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("A média das notas é: %.2f", media);
        nota.close();

        if(media >=7) {
            System.out.println("Está aprovado! ");
        } else if(media >=5){
            System.out.println("Está em recuperação ");
        }else{
            System.out.println("Está reprovado ");
        }
    }

}
