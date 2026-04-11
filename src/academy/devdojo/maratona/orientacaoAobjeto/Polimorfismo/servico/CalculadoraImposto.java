package Polimorfismo.servico;

import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;


public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("--- Calculadora de Imposto ---");
        double valorImposto = produto.calcularTaxa();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: R$ " + produto.getValor());
        System.out.println("Valor do Imposto: R$ " + valorImposto);
        if (produto instanceof Tomate) {
            System.out.println("Data de Validade: " + ((Tomate) produto).getDataValidade());
        }
    }

}
