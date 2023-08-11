import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int alunos = entrada.nextInt();

        switch (alunos) {
            case 10:
                System.out.println("I-16");
            break;
            case 20:
                System.out.println("I-16");
            break;
            case 30:
                System.out.println("I-22");
            break;
            default:
                System.out.println("O número inserido não é válido.");
        }

    }

}
