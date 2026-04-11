package Polimorfismo.Test;

import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

public class PrdutTest02 {
    public static void main(String[] args) {
        Produto tomate = new Tomate("Tomate Italiano", 12.5, "2024-12-31");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
