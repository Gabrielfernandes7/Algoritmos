import java.util.Arrays;
import java.util.Scanner;

public class tarefa1042 {    
    
    private static void ordernarValores(int[] numeros) {
        Arrays.sort(numeros);
    }

    private static int[] lerNumeros() {
        int[] numeros = new int[3];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            numeros[i] = input.nextInt();
        }

        input.close();
        return numeros;
    }

    public static void imprimirNumeros(int[] numeros) {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Digite 3 números para que sejam ordenados em order crescente");
        int[] numeros = lerNumeros();

        ordernarValores(numeros);

        System.out.println("Números em ordem crescente");
        imprimirNumeros(numeros);
    }
}
