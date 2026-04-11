package academy.devdojo.maratona.main;

import dominio.Carro;

public class Celta {
    public static void main(String[] args) {
        Carro celta = new Carro();
        celta.setNome("Celta");
        celta.setModelo("Quadrado");
        celta.setAno(2007);

        System.out.println("Nome :"+celta.getNome()+",Modelo :"+celta.getModelo()+",Ano :"+celta.getAno());
    }
}
