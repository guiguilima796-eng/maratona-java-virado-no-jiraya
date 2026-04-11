package Polimorfismo.dominio;

public class Computador extends Produto {

    private static final double TAXA_COMPUTADOR = 0.15;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa para computador...");
        return this.valor * TAXA_COMPUTADOR;
    }
}