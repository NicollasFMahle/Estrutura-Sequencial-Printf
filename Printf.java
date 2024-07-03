import java.util.Locale;
import java.util.Scanner;

public class Printf {
    public static void main(String[] args) {
        String nome = "Nicollas Mahle";

        System.out.printf("O nome do dev é: %s\n",nome);

        double pi = Math.PI;

        System.out.printf("O valor de pi é: %f\n",pi);
        //numero de casas dps da vírgula
        System.out.printf("O valor de pi é: %.3f\n",pi);
        // quant espaçamento
        System.out.printf("O valor de pi é: %10.3f\n",pi);

        // LOCALIZACAO ESPECIFICA
        System.out.printf(Locale.CHINESE,"O valor de pi na china é: %f\n",pi);
       System.out.printf(Locale.ENGLISH,"O valor de pi na nos EUA é: %f",pi);
    }
}
