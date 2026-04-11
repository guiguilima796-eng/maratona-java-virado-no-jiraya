package introducaoMetodos.test;

import introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(10,10 );
        System.out.println(calculadora.subtraiDoisNumeros(10, 5));
        calculadora.mutiplicaDoisNumeros(25, 2.5f);


    }
}
