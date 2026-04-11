package Associacao.test;

import Associacao.dominio.Jogador;

public class JogadorTest1 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Arrascaeta");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};
        
        for(Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
    
}
