import java.util.Random;
import java.util.Scanner;

public class Adivinha_2 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

        int x = aleatorio.nextInt(10) + 1, y;

        do {
            y = entrada.nextInt();

            if(y != x) {
                System.out.println("Você errou o número, faça outra tentativa.");

                if (y > x) {
                    System.out.println("O número gerado é menor que o número que você digitou.");
                } else {
                    System.out.println("O número gerado é maior que o número que você digitou.");
                }
            }

        } while(y != x);

        System.out.println("Você adivinhou o número!");

    }

}