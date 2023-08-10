import java.text.DecimalFormat;
import java.util.Scanner;

public class Lanche_2 {

    public static void main(String [] args) {

        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);

        int p_hora, s_hora, t_hora, soma;
        float media;

        p_hora = entrada.nextInt();
        s_hora = entrada.nextInt();
        t_hora = entrada.nextInt();
        entrada.close();

        soma = p_hora + s_hora + t_hora;
        media = (float)soma/3;

        System.out.println("Total de lanches consumidos: " + soma);
        System.out.println("Média de lanches consumidos: " + decimal.format(media));

    }

}
