import java.util.Locale;
import java.util.Scanner;

public class tarefa1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final Double PI = 3.14159;

        System.out.println("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();        

        double volumeDaEsfera = (4.0 / 3.0) * PI * (raio * raio * raio);

        System.out.format("VOLUME = %.2f", volumeDaEsfera);

        scanner.close();
    }
}
