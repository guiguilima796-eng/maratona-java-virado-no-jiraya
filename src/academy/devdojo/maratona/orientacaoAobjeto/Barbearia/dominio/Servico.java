package Projeto.dominio;

public enum Servico {
    CORTE_DE_CABELO{
        @Override
        public double calcularPrecoServico() {
            return 50.0;
        }
    },
    MANICURE{
        @Override
        public double calcularPrecoServico() {
            return 30.0;
        }
    },
    PEDICURE{
        @Override
        public double calcularPrecoServico() {
            return 40.0;
        }
    },
    PINTAR_CABELO{
        @Override
        public double calcularPrecoServico() {
            return 80.0;
        }
    };
    public abstract double calcularPrecoServico();


}
