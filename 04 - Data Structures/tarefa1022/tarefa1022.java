package tarefa1022;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Colocar static dentro de uma classe permite
    que elas sejam instanciadas diretamente do método main
*/

public class tarefa1022 {
    interface OperacaoStrategy {
        String getOperacao();
    }

    static class OperacaoSimples implements OperacaoStrategy {
        private final Map<Integer, String> numeroOperacao;

        public OperacaoSimples() {
            this.numeroOperacao = new HashMap<>();
            numeroOperacao.put(1, "soma");
            numeroOperacao.put(2, "subtração");
            numeroOperacao.put(3, "multiplicação");
            numeroOperacao.put(4, "divisão");
        }

        @Override
        public String getOperacao() {
            return numeroOperacao.getOrDefault(numeroOperacao, "Operação inexistente no sistema");
        }
    }

    static class OperacaoCompleta implements OperacaoStrategy {
        private final int numero;

        public OperacaoCompleta(int numero) {
            this.numero = numero;
        }

        @Override
        public String getOperacao() {
            switch (numero) {
                case 1:
                    return "soma";
                case 2:
                    return "subtração";
                case 3:
                    return "multiplicação";
                case 4:
                    return "divisão";
                default:
                    return "Outro";
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Sum: (N1*D2 + N2*D1) / (D1*D2)
        // Subtraction: (N1*D2 - N2*D1) / (D1*D2)
        // Multiplication: (N1*N2) / (D1*D2)
        // Division: (N1/D1) / (N2/D2), that means (N1*D2)/(N2*D1)

        System.out.println("Digite o número que corresponde a operação desejada");

        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");

        int escolhaOperacao = input.nextInt();

        OperacaoStrategy strategy = 
            escolhaOperacao <= 4 ? new OperacaoCompleta(escolhaOperacao) : new OperacaoSimples(); 

        System.out.println("Digite a primeira fração: N1 / D1");
        int numerador1 = input.nextInt();
        int denominador1 = input.nextInt();

        System.out.println(numerador1 + " / " + denominador1);

        System.out.println("Digite a segunda fração N2 / D2");
        int numerador2 = input.nextInt();
        int denominador2 = input.nextInt();

        System.out.println(numerador2 + " / " + denominador2);

        String operacao = strategy.getOperacao();

        switch (operacao) {
            case "soma":
                int numeradorSoma = (numerador1 * denominador2) + (numerador2 * denominador1);
                int denominadorSoma = (denominador1 * denominador2);
                System.out.println("SOMA = " + numeradorSoma + " / " + denominadorSoma);
                break;
            case "subtração": 
                int numeradorSubtracao = (numerador1 * denominador2) - (numerador2 * denominador1);
                int denominadorSubtracao = (denominador1 * denominador2);
                System.out.println("SUBTRAÇÃO = " + numeradorSubtracao + " / " + denominadorSubtracao);
                break;
            case "multiplicação":
                int numeradorMultiplicacao = (numerador1 * numerador2);
                int denominadorMultiplicacao = (denominador1 * denominador2);
                System.out.println("MULTIPLICAÇÃO = " + numeradorMultiplicacao + " / " + denominadorMultiplicacao);
                break;
            case "divisão":
                int numeradorDivivao = (numerador1 * denominador2);
                int denominadorDivisao = (numerador2 * denominador1);
                System.out.println("DIVISÃO = " + numeradorDivivao + " / " + denominadorDivisao);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        input.close();
    }
}