import java.util.Locale;
import java.util.Scanner;

public class tarefa1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner scanner = new Scanner(System.in);

        int horasParaMinutos = 60;

        System.out.println("Velocidade do Carro X: 60km/h");
        System.out.println("Velocidade do Carro y: 90km/h");
        
        System.out.println("Escreva a distância");
        int distancia = scanner.nextInt();

        int diferencaVelocidadeXY = 30;
        int tempoEmMinutos = horasParaMinutos * (distancia / (diferencaVelocidadeXY));

        System.out.println("Tempo em minutos que os carros percorreram: " + tempoEmMinutos);

        scanner.close();
    }
}
