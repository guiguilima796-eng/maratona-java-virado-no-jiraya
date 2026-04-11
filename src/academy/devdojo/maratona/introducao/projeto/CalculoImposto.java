public class CalculoImposto {

    public static void main(String[] args) {
        double salarioanual = 30000;
        double primeiraFaixa = 9.70 /100;
        double segundaFaixa = 37.35  /100;
        double terceiraFaixa = 47.50 /100;
        double imposto;

        if (salarioanual <= 34712) {
            imposto = salarioanual * primeiraFaixa;
        }else if (salarioanual <= 68507) {
            imposto = salarioanual * segundaFaixa;
        }else{
            imposto = salarioanual * terceiraFaixa;
        }

        System.out.println("Imposto Anual para o salario de "+salarioanual+" = "+imposto);
    }
}