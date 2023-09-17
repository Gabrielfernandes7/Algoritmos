import java.util.Locale;
import java.util.Scanner;

public class tarefa1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        int meses = (dias / 30);
        int anos = (meses / 12);

        if (dias >= 30) {
            dias = dias % 30;
            if (meses >= 12) {
                meses = meses % 12;
            }
        }

        System.out.println();

        System.out.format("%d ano(s)\n", anos);
        System.out.println();
        
        System.out.format("%d mes(es)\n ", meses);
        System.out.println();
        
        System.out.format("%d dia(s)\n", dias);
        System.out.println();

        scanner.close();
    }
}
