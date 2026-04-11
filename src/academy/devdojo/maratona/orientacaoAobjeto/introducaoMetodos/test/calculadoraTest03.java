package introducaoMetodos.test;

import introducaoMetodos.dominio.Calculadora;

public class calculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int[] numeros = {1,2,3,4,5};
        calc.calculaArray(numeros);

        calc.calculaVarargs(1,2,34,5);
    }
    
}
