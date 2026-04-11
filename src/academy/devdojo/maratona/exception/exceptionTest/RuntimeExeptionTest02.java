package academy.devdojo.maratona.exception.exceptionTest;

public class RuntimeExeptionTest02 {
    public static void main(String[] args) {
        System.out.println(dividir(10,0 ));

    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

}