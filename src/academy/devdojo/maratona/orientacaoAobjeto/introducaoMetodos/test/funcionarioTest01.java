package introducaoMetodos.test;

import introducaoMetodos.dominio.introducaoMetodos.dominio.Funcionario;

public class funcionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Messi");
        funcionario1.setIdade(37);
        funcionario1.setSalario(new double[]{20000D,10000D,5000D});

        funcionario1.imprimirDados();
        
    }
}
