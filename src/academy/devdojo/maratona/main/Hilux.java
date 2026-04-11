package test;

import dominio.Carro;

public class Hilux {
    public static void main(String[] args) {
        Carro hilux = new Carro();
        hilux.setAno(2024);
        hilux.setModelo("4x4");
        hilux.setNome("Hilux");

        System.out.println("Nome:"+hilux.getNome()+"\nModelo:"+hilux.getModelo()+"\nAno:"+hilux.getAno());
    }
}
