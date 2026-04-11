package academy.devdojo.maratona.orientacaoAobjeto.gerenciamentoDeSeminarios.test;

import academy.devdojo.maratona.orientacaoAobjeto.gerenciamentoDeSeminarios.dominio.Aluno;
import academy.devdojo.maratona.orientacaoAobjeto.gerenciamentoDeSeminarios.dominio.Local;
import academy.devdojo.maratona.orientacaoAobjeto.gerenciamentoDeSeminarios.dominio.Professor;
import academy.devdojo.maratona.orientacaoAobjeto.gerenciamentoDeSeminarios.dominio.Seminario;

public class ExercicioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Guilherme", 18);
        Aluno aluno2 = new Aluno("raimundo", 15);
        Aluno aluno3 = new Aluno("Carol", 18);
        Aluno aluno4 = new Aluno("jessica", 17);
        Aluno aluno5 = new Aluno("Amanda", 18);

        Professor professor1 = new Professor("Luis", "Filosofia");
        Professor professor2 = new Professor("Raimundo", "Matematica");

        Local local1 = new Local("Floriano,Bairro:Catumbi,Num:3");
        Local local2 = new Local("Floriano,Bairro:Manguinha,Num:5");

        Seminario seminario1 = new Seminario("Inteligencia Artificial",new Aluno[]{aluno1,aluno2},professor1,local1);
        Seminario seminario2 = new Seminario("História da Computação", new Aluno[]{aluno3,aluno4,aluno5}, professor2, local2);

        seminario1.imprime();
        seminario2.imprime();
    }
}
