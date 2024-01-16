import java.util.Locale;
import java.util.Scanner;

public class tarefa1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número do colaborador: ");
        int numeroDoColaborador = scanner.nextInt();

        System.out.println("Número de horas trabalhadas: ");
        int horasTrabalhadasNoMes = scanner.nextInt();

        System.out.println("Reais por hora trab: ");
        int valorPorHora = scanner.nextInt();

        double salario = valorPorHora * horasTrabalhadasNoMes;

        System.out.println("Funcionário: " + numeroDoColaborador);
        System.out.printf("Salário: %.2f", salario);

        scanner.close();
    }
}
