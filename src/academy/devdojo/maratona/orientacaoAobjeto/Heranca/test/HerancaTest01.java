package Heranca.test;

import Heranca.dominio.Endereco;
import Heranca.dominio.Funcionario;
import Heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("64800-000","Vereda Grande");
        Endereco endereco2 = new Endereco("68000-000","Peixoto");

        Pessoa pessoa = new Pessoa("Guilherme","123456789",endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Raimundo","123432112",endereco2,10500);
        funcionario.imprime();
    }
}
