import java.util.Locale;
import java.util.Scanner;

public class tarefa1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota A: ");
        double notaA = scanner.nextDouble();
        
        System.out.println("Digite a nota B: ");
        double notaB = scanner.nextDouble();
        
        System.out.println("Digite a nota C: ");
        double notaC = scanner.nextDouble();

        double media = (2*notaA + 3*notaB + 5*notaC) / 10.0;

        System.out.println("O valor da média é " + media);

        scanner.close();
    }
}
