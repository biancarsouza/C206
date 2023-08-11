import java.util.Random;
import java.util.Scanner;

public class Adivinha {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int x = aleatorio.nextInt(10) + 1, y;

        do {
            y = entrada.nextInt();

            if(y != x) {
                System.out.println("Você errou o número, faça outra tentativa.");
            }

        } while(y != x);

        System.out.println("Você adivinhou o número!");

    }

}
