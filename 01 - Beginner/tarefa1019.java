import java.util.Locale;
import java.util.Scanner;

public class tarefa1019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a quantidade de segundos");
        System.out.println("Sera convertido em hh:mm:seg");

        int segundos = scanner.nextInt();
        int minutos = segundos / 60;
        int horas = minutos / 60;
        
        if (segundos >= 60) {
            segundos = segundos % 60;
            if (minutos >= 60) {
                minutos = minutos % 60;
            }
        }

        System.out.println();
        System.out.format("%d:%d:%d", horas, minutos, segundos);

        scanner.close();
    }
}
