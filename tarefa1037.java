import java.util.Locale;
import java.util.Scanner;

public class tarefa1037 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre com o valor para encontrar em que intervalo ele se encontra");
        double numero = input.nextDouble();

        if (numero < 0.0 && numero > 100.0) {
          System.out.println("O valor está fora do intervalo");
        } else {
          if (numero >= 0.0 && numero <= 25.0) {
            System.out.println("[0, 25]");
          } else if (numero > 25.0 && numero <= 50.0) {
            System.out.println("(25, 50]");
          } else if (numero > 50.0 && numero < 75.0) {
            System.out.println("(50, 75]");
          } else if (numero > 75.0 && numero < 100.0) {
            System.out.println("(75, 100]");
          }
        }

      input.close();
    }
}
