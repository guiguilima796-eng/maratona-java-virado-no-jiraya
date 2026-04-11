package Polimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO = 0.10;
    private String dataValidade;

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando taxa para tomate...");
        return this.valor * IMPOSTO;
    }
}