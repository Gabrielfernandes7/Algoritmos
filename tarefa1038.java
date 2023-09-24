import java.util.Locale;
import java.util.Scanner;

public class tarefa1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String vermelho = "\u001B[32m";
        System.out.println(vermelho + " De acordo com a tabela a seguir digite o codigo do seu lanche e a quantidade desejada");

        Object[][] tabela = new Object[5][3];
        
        /*
            [00] [01] [02]
            [10] [11] [12]
            [20] [21] [22]
            [30] [31] [32]
            [40] [41] [42]
        */

        // Código
        tabela[0][0] = 1;
        tabela[1][0] = 2;
        tabela[2][0] = 3;
        tabela[3][0] = 4;
        tabela[4][0] = 5;

        // Especificação
        tabela[0][1] = "Cachorro Quente";
        tabela[1][1] = "X-Salada";
        tabela[2][1] = "X-Bacon";
        tabela[3][1] = "Torrada";
        tabela[4][1] = "Refrigerante";

        // Preço
        tabela[0][2] = 4.00;
        tabela[1][2] = 4.50;
        tabela[2][2] = 5.00;
        tabela[3][2] = 2.00;
        tabela[4][2] = 1.50;

        for (int i = 0; i < tabela.length; i++) {
            System.out.println("\u001B[0m CODE: " + tabela[i][0] + " | Nome: " + tabela[i][1] + " | Preco: " + tabela[i][2] + "\n");
        }

    }
}
