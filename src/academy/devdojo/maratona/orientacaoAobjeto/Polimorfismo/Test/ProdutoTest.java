package Polimorfismo.Test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Televisao;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto computador = new Computador("Dell Inspiron", 4500.0);
        Produto tomate = new Tomate("Tomate Italiano", 12.5, "2024-12-31");
        Produto televisao = new Televisao("Samsung 4K", 3500.0);
        CalculadoraImposto.calcularImposto(televisao);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);

    }
}
