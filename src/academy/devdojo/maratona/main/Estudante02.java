package test;

import dominio.Pessoa;

public class Estudante02 {
    public static void main(String[] args) {
        Pessoa estudante02 = new Pessoa();
        estudante02.nome = "Messi";
        estudante02.idade = 37;
        estudante02.sexo = 'M';

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

    }
}
