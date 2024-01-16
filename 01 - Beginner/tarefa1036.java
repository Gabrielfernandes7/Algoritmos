import java.util.Locale;
import java.util.Scanner;

public class tarefa1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os coeficientes dos respectivos termos para encontra as raízes da eq. de segundo grau");
        
        System.out.println("Valor a");
        double a = input.nextDouble();
        
        System.out.println("Valor b");
        double b = input.nextDouble();
        
        System.out.println("Valor c");
        double c = input.nextDouble();
        
        double delta = (Math.pow(b, 2) - 4*a*c);
        
        if((a == 0) || delta < 0) {
            System.out.println("Impossível calcular");

        } else {
            double raiz1 = (b*(-1) + Math.sqrt(delta)) / 2.0;
            double raiz2 = (b*(-1) - Math.sqrt(delta)) / 2.0;

            System.out.println("R1 = " + raiz1);
            System.out.println("R2 = " + raiz2);
        }

        input.close();
    }
}
