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

        int inicioTotalMinutos = hInicial * 60 + mInicial;
        int finalTotalMinutos = hFinal * 60 + mFinal;

        int duracaoTotalMinutos;

        if (inicioTotalMinutos == finalTotalMinutos) {
            duracaoTotalMinutos = 24 * 60;
        } else if (inicioTotalMinutos < finalTotalMinutos) {
            duracaoTotalMinutos = finalTotalMinutos - inicioTotalMinutos;
        } else {
            duracaoTotalMinutos = (24 * 60 - inicioTotalMinutos) + finalTotalMinutos;
        }

        duracaoH = duracaoTotalMinutos / 60;
        duracaoM = duracaoTotalMinutos % 60;

        System.out.println(duracaoH);

        System.out.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", duracaoH, duracaoM);

        input.close();
    }
}
