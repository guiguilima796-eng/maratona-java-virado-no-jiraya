package Associacao.test;

import Associacao.dominio.Jogador;
import Associacao.dominio.Time;

public class jogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ribamar");
        Jogador jogador2 = new Jogador("Caça Rato");

        Time time1 = new Time("Basco");

        jogador1.setTime(time1);
        jogador2.setTime(time1);

        time1.setJogadores(new Jogador[]{jogador1,jogador2});

        jogador1.imprime();
        jogador2.imprime();
        
        time1.imprime();

        
    }
}
