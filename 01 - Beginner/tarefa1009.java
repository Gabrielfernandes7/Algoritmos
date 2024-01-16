import java.util.Locale;
import java.util.Scanner;

public class tarefa1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nomeDoVendedor = scanner.nextLine();

        System.out.println("Digite o salário fixo: ");
        double salarioVendedor = scanner.nextDouble();

        System.out.println("Digite a quatidade em vendas: ");
        double vendas = scanner.nextDouble();

        double salarioVendas = (0.15 * vendas);

        double salarioTotal = salarioVendas + salarioVendedor;

        System.out.printf("O valor do salário de %s é R$ %.2f", nomeDoVendedor, salarioTotal);

        scanner.close();
    }
}
