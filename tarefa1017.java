import java.util.Locale;
import java.util.Scanner;

public class tarefa1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double distanciaPorLitros = 12.00;

        System.out.println("Digite o tempo gasto no caminho: ");
        int tempoGasto = scanner.nextInt();

        System.out.println("Digite a velocidade média percorrida");
        int velocidadeMedia = scanner.nextInt();

        int distanciaPercorrida = (tempoGasto * velocidadeMedia);
        System.out.println("Distância percorrida é: " + distanciaPercorrida);

        double litrosGastos = (distanciaPercorrida / distanciaPorLitros);

        System.out.format("A quantidade de litros gastos é de: %.3f", litrosGastos);
        
        scanner.close();

    }
}
