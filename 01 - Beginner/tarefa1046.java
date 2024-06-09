import java.util.Scanner;

public class tarefa1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int duracao;

        System.out.println("Entre com a hora inicial");
        int tIncial = input.nextInt();
        
        System.out.println("Entre com a hora final");
        int tFinal = input.nextInt();

        if (tIncial < tFinal) {
            duracao = tFinal - tIncial;
        } else {
            duracao = (24 - tFinal) + tIncial;
        }

        System.out.format("O JOGO DUROU %d HORA(S)", duracao);

        input.close();
    }
}