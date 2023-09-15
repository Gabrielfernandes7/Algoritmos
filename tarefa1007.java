import java.util.Scanner;

public class tarefa1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor A");
        int valorA = scanner.nextInt();
        
        System.out.println("Digite o valor B");
        int valorB = scanner.nextInt();
        
        System.out.println("Digite o valor C");
        int valorC = scanner.nextInt();
        
        System.out.println("Digite o valor D");
        int valorD = scanner.nextInt();

        int diferenca = (valorA * valorB - valorC * valorD);

        System.out.print("Diferença " + diferenca);

        scanner.close();
    }
}
