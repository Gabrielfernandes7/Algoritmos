import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        System.out.println("Digite o número: ");

        Scanner scanner = new Scanner(System.in);

        int numeroDigitado = scanner.nextInt();
        
        System.out.println("O número digitado é: " + numeroDigitado);
        
        if (numeroDigitado == 0 && numeroDigitado == 1) {
            System.out.println("O valor do fatorial é 1");
        } else {
            int valorFatorial = 1;
            for(int i = numeroDigitado; i > 0; i--) {
                valorFatorial *= i;
            }

            System.out.print("O valor do fatorial de " + numeroDigitado + " é: " + valorFatorial);
        }

        scanner.close();
    }
}
