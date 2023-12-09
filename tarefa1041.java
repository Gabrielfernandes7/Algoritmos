import java.util.Locale;
import java.util.Scanner;

public class tarefa1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com as coordenadas X, Y");
        System.out.println("O quadrante do ponto será informado");

        System.out.println("Eixo X: ");
        double eixoX = input.nextDouble();

        System.out.println("Eixo Y");
        double eixoY = input.nextDouble();

        if (eixoX == 0 && eixoY == 0) {
            System.out.println("Origem");
        } else {
            if (eixoX > 0 && eixoY > 0) {
                System.out.println("Q1");
            } else if (eixoX < 0 && eixoY > 0) {
                System.out.println("Q2");
            } else if(eixoX < 0 && eixoY < 0) {
                System.out.println("Q3");
            } else if(eixoX > 0 && eixoY < 0) {
                System.out.println("Q4");
            }
        }

        input.close();
    }
}