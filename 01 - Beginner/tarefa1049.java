import java.util.Scanner;

public class tarefa1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        String palavra3 = sc.nextLine();

        sc.close();

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("Águia");
                }

                if (palavra3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            }
            
            if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                }
                if (palavra3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }
        
        if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematófago")) {
                    System.out.println("pulga");
                }
                if (palavra3.equals("onivoro")) {
                    System.out.println("lagarta");
                }
            }

            if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematófago")) {
                    System.out.println("sanguessuga");
                }
                if (palavra3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
