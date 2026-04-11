package academy.devdojo.maratona.orientacaoAobjeto.Enumeracao.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDescontoPorTipoPagamento(double valor) {
            // TODO Auto-generated method stub
            return valor * 0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDescontoPorTipoPagamento(double valor) {
            // TODO Auto-generated method stub
            return valor * 0.05;
        }
    };

    public abstract double calcularDescontoPorTipoPagamento(double valor);
}
