import java.util.Locale;
import java.util.Scanner;

public class tarefa1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite o código do produto " + i);
            int produtoCodigo = scanner.nextInt();

            System.out.println("Digite quantos produtos você comprou");
            int itemsComprados = scanner.nextInt();
    
            System.out.println("Digite o preço unitário destes produtos");
            double precoUnitario = scanner.nextDouble();

            System.out.println("#### Iteração " + i + " ####");
            System.out.println("O código do produto é: " + produtoCodigo);

            System.out.println();

            double valorTotal = precoUnitario * itemsComprados;

            System.out.println("O VALOR À PAGAR = " + valorTotal);
        }

        scanner.close();
    }
}
