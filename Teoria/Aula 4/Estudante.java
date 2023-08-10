import java.util.Scanner;

public class Estudante {

    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        float npa, np3, nfa;

        npa = entrada.nextFloat();

        if(npa >= 60) {
            System.out.println("O estudante passou.");
        } else if (npa < 30) {
            System.out.println("O estudante não passou.");
        } else {
            System.out.println("O estudante ficou de NP3.");

            np3 = entrada.nextFloat();
            nfa = (npa + np3)/2;

            if(nfa >= 50) {
                System.out.println("O estudante passou.");
            } else {
                System.out.println("O estudante não passou.");
            }
        }

    }

}
