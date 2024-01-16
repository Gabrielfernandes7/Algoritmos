import java.util.Scanner;

public class tarefa1044 {
    private static boolean validarMultiplo(int a, int b) {
        if ((a % b == 0) || (b % a == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        int numeroA = input.nextInt();

        System.out.println("Entre com o segundo número");
        int numeroB = input.nextInt();

        boolean validacao = validarMultiplo(numeroA, numeroB);

        if (validacao) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        input.close();
    }
}
