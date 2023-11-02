import java.util.Scanner;

public class tarefa1039 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    java.util.Scanner input = new Scanner(System.in);

    /*
     * Para que saibamos se o circulo 1
     * está completamente contido no círculo 2
    */

    System.out.println("*** Flor de fogo ***");

    System.out.println("Entre com as coordenadas do caçador");
    System.out.println("X1: ");
    int x1 = input.nextInt();

    System.out.println("Y1:");
    int y1 = input.nextInt();

    System.out.println("Entre com as coordenadas da flor de fogo");
    System.out.println("X2: ");
    int x2 = input.nextInt();

    System.out.println("Y2:");
    int y2 = input.nextInt();

    System.out.println("Entre com o raio 1");
    double r1 = input.nextInt();

    System.out.println("Entre com o raio 2");
    double r2 = input.nextInt();

    double distanciaQuadrado = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
    double distanciaEntreOsCentros = Math.sqrt(distanciaQuadrado);

    System.out.println(distanciaEntreOsCentros);

    if (distanciaEntreOsCentros <= (r2 - r1)) {
      System.out.println("RICO");
    } else {
      System.out.println("MORTO");
    }

    input.close();

  }
}

