package academy.devdojo.maratona.orientacaoAobjeto.Associacao.test;


import Associacao.dominio.Professor;
import academy.devdojo.maratona.orientacaoAobjeto.Associacao.dominio.Escola;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 =new Professor("Pardal");
        Professor professor2 = new Professor("FL");

        Escola escola1 = new Escola("IFPI",new Professor[]{professor1,professor2});

        escola1.imprime();
    }
}
