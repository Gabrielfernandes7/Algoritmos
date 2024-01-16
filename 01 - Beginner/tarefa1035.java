import java.util.Locale;
import java.util.Scanner;

public class tarefa1035 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre que o valor A");
        int valorA = input.nextInt();

        System.out.println("Entre com o valor B");
        int valorB = input.nextInt();

        System.out.println("Entre com o valor C");
        int valorC = input.nextInt();

        System.out.println("Entre com o valor D");
        int valorD = input.nextInt();

        boolean primeiraExpressao = (valorB > valorC) && ((valorC + valorD) > (valorA + valorB));
        boolean segundaExpressao = ((valorC > 0 && valorD > 0)) && (valorA % 2 == 0);
        
        if (primeiraExpressao && segundaExpressao) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }

        input.close();
    }
}