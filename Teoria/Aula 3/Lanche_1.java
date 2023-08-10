import java.text.DecimalFormat;

public class Lanche_1 {

    public static void main(String [] args) {

        DecimalFormat decimal = new DecimalFormat("0.00");

        int p_hora = 10, s_hora = 4, t_hora = 2, soma;
        float media;

        soma = p_hora + s_hora + t_hora;
        media = (float)soma/3;

        System.out.println("Total de lanches consumidos: " + soma);
        System.out.println("Média de lanches consumidos: " + decimal.format(media));

    }

}
