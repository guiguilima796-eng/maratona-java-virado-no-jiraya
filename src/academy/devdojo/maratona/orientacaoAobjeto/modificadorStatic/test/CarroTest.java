package modificadorStatic.test;

import modificadorStatic.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Camaro", 300);
        Carro carro2 = new Carro("Fusca", 200);
        Carro.setVelLim(300);
        carro1.imprime();
        carro2.imprime();

    }
}
