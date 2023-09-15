import java.util.Scanner;

class Quadrado {
    public static void main(String[] args) {
        
        System.out.println("Digite um número");

        Scanner scanner = new Scanner(System.in);

        int numeroInput = scanner.nextInt();
        int numeroInputQuadrado = numeroInput * numeroInput;

        System.out.print("O quadrado desse número é: " + numeroInputQuadrado);

        scanner.close();
    }
}