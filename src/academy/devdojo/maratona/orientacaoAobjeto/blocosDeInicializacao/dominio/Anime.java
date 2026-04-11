package blocosDeInicializacao.dominio;

public class Anime {
    private String nome;
    private static int[] eps;

    //bloco de inialização

    static{
        Anime.eps = new int[100];
        for(int i = 0;i < Anime.eps.length;i++){
            Anime.eps[i] = i+1;
            System.out.print(Anime.eps[i]+"");
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public int[] getEps(){
        return Anime.eps;
    }

    public String getNome(){
        return this.nome;
    }
    
}
