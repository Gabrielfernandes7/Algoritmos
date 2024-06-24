import java.util.Locale;
import java.util.Scanner;

public class tarefa1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        float readjustment;

        System.out.println("Entre com o salário");
        float salary = input.nextFloat();

        if ((salary > 0) && (salary <= 400)) {
            readjustment = 15;
            
            float salary_readjustment = ((readjustment * salary) / 100) + salary;

            System.out.printf("Novo salário: %.2f \n", salary_readjustment);
            System.out.printf("Reajuste ganho: %.2f \n", (salary_readjustment - salary));
            System.out.printf("Em percentual: %.2f%% \n", readjustment);
        } else if ((salary >= 400.01) && (salary <= 800)) {
            readjustment = 12;
            
            float salary_readjustment = ((readjustment * salary) / 100) + salary;

            System.out.printf("Novo salário: %.2f \n", salary_readjustment);
            System.out.printf("Reajuste ganho: %.2f \n", (salary_readjustment - salary));
            System.out.printf("Em percentual: %.2f%%", readjustment);
        } else if ((salary >= 800.01) && (salary <= 1200)) {
            readjustment = 10;
            
            float salary_readjustment = ((readjustment * salary) / 100) + salary;

            System.out.printf("Novo salário: %.2f \n", salary_readjustment);
            System.out.printf("Reajuste ganho: %.2f \n", (salary_readjustment - salary));
            System.out.printf("Em percentual: %.2f%% \n", readjustment);
        } else if ((salary >= 1200.01) && (salary <= 2000)) {
            readjustment = 7;
            
            float salary_readjustment = ((readjustment * salary) / 100) + salary;

            System.out.printf("Novo salário: %.2f \n", salary_readjustment);
            System.out.printf("Reajuste ganho: %.2f \n", (salary_readjustment - salary));
            System.out.printf("Em percentual: %.2f%% \n", readjustment);
        } else if(salary > 2000.01) {
            readjustment = 4;
            
            float salary_readjustment = ((readjustment * salary) / 100) + salary;

            System.out.printf("Novo salário: %.2f \n", salary_readjustment);
            System.out.printf("Reajuste ganho: %.2f \n", (salary_readjustment - salary));
            System.out.printf("Em percentual: %.2f%% \n", readjustment);
        }

        input.close();
    }
}