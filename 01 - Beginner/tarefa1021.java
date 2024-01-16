import java.util.Locale;
import java.util.Scanner;

public class tarefa1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int[] cedulas = { 100, 50, 20, 10, 5, 2 };
        double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.01 };

        System.out.println("Digite o valor que você possui em R$");
        double valorEmReais = input.nextDouble();

        System.out.println("NOTAS:");
        for(int i = 0; i < cedulas.length; i++){
            int quantidadeNotas = (int) valorEmReais / cedulas[i];
            System.out.printf("%d nota(s) de R$ %d,00 \n", quantidadeNotas, cedulas[i]);

            valorEmReais  = valorEmReais % cedulas[i];
        }
        
        double parteFlutuante = valorEmReais - (int) valorEmReais;
        parteFlutuante = (Math.floor(parteFlutuante * 100) / 100);
        
        System.out.println("MOEDAS:");

        for(int j = 0; j < moedas.length; j++){
            int quantidadeMoedas = (int) (parteFlutuante / moedas[j]);

            System.out.printf("%d moeda(s) de R$ %.2f centavos \n", quantidadeMoedas, moedas[j]);
            
            parteFlutuante = parteFlutuante % moedas[j];
        }
        
        input.close();
    }
}