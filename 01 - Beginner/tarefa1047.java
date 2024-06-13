import java.util.Scanner;

public class tarefa1047 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite horas e minutos inicial");

        int hInicial = input.nextInt();
        int mInicial = input.nextInt();

        System.out.println("Digite horas e minutos final");
        int hFinal = input.nextInt();
        int mFinal = input.nextInt();

        input.close();
    }
}
