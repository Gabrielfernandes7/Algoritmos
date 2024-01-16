import java.util.Locale;
import java.util.Scanner;

public class tarefa1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida em Km");
        int distanciaPercorrida = scanner.nextInt();

        System.out.println("Digite os litros de gasolina consumidos em L");
        double litrosConsumidos = scanner.nextDouble();

        double mediaDeConsumo = (distanciaPercorrida / litrosConsumidos);

        System.out.printf("%.2f km/L", mediaDeConsumo);

        scanner.close();
    }
}
