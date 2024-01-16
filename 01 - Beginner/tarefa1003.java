import java.util.Scanner;

public class tarefa1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int produto = a * b;

        System.out.print("Produto: " + produto);

        scanner.close();
    }
}
