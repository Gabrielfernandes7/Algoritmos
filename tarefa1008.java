import java.util.Scanner;

public class tarefa1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Número do colaborador: ");
        int numeroDoColaborador = scanner.nextInt();

        System.out.println("Número de horas trabalhadas: ");
        int horasTrabalhadasNoMes = scanner.nextInt();

        System.out.println("Reais por hora trab: ");
        int valorPorHora = scanner.nextInt();

        scanner.close();
    }
}
