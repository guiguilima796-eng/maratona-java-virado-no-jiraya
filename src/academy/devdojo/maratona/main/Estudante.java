package test;

import dominio.Pessoa;

public class Estudante {

    public static void main(String[] args) {
        Pessoa estudante = new Pessoa();

        estudante.nome = "Guilherme";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}