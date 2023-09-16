import java.util.Locale;
import java.util.Scanner;

public class tarefa1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iremos calcular a distância entre dois pontos A(x1,y1) B(x2,y2)");

        System.out.println("Digite os pontos x1 e y1, respectivamente: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Digite os pontos x2 e y2, respectivamente: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distanciaABQuadradoX = Math.pow((x2 - x1), 2); 
        double distanciaABQuadradoY = Math.pow((y2 - y1), 2); 

        double distanciaAB = Math.sqrt(distanciaABQuadradoX + distanciaABQuadradoY);

        System.out.format("A distância AB = %.4f", distanciaAB);

        scanner.close();
    }
}
