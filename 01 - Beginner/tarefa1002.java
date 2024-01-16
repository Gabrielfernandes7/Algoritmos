import java.util.Locale;
import java.util.Scanner;

public class tarefa1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.141592;

        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double areaDoCirculo = PI * (raio * raio);

        System.out.print("A = " + areaDoCirculo);

        scanner.close();
    }
}
