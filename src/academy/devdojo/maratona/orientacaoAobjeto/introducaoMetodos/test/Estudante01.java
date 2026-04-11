package introducaoMetodos.test;

import introducaoMetodos.dominio.Estudante;
import introducaoMetodos.dominio.EstudanteImprime;

public class Estudante01 {
    
    

    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "guilherme";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "guigol";
        estudante02.idade = 21;
        estudante02.sexo = 'M';

        // EstudanteImprime imprime = new EstudanteImprime();

        // imprime.imprime(estudante02);
        // imprime.imprime(estudante01);

        // EstudanteImprime.imprime(estudante01);
        // EstudanteImprime.imprime(estudante02);

        estudante01.imprime();
        estudante02.imprime();
    }
}
