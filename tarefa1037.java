import java.util.Locale;
import java.util.Scanner;

public class tarefa1037 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.UK);

        System.out.println("Entre com o valor para encontrar em que intervalo ele se encontra");
        double numero = input.nextDouble();

        if (numero < 0 && numero >= 25) {
          System.out.println("O valor está fora do intervalo");
        }
    }
}
