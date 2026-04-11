package introducaoMetodos.test;

import introducaoMetodos.dominio.introducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setIdade(18);
        pessoa1.setNome("Guilherme");
        pessoa1.imprime();
    }
}
