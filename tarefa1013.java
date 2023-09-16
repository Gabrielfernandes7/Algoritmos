import java.util.Locale;
import java.util.Scanner;

public class tarefa1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com dois números para sabermos qual o maior dentre eles: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double maiorAB = ((a + b) + Math.abs(a - b)) / 2.0;
        
        if (maiorAB < c) {
            System.out.format("%d é maior", c);
        } else {
            if (a > b) {
                System.out.format("%d é maior", a);
            } else {
                System.out.format("%d é maior", b);
            }
        }

        scanner.close();
    }
}
