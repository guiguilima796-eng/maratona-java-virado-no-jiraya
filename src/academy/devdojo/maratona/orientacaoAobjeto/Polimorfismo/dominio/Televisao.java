package Polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.20;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
    
    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa para televisão...");
        return this.valor * IMPOSTO;    
    }
}
