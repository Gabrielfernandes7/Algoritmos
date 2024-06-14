import java.util.Scanner;

public class tarefa1047 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int duracaoH;
        int duracaoM;

        System.out.println("Digite horas e minutos inicial");

        int hInicial = input.nextInt();
        int mInicial = input.nextInt();

        System.out.println("Digite horas e minutos final");
        int hFinal = input.nextInt();
        int mFinal = input.nextInt();

        if (hInicial < hFinal) {
            duracaoH = hFinal - hInicial;
        } else {
            duracaoH = (24 - hFinal) + hInicial;
        }

        if (mInicial < mFinal) {
            duracaoM = mFinal - mInicial;
        } else {
            duracaoM = (mFinal + 60) - mInicial;
        }

        System.out.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracaoH, duracaoM);

        input.close();
    }
}
