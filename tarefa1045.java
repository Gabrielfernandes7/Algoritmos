import java.util.Arrays;
import java.util.Scanner;

public class tarefa1045 {

    private static void tipoTriangulo(double a, double b, double c) {
        if ((a >= b + c) || ((a == 0) || (b == 0) || (c == 0))) {
            System.out.println("Não forma triângulo");
        } else if((Math.pow(a, 2)) == (Math.pow(b, 2)) + (Math.pow(c, 2))) {
            System.out.println("Triângulo retângulo");
        } else if((Math.pow(a, 2)) > (Math.pow(b, 2)) + (Math.pow(c, 2))) {
            System.out.println("Triângulo obtusângulo");
        } else if ((Math.pow(a, 2)) < (Math.pow(b, 2)) + (Math.pow(c, 2))) {
            System.out.println("Triângulo acutângulo");
        } else if (a == b && a == c){
            System.out.println("Triângulo equilátero");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com os lados A, B, C");

        double[] lado = new double[3];
        for(int i = 0; i < 3; i++) {
            lado[i] = input.nextDouble();
        }

        Arrays.sort(lado);
        double ladoA = lado[2];
        double ladoB = lado[1];
        double ladoC = lado[0];

        tipoTriangulo(ladoA, ladoB, ladoC);

        input.close();
    }
}
