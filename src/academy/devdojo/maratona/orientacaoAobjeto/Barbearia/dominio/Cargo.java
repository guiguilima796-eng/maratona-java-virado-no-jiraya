package Projeto.dominio;

public enum Cargo {
    BARBEIRO{
        // Implementação específica para BARBEIRO
        public double calcularSalario() {
            return 5000;
        }
    },
    RECEPCIONISTA{
        public double calcularSalario() {
            // Implementação específica para RECEPCIONISTA
            return 3000;
        }
    },
    GERENTE{
        public double calcularSalario() {
            // Implementação específica para GERENTE
            return 7000;
        }
    };

    double calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }
}
