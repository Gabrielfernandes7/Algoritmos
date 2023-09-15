import java.util.Locale;
import java.util.Scanner;

public class tarefa1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a: ");
        double valorA = scanner.nextDouble();

        System.out.println("Digite o valor b: ");
        double valorB = scanner.nextDouble();

        double media = (valorA + valorB) / 2.0;
        System.out.print("O valor da média é: " + media);

        scanner.close();
    }
}
