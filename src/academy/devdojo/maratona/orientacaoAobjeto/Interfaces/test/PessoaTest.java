package Interfaces.test;

import Interfaces.dominio.Jogador;
import Interfaces.dominio.NivelJogador;

public class PessoaTest {
    public static void main(String[] args) {
        System.out.println(Interfaces.dominio.Pessoa.NOME);
        Jogador jogador = new Jogador("Carlos",NivelJogador.EXPERT);
        System.out.println(jogador);
        jogador.falar("Estou falando como uma pessoa");
        jogador.andar();

    }
}
