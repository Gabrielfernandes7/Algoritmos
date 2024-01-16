public class tarefa1043 {

    private static void validarExistenciaTriangulo(
        double a, double b, double c
    ) {
        System.out.println("Verifica a existência do triângulo...");

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Esse triângulo existe");

            double perimetroTriangulo = calcularPerimetroTriangulo(a, b, c);

            System.out.println("Perimetro = " + perimetroTriangulo);
        } else {
            System.out.println("Esse triângulo não existe");

            double areaTrapezio = calcularAreaTrapezio(a, b, c);

            System.out.println("Area = " + areaTrapezio);
        }
    }

    private static double calcularPerimetroTriangulo(
        double a, double b, double c
    ) {
        return a + b + c;
    }

    private static double calcularAreaTrapezio(
        double a, double b, double c
    ) {
        return ((a + b) * c) / 2.0;
    }

    public static void main(String[] args) {
        validarExistenciaTriangulo(3, 4, 5);

        validarExistenciaTriangulo(1, 1, 2);
    }
}