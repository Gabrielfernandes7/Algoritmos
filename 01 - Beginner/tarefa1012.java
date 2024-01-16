import java.util.Locale;
import java.util.Scanner;

public class tarefa1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("Escreva os lados A, B e C, respectivamente");
        System.out.println("Será calculado a área dos poligonos");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double areaTriangulo = (a * c);
        double areaCirculo = PI * (c * c);
        double areaTrapezio = ((a + b) * (c / 2.0));
        double areaRetangulo = (a * b);
        double areaQuadrado = (b * b);
        
        System.out.format("AREA TRIANGULO = %.3f \n", areaTriangulo);
        System.out.format("AREA CIRCULO = %.3f \n", areaCirculo);
        System.out.format("AREA TRAPEZIO = %.3f \n", areaTrapezio);
        System.out.format("AREA RETANGULO = %.3f \n", areaRetangulo);
        System.out.format("AREA QUADRADO = %.3f \n", areaQuadrado);

        scanner.close();
    }
}
