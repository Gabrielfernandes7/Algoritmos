import java.util.Scanner;

public class tarefa1001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de b: ");
        int b = scanner.nextInt();

        int soma = a + b;

        System.out.println("O valor da soma é: " + soma);

        scanner.close();
    }
}