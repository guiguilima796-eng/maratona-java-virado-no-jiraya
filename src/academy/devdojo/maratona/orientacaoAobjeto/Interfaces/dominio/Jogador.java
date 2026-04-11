package Interfaces.dominio;

public class Jogador implements Pessoa {
    private String nome;
    private NivelJogador nivelJogador;

    public Jogador(String nome,NivelJogador nivelJogador) {
        this.nome = nome;
        this.nivelJogador = nivelJogador;
    }

    public NivelJogador getNivelJogador() {
        return nivelJogador;
    }

    public void setNivelJogador(NivelJogador nivelJogador) {
        this.nivelJogador = nivelJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void andar() {
                // TODO Auto-generated method stub
        System.out.println(this.nome + " esta andando");    
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + this.nome + " Nivel: " + this.nivelJogador;
    }

    
}
