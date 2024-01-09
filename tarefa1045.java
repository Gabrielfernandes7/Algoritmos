import java.util.Scanner;

public class tarefa1045 {

    private static void tipoTriangulo(double a, double b, double c) {
        if ((a == b) && (a == c) && (b == c)) {
            System.out.println("Trinângulo equilátero");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o lado A");
        double ladoA = input.nextDouble();

        System.out.println("Entre com o lado B");
        double ladoB = input.nextDouble();

        System.out.println("Entre com o lado C");
        double ladoC = input.nextDouble();

        if (ladoA >= ladoB + ladoC) {
            System.out.println("Não forma triângulo");
        }

        tipoTriangulo(ladoA, ladoB, ladoC);

        input.close();
    }
}
