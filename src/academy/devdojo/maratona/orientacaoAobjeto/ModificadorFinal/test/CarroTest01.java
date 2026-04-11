package ModificadorFinal.test;

import ModificadorFinal.dominio.Carro;
import ModificadorFinal.dominio.Comprador;

public class CarroTest01 {
    
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Guilherme");
        System.out.println(carro.COMPRADOR);
    }
}
