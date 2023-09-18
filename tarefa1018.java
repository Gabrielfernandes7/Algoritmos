import java.util.Locale;
import java.util.Scanner;

public class tarefa1018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };
        
        System.out.print("Entre com o capital recebido: ");
        int capitalRecebido = scanner.nextInt();
        
        System.out.println("O valor recebido foi: " + capitalRecebido);
        System.out.println();
        
        for (int i = 0; i < cedulas.length; i++) {            
            int quantidadeNotas = capitalRecebido / cedulas[i];
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeNotas, cedulas[i]);
            capitalRecebido = capitalRecebido % cedulas[i]; // O que sobrou para ser trocado
        }
        
        scanner.close();
    }
}
