import java.util.Locale;
import java.util.Scanner;

public class tarefa1040 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.UK);
    Scanner input = new Scanner(System.in);

    System.out.println("Entre com as respectivas notas do aluno: N1, N2, N3, N4");
    double n1 = input.nextDouble();
    double n2 = input.nextDouble();
    double n3 = input.nextDouble();
    double n4 = input.nextDouble();

    double media = (n1 + n2 + n3 + n4) / 4.0;

    System.out.printf("MÉDIA %.1f \n", media);

    if (media < 5.0) {
      System.out.println("Aluno reprovado");
    } else if (media >= 5.0 && media <= 6.9){
      System.out.println("Aluno em exame. Digite nota do aluno em exame");
      double nota5 = input.nextDouble();

      double mediaExame = (media + nota5) / 2.0;

      System.out.printf("MÉDIA DO EXAME %.1f \n", mediaExame);

      if (mediaExame < 5.0) {
        System.out.println("Aluno reprovado no exame");
      } else {
        System.out.println("Aluno aprovado");
      }
    } else {
      System.out.println("Aluno aprovado !");
    }

    input.close();
  }
}
